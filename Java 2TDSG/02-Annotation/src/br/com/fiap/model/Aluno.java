package br.com.fiap.model;

import br.com.fiap.annotation.Tabela;

@Tabela(nome = "TB_ALUNO")
public class Aluno {

	private String nome;
	private String classe;
	private int idade;
}
