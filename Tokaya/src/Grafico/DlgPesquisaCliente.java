package Grafico;

import Controle.ControlaCliente;
import Controle.ControlaConfiguracao;
import Negocio.Cliente;
import Utilitario.FormataData;
import Utilitario.Funcoes;
import caroco.Data;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DlgPesquisaCliente extends javax.swing.JDialog {
    ControlaCliente ctlCliente = new ControlaCliente();
    ControlaConfiguracao ctlConfiguracao = new ControlaConfiguracao();
    public DlgPesquisaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        criandoTabela();
        this.setTitle("Pesquisa de Cliente");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        CcbAtivo.setSelected(true);
    }
    
    public DlgPesquisaCliente(java.awt.Dialog parent, boolean modal, boolean ativo) {
        super(parent, modal);
        initComponents();
        criandoTabela();
        this.setTitle("Pesquisa de Cliente");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        CcbAtivo.setSelected(true);
        CcbAtivo.setEnabled(ativo);       
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        lblCpfCnpj = new javax.swing.JLabel();
        tfdCpfCnpj = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        tfdCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        CcbAtivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setText("Nome:");

        lblCpfCnpj.setText("CPF/CNPJ:");

        lblCidade.setText("Cidade:");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisaUsuario.png"))); // NOI18N
        btnPesquisar.setText("Perquisar Cliente");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Selecionar.png"))); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        CcbAtivo.setText("Ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCpfCnpj)
                        .addGap(18, 18, 18)
                        .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCidade)
                        .addGap(18, 18, 18)
                        .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CcbAtivo)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(btnPesquisar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfCnpj)
                    .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CcbAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar)
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        ctlCliente.clientes = new ArrayList<>();//Limpa o vetor local de clientes
        limpaTabela(); //Limpa a tabela de clientes
        ctlCliente.buscarClientesDoBanco(tfdNome.getText().toUpperCase(), tfdCpfCnpj.getText().toUpperCase(), tfdCidade.getText().toUpperCase(), CcbAtivo.isSelected());
        try {
            atualizarTabelaClientes(ctlCliente.clientes);
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(this, "Sua pesquisa não foi precisa o bastante");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Cliente auxCli = new Cliente();
        try {
            auxCli = ctlCliente.buscarClientePorId(Long.parseLong(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString()));
            DlgCadastroCliente dlg = new DlgCadastroCliente(this, true, auxCli);
            dlg.setVisible(true);
            btnPesquisarActionPerformed(evt);//atualiza a tabela
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você não selecionou cliente para editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            Janela.CLIENTE = ctlCliente.buscarClientePorId(Long.parseLong(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString()));
            if (!verificaAtualizacaoCadastro(Janela.CLIENTE.getDataAtualizacao(),ctlConfiguracao.buscaTempoAtualizao())) {
                int num = JOptionPane.showConfirmDialog(this, "Cliente com dados desatualizados, deseja atualizar?");
                if (num == JOptionPane.YES_OPTION) {
                    DlgCadastroCliente dlg = new DlgCadastroCliente(this, true, Janela.CLIENTE);
                    dlg.setVisible(true);
                    btnPesquisarActionPerformed(evt);//atualiza a tabela
                }
            }
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você não selecionou cliente 1");
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    public void criandoTabela(){
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Data Nascimento");
        modelo.addColumn("CPF/CNPJ");
        modelo.addColumn("RG/IE");
        modelo.addColumn("Endereço");
        modelo.addColumn("Telefone");
        modelo.addColumn("Celular");
        modelo.addColumn("Cidade");
        modelo.addColumn("Renda");

        // estabelece o tamanho de cada coluna
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(50);//IdCliente
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(200);//Nome
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(150);//Data de nascimento
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(120);//CPF
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(120);//RG
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(200);//Endereço
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(100);//Telefone
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(100);//Celular
        tblCliente.getColumnModel().getColumn(8).setPreferredWidth(100);//Cidade
        tblCliente.getColumnModel().getColumn(9).setPreferredWidth(100);//Renda
    }
    
    public void limpaTabela() { //Responsavel por limpar todos os campos da tabela
        ((DefaultTableModel) tblCliente.getModel()).setNumRows(0);
        tblCliente.updateUI();
    }
    
    public void atualizarTabelaClientes(ArrayList<Cliente> ar) {
        // primeiro limpa a tabela
        limpaTabela();
        // agora popula com valores atualizados
        for (int i = 0; i < ar.size(); i++) {
            Object row[] = {
                        ar.get(i).getIdcliente(),
                        ar.get(i).getNome(),
                        ar.get(i).getDataNascimento(),
                        ar.get(i).getCpfCnpj(),
                        ar.get(i).getRgIe(),
                        ar.get(i).getEndereco(),
                        ar.get(i).getTelefone(),
                        ar.get(i).getCelular(),
                        ar.get(i).getCidade(),
                        ar.get(i).getRenda()};
                    ((DefaultTableModel) tblCliente.getModel()).addRow(row);
            }
    }

    public boolean verificaAtualizacaoCadastro(Data dataCadastro, String dias) {
        boolean atualizado = false;
        int configuracao = Integer.parseInt(dias);
        int diferenca = 0;
        diferenca = dataCadastro.obterDiferençaEmDias(FormataData.tranformaParaData(Funcoes.getData()));
        if (diferenca < configuracao) {
            atualizado = true;
        }
        return atualizado;
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
            java.util.logging.Logger.getLogger(DlgPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgPesquisaCliente dialog = new DlgPesquisaCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox CcbAtivo;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPesquisar;
    public static javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField tfdCidade;
    private javax.swing.JTextField tfdCpfCnpj;
    private javax.swing.JTextField tfdNome;
    // End of variables declaration//GEN-END:variables
}
