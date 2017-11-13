package br.com.estudos.mylib.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.estudos.mylib.entity.Style;
import br.com.estudos.mylib.repository.IStyleRepository;
import br.com.estudos.mylib.service.StyleService;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class StyleServiceImpl implements StyleService{

	@Inject
	private IStyleRepository dao;
	
	public List<Style> listar(){
		return dao.listar();
	}
}
