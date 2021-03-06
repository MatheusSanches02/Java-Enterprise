package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
												//ano, mes, dia, hora, minutos
		Calendar abertura = new GregorianCalendar(2022,1,22, 11,0); // mes de 0 - 11 ou usar Calendar.FEBRUARY
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(format.format(hoje.getTime()));
		System.out.println(format.format(abertura.getTime()));
		
		//datas com API Java 8
		
		LocalDate dataAtual = LocalDate.now();
		
		LocalDate dataApresentacao = LocalDate.of(2022, 5, 25);
		
		LocalTime horaAtual = LocalTime.now();
		
		LocalTime horaIntervalo = LocalTime.of(9, 40);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		LocalDateTime dataColacao = LocalDateTime.of(2023,3,3,19,0); //03/03/2023 19:00
		
		//Formatador de datas
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(dataAtual.format(formataData));
		System.out.println(dataApresentacao.format(formataData));
		
		DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println(horaAtual.format(formataHora));
		System.out.println(horaIntervalo.format(formataHora));
		
		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(dataHoraAtual.format(formataDataHora));
		System.out.println(dataColacao.format(formataDataHora));
	}
}
