package br.com.fiap.jpa.main;

import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Exemplo {

	public static void main(String[] args) {
		
		//Octer uma fabrica
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		
		//Fechar fabrica
		factory.close();

	}

}
