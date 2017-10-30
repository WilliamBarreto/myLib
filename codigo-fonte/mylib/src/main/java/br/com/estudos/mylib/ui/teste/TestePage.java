package br.com.estudos.mylib.ui.teste;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import br.com.estudos.mylib.ui.template.TemplatePage;

public class TestePage extends TemplatePage {

	private static final long serialVersionUID = 331428942884252955L;

	public TestePage(PageParameters pageParameters) {
		super(pageParameters,"Teste");
	}
}
