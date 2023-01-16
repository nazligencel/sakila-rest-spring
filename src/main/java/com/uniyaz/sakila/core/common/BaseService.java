package com.uniyaz.sakila.core.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public abstract class BaseService<T extends BaseEntity, R extends BaseRepository>{

    @Autowired
    public R repository;

    public List<T> findAll() {
        List<T> entityList = repository.findAll();
        return entityList;
    }

    public T save(T t) {
        return (T) repository.save(t);
    }

    public void delete(Long entityId) {
        repository.deleteById(entityId);
    }

}
