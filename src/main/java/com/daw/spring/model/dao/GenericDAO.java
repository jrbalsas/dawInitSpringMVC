package com.daw.spring.model.dao;

import java.util.List;

public interface GenericDAO<T,K> {
    
    public T findById(K id);
    public List<T> findAll();
    public boolean create(T c);
    public boolean update(T c);    
    public boolean delete(K id);
}
