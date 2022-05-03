package br.com.fiap.jpa.dao.impl;


import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.ChurrosDao;
import br.com.fiap.jpa.entity.Churros;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdException;

public class ChurrosDaoImpl implements ChurrosDao{

	private EntityManager em;

	public ChurrosDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void create(Churros churros) {
		em.persist(churros);
	}

	public void update(Churros churros) throws IdException {
		//valida se o obj existe pra ser atualizado
		findById(churros.getCodigo());
		em.merge(churros);
	}

	public void remove(Integer id) throws IdException {
		Churros churros = findById(id);
		em.remove(churros);
	}

	public Churros findById(Integer id) throws IdException{
			Churros churrosId = em.find(Churros.class, id); //Pesquisa o churros
			if(churrosId != null) //valida se o churros existe
				return churrosId;
			throw new IdException(); //Se nao existir lançar exceção
		}
		

	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}
	
}
