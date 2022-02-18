package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(cc1);
		System.out.println(cc1.saldo);
	}

}
