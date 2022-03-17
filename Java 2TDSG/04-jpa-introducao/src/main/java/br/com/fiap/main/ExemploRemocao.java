package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.exercicio1.Aluno;

public class ExemploRemocao {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = factory.createEntityManager();
		
		Aluno aluno = em.find(Aluno.class, 1);
		
		em.remove(aluno);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println(aluno);
		
		factory.close();
		em.close();
	}

}
