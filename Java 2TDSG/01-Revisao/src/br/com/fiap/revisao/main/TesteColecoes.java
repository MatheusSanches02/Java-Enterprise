package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.fiap.revisao.model.Carro;
import br.com.fiap.revisao.model.CarroEsportivo;

public class TesteColecoes {

	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<Carro>();
		
		Carro ferrari = new Carro("Fearrari", 2021, 300.0);
		Carro masseratti = new Carro("Masseratti", 2022, 400.0);
		
		//carros.add(new Carro("Celta", 2010,80));
		
		carros.add(ferrari);
		carros.add(masseratti);
		
		for(int i = 0; i<carros.size(); i++) {
			System.out.println(carros.get(i));
		}
		
		for (Carro car : carros) {
			System.out.println(car);
		}
		
		Set<Carro> conjunto = new HashSet<Carro>();
		
		conjunto.add(masseratti);
		conjunto.add(masseratti); //elemento repetido, conjunto nao permite repeti??o
		conjunto.add(ferrari);
		
		for(int i = 0; i<conjunto.size(); i++) {
			System.out.println(carros.get(i));
		}
		
		for (Carro car : conjunto) {
			System.out.println(car);
		}
		
		//Cria um mapa com a chave do tipo String e o valor do tipo Carro
		Map<String, Carro> mapa = new HashMap<String, Carro>();
		
		mapa.put("Matheus", masseratti);
		mapa.put("Izadora", ferrari);
		
		//ao adicionar o valor em uma chave existente, o valor antigo ? substituido
		
		
		//Recuperar o carro no mapa atrav?s da chave
		System.out.println("Recuperar o valor do mapa pela chave");
		System.out.println(mapa.get("Matheus"));
		
		//Recuperar as chaves mapeadas
		Set<String> chaves = mapa.keySet();
		
		//Exibir as chaves e os valores do mapa
		System.out.println("Mapeamentos: ");
		for (String key : chaves) {
			System.out.println(key + "-" + mapa.get(key));
		}
	}
}
