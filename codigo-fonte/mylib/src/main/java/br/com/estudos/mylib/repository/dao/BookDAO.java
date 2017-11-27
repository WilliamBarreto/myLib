package br.com.estudos.mylib.repository.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.estudos.mylib.entity.Book;
import br.com.estudos.mylib.repository.IBookRepository;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class BookDAO extends GenericDAO<Long, Book> implements IBookRepository {

	@PersistenceContext(unitName = "mylib-pu")
	private EntityManager entityManger;
	
	@Override
	public List<Book> listar() {
		return listAll();
	}
	
	@Override
	public EntityManager getEntityManager() {
		return entityManger;
	}

	@Override
	public Class<Book> getEntityClass() {		
		return Book.class;
	}

	@Override
	public Book salvar(Book entity) {
		return save(entity);
	}

	@Override
	public void excluir(Book entity) {
		delete(entity);
	}

	@Override
	public Book buscarPorId(Long id) {
		return findById(id);
	}

}
