package br.com.fiap.main;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.exercicio1.Aluno;
import br.com.fiap.exercicio1.Genero;

public class ExemploAtualizacao {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = factory.createEntityManager();
		
		//Instanciar um aluno com as informações e com um código (detached)
		Aluno aluno1 = new Aluno(1,"Jose",new GregorianCalendar(2022, Calendar.JANUARY, 3), Genero.MASCULINO, null, "jose@fiap.com",LocalDate.now(), true);
		
		//Atualizar o aluno
		Aluno copia1 = em.merge(aluno1);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		copia1.setName("Junior");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Aluno atualizado!");
		
		em.close();
		factory.close();

	}

}
