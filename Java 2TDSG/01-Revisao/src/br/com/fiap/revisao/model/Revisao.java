package br.com.fiap.revisao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Revisao {

	private double valor;
	private double km;
	private LocalDate data;
	
	// Construtos - CTRL + 3 -> gcuf
	public Revisao(double valor, double km, LocalDate data) {
		this.valor = valor;
		this.km = km;
		this.data = data;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Data : " + data.format(padrao) + " Km: " + km + " Valor: " + valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
}
