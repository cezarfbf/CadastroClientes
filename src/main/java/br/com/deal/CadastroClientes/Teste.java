package br.com.deal.CadastroClientes;

import br.com.deal.CadastroClientes.persistence.Connect;

public class Teste {
	
	public static void main(String arg[]) {
		
		Connect conn = new Connect();
		
		conn.getConnection();
		
	}

}
