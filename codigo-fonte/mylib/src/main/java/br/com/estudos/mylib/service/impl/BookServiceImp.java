package br.com.estudos.mylib.service.impl;

import java.util.Collections;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.estudos.mylib.entity.Book;
import br.com.estudos.mylib.repository.IBookRepository;
import br.com.estudos.mylib.service.IBookService;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class BookServiceImp implements IBookService{

	@Inject
	private IBookRepository dao;
	
	@Override
	public List<Book> listar() {
		return Collections.unmodifiableList(dao.listar());
	}

}
