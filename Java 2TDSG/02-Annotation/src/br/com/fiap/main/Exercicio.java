package br.com.fiap.main;

import br.com.fiap.model.Aluno;
import br.com.fiap.model.Carro;
import br.com.fiap.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Orm orm = new Orm();
		System.out.println(orm.pesquisar(aluno));
		Carro carro = new Carro();
		System.out.println(orm.pesquisar(carro));
	}

}
