package br.com.fiap.bean;

import java.util.Calendar;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(001, 1, Calendar.getInstance(), 5000.0, TipoConta.COMUM);
		ContaPoupanca cp1 = new ContaPoupanca(002, 2, Calendar.getInstance(), 5000.0, TipoConta.ESPECIAL);
		
		List<ContaCorrente> contas;
		contas.add(cc1);
		System.out.println(cc1.saldo);
	}

}
