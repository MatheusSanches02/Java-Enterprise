package br.com.fiap.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.model.Carro;

public class Exemplo {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		//Exibir nome da classe
		System.out.println(carro.getClass().getName());
		
		//Recuperar os atributos do carro
		Field[] atributos = carro.getClass().getDeclaredFields();
		
		System.out.println("ATRIBUTOS");
		
		for(Field churros : atributos) {
			System.out.println(churros);//.getName .getType
			//Recuperar a anotação @Coluna
			Coluna anotacao = churros.getAnnotation(Coluna.class);
			//Exibir os valores dos parametros
			System.out.println("Nome: " + anotacao.nome());
			System.out.println("Chave? " + anotacao.chave());
			System.out.println("Tamanho: " + anotacao.tamanho());
			System.out.println("Obrigatório? " + anotacao.obrigatorio() + "\n");
		}
		
		//Recuper os metodos do carro
		Method[] metodos = carro.getClass().getDeclaredMethods();
		
		System.out.println("METODOS");
		for(Method banana : metodos) {
			System.out.println(banana);
		}
	}
}
