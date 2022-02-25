package br.com.fiap.revisao.model;

import java.util.List;

public class Carro {

	private int capacidade;
	private String cor;
	private String modelo;
	private int ano;
	private boolean automatico;
	protected double velocidade;
	
	List<Revisao> revisoes;
	
	private Combustivel combustivel;
	
	// Construtores -> métodos especial utilizado na instanciação da Classe
	// 1- Tem o mesmo nome da classe
	// 2- Não tem retorno, nem void
	public Carro(String modelo, int ano, double velocidade) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
	}
	
	// Criar o construtor com todos os atributos...
	public Carro(String modelo, int ano, double velocidade, String cor, int capacidade, boolean automatico) {
		this(modelo, ano, velocidade); // Chama o construtor com 3 parâmetros
		this.cor = cor;
		this.capacidade = capacidade;
		this.automatico = automatico;
	}
	
	//construtor com todos parametros
	public Carro(int capacidade, String cor, String modelo, int ano, boolean automatico, double velocidade,
			List<Revisao> revisao, Combustivel combustivel) {
		this(modelo, ano, velocidade, cor, capacidade, automatico);
		this.revisoes = revisao;
		this.combustivel = combustivel;
	}

	
	// public Carro() {}

	// Métodos
	
	public List<Revisao> getRevisoes() {
		return revisoes;
	}

	public void setRevisoes(List<Revisao> revisao) {
		this.revisoes = revisao;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

		//Sobrescrever o método toString para exibir os valores dos atributos
		@Override
		public String toString() {
			return "Modelo: " + modelo + " Ano: " + ano + " Velocidade: " + velocidade + 
					" Cor: " + cor + (automatico?" Automático":" Mecânico") + 
					" Capacidade: " + capacidade;
		}
	
	// Sobrecarga (Overload) - método com o mesmo nome mas com parâmetros diferentes
	// Parâmetros diferentes -> diferentes no tipo ou na quantidade

	public void acelerar(double velocidade) {
		this.velocidade += velocidade;
	}
	
	public void acelerar(int marcha) {
		// Aumentar a velocidade do carro de acordo com a marcha
		// velocidade = velocidade * 10/marcha;
		velocidade += 20 / marcha; // qualquer cálculo...
	}
	
	public void acelerar() {
		// Aumenta a velocidade em 10%
		// velocidade = velocidade + velocidade * 0.1;
		// velocidade = velocidade + velocidade/10;
		// velocidade = velocidade * 1.1;

		// velocidade += 10; // velocidade = velocidade + 10;

		velocidade *= 1.1; // velocidade = velocidade * 1.1;
	}
	public boolean validaAno() {
		return (ano >= 1990 && ano<= 2023)? true:false;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
}
