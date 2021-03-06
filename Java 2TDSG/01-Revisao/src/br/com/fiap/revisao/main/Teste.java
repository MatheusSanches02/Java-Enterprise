package br.com.fiap.revisao.main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.revisao.model.Carro;
import br.com.fiap.revisao.model.CarroEsportivo;
import br.com.fiap.revisao.model.Combustivel;
import br.com.fiap.revisao.model.Revisao;

public class Teste {

	public static void main(String[] args) {
		//Instanciar a classe Carro
				Carro uno = new Carro("UNO", 1999, 70, "Vermelho", 5, false );
				
				//Atribuir valores para o objeto do tipo Carro
//				uno.setModelo("UNO");
//				uno.setAno(1999);
//				uno.setAutomatico(false);
//				uno.setCapacidade(5);
//				uno.setCor("Vermelho");
//				uno.setVelocidade(70);
				
				//Chamar os m?todos e exibir o resultado
				uno.acelerar(3); //marcha
				System.out.println("Velocidade atual: " + uno.getVelocidade());
				
				System.out.println(uno.validaAno()?"Ano correto":"Ano inv?lido");
				
				//Instanciar a classe CarroEsportivo com todos os valores (Menos a equipe)
				CarroEsportivo ferrari = 
						new CarroEsportivo("Ferrari", 2022, 300, "Vermelho", 1, false, true);
				
				//Chamar os m?todos e exibir o resultado
				ferrari.acelerar(); 
				System.out.println("Velocidade atual: " + ferrari.getVelocidade());
				
				System.out.println(ferrari.validaAno()?"Ano correto":"Ano inv?lido");
				
				//CarroEsportivo esporte = new Carro("Gol", 2010, 100); N?o compila!
				Carro carro = new CarroEsportivo("Gol", 2010, 100);
				
				//Sobrescrita executa o m?todo do Objeto
				carro.acelerar(); //Executou o m?todo do CarroEsportivo
				System.out.println("Velocidade atual: " + carro.getVelocidade());
				
				List<Revisao> revisoes = new ArrayList<Revisao>();
				
				revisoes.add(new Revisao(1000, 20000, LocalDate.of(2022,  Month.JANUARY, 20)));
				revisoes.add(new Revisao(499, 30000, LocalDate.now()));
				
				Carro polo = new Carro(5, "Cinza", "Polo", 2020, true, 100, revisoes, Combustivel.FLEX);
				
				System.out.println(polo);
				
				for (Revisao item : polo.getRevisoes()) {
					System.out.println(item);
				}
	}

}
