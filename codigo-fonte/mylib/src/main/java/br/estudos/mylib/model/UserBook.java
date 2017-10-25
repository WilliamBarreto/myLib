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
@Table(name="user_book")
public class UserBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	private List<User> fk_userId;
	
	@ManyToMany
	private List<Book> fk_bookId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<User> getFk_userId() {
		return fk_userId;
	}

	public void setFk_userId(List<User> fk_userId) {
		this.fk_userId = fk_userId;
	}

	public List<Book> getFk_bookId() {
		return fk_bookId;
	}

	public void setFk_bookId(List<Book> fk_bookId) {
		this.fk_bookId = fk_bookId;
	}
}
