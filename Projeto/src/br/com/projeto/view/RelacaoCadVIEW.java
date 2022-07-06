/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.projeto.view;

import br.com.projeto.ctr.PessoaCTR;
import br.com.projeto.dto.PessoaDTO;
import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 * Tela que exibe uma relação com todos os registros presentes no Banco de Dados
 * do sistema.
 *
 * @author Kevin Fernando.
 */
public class RelacaoCadVIEW extends javax.swing.JInternalFrame {
    ResultSet rs = null;
    
    PessoaDTO pessoaDTO = new PessoaDTO();
    PessoaCTR pessoaCTR = new PessoaCTR();
    
    DefaultTableModel mdl_tabela_trabalho;
    
    /**
     * Método construtor da tela RelacaoCadVIEW.
     */
    public RelacaoCadVIEW() {
        initComponents();
        mdl_tabela_trabalho = (DefaultTableModel) tabelaTrabalho.getModel();
    }
    
    /**
     * Método que seta a posicao do formulaŕio no centro da tela.
     */
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, 
                         (d.height - this.getSize().height) / 2
        );
    }// Fecha método setPosicao.
    
    /**
     * Método que preenche a tabela de acordo com a escolha do usuário.
     */
    private void preencheTabela() {
        try {
            if(boxTipoCad.getSelectedItem().equals("Trabalho")) {
                rs = pessoaCTR.consultaPessoa(pessoaDTO, 4);
                
                while(rs.next()) {
                    mdl_tabela_trabalho.addRow(new Object[] {
                        rs.getString("id_trabalho"),
                        rs.getString("instituicao"),
                        rs.getString("salario"),
                        rs.getString("responsavel")
                    });
                }
            }
        } 
        catch (Exception errTab) {
            System.out.println("Erro ao preencher tabela: " + errTab);
        }
    }// Fecha método preencheTabela.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelInfo = new javax.swing.JLabel();
        boxTipoCad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTrabalho = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relação de Cadastros");

        labelInfo.setText("Selecione os cadastros que deseja ver:");

        boxTipoCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pessoa", "Trabalho" }));

        tabelaTrabalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pessoa", "Instituição", "Salário", "Responsável"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaTrabalho);
        if (tabelaTrabalho.getColumnModel().getColumnCount() > 0) {
            tabelaTrabalho.getColumnModel().getColumn(0).setResizable(false);
            tabelaTrabalho.getColumnModel().getColumn(1).setResizable(false);
            tabelaTrabalho.getColumnModel().getColumn(2).setResizable(false);
            tabelaTrabalho.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxTipoCad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addComponent(btnAtualizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInfo)
                    .addComponent(boxTipoCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        preencheTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoCad;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JTable tabelaTrabalho;
    // End of variables declaration//GEN-END:variables
}// Fecha classe RelacaoCadVIEW.