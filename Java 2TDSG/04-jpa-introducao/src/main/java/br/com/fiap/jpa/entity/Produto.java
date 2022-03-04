package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
						//nome no java, nome no banco, incremento
@SequenceGenerator(name="produto", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)
public class Produto {

	@Id //PK
	@Column(name="cd_produto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto") //gera valor automatico - generator = name
	private Integer codigo;
	
	@Column(name="nm_produto")
	private String nome;
	
	@Column(name="ds_produto")
	private String descricao;
	
	@Column(name="dt_fabricacao")
	private Calendar dataFabricacao;
	
	@Column(name="vl_rpoduto")
	private Double valor;
}
