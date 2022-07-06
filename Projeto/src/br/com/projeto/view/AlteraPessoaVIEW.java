/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.ctr.PessoaCTR;
import br.com.projeto.dto.PessoaDTO;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Formulário que altera um cadastro de Pessoa no Banco de Dados.
 *
 * @author Kevin Fernando.
 */
public class AlteraPessoaVIEW extends javax.swing.JInternalFrame {
    ResultSet rs = null;
    
    PessoaDTO pessoaDTO = new PessoaDTO();
    PessoaCTR pessoaCTR = new PessoaCTR();
    
    /**
     * Método construtor do formulário AlteraPessoaVIEW.
     */
    public AlteraPessoaVIEW() {
        initComponents();
    }
    
    /**
     * Método que seta a posição do formulário no centro da tela.
     */
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, 
                         (d.height - this.getSize().height) / 2
        );
    }// Fecha método setPosicao;
    
    /**
     * Método que limpa os campos do formulário.
     */
    private void limpaCampos() {
        primeiroNome.setText("");
        segundoNome.setText("");
        dataNasc.setText("");
        rg.setText("");
        cpf.setText("");
        boxEstCivil.setSelectedItem(" ");
        endereco.setText("");
        numero.setText("");
        cidade.setText("");
        estado.setText("");
    }// Fecha método limpaCampos.
    
    /**
     * Método que seta os campos do formulário.
     * 
     * @param id_pessoa, da classe SelecionarAlterarVIEW. 
     */
    public void setarCampos(int id_pessoa) {
        try {
            pessoaDTO.setId_pessoa(id_pessoa);
            rs = pessoaCTR.consultaPessoa(pessoaDTO, 1);
            
            if(rs.next()) {
                labelPriNome.setText("Primeiro nome: " + rs.getString("primeiroNome"));
                labelSegNome.setText("Segundo nome: " + rs.getString("segundoNome"));
                labelDataNasc.setText("Data de Nascimento: " + rs.getString("dataNasc"));
                labelRg.setText("RG: " + rs.getString("rg"));
                labelCpf.setText("CPF: " + rs.getString("cpf"));
                labelEstCivil.setText("Estado Civil: " + rs.getString("estadoCivil"));
                labelEndereco.setText("Endereço: " + rs.getString("endereco"));
                labelNumero.setText("Número: " + rs.getString("numero"));
                labelCidade.setText("Cidade: " + rs.getString("cidade"));
                labelEstado.setText("Estado: " + rs.getString("estado"));
                labelIdUsuario.setText("ID do Usuário: " + rs.getString("id_pessoa"));
            }
        } 
        catch (Exception errCon) {
            System.out.println("Erro ao consultar Banco de Dados: " + errCon);
        }
    }// Fecha método consultaPessoa.
    
    /**
     * Método que altera o cadastro de Trabalho.
     */
    private void alteraCadastro() {
        try {
            pessoaDTO.setPrimeiroNome(primeiroNome.getText());
            pessoaDTO.setSegundoNome(segundoNome.getText());
            pessoaDTO.setDataNasc(dataNasc.getText());
            pessoaDTO.setRg(rg.getText());
            pessoaDTO.setCpf(cpf.getText());
            pessoaDTO.setEstadoCivil(boxEstCivil.getSelectedItem().toString());
            pessoaDTO.setEndereco(endereco.getText());
            pessoaDTO.setNumero(Integer.parseInt(numero.getText()));
            pessoaDTO.setCidade(cidade.getText());
            pessoaDTO.setEstado(estado.getText());
            
            JOptionPane.showMessageDialog(null, pessoaCTR.alteraCadastro(pessoaDTO, 1));
            
            setarCampos(pessoaDTO.getId_pessoa());
            limpaCampos();
        } 
        catch (Exception errAltCad) {
            System.out.println("Erro ao alterar cadastro: " + errAltCad);
        }
    }// Fecha método alteraCadastro.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDados = new javax.swing.JPanel();
        labelPriNome = new javax.swing.JLabel();
        labelSegNome = new javax.swing.JLabel();
        labelDataNasc = new javax.swing.JLabel();
        labelRg = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelEstCivil = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelIdUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        primeiroNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        segundoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dataNasc = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        rg = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        boxEstCivil = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        btnAlteraCadastro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alterar Cadastro de Pessoa");

        painelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados salvos"));

        labelPriNome.setText("Primeiro nome:");

        labelSegNome.setText("Segundo nome:");

        labelDataNasc.setText("Data de Nascimento:");

        labelRg.setText("RG:");

        labelCpf.setText("CPF:");

        labelEstCivil.setText("Estado Civil:");

        labelEndereco.setText("Endereço:");

        labelNumero.setText("Número:");

        labelCidade.setText("Cidade:");

        labelEstado.setText("Estado:");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPriNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSegNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(labelRg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEstCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPriNome)
                .addGap(18, 18, 18)
                .addComponent(labelSegNome)
                .addGap(18, 18, 18)
                .addComponent(labelDataNasc)
                .addGap(18, 18, 18)
                .addComponent(labelRg)
                .addGap(18, 18, 18)
                .addComponent(labelCpf)
                .addGap(18, 18, 18)
                .addComponent(labelEstCivil)
                .addGap(18, 18, 18)
                .addComponent(labelEndereco)
                .addGap(18, 18, 18)
                .addComponent(labelNumero)
                .addGap(18, 18, 18)
                .addComponent(labelCidade)
                .addGap(18, 18, 18)
                .addComponent(labelEstado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelIdUsuario.setText("ID do Usuário");

        jLabel1.setText("Primeiro nome:");

        jLabel2.setText("Segundo nome:");

        jLabel3.setText("Data de Nascimento:");

        try {
            dataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("RG:");

        try {
            rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("CPF:");

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Estado Civil:");

        boxEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Solteiro", "Casado", "Viúvo" }));

        jLabel7.setText("Endereço:");

        jLabel8.setText("Número:");

        jLabel9.setText("Cidade:");

        jLabel10.setText("Estado:");

        btnAlteraCadastro.setText("Salvar Alterações");
        btnAlteraCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraCadastroActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/view/icons/ajuda.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primeiroNome)
                            .addComponent(segundoNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endereco)
                            .addComponent(cidade)
                            .addComponent(estado)
                            .addComponent(rg)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cpf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlteraCadastro)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIdUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(primeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(segundoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(boxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlteraCadastro)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlteraCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraCadastroActionPerformed
        alteraCadastro();
    }//GEN-LAST:event_btnAlteraCadastroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstCivil;
    private javax.swing.JButton btnAlteraCadastro;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField dataNasc;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField estado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEstCivil;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelIdUsuario;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPriNome;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelSegNome;
    private javax.swing.JTextField numero;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTextField primeiroNome;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JTextField segundoNome;
    // End of variables declaration//GEN-END:variables
}