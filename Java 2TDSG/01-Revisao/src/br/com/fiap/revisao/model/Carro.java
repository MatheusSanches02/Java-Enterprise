package br.com.fiap.revisao.model;

public class Carro {

	private int capacidade;
	private String cor;
	private String modelo;
	private int ano;
	private boolean automatico;
	protected double velocidade;
	
	// Construtores -> m�todos especial utilizado na instancia��o da Classe
	// 1- Tem o mesmo nome da classe
	// 2- N�o tem retorno, nem void
	public Carro(String modelo, int ano, double velocidade) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
	}
	
	// Criar o construtor com todos os atributos...
	public Carro(String modelo, int ano, double velocidade, String cor, int capacidade, boolean automatico) {
		this(modelo, ano, velocidade); // Chama o construtor com 3 par�metros
		this.cor = cor;
		this.capacidade = capacidade;
		this.automatico = automatico;
	}
	
	// public Carro() {}

	// M�todos
	// Sobrecarga (Overload) - m�todo com o mesmo nome mas com par�metros diferentes
	// Par�metros diferentes -> diferentes no tipo ou na quantidade

	public void acelerar(double velocidade) {
		this.velocidade += velocidade;
	}
	
	public void acelerar(int marcha) {
		// Aumentar a velocidade do carro de acordo com a marcha
		// velocidade = velocidade * 10/marcha;
		velocidade += 20 / marcha; // qualquer c�lculo...
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
