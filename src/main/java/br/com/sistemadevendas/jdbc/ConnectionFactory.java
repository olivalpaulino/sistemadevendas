/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemadevendas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Olival Paulino
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws ClassNotFoundException {
        Connection conexao = null;
        try {
            // Dados da conexao com o banco de dados MySQL
            String url = "jdbc:mysql://localhost:3306/bdvendas";
            String usuario = "usuariocurso";
            String senha = "123";
            // Carregar o Driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Estabelecendo a conexao
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            System.out.println("Conexão Realizada com Sucesso!");
        } catch(SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados");
            System.err.println(e);
        }
        
        return conexao;
    }
}
