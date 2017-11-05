package br.com.estudos.mylib.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.estudos.mylib.entity.Style;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class StyleDAO {

	@PersistenceContext(unitName = "mylib-pu")
	private EntityManager entityManager;

	public List<Style> listar(){
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Style> cq = cb.createQuery(Style.class);
		cq.from(Style.class);
		return entityManager.createQuery(cq).getResultList();
	}
}
