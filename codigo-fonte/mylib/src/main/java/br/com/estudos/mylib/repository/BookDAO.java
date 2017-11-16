package br.com.estudos.mylib.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.estudos.mylib.entity.Book;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class BookDAO implements IBookRepository {

	@PersistenceContext(unitName = "mylib-pu")
	private EntityManager entityManger;
	
	@Override
	public List<Book> listar() {
		CriteriaBuilder cb = entityManger.getCriteriaBuilder();
		CriteriaQuery<Book> cq = cb.createQuery(Book.class);
		cq.from(Book.class);
		return entityManger.createQuery(cq).getResultList();
	}

}
