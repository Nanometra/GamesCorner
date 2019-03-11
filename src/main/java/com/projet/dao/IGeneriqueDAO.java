package com.projet.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IGeneriqueDAO<T> {

	T findById(Integer id);
	
	List<T> findAll();
	
	void add (T entity);
	
	void delete(Integer id);
	
	T update(T entity);
}
