package br.com.estudos.mylib.ui.template;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import br.com.estudos.mylib.ui.book.BookPage;
import br.com.estudos.mylib.ui.teste.TestePage;

public abstract class TemplatePage extends WebPage{

	private static final long serialVersionUID = 1426508442885188335L;
	private String name;
	
	public TemplatePage(PageParameters pageParameters, String name) {
		super(pageParameters);
		this.name = name;
		initName();
		initMenu();
		initReferences();
		initComponents();
	}

	private void initName() {
		add(new Label("title", getName()));
		add(new Label("titulo",getName()));
	}

	protected abstract void initReferences();
	
	protected abstract void initComponents();

	private void initMenu() {
		add(lnkMylib());
		add(lnkHome());
		add(lnkTest());
		add(lnkBook());
	}

	private Link<Void> lnkHome() {
		return new Link<Void>("home") {
			private static final long serialVersionUID = -288119186975649069L;

			@Override
			public void onClick() {
				setResponsePage(getApplication().getHomePage());
			}
		};
	}

	private Link<Void> lnkMylib() {
		return new Link<Void>("mylib") {
			private static final long serialVersionUID = -288119186975649069L;

			@Override
			public void onClick() {
				setResponsePage(getApplication().getHomePage());
			}
		};
	};
	
	private Link<Void> lnkTest() {
		return new Link<Void>("test") {
			private static final long serialVersionUID = -288119186975649069L;

			@Override
			public void onClick() {
				setResponsePage(TestePage.class);
			}
		};
	}

	private Link<Void> lnkBook(){
		return new Link<Void>("book") {
			private static final long serialVersionUID = -8144804952823314967L;

			@Override
			public void onClick() {
				setResponsePage(BookPage.class);
			}
		};
	}

	public String getName() {
		if(name == null)
			return "MYLIB";
		return name;
	}
}
