package com.generic.entity.framework.generics.controller;

import com.generic.entity.framework.generics.dto.GenericDTO;
import com.generic.entity.framework.generics.service.GenericService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public abstract class GenericController<T, ID extends Serializable> {

    protected final GenericService<T, ID> service;

    protected GenericController(GenericService<T, ID> service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody @Valid T entity) {
        return ResponseEntity.ok(service.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> get(@PathVariable ID id) {
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<T>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity) {
        return ResponseEntity.ok(service.put(id, entity));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<T> patch(@PathVariable ID id, @RequestBody GenericDTO<?> entityDto) {
        return ResponseEntity.ok(service.patch(id, (GenericDTO<T>) entityDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable ID id) {
        Boolean delete = service.deleteById(id);
        return ResponseEntity.ok("Record deleted by id: " + id);
    }
}
