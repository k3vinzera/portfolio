/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.ctr.PessoaCTR;
import br.com.projeto.dto.PessoaDTO;
import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * Formulário que altera um cadastro de Pessoa no Banco de Dados.
 *
 * @author Kevin Fernando.
 */
public class AlteraTrabalhoVIEW extends javax.swing.JInternalFrame {
    ResultSet rs = null;
    
    PessoaDTO pessoaDTO = new PessoaDTO();
    PessoaCTR pessoaCTR = new PessoaCTR();
    
    /**
     * Método constutor do formulário AlteraTrabalhoVIEW.
     */
    public AlteraTrabalhoVIEW() {
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
    }// Fecha método setPosicao.
    
    /**
     * Método que limpa os campos do formulário.
     */
    private void limpaCampos() {
        instituicao.setText("");
        funcao.setText("");
        salario.setText("");
        responsavel.setText("");
        txtDescObs.setText("");
    }// Fecha método limpaCampos.
    
    /**
     * Método que seta os campos do formulário.
     * 
     * @param id_trabalho, da classe SelecionarAlterarVIEW. 
     */
    public void setarCampos(int id_trabalho) {
        try {
            pessoaDTO.setId_trabalho(id_trabalho);
            rs = pessoaCTR.consultaPessoa(pessoaDTO, 2);
            
            if(rs.next()) {
                labelInstituicao.setText("Instituição: " + rs.getString("instituicao"));
                labelFuncao.setText("Função: " + rs.getString("funcao"));
                labelRemuneracao.setText("Remuneração (Salário): " + rs.getString("salario"));
                labelResponsavel.setText("Responsável: " + rs.getString("responsavel"));
                labelDescObs.setText("Descrição/Observação: " + rs.getString("obsdesc"));
                labelIdCad.setText("ID do Cadastro: " + rs.getString("id_trabalho"));
            }
        } 
        catch (Exception errCon) {
            System.out.println("Erro ao consultar Banco de Dados: " + errCon);
        }
    }// Fecha método setarCampos.
    
    /**
     * Método que altera o cadastro de Trabalho.
     */
    private void alterarCadastro() {
        try {
            pessoaDTO.setInstituicao(instituicao.getText());
            pessoaDTO.setFuncao(funcao.getText());
            pessoaDTO.setSalario(Double.parseDouble(salario.getText()));
            pessoaDTO.setResponsavel(responsavel.getText());
            pessoaDTO.setObsDesc(txtDescObs.getText());
            
            JOptionPane.showMessageDialog(null, pessoaCTR.alteraCadastro(pessoaDTO, 2));
            
            setarCampos(pessoaDTO.getId_trabalho());
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
        labelInstituicao = new javax.swing.JLabel();
        labelFuncao = new javax.swing.JLabel();
        labelRemuneracao = new javax.swing.JLabel();
        labelResponsavel = new javax.swing.JLabel();
        labelDescObs = new javax.swing.JLabel();
        labelIdCad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        instituicao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        funcao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        responsavel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescObs = new javax.swing.JTextArea();
        btnSalvarAlteracoes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Altera Cadastro de Trabalho");

        painelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados salvos"));

        labelInstituicao.setText("Instituição:");

        labelFuncao.setText("Função: ");

        labelRemuneracao.setText("Remuneração (Salário): ");

        labelResponsavel.setText("Responsável:");

        labelDescObs.setText("Descrição/Observação:");
        labelDescObs.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelDescObs.setAutoscrolls(true);

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRemuneracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDescObs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInstituicao)
                .addGap(18, 18, 18)
                .addComponent(labelFuncao)
                .addGap(18, 18, 18)
                .addComponent(labelRemuneracao)
                .addGap(18, 18, 18)
                .addComponent(labelResponsavel)
                .addGap(18, 18, 18)
                .addComponent(labelDescObs, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelIdCad.setText("ID do Cadastro:");

        jLabel7.setText("Instituição:");

        jLabel8.setText("Função:");

        jLabel9.setText("Remuneração (Salário):");

        jLabel10.setText("Responsável:");

        jLabel11.setText("Descrição/Observação");

        txtDescObs.setColumns(20);
        txtDescObs.setRows(5);
        jScrollPane1.setViewportView(txtDescObs);

        btnSalvarAlteracoes.setText("Salvar Alterações");
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/view/icons/ajuda.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(funcao)
                            .addComponent(instituicao)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(responsavel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(btnSalvarAlteracoes)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelIdCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(instituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarAlteracoes)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        alterarCadastro();
    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JTextField funcao;
    private javax.swing.JTextField instituicao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescObs;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelIdCad;
    private javax.swing.JLabel labelInstituicao;
    private javax.swing.JLabel labelRemuneracao;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTextField responsavel;
    private javax.swing.JTextField salario;
    private javax.swing.JTextArea txtDescObs;
    // End of variables declaration//GEN-END:variables
}