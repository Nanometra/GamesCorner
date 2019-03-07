package com.projet.dao;

import java.util.List;

public interface IGeneriqueDAO<T> {

	T findById(Integer id);
	
	List<T> findAll();
	
	void add (T entity);
	
	void delete(Integer id);
	
	T update(T entity);
}
