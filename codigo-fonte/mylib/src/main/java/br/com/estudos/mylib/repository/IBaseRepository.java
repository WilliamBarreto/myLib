package br.com.estudos.mylib.repository;

import java.io.Serializable;
import java.util.List;

import br.com.estudos.mylib.entity.BaseEntity;

public interface IBaseRepository<I extends Serializable, T extends BaseEntity<I>> {

	List<T> listar();
	T salvar(T entity);
	void excluir(T entity);
	T buscarPorId(I id);
	
}
