package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {

	private int agencia;
	private int numero;
	private Calendar dataAbertura;
	protected float saldo;
	
	public float Depositar(float valor) {
		return saldo += valor;
	}
	
	public float Retirar(float valor) throws Exception {
		return saldo -= valor;
	}
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, Calendar dataAbertura, float saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}
	
}
