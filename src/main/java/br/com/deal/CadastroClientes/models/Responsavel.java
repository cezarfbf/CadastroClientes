package br.com.deal.CadastroClientes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responsavel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idResponsavel;
	private String nome;
	private String cpf;
	
	
	
	public Responsavel(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public long getIdResponsavel() {
		return idResponsavel;
	}
	public void setIdResponsavel(long idResponsavel) {
		this.idResponsavel = idResponsavel;
	}
	
	

}
