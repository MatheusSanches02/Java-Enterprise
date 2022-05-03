package aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Veiculo;

public class ListandoVeiculos {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = factory.createEntityManager();
		
		Query query = em.createQuery("select v from Veiculo v");
		
		
		List<Veiculo> veiculos = query.getResultList();
		
		for( Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getCodigo() + " - " 
					+ veiculo.getFabricante() + " "
					+ veiculo.getModelo() + ", ano " 
					+ veiculo.getAnoFabricacao() +  "/" 
					+ veiculo.getAnoModelo() + " por "
					+ "R$" + veiculo.getValor() );
		}
		
		
		System.out.println("Pronto");
		em.close();
		factory.close();
	}

}
