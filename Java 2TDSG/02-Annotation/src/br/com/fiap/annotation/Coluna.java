package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define ate quando a anota??o ? mantida
@Retention(RetentionPolicy.RUNTIME)
//Define onde pode ser utilizada a anota??o
@Target(ElementType.FIELD)//field = atributo
public @interface Coluna {

	String nome();
	boolean chave() default false;
	int tamanho() default 0;
	boolean obrigatorio() default false;
}
