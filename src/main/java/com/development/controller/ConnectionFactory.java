package com.development.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// CONEXÃO COM O BANCO DE DADOS
public class ConnectionFactory {
	public Connection connection () throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/db_olx";
        String user = "root";
        String password = "siprogram1165";
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Banco conectado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
	}
}
