package com.projet.service;

import java.util.List;

public interface IGeneriqueService<T> {

	T findById(Integer id);
	
	List<T> findAll();
	
	void add (T entity);
	
	void delete (Integer id);
	
	T update (T entity);
	
}
