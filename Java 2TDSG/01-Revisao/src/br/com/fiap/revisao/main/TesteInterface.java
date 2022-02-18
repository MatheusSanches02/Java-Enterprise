package br.com.fiap.revisao.main;

import br.com.fiap.revisao.dao.CarroDao;
import br.com.fiap.revisao.dao.CarroOracleDao;
import br.com.fiap.revisao.model.Carro;

public class TesteInterface {

	public static void main(String[] args) {
		
		CarroDao dao = new CarroOracleDao(); //new MySqlDao();
		//Eliminar dependencia, entao se eu precisar instanciar dao em outra classe, futuramente eu posso
		
		
		dao.cadastrar(new Carro("Polo", 2021, 100));
		
		dao.listar();
		
	}

}
