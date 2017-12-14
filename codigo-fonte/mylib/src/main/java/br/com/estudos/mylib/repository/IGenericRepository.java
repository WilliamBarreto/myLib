package br.com.estudos.mylib.repository;

import java.util.List;

public interface IGenericRepository<T> {
	
	List<T> listAll(Class<T> clazz);
	T save(T t);
	T update(T t);
	void delete(T t);
	T findById(Class<T> clazz, T t);
}
