package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements IContaInvestimento {
	
	private double taxa;
	//Constante
	//final:
	//atributos -> n�o permite aletar o valor
	//m�todos -> n�o permite a sobrescrita
	//classe -> n�o permite a heran�a
	//static: define o elemento como sendo da classe e n�o do objeto
	public static final double RENDIMENTO = 10;
	
	public ContaPoupanca() {}

	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, double taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	@Override
	public double Depositar(double valor) {
		return saldo += valor;
	}
	
	@Override
	public double Retirar(double valor)throws SaldoInsuficienteException {
		if(saldo < valor +taxa) {
			throw new SaldoInsuficienteException(saldo-taxa);
		}
		return saldo -= valor * taxa;
	}
	
	@Override
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
}
