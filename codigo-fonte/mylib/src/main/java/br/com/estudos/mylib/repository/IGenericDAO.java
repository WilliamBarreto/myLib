package br.com.estudos.mylib.repository;

import java.util.List;

public interface IGenericDAO<T> {
	
	List<T> listAll(Class<T> clazz);
	T save(T t);
	List<T> update();
	void delete();
	List<T> findById(T t);
}
