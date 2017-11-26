package br.com.estudos.mylib.repository;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.estudos.mylib.entity.Style;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class StyleDAO extends GenericDAO<Style> implements IStyleRepository {

	@PersistenceContext(unitName = "mylib-pu")
	private EntityManager entityManager;
}
