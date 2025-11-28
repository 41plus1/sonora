package com.sonora.dao;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    void save(T entity);
    // void delete(String id);
    // Optional<T> findById(String id);
    // List<T> findAll();
}
