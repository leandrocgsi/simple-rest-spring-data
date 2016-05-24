package br.com.erudio.repository.generic;

import java.util.List;

public interface IGenericRepository<T> {
	
	T create(T entity);
	T update(T entity);
	void delete(T entity);
	T findById(String id);
	List<T> findAll();
}