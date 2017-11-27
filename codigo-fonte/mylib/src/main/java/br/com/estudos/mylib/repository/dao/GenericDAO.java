package br.com.estudos.mylib.repository.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.estudos.mylib.entity.BaseEntity;

public abstract class GenericDAO<I extends Serializable, T extends BaseEntity<I>>{

	protected List<T> listAll() {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder(); 
		CriteriaQuery<T> cq = cb.createQuery(getEntityClass());
		cq.from(getEntityClass());
		return getEntityManager().createQuery(cq).getResultList();
	}
	
	protected T save(T entity) {
		if(entity.getId() == null)
			getEntityManager().persist(entity);
		return entity;
	}

	protected T update(T entity) {
		return getEntityManager().merge(entity);
	}

	protected void delete(T entity) {
		T entityToDelete = findById(entity.getId());
		getEntityManager().remove(entityToDelete);
	}

	protected T findById(I id) {
		return getEntityManager().find(getEntityClass(), id);
	}
	
	public abstract EntityManager getEntityManager();
	
	public abstract Class<T> getEntityClass();
}
