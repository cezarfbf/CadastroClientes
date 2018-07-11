package br.com.deal.CadastroClientes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idTelefone;
	private String numero;
	
	
	
	public Telefone(String numero) {
		super();
		this.numero = numero;
	}
	public long getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(long idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
