package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.TapiocaDao;
import br.com.fiap.jpa.entity.Tapioca;

public class TapiocaDaoImpl extends GenericDaoImpl<Tapioca, Integer> implements TapiocaDao{

	public TapiocaDaoImpl(EntityManager em) {
		super(em);
	}

}
