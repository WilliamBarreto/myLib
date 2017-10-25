/**
 * @author Jonathan Cabral
 * @Since October 23
 */
package br.estudos.mylib.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="book_style")
public class BookStyle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	private List<Book> fk_bookId;
	
	@ManyToMany
	private List<Style> fk_styleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Book> getFk_bookId() {
		return fk_bookId;
	}

	public void setFk_bookId(List<Book> fk_bookId) {
		this.fk_bookId = fk_bookId;
	}

	public List<Style> getFk_styleId() {
		return fk_styleId;
	}

	public void setFk_styleId(List<Style> fk_styleId) {
		this.fk_styleId = fk_styleId;
	}
}
