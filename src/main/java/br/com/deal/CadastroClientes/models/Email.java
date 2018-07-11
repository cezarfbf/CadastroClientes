package br.com.deal.CadastroClientes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idEmail;
	private String endereco;
	
	
	
	public Email(String endereco) {
		super();
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getIdEmail() {
		return idEmail;
	}
	public void setIdEmail(long idEmail) {
		this.idEmail = idEmail;
	}

}
