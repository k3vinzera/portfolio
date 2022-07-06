/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projeto.view;

/**
 * Formulário que contém a visualização principal do sistema, onde o usuário fará
 * todas as interações com as funcionalidades.
 *
 * @author Kevin Fernando.
 */
public class PrincipalVIEW extends javax.swing.JFrame {

    /**
     * Método construtor do formulário PrincipalVIEW.
     */
    public PrincipalVIEW() {
        initComponents();
        // Posicionando o formulário no centro da tela ao iniciá-lo.
        this.setLocationRelativeTo(null);
        // Teste de conexão com o Banco de Dados.
        // ConexaoDAO.Conecta();
    }
    
    /**
     * Método responsável por abrir e setar a posição do formulário de cadastro.
     */
    private void abreCadastroVIEW() {
        CadastroVIEW cadastroVIEW = new CadastroVIEW();
        this.painelDesktop.add(cadastroVIEW);
        cadastroVIEW.setVisible(true);
        cadastroVIEW.setPosicao();
    }// Fecha método abreCadastro.
    
    /**
     * Método responsável por abrir e setar a posição do formulário de alteração
     * de cadastro. 
     */
    private void abreSelecionarAlterarVIEW() {
        SelecionarAlterarVIEW selecionarAlterarVIEW = new SelecionarAlterarVIEW();
        this.painelDesktop.add(selecionarAlterarVIEW);
        selecionarAlterarVIEW.setVisible(true);
        selecionarAlterarVIEW.setPosicao();
    }// Fecha método abreSelecionarAlterarVIEW.
    
    /**
     * Método responsável por abrir e setar a posição da tela que mostra a relação
     * de cadastros no Banco de Dados.
     */
    private void abreRelacaoCadVIEW() {
        RelacaoCadVIEW relacaoCadVIEW = new RelacaoCadVIEW();
        this.painelDesktop.add(relacaoCadVIEW);
        relacaoCadVIEW.setVisible(true);
        relacaoCadVIEW.setPosicao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenu = new javax.swing.JPanel();
        labelMenu = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnRelCad = new javax.swing.JButton();
        painelDesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelMenu.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenu.setText("Menu Principal");

        btnCadastrar.setText("Adicionar novo Cadastro");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar um Cadastro");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir um Cadastro");

        btnRelCad.setText("Relação de Cadastros");
        btnRelCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnRelCad)
                .addContainerGap(501, Short.MAX_VALUE))
        );

        painelDesktop.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout painelDesktopLayout = new javax.swing.GroupLayout(painelDesktop);
        painelDesktop.setLayout(painelDesktopLayout);
        painelDesktopLayout.setHorizontalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        painelDesktopLayout.setVerticalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDesktop))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(painelDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        abreCadastroVIEW();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        abreSelecionarAlterarVIEW();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRelCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelCadActionPerformed
        abreRelacaoCadVIEW();
    }//GEN-LAST:event_btnRelCadActionPerformed

    /**
     * Método main do formulário.
     * 
     * @param args, das linhas de comando.
     */
    public static void main(String args[]) {
        // Define as opções de visualização e estilo.
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Cria e mostra o formulário na tela.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRelCad;
    private javax.swing.JLabel labelMenu;
    public static javax.swing.JDesktopPane painelDesktop;
    private javax.swing.JPanel painelMenu;
    // End of variables declaration//GEN-END:variables
}// Fecha classe PrincipalVIEW.