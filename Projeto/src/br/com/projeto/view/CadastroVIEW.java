/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.projeto.view;

// Importanto bibliotecas necessárias para o formulário.
import br.com.projeto.ctr.PessoaCTR;
import br.com.projeto.dto.PessoaDTO;
import java.awt.Dimension;
import javax.swing.JOptionPane;


/**
 * Formulário que contém a entrada de dados para a realização de um novo cadastro
 * no Banco de Dados.
 *
 * @author Kevin Fernando.
 */
public class CadastroVIEW extends javax.swing.JInternalFrame {
    PessoaDTO pessoaDTO = new PessoaDTO();
    PessoaCTR pessoaCTR = new PessoaCTR();
    
    /**
     * Método construtor do formulário CadastroVIEW.
     */
    public CadastroVIEW() {
        initComponents();
    }
    
    /**
     * Método que seta a posição do formulário no centro da tela.
     */
    public void setPosicao() {
        // Cria um atributo do tipo Dimension para armazenar as dimensões do painel Desktop.
        Dimension dimensao = this.getDesktopPane().getSize();
        
        // Calcula a posição central do painel.
        this.setLocation((dimensao.width - this.getSize().width) / 2, 
                         (dimensao.height - this.getSize().height) / 2
        );
    }// Fecha método setPosicao.
    
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
        boxEstado.setSelectedItem(" ");
        instituicao.setText("");
        funcao.setText("");
        salario.setText("");
        responsavel.setText("");
        txtObsDesc.setText("");
        primeiroNome.requestFocus();
    }// Fecha método limpaCampos.
    
    /**
     * Método que repassa as informações para a classe PessoaDTO.
     */
    private void cadastraPessoa() {
        // Usamos tratamento de excessão para possíveis erros.
        try {
            // Setando as informações na classe PessoaDTO.
            pessoaDTO.setPrimeiroNome(primeiroNome.getText());
            pessoaDTO.setSegundoNome(segundoNome.getText());
            pessoaDTO.setDataNasc(dataNasc.getText());
            pessoaDTO.setRg(rg.getText());
            pessoaDTO.setCpf(cpf.getText());
            pessoaDTO.setEstadoCivil(boxEstCivil.getSelectedItem().toString());
            pessoaDTO.setEndereco(endereco.getText());
            pessoaDTO.setNumero(Integer.parseInt(numero.getText()));
            pessoaDTO.setCidade(cidade.getText());
            pessoaDTO.setEstado(boxEstado.getSelectedItem().toString());
            pessoaDTO.setInstituicao(instituicao.getText());
            pessoaDTO.setFuncao(funcao.getText());
            pessoaDTO.setSalario(Double.parseDouble(salario.getText()));
            pessoaDTO.setResponsavel(responsavel.getText());
            pessoaDTO.setObsDesc(txtObsDesc.getText());
            
            // Acessando o método cadastraPessoa na classe PessoaDAO através da classe PessoaCTR.
            JOptionPane.showMessageDialog(null, pessoaCTR.cadastraPessoa(pessoaDTO));
            // Limpa os campos após o cadastro.
            limpaCampos();
        }// Fecha try.
        catch (Exception errCad) {
            System.out.println("Erro ao cadastrar (VIEW): " + errCad); // Mensagem de erro.
        }// Fecha catch.
    }// Fecha método cadastraPessoa.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPessoa = new javax.swing.JPanel();
        labelPriNome = new javax.swing.JLabel();
        primeiroNome = new javax.swing.JTextField();
        labelSegNome = new javax.swing.JLabel();
        segundoNome = new javax.swing.JTextField();
        labelDataNasc = new javax.swing.JLabel();
        dataNasc = new javax.swing.JFormattedTextField();
        labelRg = new javax.swing.JLabel();
        rg = new javax.swing.JFormattedTextField();
        labelCPF = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        labelEstCivil = new javax.swing.JLabel();
        boxEstCivil = new javax.swing.JComboBox<>();
        labelEndereco = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        painelTrabalho = new javax.swing.JPanel();
        labelInstituicao = new javax.swing.JLabel();
        instituicao = new javax.swing.JTextField();
        labelFuncao = new javax.swing.JLabel();
        funcao = new javax.swing.JTextField();
        labelSalario = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        labelResponsavel = new javax.swing.JLabel();
        responsavel = new javax.swing.JTextField();
        labelDescObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObsDesc = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulário de Cadastro");

        painelPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        labelPriNome.setText("Primeiro nome:");

        labelSegNome.setText("Segundo nome:");

        labelDataNasc.setText("Data de Nascimento:");

        try {
            dataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelRg.setText("RG:");

        try {
            rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rg.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        labelCPF.setText("CPF:");

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        labelEstCivil.setText("Estado Civil:");

        boxEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Solteiro", "Casado", "Viúvo" }));

        labelEndereco.setText("Endereço:");

        labelNumero.setText("Número:");

        labelCidade.setText("Cidade:");

        labelEstado.setText("Estado:");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Fedral", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Mina Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        javax.swing.GroupLayout painelPessoaLayout = new javax.swing.GroupLayout(painelPessoa);
        painelPessoa.setLayout(painelPessoaLayout);
        painelPessoaLayout.setHorizontalGroup(
            painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPessoaLayout.createSequentialGroup()
                        .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPriNome)
                            .addComponent(labelSegNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(segundoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPessoaLayout.createSequentialGroup()
                        .addComponent(labelDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPessoaLayout.createSequentialGroup()
                        .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRg)
                            .addComponent(labelCPF)
                            .addComponent(labelEstCivil)
                            .addComponent(labelEndereco)
                            .addComponent(labelNumero)
                            .addComponent(labelCidade)
                            .addComponent(labelEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rg)
                            .addComponent(cpf)
                            .addComponent(boxEstCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endereco)
                            .addComponent(numero)
                            .addComponent(cidade)
                            .addComponent(boxEstado, 0, 255, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPessoaLayout.setVerticalGroup(
            painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPriNome)
                    .addComponent(primeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSegNome)
                    .addComponent(segundoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNasc)
                    .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRg)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstCivil)
                    .addComponent(boxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstado)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTrabalho.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Trabalhistas"));

        labelInstituicao.setText("Instituição:");

        labelFuncao.setText("Função:");

        labelSalario.setText("Remuneração (Salário):");

        labelResponsavel.setText("Responsável:");

        labelDescObs.setText("Descrição/Observações:");

        txtObsDesc.setColumns(20);
        txtObsDesc.setRows(5);
        jScrollPane1.setViewportView(txtObsDesc);

        javax.swing.GroupLayout painelTrabalhoLayout = new javax.swing.GroupLayout(painelTrabalho);
        painelTrabalho.setLayout(painelTrabalhoLayout);
        painelTrabalhoLayout.setHorizontalGroup(
            painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTrabalhoLayout.createSequentialGroup()
                        .addGroup(painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelInstituicao)
                            .addComponent(labelFuncao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(instituicao)
                            .addComponent(funcao, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTrabalhoLayout.createSequentialGroup()
                        .addComponent(labelSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTrabalhoLayout.createSequentialGroup()
                        .addComponent(labelResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTrabalhoLayout.createSequentialGroup()
                        .addComponent(labelDescObs)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelTrabalhoLayout.setVerticalGroup(
            painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInstituicao)
                    .addComponent(instituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuncao)
                    .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSalario)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResponsavel)
                    .addComponent(responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelDescObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar Campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
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
                        .addComponent(painelPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAjuda)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar)
                        .addComponent(btnLimpar))
                    .addComponent(btnAjuda, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastraPessoa();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstCivil;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField dataNasc;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField funcao;
    private javax.swing.JTextField instituicao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelDescObs;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEstCivil;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelInstituicao;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPriNome;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelSegNome;
    private javax.swing.JTextField numero;
    private javax.swing.JPanel painelPessoa;
    private javax.swing.JPanel painelTrabalho;
    private javax.swing.JTextField primeiroNome;
    private javax.swing.JTextField responsavel;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField segundoNome;
    private javax.swing.JTextArea txtObsDesc;
    // End of variables declaration//GEN-END:variables
}// Fecha classe CadastroVIEW.