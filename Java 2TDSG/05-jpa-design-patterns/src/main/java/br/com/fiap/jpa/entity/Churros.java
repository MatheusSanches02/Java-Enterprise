package br.com.fiap.jpa.entity;

import java.math.BigDecimal;
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

@Entity
@Table(name="TB_CHURROS")
@SequenceGenerator(name="churros", sequenceName = "SQ_TB_CHURROS", allocationSize =1)
public class Churros {

	@Id
	@Column(name="cd_churros")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="churros")
	private Integer codigo;
	
	@Column(name="nm_churros", length=20, nullable=false)
	private String nome;
	
	@Column(name="vl_churros", precision=10,scale=2)
	private BigDecimal valor;
	
	@Column(name="ds_sabor", length=60, nullable=false)
	private String sabor;
	
	@Column(name="dt_validade")
	@Temporal(TemporalType.DATE)
	private Calendar validade;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_cobertura", length = 20, nullable = false)
	private Cobertura cobertura;
	
	

	public Churros() {} //usar no find

	public Churros(String nome, BigDecimal valor, String sabor, Calendar validade, byte[] foto,
			Cobertura cobertura) {
		this.nome = nome;
		this.valor = valor;
		this.sabor = sabor;
		this.validade = validade;
		this.foto = foto;
		this.cobertura = cobertura;
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Calendar getValidade() {
		return validade;
	}

	public void setValidade(Calendar validade) {
		this.validade = validade;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Cobertura getCobertura() {
		return cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	
}
