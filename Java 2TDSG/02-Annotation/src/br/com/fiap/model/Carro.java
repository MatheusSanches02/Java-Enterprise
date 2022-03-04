package br.com.fiap.model;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.annotation.Tabela;

@Tabela(nome="TB_CARRO")
public class Carro {

	@Coluna(nome= "cd_carro", chave = true)
	private int codigo;
	@Coluna(nome = "ds_modelo", tamanho = 60, obrigatorio = true)
	private String modelo;
	@Coluna(nome = "ds_ano")
	private int ano;
	@Coluna(nome = "ds_cor", tamanho = 50)
	private String cor;
	@Coluna(nome = "ds_tipo", tamanho = 40, obrigatorio = true)
	private String tipo;
	
	//Getters e setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
