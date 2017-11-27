package br.com.estudos.mylib.repository;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.estudos.mylib.entity.BaseEntity;

@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class GenericDAO<T extends BaseEntity<Long>> implements IGenericRepository<T>{

	@PersistenceContext(unitName="mylib-pu")
	protected EntityManager entityManger;

	@Override
	public List<T> listAll(Class<T> clazz) {
		CriteriaBuilder cb = entityManger.getCriteriaBuilder(); 
		CriteriaQuery<T> cq = cb.createQuery(clazz);
		cq.from(clazz);
		return entityManger.createQuery(cq).getResultList();
	}
	
	@Override
	public T save(T t) {
		if(t.getId() == null)
			entityManger.persist(t);
		return t;
	}

	@Override
	public List<T> update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findById(T t) {
		// TODO Auto-generated method stub
		return null;
	}
}
