package Grafico;

import Controle.ControlaCliente;
import Controle.ControlaParcela;
import Negocio.Cliente;
import Utilitario.FormataData;
import Utilitario.Funcoes;
import Utilitario.TeclasPermitidas;
import caroco.Data;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class DlgCadastroCliente extends javax.swing.JDialog {

    ControlaCliente ctlCliente = new ControlaCliente();
    ControlaParcela ctlParcela = new ControlaParcela();

    Cliente cliente = new Cliente();

    public DlgCadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Cadastro de Cliente");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        bloquearLetras();
        camposNaoEditaveis();
        CbxAtivo.setSelected(true);
    }

    public DlgCadastroCliente(java.awt.Dialog parent, boolean modal, Cliente c) {
        super(parent, modal);
        initComponents();
        this.setTitle("Edição de Cliente");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        bloquearLetras();
        camposNaoEditaveis();
        preencherCampos(c);
        cliente = c;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPessoal = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdDataNascimento = new javax.swing.JLabel();
        lblCpfCnpj = new javax.swing.JLabel();
        tfdCpfCnpj = new javax.swing.JTextField();
        lblRgIe = new javax.swing.JLabel();
        tfdRgIe = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        tfdEndereco = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        tfdCidade = new javax.swing.JTextField();
        lblContato = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        tfdTelefone = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        tfdCelular = new javax.swing.JTextField();
        lblFinanceiro = new javax.swing.JLabel();
        lblRenda = new javax.swing.JLabel();
        lblMda = new javax.swing.JLabel();
        tfdRenda = new jnumberformatfield.JNumberFormatField();
        tfdMda = new javax.swing.JTextField();
        lblMa = new javax.swing.JLabel();
        tfdMa = new javax.swing.JTextField();
        lblDataAtualizacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPessoaAutorizada = new javax.swing.JLabel();
        tfdPessoaAutorizada = new javax.swing.JTextField();
        lblCasaPropria = new javax.swing.JLabel();
        cmbCasaPropria = new javax.swing.JComboBox<String>();
        tfdLocalTrabalho = new javax.swing.JTextField();
        lblLocalTrabalho = new javax.swing.JLabel();
        lblFuncaoTrabalho = new javax.swing.JLabel();
        tfdFuncaoTrabalho = new javax.swing.JTextField();
        lblNomeReferencia = new javax.swing.JLabel();
        tfdNomeReferencia = new javax.swing.JTextField();
        lblTelefoneReferencia = new javax.swing.JLabel();
        tfdTelefoneReferencia = new javax.swing.JTextField();
        lblAnos = new javax.swing.JLabel();
        jmDataNascimento = new caroco.JmData();
        jmDataAtualizacao = new caroco.JmData();
        CbxAtivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPessoal.setText("Pessoal____________________________________________________________________________________________________________");

        lblNome.setText("Nome:");

        tfdDataNascimento.setText("Data de nascimento:");

        lblCpfCnpj.setText("CPF/CNPJ:");

        lblRgIe.setText("RG/IE:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/limpa.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblEndereco.setText("Endereço:");

        lblCidade.setText("Cidade:");

        lblContato.setText("Contato___________________________________________________________________________________________________________");

        lblTelefone.setText("Telefone:");

        lblCelular.setText("Celular:");

        lblFinanceiro.setText("Financeiro_________________________________________________________________________________________________________");

        lblRenda.setText("Renda:");

        lblMda.setText("MDA:");

        lblMa.setText("MA:");

        lblDataAtualizacao.setText("Data da última atualização:");

        jLabel1.setText("Referencia________________________________________________________________________________________________________");

        lblPessoaAutorizada.setText("Pessoa Autorizada:");

        lblCasaPropria.setText("Casa Própria:");

        cmbCasaPropria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIM", "NÃO" }));

        lblLocalTrabalho.setText("Local Trabalho:");

        lblFuncaoTrabalho.setText("Função Trabalho:");

        lblNomeReferencia.setText("Nome da pessoa de referência:");

        lblTelefoneReferencia.setText("Telefone Referência:");

        lblAnos.setText("anos");

        CbxAtivo.setText("Ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPessoal)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCpfCnpj)
                                            .addComponent(lblNome)
                                            .addComponent(lblEndereco)
                                            .addComponent(lblLocalTrabalho))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblRgIe)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tfdRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(39, 39, 39)
                                                        .addComponent(lblCasaPropria)
                                                        .addGap(28, 28, 28)
                                                        .addComponent(cmbCasaPropria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(35, 35, 35)
                                                        .addComponent(lblCidade)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tfdLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(38, 38, 38)
                                                        .addComponent(lblFuncaoTrabalho)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tfdFuncaoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfdDataNascimento)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jmDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblAnos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CbxAtivo)))))))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTelefone)
                                        .addGap(34, 34, 34)
                                        .addComponent(tfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(lblCelular)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRenda)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(lblMda)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdMda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(lblMa)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdMa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblDataAtualizacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jmDataAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))))
                            .addComponent(lblContato)
                            .addComponent(lblFinanceiro)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPessoaAutorizada)
                                            .addGap(75, 75, 75)
                                            .addComponent(tfdPessoaAutorizada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNomeReferencia)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfdNomeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(27, 27, 27)
                                    .addComponent(lblTelefoneReferencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfdTelefoneReferencia))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPessoal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfdDataNascimento))
                    .addComponent(lblAnos)
                    .addComponent(jmDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxAtivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCnpj)
                    .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRgIe)
                    .addComponent(tfdRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCasaPropria)
                    .addComponent(cmbCasaPropria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocalTrabalho)
                            .addComponent(lblFuncaoTrabalho))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfdFuncaoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(lblContato)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(tfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(tfdCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblFinanceiro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenda)
                    .addComponent(lblMda)
                    .addComponent(tfdRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdMda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMa)
                    .addComponent(tfdMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataAtualizacao)
                    .addComponent(jmDataAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeReferencia)
                    .addComponent(tfdNomeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefoneReferencia)
                    .addComponent(tfdTelefoneReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPessoaAutorizada)
                    .addComponent(tfdPessoaAutorizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaTela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            cliente.getNome().isEmpty();
            if (CbxAtivo.isSelected() == ctlCliente.buscarClientePorId(cliente.getIdcliente()).isStatus()) {
                salvarCliente();
            } else {

                if (!ctlParcela.buscarParcelaPorIdCliente(cliente.getIdcliente())) {
                    JOptionPane.showMessageDialog(this, "Cliente possui parcelas em aberto, Favor quitar antes de INATIVAR cliente");
                } else {
                    salvarCliente();
                }
            }
        } catch (Exception e) {

            salvarCliente();

        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void bloquearLetras() {
        tfdCpfCnpj.setDocument(new TeclasPermitidas());
        tfdRgIe.setDocument(new TeclasPermitidas());
        tfdTelefone.setDocument(new TeclasPermitidas());
        tfdCelular.setDocument(new TeclasPermitidas());
        tfdTelefoneReferencia.setDocument(new TeclasPermitidas());
    }

    private void camposNaoEditaveis() {
        tfdMa.setEnabled(false);
        tfdMda.setEnabled(false);
        jmDataAtualizacao.setEnabled(false);
    }

    private void limpaTela() {// Limpa os campos TextField
        tfdNome.setText("");
        jmDataNascimento.setData(null);
        tfdCpfCnpj.setText("");
        tfdRgIe.setText("");
        tfdEndereco.setText("");
        tfdCidade.setText("");
        tfdTelefone.setText("");
        tfdCelular.setText("");
        tfdRenda.setText("");
        tfdMda.setText("");
        tfdMa.setText("");
        tfdLocalTrabalho.setText("");
        tfdFuncaoTrabalho.setText("");
        tfdNomeReferencia.setText("");
        tfdTelefoneReferencia.setText("");
        cmbCasaPropria.setSelectedItem("SIM");
        tfdPessoaAutorizada.setText("");
        jmDataAtualizacao.setData(null);
        tfdNome.requestFocus();
    }

    private void salvarCliente() {
        Cliente auxCli = new Cliente();
        try {

            if (!tfdNome.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setNome(tfdNome.getText().toUpperCase());  //faz isso   
            } else // senão 
            {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }

            if (jmDataNascimento.getData() != null) {// se diferente de vazio 
                auxCli.setDataNascimento(jmDataNascimento.getData());  //faz isso   
            } else // senão 
            {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }

            if (!tfdCpfCnpj.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setCpfCnpj(tfdCpfCnpj.getText().toUpperCase()); //faz isso
            } else // senão 
            {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }

            if (!tfdRgIe.getText().isEmpty()) {// se diferente de vazio e menor igual a 14
                auxCli.setRgIe(tfdRgIe.getText().toUpperCase()); //faz isso
            } else // senão 
            {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }

            if (!tfdEndereco.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setEndereco(tfdEndereco.getText().toUpperCase());  //faz isso   
            } else // senão  
            {
                auxCli.setEndereco("");
            }

            if (!tfdCidade.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setCidade(tfdCidade.getText().toUpperCase());
            } else {
                auxCli.setCidade("");
            }

            if (!tfdTelefone.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setTelefone(tfdTelefone.getText().toUpperCase());
            } else {
                auxCli.setTelefone("");
            }

            if (!tfdCelular.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setCelular(tfdCelular.getText().toUpperCase());
            } else {
                auxCli.setCelular("");
            }

            if (!tfdRenda.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setRenda(tfdRenda.getText());
            } else {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }

            if (!tfdLocalTrabalho.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setLocalTrabalho(tfdLocalTrabalho.getText().toUpperCase());
            } else {
                auxCli.setLocalTrabalho("");
            }

            if (!tfdFuncaoTrabalho.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setFuncaoTrabalho(tfdFuncaoTrabalho.getText().toUpperCase());
            } else {
                auxCli.setFuncaoTrabalho("");
            }

            if (!tfdNomeReferencia.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setNomeReferencia(tfdNomeReferencia.getText().toUpperCase());
            } else {
                auxCli.setNomeReferencia("");
            }

            if (!tfdTelefoneReferencia.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setTelefoneReferencia(tfdTelefoneReferencia.getText().toUpperCase());
            } else {
                auxCli.setTelefoneReferencia("");
            }

            auxCli.setCasaPropria(cmbCasaPropria.getSelectedItem().toString());

            if (!tfdPessoaAutorizada.getText().isEmpty()) {// se diferente de vazio 
                auxCli.setPessoaAutorizada(tfdPessoaAutorizada.getText().toUpperCase());
            } else {
                auxCli.setPessoaAutorizada("");
            }
            if (CbxAtivo.isSelected() == true) {
                auxCli.setStatus(true);
            } else {
                auxCli.setStatus(false);
            }
            auxCli.setDataAtualizacao(FormataData.tranformaParaData(Funcoes.getData()));

            if (cliente.getIdcliente() == 0) {
                ctlCliente.incluirClienteBanco(auxCli);// Faz o inclusão de um cliente no Banco
            } else {
                ctlCliente.atualizaClienteBanco(auxCli, cliente);
                this.dispose();
            }

            JOptionPane.showMessageDialog(this, "Cliente '" + tfdNome.getText() + "' salvo com sucesso");
            limpaTela();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Cliente não salvo, faltam campos obrigatórios");
        }

    }

    private void preencherCampos(Cliente c) {
        tfdNome.setText(c.getNome());
        jmDataNascimento.setData(c.getDataNascimento());
        tfdCpfCnpj.setText(c.getCpfCnpj());
        tfdRgIe.setText(c.getRgIe());
        tfdEndereco.setText(c.getEndereco());
        tfdCidade.setText(c.getCidade());
        tfdTelefone.setText(c.getTelefone());
        tfdCelular.setText(c.getCelular());
        tfdRenda.setText(c.getRenda());
        tfdMda.setText(c.getMda());
        tfdMa.setText(c.getMa());
        tfdLocalTrabalho.setText(c.getLocalTrabalho());
        tfdFuncaoTrabalho.setText(c.getFuncaoTrabalho());
        tfdNomeReferencia.setText(c.getNomeReferencia());
        tfdTelefoneReferencia.setText(c.getTelefoneReferencia());
        cmbCasaPropria.setSelectedItem(c.getCasaPropria());
        tfdPessoaAutorizada.setText(c.getPessoaAutorizada());
        jmDataAtualizacao.setData(c.getDataAtualizacao());
        tfdNome.requestFocus();
        CbxAtivo.setSelected(c.isStatus());
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadastroCliente dialog = new DlgCadastroCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CbxAtivo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCasaPropria;
    private javax.swing.JLabel jLabel1;
    private caroco.JmData jmDataAtualizacao;
    private caroco.JmData jmDataNascimento;
    private javax.swing.JLabel lblAnos;
    private javax.swing.JLabel lblCasaPropria;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblDataAtualizacao;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFinanceiro;
    private javax.swing.JLabel lblFuncaoTrabalho;
    private javax.swing.JLabel lblLocalTrabalho;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblMda;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeReferencia;
    private javax.swing.JLabel lblPessoaAutorizada;
    private javax.swing.JLabel lblPessoal;
    private javax.swing.JLabel lblRenda;
    private javax.swing.JLabel lblRgIe;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneReferencia;
    private javax.swing.JTextField tfdCelular;
    private javax.swing.JTextField tfdCidade;
    private javax.swing.JTextField tfdCpfCnpj;
    private javax.swing.JLabel tfdDataNascimento;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfdFuncaoTrabalho;
    private javax.swing.JTextField tfdLocalTrabalho;
    private javax.swing.JTextField tfdMa;
    private javax.swing.JTextField tfdMda;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdNomeReferencia;
    private javax.swing.JTextField tfdPessoaAutorizada;
    private jnumberformatfield.JNumberFormatField tfdRenda;
    private javax.swing.JTextField tfdRgIe;
    private javax.swing.JTextField tfdTelefone;
    private javax.swing.JTextField tfdTelefoneReferencia;
    // End of variables declaration//GEN-END:variables
}
