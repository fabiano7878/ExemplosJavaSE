package br.com.exemplos.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){		
		try{
	return DriverManager.getConnection("jdbc:microsoft:sqlserver://labs007:1433;User=internet;Password=ntrnt");
		}catch(SQLException ex){
		throw new RuntimeException();
		}
	}

}
