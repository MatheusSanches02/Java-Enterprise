package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define ate quando a anotação é mantida
@Retention(RetentionPolicy.RUNTIME)
//Define onde pode ser utilizada a anotação
@Target(ElementType.TYPE)//type = class
public @interface Tabela {

	String nome();
}
