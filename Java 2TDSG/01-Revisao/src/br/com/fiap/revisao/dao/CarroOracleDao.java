package br.com.fiap.revisao.dao;

import java.util.List;

import br.com.fiap.revisao.model.Carro;

public class CarroOracleDao implements CarroDao{
	
	public void cadastrar(Carro carro) {
		System.out.println("Cadastrando...");
	}

	public List<Carro> listar() {
		System.out.println("Listando do oracle...");
		return null;
	}

	
}
