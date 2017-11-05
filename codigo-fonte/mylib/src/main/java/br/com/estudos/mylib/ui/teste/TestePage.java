package br.com.estudos.mylib.ui.teste;

import javax.inject.Inject;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import br.com.estudos.mylib.entity.Style;
import br.com.estudos.mylib.service.StyleService;
import br.com.estudos.mylib.ui.template.TemplatePage;

public class TestePage extends TemplatePage {

	private static final long serialVersionUID = 331428942884252955L;
	
	@Inject 
	private StyleService styleService;
	
	public TestePage(PageParameters pageParameters) {
		super(pageParameters,"Teste");
	}
	
	@Override
	protected void initComponents() {
	
	}
	@Override
	protected void initReferences() {
		add(newListViewStyles());
	}

	private PropertyListView<Style> newListViewStyles() {

		return new PropertyListView<Style>("styles", styleService.listar()) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<Style> item) {
				item.add(new Label("id"));
				item.add(new Label("style"));
				
			}
		};
	}
}
