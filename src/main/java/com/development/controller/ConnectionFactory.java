package com.development.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// CONEXÃO COM O BANCO DE DADOS
public class ConnectionFactory {
	public Connection connection () throws ClassNotFoundException {
		// VERIFICAR PARÂMETROS TODA VEZ QUE FOR RODAR O BANCO
		String url_db = "jdbc:mysql://localhost:3306/db_olx";
        String user_db = "root";
        String password_db = "siprogram1165"; 
        
        Connection db_connection = null;
        try {
        	db_connection = DriverManager.getConnection(url_db, user_db, password_db);
            System.out.println("Banco db_olx conectado.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return db_connection;
	}
}
