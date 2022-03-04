package br.com.fiap.exercicio1.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteExercicio {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		fabrica.close();

	}

}
