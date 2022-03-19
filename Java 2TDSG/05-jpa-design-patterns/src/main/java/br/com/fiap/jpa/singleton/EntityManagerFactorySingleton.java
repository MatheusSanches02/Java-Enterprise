package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//1 - Atributo estatico que armazena a unica instancia
	private static EntityManagerFactory factory;
	
	//2 - Construtor privado
	private EntityManagerFactorySingleton() {}
	
	//3 - Método estatiico que retorna a única instancia
	public static EntityManagerFactory getInstance() {
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return factory;
	}
}
