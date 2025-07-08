package com.generic.entity.framework.controller;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.dto.GenericMapper;
import com.generic.entity.framework.service.GenericService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GenericController<T, D extends GenericDTO<T>, ID extends Serializable> {

    protected final GenericService<T, ID> service;
    protected final Class<T> entityClass;
    protected final Class<D> dtoClass;

    protected GenericController(GenericService<T, ID> service, Class<T> entityClass,  Class<D> dtoClass) {
        this.service = service;
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody D dto) {
        T entity = GenericMapper.toEntity(dto, entityClass);
        T saved = service.save(entity);
        D responseDto = GenericMapper.toDto(saved, dtoClass); // returns new instance of dto
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> get(@PathVariable ID id) {
        return service.findById(id)
                .map(entity -> ResponseEntity.ok(GenericMapper.toDto(entity, dtoClass)))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<D>> getAll() {
        List<T> entities = service.findAll();
        List<D> dtos = entities.stream()
                .map(entity -> GenericMapper.toDto(entity,  dtoClass))
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable ID id, @RequestBody @Valid D dto) {
        T entity = GenericMapper.toEntity(dto, entityClass);
        T updated = service.put(id, entity);
        return ResponseEntity.ok(GenericMapper.toDto(updated, dtoClass));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<D> patch(@PathVariable ID id, @RequestBody D dto) {
        T patched = service.patch(id, dto);
        return ResponseEntity.ok(GenericMapper.toDto(patched, dtoClass));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable ID id) {
        Boolean deleted = service.deleteById(id);
        return ResponseEntity.ok("Record deleted by id: " + id);
    }
}
