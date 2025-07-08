package com.generic.entity.framework.generics.service;

import com.generic.entity.framework.generics.dto.GenericDTO;
import com.generic.entity.framework.generics.dto.GenericMapper;
import com.generic.entity.framework.generics.repo.GenericRepository;
import com.generic.entity.framework.generics.service.utils.GenericEntityUtils;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

    protected final GenericRepository<T, ID> repository;

    public GenericServiceImpl(GenericRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T put(ID id, T entity) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Entity not found with id " + id);
        }
//        ID currentId = (ID) EntityUtils.getIdValue(entity);
        GenericEntityUtils.setIdValue(entity, id);
        return repository.save(entity);
    }

    @Override
    public T patch(@PathVariable ID id, @RequestBody GenericDTO<T> entityDto) {
        T entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
//        ID currentId = (ID) EntityUtils.getIdValue(entity);
        GenericMapper.patchEntity(entityDto, entity);
        return repository.save(entity);
    }

    @Override
    public Boolean deleteById(ID id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
