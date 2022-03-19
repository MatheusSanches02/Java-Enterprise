package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Churros;

public interface ChurrosDao {

	void create(Churros churros);
	
	void update(Churros churros);
	
	void remove(Integer id);
	
	Churros findById(Integer id);
	
}
