package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {

	private TipoConta tipo;
	
	public float Depositar(double valor) {
		return saldo += valor;
	}
	
	public float Retirar(double valor, TipoConta tipoConta) throws Exception {
		try {
			saldo -= valor;
			if(tipoConta == tipo.COMUM && saldo < 0) {
				System.out.println("Operação nao concluida!");
				return saldo;
			}
			else {
				return saldo -=valor;
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, float saldo, TipoConta tipo){
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}
}
