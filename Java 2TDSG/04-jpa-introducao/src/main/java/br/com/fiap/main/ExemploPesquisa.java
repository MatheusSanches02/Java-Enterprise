package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.exercicio1.Aluno;

public class ExemploPesquisa {

	//Pesquisar um aluno pela PK
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = factory.createEntityManager();
		
		Aluno aluno = em.find(Aluno.class, 1); //(Entidde, PK)
		
		System.out.println(aluno);
		
		//aluno.setName("Carlos");
		
		//em.getTransaction().begin();
		//em.getTransaction().commit();
		
		//System.out.println(em.find(Aluno.class, 1));
		
		em.close();
		factory.close();
		
	}

}
