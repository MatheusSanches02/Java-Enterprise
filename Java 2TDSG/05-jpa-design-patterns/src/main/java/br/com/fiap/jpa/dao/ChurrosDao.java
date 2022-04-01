package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Churros;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdException;

public interface ChurrosDao {

	void create(Churros churros);
	
	void update(Churros churros) throws IdException;
	
	void remove(Integer id) throws IdException;
	
	Churros findById(Integer id) throws IdException;
	
	void commit() throws CommitException;
	
}
