/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

// Importando biblioteca de comandos SQL para Java.
import java.sql.*;

/**
 * Classe que conecta o sistema ao Banco de Dados.
 *
 * @author Kevin Fernando
 */
public class ConexaoDAO {
    // Atributo do tipo Connection que recebe uma conexão. 
    public static Connection conexao = null;
    
    /**
     * Método que conecta o sistema ao Banco de Dados.
     */
    public static void Conecta() {
        // Definindo paramêtros para conexão com o Banco de Dados.
        String dsn = "projeto"; // Nome do Banco de Dados que quer se conectar.
        String user = "postgres"; // Usuário que usará para se conectar.
        String passwd = "postdba"; // Senha para o usuário informado.
        
        // Usamos tratamento de excessão para tratar possíveis erros de conexão.
        try {
            // Registrando o driver importado para o PostgreSQL.
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            // Definindo a URL que o driver usará para tentar a conexão.
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            // Tentando conexão com o Banco de Dados através do DriverManager.
            conexao = DriverManager.getConnection(url, user, passwd);
            // Desativando o auto commit do Banco de Dados.
            conexao.setAutoCommit(false);
            
            // Estrutura que testa a conexão para validá-la.
            if(conexao == null) 
                System.out.println("Erro ao conectar"); // Exibe mensagem com o status de conexão no terminal.
            else 
                System.out.println("Conectado com sucesso!"); // Exibe mensagem com o status de conexão no terminal.
        }// Fecha try. 
        catch (Exception errCon) {
            System.out.println("Erro de Conexão: " + errCon); // Mensagem de erro.
        }// Fecha catch.
    }// Fecha método Conecta.
    
    /**
     * Método que desconecta o sistema do Banco de Dados.
     */
    public static void Desconecta() {
        // Usamos tratamento de excessão para tratar possíveis erros de desconexão.
        try {
            // Chamamos o método que fecha a conexão a partir da váriável que a mantém.
            conexao.close();
        }// Fecha try. 
        catch (Exception errDesc) {
            System.out.println("Erro de Desconexão: " + errDesc); // Mensagem de erro.
        }// Fecha catch.
    }// Fecha método Desconecta.
}//Fecha classe ConexaoDAO.