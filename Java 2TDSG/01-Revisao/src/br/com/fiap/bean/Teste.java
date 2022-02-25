package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.exception.SaldoInsuficienteException;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(1, 102, Calendar.getInstance(), 1000.0, TipoConta.COMUM);
		ContaPoupanca cp1 = new ContaPoupanca(2, 103, new GregorianCalendar(2010, Calendar.JANUARY, 10), 5000.57, 0.3);

		cc1.Depositar(100);

		System.out.println("Saldo da cc: " + cc1.getSaldo());

		cp1.Depositar(100);

		System.out.println("Saldo da cp: " + cp1.getSaldo());

		try {
			cc1.Retirar(300);

			System.out.println("Novo Saldo da cc: " + cc1.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			cp1.Retirar(200);

			System.out.println("Novo Saldo da cp: " + cp1.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		}
		
		List<ContaCorrente> list = new ArrayList<ContaCorrente>();
		
		list.add(cc1);
		list.add(new ContaCorrente(5, 502, new GregorianCalendar(2005, Calendar.APRIL, 15), 100, TipoConta.COMUM));
		list.add(new ContaCorrente(6, 602, new GregorianCalendar(2007, Calendar.OCTOBER, 16), 100, TipoConta.ESPECIAL));
		
		System.out.println("Saldos: ");
		for(ContaCorrente churros : list) {
			System.out.println(churros.getSaldo());
		}
	}

}
