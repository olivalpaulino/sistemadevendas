/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemadevendas.dao;

import br.com.sistemadevendas.jdbc.ConnectionFactory;
import br.com.sistemadevendas.model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Olival Paulino
 */
public class ClientesDAO {
    private Connection con;
    
    public ClientesDAO() throws ClassNotFoundException {
        this.con = new ConnectionFactory().getConnection();
    }
    
    // Metodo Cadastrar Cliente
    public void cadastrarCliente(Clientes obj) {
        try {
            // 1. Comando SQL para inserir dados no banco de dados
            String sql = "INSERT INTO tb_clientes(nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            // 2. Conectar ao banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome()); // na primeira interrogação substitua pelo nome do obj 
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());           
            
            // 3. Executar o Comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar o Cliente - "+e.getMessage());
        }
    }
    
    // Metodo Alterar CLiente
    public void alterarCliente() {
        
    }
    
    // Medoto Excluir Cliente
    public void excluirCliente() {
        
    }
}
