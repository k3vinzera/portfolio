/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.ctr;

// Importando classes necessárias para o controle de acesso.
import br.com.projeto.dao.PessoaDAO;
import br.com.projeto.dto.PessoaDTO;
import java.sql.ResultSet;

/**
 * Classe que controla o acesso ao método da classe PessoaDAO.
 *
 * @author Kevin Fernando.
 */
public class PessoaCTR {
    // Instanciando um objeto da classe PessoaDAO.
    PessoaDAO pessoaDAO = new PessoaDAO();
    
    /**
     * Método que controla o acesso ao método cadastraPessoa, na classe PessoaDAO.
     * 
     * @param pessoaDTO, vindo da classe PessoaDTO.
     * @return uma String com uma mensagem.
     */
    public String cadastraPessoa(PessoaDTO pessoaDTO) {
        // Usamos tratamento de excessão para tratar possíveis erros.
        try {
            // Estrutura de decisão que testa o retorno do método cadastrarPessoa na classe PessoaDAO.
            if(pessoaDAO.cadastraPessoa(pessoaDTO)) 
                return "Cidadão cadastrado!";
            else
                return "Cidadão não cadastrado!";            
        }// Fecha try. 
        catch (Exception errValCad) {
            System.out.println("Erro ao validar cadastro: " + errValCad); // Mensagem de erro.
            return "Cidadão não cadastrado!\n"
                 + "Vide terminal.";
        }// Fecha catch.
    }// Fecha método cadastraPessoa.
    
    public String alteraCadastro(PessoaDTO pessoaDTO, int opcao) {
        try {
            if(pessoaDAO.alteraCadastro(pessoaDTO, opcao))
                return "Cadastro alterado!";
            else
                return "Cadastro não alterado!";
        } 
        catch (Exception errAltCad) {
            System.out.println("Erro ao validar alteração de cadastro: " + errAltCad);
            return "Cidadão não cadastrado!\n"
                 + "Vide terminal.";
        }
    }// Fecha método alteraCadastro.
    
    public ResultSet consultaPessoa(PessoaDTO pessoaDTO, int opcao) {
        ResultSet rs = null;
        
        rs = pessoaDAO.consultaPessoa(pessoaDTO, opcao);
        
        return rs;
    }// Fecha método consultaPessoa.
}// Fecha classe PessoaCTR.