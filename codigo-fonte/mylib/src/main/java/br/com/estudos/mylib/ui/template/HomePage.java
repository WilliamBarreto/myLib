package br.com.estudos.mylib.ui.template;

import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends TemplatePage {

	private static final long serialVersionUID = -3196747496151252015L;

	public HomePage(PageParameters pageParameters) {
		super(pageParameters,"Home");
		
	}
	
	@Override
	protected void initComponents() {}

	@Override
	protected void initReferences() {}	
}
