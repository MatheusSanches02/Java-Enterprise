package br.com.fiap.main;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.fiap.exercicio1.Aluno;
import br.com.fiap.exercicio1.Genero;

public class ExemploCadastro {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//obter um entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//instanciar aluno
		Aluno aluno = new Aluno("Matheus", new GregorianCalendar(2000, Calendar.JULY, 10),Genero.MASCULINO, null,"rm87426@fiap.com.br",LocalDate.now(),true );
		
		//persistir aluno
		em.persist(aluno);
		
		//Transa??o
		em.getTransaction().begin(); //come?ar a transa??o
		em.getTransaction().commit();//finalizar transa??o com commit
		
		System.out.println("Aluno cadatrado!");
		
		
		em.close();
		fabrica.close();
		
		
	}
	
}
