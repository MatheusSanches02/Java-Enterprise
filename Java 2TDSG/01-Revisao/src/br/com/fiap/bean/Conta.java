package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public abstract class Conta {

	private int agencia;
	private int numero;
	private Calendar dataAbertura;
	protected double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}


	public abstract double Depositar(double valor);
	
	public abstract double Retirar(double valor) throws SaldoInsuficienteException;
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
