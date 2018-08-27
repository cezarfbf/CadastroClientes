package br.com.deal.CadastroClientes.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jboss.jandex.Main;

public class ConnectionMySQL {
	
	private static Properties config = new Properties();
	private static String path = "src/main/resources/application.properties";
	
	public static Connection getConnection(){
		
		
		
		Connection conn = null;
				
		try {
			config.load(new FileInputStream(path));
			conn = DriverManager.getConnection(config.getProperty("URL"),config.getProperty("USER"),config.getProperty("PASS"));
			System.out.println("Conectado com sucesso! ");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar: "+e.getMessage()+" "+e.getSQLState());
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo config DB não encontrado: "+e.getMessage());
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
		} catch (IOException e) {
			System.out.println("Arquivo config DB não encontrado: "+e.getMessage());
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return conn;
		
	}

}
