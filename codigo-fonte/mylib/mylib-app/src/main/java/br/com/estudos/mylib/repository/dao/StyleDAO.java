package br.com.estudos.mylib.repository.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.estudos.mylib.entity.Style;
import br.com.estudos.mylib.repository.IStyleRepository;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class StyleDAO extends GenericDAO<Long, Style> implements IStyleRepository{

	@PersistenceContext(unitName = "mylib-pu")
	private EntityManager entityManager;

	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Override
	public Class<Style> getEntityClass() {
		return Style.class;
	}

	@Override
	public List<Style> listar() {
		return listAll();
	}

	@Override
	public Style salvar(Style entity) {
		return save(entity);
	}
	
	@Override
	public Style buscarPorId(Long id) {
		return findById(id);
	}

	@Override
	public void excluir(Style entity) {
		delete(entity);
	}
}
