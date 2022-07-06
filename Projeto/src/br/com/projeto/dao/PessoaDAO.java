/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

// Importando biblioteca de comandos SQL para Java. 
import java.sql.*;
// Importando a classe que contém os atributos de uma Pessoa.
import br.com.projeto.dto.PessoaDTO;

/**
 * Classe que contém o método que realiza o cadastro da Pessoa no Banco de Dados.
 *
 * @author Kevin Fernando.
 */
public class PessoaDAO {
    // Criando uma varável do tipo Prepared Statement que irá levar as informações até o Banco de Dados.
    private PreparedStatement pst, pst1 = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    /**
     * Método que repassa a query para o Banco de Dados e realiza o cadastro da
     * pessoa no Banco de Dados.
     * 
     * @param pessoaDTO, que vem da classe CadastroVIEW.
     * @return um booleano.
     */
    public boolean cadastraPessoa(PessoaDTO pessoaDTO) {
        // Usamos tratamento de excessão para possíveis erros de SQL.
        try {
            ConexaoDAO.Conecta();
            
            // Definindo a query SQL.
            String sql = "Insert into pessoa(primeiroNome, segundoNome, dataNasc, "
                       + "Rg, Cpf, estadoCivil, endereco, numero, cidade, estado) "
                       + "values(?,?,?,?,?,?,?,?,?,?)";
            
            String sql2 = "Insert into trabalho(instituicao, funcao, salario, "
                        + "responsavel, obsDesc) "
                        + "values(?,?,?,?,?)";
            // Preparando para levar um statement até o Banco de Dados.
            pst = ConexaoDAO.conexao.prepareStatement(sql);
            pst1 = ConexaoDAO.conexao.prepareStatement(sql2);
            
            // Passando as informações para o statement.
            pst.setString(1, pessoaDTO.getPrimeiroNome());
            pst.setString(2, pessoaDTO.getSegundoNome());
            pst.setString(3, pessoaDTO.getDataNasc());
            pst.setString(4, pessoaDTO.getRg());
            pst.setString(5, pessoaDTO.getCpf());
            pst.setString(6, pessoaDTO.getEstadoCivil());
            pst.setString(7, pessoaDTO.getEndereco());
            pst.setInt(8, pessoaDTO.getNumero());
            pst.setString(9, pessoaDTO.getCidade());
            pst.setString(10, pessoaDTO.getEstado());
            
            // Passando as informações para o statement 2.
            pst1.setString(1, pessoaDTO.getInstituicao());
            pst1.setString(2, pessoaDTO.getFuncao());
            pst1.setDouble(3, pessoaDTO.getSalario());
            pst1.setString(4, pessoaDTO.getResponsavel());
            pst1.setString(5, pessoaDTO.getObsDesc());
            
            // Executando o statement no Banco de Dados.
            pst.executeUpdate();
            pst1.executeUpdate();
            // Commita o Banco de Dados.
            ConexaoDAO.conexao.commit();
            
            return true;
        }// Fecha try. 
        catch (Exception errCad) {
            System.out.println("Erro ao cadastrar: " + errCad); // Mensagem de erro.
            return false;
        }// Fecha catch.
    }// Fecha método cadastraPessoa.
    
    /**
     * Método que altera cadastros no Banco de Dados.
     * 
     * @param pessoaDTO, da classe PessoaDTO.
     * @param opcao, inteiro com a opção.
     * @return um boolean.
     */
    public boolean alteraCadastro(PessoaDTO pessoaDTO, int opcao) {
        try {
            ConexaoDAO.Conecta();
            
            if(opcao == 1) {
                String sql = "Update pessoa set "
                           + "primeiroNome = ?, segundoNome = ?, dataNasc = ?, rg = ?, "
                           + "cpf = ?, estadoCivil = ?, endereco = ?, numero = ?, "
                           + "cidade = ?, estado = ? "
                           + "where id_pessoa = ?";
            
                pst = ConexaoDAO.conexao.prepareStatement(sql);
            
                pst.setString(1, pessoaDTO.getPrimeiroNome());
                pst.setString(2, pessoaDTO.getSegundoNome());
                pst.setString(3, pessoaDTO.getDataNasc());
                pst.setString(4, pessoaDTO.getRg());
                pst.setString(5, pessoaDTO.getCpf());
                pst.setString(6, pessoaDTO.getEstadoCivil());
                pst.setString(7, pessoaDTO.getEndereco());
                pst.setInt(8, pessoaDTO.getNumero());
                pst.setString(9, pessoaDTO.getCidade());
                pst.setString(10, pessoaDTO.getEstado());
                pst.setInt(11, pessoaDTO.getId_pessoa());
            
                pst.executeUpdate();
                ConexaoDAO.conexao.commit();
                pst.close();
                return true;
            } else 
                if(opcao == 2) {
                    String sql = "Update trabalho set "
                               + "instituicao = ?, funcao = ?, salario = ?, "
                               + "responsavel = ?, obsdesc = ? "
                               + "where id_trabalho = ?";
                    
                    pst = ConexaoDAO.conexao.prepareStatement(sql);
                    
                    pst.setString(1, pessoaDTO.getInstituicao());
                    pst.setString(2, pessoaDTO.getFuncao());
                    pst.setDouble(3, pessoaDTO.getSalario());
                    pst.setString(4, pessoaDTO.getResponsavel());
                    pst.setString(5, pessoaDTO.getObsDesc());
                    pst.setInt(6, pessoaDTO.getId_trabalho());
                    
                    pst.executeUpdate();
                    ConexaoDAO.conexao.commit();
                    pst.close();
                    return true;
                }
            return false;
        } 
        catch (Exception errAlt) {
            System.out.println("Erro ao alterar cadastro: " + errAlt);
            return false;
        } 
        finally {
            ConexaoDAO.Desconecta();
        }
    }// Fecha método alteraCadastro.
    
    /**
     * Método que busca um registro no Banco de Dados.
     * 
     * @param pessoaDTO, da classe PessoaDTO.
     * @param opcao, inteiro da Classe VIEW.
     * @return um ResultSet com a consulta.
     */
    public ResultSet consultaPessoa(PessoaDTO pessoaDTO, int opcao) {
        try {
            ConexaoDAO.Conecta();
            
            String sql = "";
            
            stmt = ConexaoDAO.conexao.createStatement();
            
            switch(opcao) {
                case 1:
                    sql = "Select * from pessoa where id_pessoa = " 
                            + pessoaDTO.getId_pessoa();
                    break;
                case 2:
                    sql = "Select * from trabalho where id_trabalho = "
                            + pessoaDTO.getId_trabalho();
                    break;
                case 3:
                    sql = "Select * from pessoa";
                    break;
                case 4:
                    sql = "Select * from trabalho";
                    break;
            }
            
            rs = stmt.executeQuery(sql);
            return rs;
        } 
        catch (Exception errCon) {
            System.out.println("Erro ao consultar Banco de Dados: " + errCon);
            return rs;
        }
    }// Fecha método consultaPessoa.
}//Fecha classe PessoaDAO.