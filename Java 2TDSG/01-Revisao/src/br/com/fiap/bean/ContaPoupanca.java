package br.com.fiap.bean;

public class ContaPoupanca extends Conta implements IContaInvestimento {
	
	private float taxa;
	private final float rendimento = 10;

	public float Depositar(float valor) {
		return saldo += valor;
	}
	
	public float Retirar(float valor, float taxa) {
		if (saldo > valor) {
			return saldo -= valor * taxa;
		}
		else {
			return saldo;
		}
	}
	
	public float calculaRetornoInvestimento() {
		return saldo * rendimento;
	}
}
