package br.com.fiap.jpa.main;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.impl.ChurrosDaoImpl;
import br.com.fiap.jpa.entity.Churros;
import br.com.fiap.jpa.entity.Cobertura;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Exemplo {

	public static void main(String[] args) {
		
		//Obter uma fabrica
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager em = factory.createEntityManager();
		
		Churros churros = new Churros("churros", new BigDecimal(10.0), "doce de leite", Calendar.getInstance(), null, Cobertura.NUTELLA );
		
		ChurrosDaoImpl dao = new ChurrosDaoImpl(em);
		
		try {
			dao.create(churros);
			dao.commit();
		}catch(CommitException e) {
			System.err.println(e.getMessage());
		}
		try {
			dao.findById(1);
		}catch(IdException e) {
			System.err.println(e.getMessage());
		}
		try {
			churros.setSabor("chocolate");
			dao.update(churros);
			dao.commit();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			dao.remove(3);
			dao.commit();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		//Fechar fabrica
		em.close();
		factory.close();
	}

}
