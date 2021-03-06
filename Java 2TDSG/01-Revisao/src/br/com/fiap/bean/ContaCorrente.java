package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	private TipoConta tipo;

	public ContaCorrente() {

	}

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	@Override
	public double Depositar(double valor) {
		return saldo += valor;
	}

	public double Retirar(double valor) throws SaldoInsuficienteException {
		saldo -= valor;
		if (tipo == TipoConta.COMUM && saldo < 0) {
			System.out.println("Opera??o nao concluida!");
			saldo += valor;
			throw new SaldoInsuficienteException("Saldo insuficiente, valor disponivel: " + saldo);
		} else {
			return saldo;
		}

	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}


}
