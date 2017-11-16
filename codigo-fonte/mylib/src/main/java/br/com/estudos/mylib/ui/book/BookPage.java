package br.com.estudos.mylib.ui.book;

import javax.inject.Inject;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import br.com.estudos.mylib.entity.Book;
import br.com.estudos.mylib.service.IBookService;
import br.com.estudos.mylib.ui.template.TemplatePage;

public class BookPage extends TemplatePage{

	private static final long serialVersionUID = -1563636148708780123L;

	@Inject
	private IBookService bookService;
	
	public BookPage(PageParameters pageParameters) {
		super(pageParameters, "Book");
	}

	@Override
	protected void initReferences() {
		add(newListViewBook());
	}

	@Override
	protected void initComponents() {
		
	}
	
	private PropertyListView<Book> newListViewBook(){
		return new PropertyListView<Book>("books", bookService.listar()) {
			private static final long serialVersionUID = 2285564972817843726L;

			@Override
			protected void populateItem(ListItem<Book> item) {
				item.add(new Label("book"));
				item.add(new Label("pages"));
			}
			
		};
	}
}
