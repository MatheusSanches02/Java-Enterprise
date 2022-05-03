package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Veiculo;

public class BuscandoVeiculo {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Veiculo veiculo = em.find(Veiculo.class, 1); //getReference()
		System.out.println("Veiculo de codigo " + veiculo.getCodigo() + " é um " + veiculo.getModelo());
		
		System.out.println("Pronto!");
		em.close();
		factory.close();

	}

}
