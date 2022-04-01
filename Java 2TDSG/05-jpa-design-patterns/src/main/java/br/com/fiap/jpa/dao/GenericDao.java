package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdException;

public interface GenericDao<E,K> {

	//E -> entidade 
	//K -> tipo do atributo da PK
	
	void create(E entity);
	
	void update(E entity) throws IdException;
	
	void remove(K id) throws IdException;
	
	E findById(K id) throws IdException;
	
	void commit() throws CommitException;
}
