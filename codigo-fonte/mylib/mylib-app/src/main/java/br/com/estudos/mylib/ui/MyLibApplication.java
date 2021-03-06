package br.com.estudos.mylib.ui;

import org.apache.wicket.cdi.CdiConfiguration;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import br.com.estudos.mylib.ui.template.HomePage;
import br.com.estudos.mylib.ui.teste.TestePage;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see br.estudos.mylib.Start#main(String[])
 */
public class MyLibApplication extends WebApplication {
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage() {
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init() {
		super.init();
        new CdiConfiguration().configure(this);
		mountPage("home", HomePage.class);
		mountPage("teste", TestePage.class);
	}
}
