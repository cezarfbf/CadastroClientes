package br.com.deal.CadastroClientes.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	private static final String URL = "jdbc:mysql://localhost:3306/cadastro_cliente?useTimezone=true&serverTimezone=UTC&useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	public static Connection getConnection(){
		
		Connection conn = null;
				
		try {
			conn = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("Conectado com sucesso! ");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar: "+e.getMessage()+" "+e.getSQLState());
		}
		
		return conn;
		
	}

}
