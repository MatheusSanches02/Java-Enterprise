package br.com.fiap.jpa.entity;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_PRODUTO")
						//nome no java, nome no banco, incremento
@SequenceGenerator(name="produto", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)
public class Produto {

	@Id //PK
	@Column(name="cd_produto")//nao precisa do nullable pq o Id ja define isso
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto") //gera valor automatico - generator = name
	private Integer codigo;
	
	@Column(name="nm_produto", nullable = false, length = 20)
	private String nome;
	
	@Column(name="ds_produto", length = 100)
	private String descricao;
	
	@Column(name="dt_fabricacao") 
	@Temporal(TemporalType.DATE) //define o que sera armazenado no banco de dados (data), somente para Calendar
	private Calendar dataFabricacao;
	
	@Column(updatable = false, name="cadastro") //updatable --> campo sera atualizado?
	private LocalDate dataCadastro;
	
	@Column(name="vl_rpoduto", nullable = false) //nullable --> campo pode ser nulo?
	private Double valor;
	
	@Transient //Não sera uma coluna na tabela
	private int idade;
	
	@Lob //campo para armazenar arquivos
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING) // Grava no banco o texto da constante
	@Column(nullable = false, name = "ds_estado", length = 10)
	private EstadoProduto estado;
	
	public Produto() {}

	public Produto(Integer codigo, String nome, String descricao, Calendar dataFabricacao, LocalDate dataCadastro,
			Double valor, int idade, byte[] foto, EstadoProduto estado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
		this.dataCadastro = dataCadastro;
		this.valor = valor;
		this.idade = idade;
		this.foto = foto;
		this.estado = estado;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public EstadoProduto getEstado() {
		return estado;
	}

	public void setEstado(EstadoProduto estado) {
		this.estado = estado;
	}
	
	
}
