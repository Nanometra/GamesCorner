package com.projet.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IGeneriqueService<T> {

	T findById(Integer id);
	
	List<T> findAll();
	
	void add (T entity);
	
	void delete (Integer id);
	
	T update (T entity);
	
}
