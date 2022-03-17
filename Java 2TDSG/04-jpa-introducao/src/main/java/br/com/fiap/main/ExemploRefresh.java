package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.exercicio1.Aluno;

public class ExemploRefresh {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
		
		Aluno aluno = em.find(Aluno.class, 1);
		
		System.out.println(aluno.getName());
		
		aluno.setName("Arthur");
		
		System.out.println(aluno.getName());
		
		em.refresh(aluno);
		
		System.out.println(aluno.getName());
		
		factory.close();
		em.close();
	}

}
