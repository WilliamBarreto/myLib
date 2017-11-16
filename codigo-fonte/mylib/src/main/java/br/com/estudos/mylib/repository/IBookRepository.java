package br.com.estudos.mylib.repository;

import java.util.List;

import br.com.estudos.mylib.entity.Book;

public interface IBookRepository {

	public List<Book> listar();

}
