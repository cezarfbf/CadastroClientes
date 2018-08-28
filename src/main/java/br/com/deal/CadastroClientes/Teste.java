package br.com.deal.CadastroClientes;

import java.sql.Connection;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.deal.CadastroClientes.models.Cliente;
import br.com.deal.CadastroClientes.models.Endereco;
import br.com.deal.CadastroClientes.persistence.ConnectionMySQL;
import br.com.deal.CadastroClientes.repository.ClienteRepository;

public class Teste {
//	@Autowired
	private static ClienteRepository dao;
	
	public static void main(String arg[]) {
		
//		Connection conn = ConnectionMySQL.getConnection();
		
		Cliente cli = new Cliente("Teste", "1098908709832081", "PE");
		cli.setEmails(new ArrayList<>());
		cli.setEndereco(new Endereco());
		cli.setTelefones(new ArrayList<>());
		cli.setResponsaveis(new ArrayList<>());
		cli.setCodgio(10);
		
		try {
        dao.save(cli);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
