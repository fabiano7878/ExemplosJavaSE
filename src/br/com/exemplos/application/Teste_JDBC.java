package br.com.exemplos.application;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.exemplos.jdbc.factory.ConnectionFactory;

public class Teste_JDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
			//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
		
			Connection con = new ConnectionFactory().getConnection();
			System.out.print("Concetado no Labs007. ");
			con.close();
	}
	
	/*
	
	 // @param args
	 // @throws ClassNotFoundException 
	 //@throws SQLException 
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try{
			//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			Class.forName("com.microsoft.jdbcx.sqlserver.SQLServerDataSource");
			conection();
		
		}catch (SQLException ex) {
			// TODO: handle exception
			System.out.println("Erro do SQL: "+ex);
		}
	}
public static void conection() throws SQLException{	
	
		Connection con = DriverManager.getConnection("jdbc:mssqlserver://labs007/Extremail,'internet','ntrnt'");
		System.out.println("Conectando no Labs007");

}
**/
	
	
}
