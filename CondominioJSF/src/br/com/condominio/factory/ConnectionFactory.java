package br.com.condominio.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static final String USUARIO = "root";
	public static final String SENHA = "Gui246060";
	public static final String URL = "jdbc:mysql://localhost:3306/condominio";

	public static Connection conectar() throws SQLException {
		Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
		return connection;

	}
	public static void main(String[] args) {
		try{
		Connection connection = ConnectionFactory.conectar();
		System.out.println("Boa Garoto!!!!");
	}catch (SQLException ex) {
		ex.printStackTrace();
		System.out.println("uma hora voce consegue!");
		
	}
	}
}