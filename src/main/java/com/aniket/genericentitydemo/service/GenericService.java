package com.aniket.genericentitydemo.service;

import com.aniket.genericentitydemo.dto.GenericDTO;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericService<T, ID extends Serializable> {
    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    T put(ID id, T updatedEntity);
    T patch(ID id, GenericDTO<T> updatedEntity);
    Boolean deleteById(ID id);
}
