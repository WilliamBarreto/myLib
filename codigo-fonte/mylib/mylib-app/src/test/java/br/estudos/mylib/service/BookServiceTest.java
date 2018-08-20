package br.estudos.mylib.service;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.estudos.mylib.entity.Book;


@RunWith(Arquillian.class)
public class BookServiceTest {

	@Inject
	private Book book;
	
	@Deployment
	public static JavaArchive createDeployment() {
		JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
				.addClass(Book.class)
				.addAsManifestResource(EmptyAsset.INSTANCE,"beans.xml"); 
		System.out.println(jar.toString(true));
		return jar;
			
	}
	
	@Test
	public void test() {
		Assert.assertNotNull(book);
	}

}
