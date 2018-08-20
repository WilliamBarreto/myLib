package br.com.estudos.mylib.entity;

import java.io.Serializable;

public interface IBaseEntity<I extends Serializable> extends Serializable{
	I getId();
}
