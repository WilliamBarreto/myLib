package br.com.estudos.mylib.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
		Root<Book> root = cq.from(Book.class);
		cq.orderBy(cb.asc(root.<String>get("book")));
		return entityManger.createQuery(cq).getResultList();
	}

}
