package br.com.fiap.revisao.model;

public class CarroEsportivo extends Carro{

	//Atributos
		private boolean turbo;
		
		private Equipe equipe; //CarroEsportivo tem uma equipe
		
		//Construtores? São herdados? Não!
		//O construtor da classe filha precisa chamar um construtor do pai
		public CarroEsportivo(String modelo, int ano, double velocidade) {
			super(modelo, ano, velocidade); //chama o construtor do pai
		}

		//Criar o construtor com todos os atributos 
		public CarroEsportivo(String modelo, int ano, double velocidade, String cor,
				int capacidade, boolean automatico, boolean turbo) {
			super(modelo, ano, velocidade, cor, capacidade, automatico);
			this.turbo = turbo;
		}
		
		//Métodos
		//Sobrescrita (Override) -> mesmo método do pai implementado na classe filha
		public void acelerar() {
			//Se for turbo aumenta em 40%, se não aumenta em 20% a velocidade
			velocidade *= turbo ? 1.4 : 1.2 ;
		}
		
		//Getters e Setters
		public boolean isTurbo() {
			return turbo;
		}

		public void setTurbo(boolean turbo) {
			this.turbo = turbo;
		}

		public Equipe getEquipe() {
			return equipe;
		}

		public void setEquipe(Equipe equipe) {
			this.equipe = equipe;
		}
}
