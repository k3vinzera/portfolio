/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 * Tela que execuratará a pesquisa de um cadastro no Banco de Dados. 
 *
 * @author Kevin Fernando.
 */
public class SelecionarAlterarVIEW extends javax.swing.JInternalFrame {
    /**
     * Método construtor da tela SelecionarAlterarVIEW.
     */
    public SelecionarAlterarVIEW() {
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
     * Método que chama o formulário AlteraPessoaVIEW.
     */
    private void abrePessoaVIEW() {
        AlteraPessoaVIEW alteraPessoaVIEW = new AlteraPessoaVIEW();
        PrincipalVIEW.painelDesktop.add(alteraPessoaVIEW);
        alteraPessoaVIEW.setVisible(true);
        alteraPessoaVIEW.setPosicao();
        alteraPessoaVIEW.setarCampos(Integer.parseInt(idCadastro.getText()));
        this.dispose();
    }// Fecha método abrePessoaVIEW.
    
    /**
     * Método que chama o formulário AlteraTrabalhoVIEW.
     */
    private void abreTrabalhoVIEW() {
        AlteraTrabalhoVIEW alteraTrabalhoVIEW = new AlteraTrabalhoVIEW();
        PrincipalVIEW.painelDesktop.add(alteraTrabalhoVIEW);
        alteraTrabalhoVIEW.setVisible(true);
        alteraTrabalhoVIEW.setPosicao();
        alteraTrabalhoVIEW.setarCampos(Integer.parseInt(idCadastro.getText()));
        this.dispose();
    }// Fecha método abreTrabalhoVIEW.
    
    /**
     * Método que verifica o preenchimento do campo ID.
     */
    private boolean verificaID() {
        if(idCadastro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o ID do cadastro a ser "
                    + "alterado!"
            );
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum "
                        + "registro com este ID, tente novamente!");
            return false;
        }
    }// Fecha método verificaID.
    
    /**
     * Método que chama o formulário de acordo com o tipo de alteração.
     */
    private void AlteraVIEW() {
        String tipo = boxTipoCadastro.getSelectedItem().toString();

        if(tipo.equals("Pessoa")) {
            if(verificaID()) 
                abrePessoaVIEW();
        } else 
            if(tipo.equals("Trabalho")) {
                if(verificaID())
                    abreTrabalhoVIEW();
            }
            else {
                JOptionPane.showMessageDialog(null, "Selecione o tipo de "
                        + "cadastro a ser alterado!"
                );
            }
    }// Fecha o método AlteraVIEW.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelInfoCad = new javax.swing.JLabel();
        boxTipoCadastro = new javax.swing.JComboBox<>();
        labelInfo = new javax.swing.JLabel();
        idCadastro = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Seleção de Cadastro");

        labelInfoCad.setText("Informe o tipo de cadastro a ser alterado:");

        boxTipoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pessoa", "Trabalho" }));

        labelInfo.setText("Informe o número (ID) do cadastro que deseja alterar:");

        btnSelecionar.setText("Selecionar Cadastro");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/view/icons/ajuda.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelInfoCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxTipoCadastro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelecionar)
                                .addGap(179, 179, 179)
                                .addComponent(btnAjuda)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInfoCad)
                    .addComponent(boxTipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjuda)
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        AlteraVIEW();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoCadastro;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnSelecionar;
    public static javax.swing.JTextField idCadastro;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelInfoCad;
    // End of variables declaration//GEN-END:variables
}