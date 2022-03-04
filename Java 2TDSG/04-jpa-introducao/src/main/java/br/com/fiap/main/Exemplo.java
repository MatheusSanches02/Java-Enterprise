package br.com.fiap.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {

	public static void main(String[] args) {
		
		//name da persistence-unit no persistence.xml
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		fabrica.close();
	}

}
