package aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Veiculo;

public class Programa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Veiculo veiculo1 = new Veiculo();
		
		veiculo1.setFabricante("Honda");
		veiculo1.setModelo("Civic");
		veiculo1.setAnoFabricacao(2020);
		veiculo1.setAnoModelo(2020);
		veiculo1.setValor(new BigDecimal(905000));
		
		em.persist(veiculo1);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
}
