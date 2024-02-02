/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemadevendas.jdbc;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Olival Paulino
 */
public class TestaConexao {
    // Testando a conexao com o BD
    
    public static void main(String[] args) {
        try {
            Connection conexao = new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
            ConnectionFactory.fecharConexao(conexao);
        } catch(Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: "+erro);
        }
    }
}
