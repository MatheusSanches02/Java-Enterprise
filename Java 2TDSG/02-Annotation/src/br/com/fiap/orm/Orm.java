package br.com.fiap.orm;

import java.lang.reflect.Field;

import br.com.fiap.annotation.Tabela;
import br.com.fiap.model.Aluno;

public class Orm {

	/**
	 * Metodo que recebe o objeto anotado com o @Tabela e retorna uma query de pesquisa
	 * @param obj
	 * @return SQL de pesquisa de acordo com a configuração de anotação
	 */
	public String pesquisar(Object obj) {
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		String nome = anotacao.nome();
		return ("SELECT * FROM " + nome);
	}
}
