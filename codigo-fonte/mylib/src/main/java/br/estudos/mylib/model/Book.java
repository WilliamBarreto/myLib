/**
 * @author Jonathan Cabral
 * @Since October 23
 */
package br.estudos.mylib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String Publisher;
	private int pages;
	
	@OneToOne
	private Author fk_authorId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Author getFk_authorId() {
		return fk_authorId;
	}

	public void setFk_authorId(Author fk_authorId) {
		this.fk_authorId = fk_authorId;
	}
}
