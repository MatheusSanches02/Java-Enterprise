package br.com.fiap.exercicio1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_ALUNO")
@SequenceGenerator(name="aluno", sequenceName = "SQ_TB_ALUNO", allocationSize =1)
public class Aluno {

	@Id
	@Column(name="cd_aluno")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aluno")
	private Integer rm;
	
	@Column(name="nm_aluno", length = 80, nullable =false)
	private String name;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", length = 14, nullable = false)
	private Genero genero;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Column(name="ds_email", length = 60, nullable = false)
	private String email;
	
	@Column(name="dt_matricula", updatable = false)
	private LocalDate dataMatricula;
	
	@Column(name="st_ativo")
	private Boolean isActive;
	
	@Transient
	private Integer idade;
	
	public Aluno() {}
	
	public Aluno(String name, Calendar dataNascimento, Genero genero, byte[] foto, String email,
			LocalDate dataMatricula, Boolean isActive) {
		this.name = name;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.foto = foto;
		this.email = email;
		this.dataMatricula = dataMatricula;
		this.isActive = isActive;
	}

	public Aluno(Integer rm,String name, Calendar dataNascimento, Genero genero, byte[] foto, String email,
			LocalDate dataMatricula, Boolean isActive) {
		this.rm = rm;
		this.name = name;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.foto = foto;
		this.email = email;
		this.dataMatricula = dataMatricula;
		this.isActive = isActive;
	}
	
	//Criar um metodo que ? executado automaticamente antes ou apos algum evento
	@PrePersist //Antes de cadastrar
	@PostPersist //Depois de cadastrar
	private void executar() {
		System.out.println("A??o sendo executada...");
	}
	
	@PostLoad //Depois de carregar o objeto
	private void carregar() {
		System.out.println("Carregando a idade");
		idade = 10;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Rm: " + rm + " Nome: " + name + " Data nascimento: " + sdf.format(dataNascimento.getTime()) +
				" Genero: " + genero + " E-mail: " + email + "Data Matricula: "
				+ dataMatricula.format(formataData) + " Ativo: " +  isActive;
	}

	public Integer getRm() {
		return rm;
	}

	public void setRm(Integer rm) {
		this.rm = rm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
}
