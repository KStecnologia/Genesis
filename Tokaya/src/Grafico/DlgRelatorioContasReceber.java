package Grafico;

import Controle.ControlaCliente;
import Controle.ControlaConfiguracao;
import Controle.ControlaParcela;
import Controle.ControlaVenda;
import Negocio.Cliente;
import Negocio.Parcela;
import Negocio.Venda;
import Utilitario.FormataData;
import Utilitario.Vencimentos;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DlgRelatorioContasReceber extends javax.swing.JDialog {

    ControlaParcela ctlParcela = new ControlaParcela();
    ControlaCliente ctlCliente = new ControlaCliente();
    ControlaVenda ctlVenda = new ControlaVenda();

    ControlaConfiguracao ctlConfiguracao = new ControlaConfiguracao();
    DecimalFormat df = new DecimalFormat("0.00"); //Transforma o valor em uma unidade monetaria

    public DlgRelatorioContasReceber(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Relatório de Contas a receber");
        this.setLocationRelativeTo(null);
        criandoTabela();
        Janela.CLIENTE = new Cliente();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        tfdIdCliente = new javax.swing.JTextField();
        btnPesquisaParcela = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisaCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jmDataDe = new caroco.JmData();
        lblDataDe = new javax.swing.JLabel();
        tfdJurosFixo = new jnumberformatfield.JNumberFormatField();
        lblDataAte = new javax.swing.JLabel();
        tfdJurosDiario = new jnumberformatfield.JNumberFormatField();
        jmDataAte = new caroco.JmData();
        tfdValor = new jnumberformatfield.JNumberFormatField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParcelas = new javax.swing.JTable();
        tfdValorTotal = new jnumberformatfield.JNumberFormatField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbOperacao = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbEmAberto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar e Fechar Janela");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfdIdCliente.setToolTipText("Digite o Codigo Do Cliente");
        tfdIdCliente.setEnabled(false);

        btnPesquisaParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/btnPesquisarConta.png"))); // NOI18N
        btnPesquisaParcela.setText("Pesquisar Parcelas");
        btnPesquisaParcela.setToolTipText("Pesquisar Conta Por Funcionario");
        btnPesquisaParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaParcelaActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor Total:");

        jLabel3.setText("Juros diario:");

        tfdNomeCliente.setEditable(false);
        tfdNomeCliente.setToolTipText("Nome Do Funcionario");

        jLabel4.setText("Juros Fixo:");

        btnPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisaUsuario.png"))); // NOI18N
        btnPesquisaCliente.setText("Pesquisar Cliente");
        btnPesquisaCliente.setToolTipText("Abrir Janela De Pesquisa Funcionario");
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor:");

        lblDataDe.setText("De:");

        tfdJurosFixo.setEnabled(false);

        lblDataAte.setText("Ate:");

        tfdJurosDiario.setEnabled(false);

        tfdValor.setEnabled(false);

        tblParcelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblParcelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblParcelasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblParcelas);

        tfdValorTotal.setEnabled(false);

        jLabel1.setText("Cliente:");

        jLabel6.setText("Operação:");

        cmbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A vista", "A prazo" }));

        jLabel7.setText("Em aberto:");

        cmbEmAberto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdJurosFixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfdJurosDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(177, 177, 177)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblDataAte)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jmDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblDataDe)
                                        .addGap(30, 30, 30)
                                        .addComponent(jmDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbEmAberto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jmDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEmAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPesquisaParcela)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfdJurosFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfdJurosDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisaParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaParcelaActionPerformed
        limpaTabela(); //Limpa a tabela de parcelas
        tfdJurosDiario.setText("");
        tfdJurosFixo.setText("");
        tfdValor.setText("");
        tfdValorTotal.setText("");
        boolean status = false;
        String operacao = "";
        try {
            if (jmDataDe.getData() == null) {
                jmDataDe.setData(FormataData.tranformaParaData("01/01/1800"));
            }
            if (jmDataAte.getData() == null) {
                jmDataAte.setData(FormataData.tranformaParaData("01/01/2100"));
            }
            if (cmbEmAberto.getSelectedItem().toString().equalsIgnoreCase("SIM")) {
                status = false;
            } else {
                status = true;
            }
            if (cmbOperacao.getSelectedItem().toString().equalsIgnoreCase("A vista")) {
                operacao = "A prazo";
            } else {
                operacao = "A vista";
            }
            ctlParcela.buscarParcelaDoBanco(jmDataDe.getData(), jmDataAte.getData(), tfdNomeCliente.getText(), status, operacao);

            atualizarTabelaParcelas(ControlaParcela.parcelas);
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(this, "Sua pesquisa não foi precisa o bastante");
        }
    }//GEN-LAST:event_btnPesquisaParcelaActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        DlgPesquisaCliente dlg = new DlgPesquisaCliente(this, true, true);
        dlg.btnEditar.setEnabled(false);
        dlg.setVisible(true);

        tfdIdCliente.setText(Janela.CLIENTE.getIdcliente() + "");
        tfdNomeCliente.setText(Janela.CLIENTE.getNome() + "");
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void tblParcelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParcelasMouseReleased
        Parcela auxPar = ctlParcela.buscarParcelaPorId(Long.parseLong(tblParcelas.getValueAt(tblParcelas.getSelectedRow(), 0).toString()));
        double jurosDiario;
        double jurosFixo;
        double valorOriginal = Double.parseDouble(auxPar.getValorOriginal());

        if (Vencimentos.verificaParcelaVencida(auxPar.getDataVencimento())) {
            jurosDiario = Vencimentos.valorDosJurosDiarios(auxPar.getDataVencimento(), ctlConfiguracao.buscaJurosDiario());
            jurosFixo = Vencimentos.valorDosJurosFixo(auxPar.getValorOriginal(), auxPar.getDataVencimento(), ctlConfiguracao.buscaJurosFixo());
            tfdJurosDiario.setText(df.format(jurosDiario));
            tfdJurosFixo.setText(df.format(jurosFixo));
            tfdValor.setText(df.format(valorOriginal));

            double jurosTotal = jurosDiario + jurosFixo;
            double valorTotal = jurosTotal + valorOriginal;
            tfdValorTotal.setText(df.format(valorTotal));
        } else {
            tfdValor.setText(df.format(valorOriginal));
            tfdJurosDiario.setText(df.format(0.00));
            tfdJurosFixo.setText(df.format(0.00));
            tfdValorTotal.setText(df.format(valorOriginal));
        }
    }//GEN-LAST:event_tblParcelasMouseReleased

    private void criandoTabela() {
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblParcelas.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("ID");
        modelo.addColumn("Venda");
        modelo.addColumn("Par.");
        modelo.addColumn("Seq.");
        modelo.addColumn("Valor Total");
        modelo.addColumn("Vencimento");
        modelo.addColumn("Cliente");
        modelo.addColumn("Status");

        // estabelece o tamanho de cada coluna
        tblParcelas.getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblParcelas.getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblParcelas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblParcelas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblParcelas.getColumnModel().getColumn(1).setPreferredWidth(40);//Id Venda
        tblParcelas.getColumnModel().getColumn(2).setPreferredWidth(30);//Parcela
        tblParcelas.getColumnModel().getColumn(3).setPreferredWidth(30);//Sequencial
        tblParcelas.getColumnModel().getColumn(4).setPreferredWidth(50); //Valor Total
        tblParcelas.getColumnModel().getColumn(5).setPreferredWidth(80);//Vencimento
        tblParcelas.getColumnModel().getColumn(6).setPreferredWidth(250);//cliente
        tblParcelas.getColumnModel().getColumn(7).setPreferredWidth(50);//Status

    }

    public void limpaTabela() {//Limpa a tabela antes da proxima pesquisa
        // limpeza da tabela dinamica
        ((DefaultTableModel) tblParcelas.getModel()).setNumRows(0);
        tblParcelas.updateUI();
    }

    private void atualizarTabelaParcelas(ArrayList<Parcela> parcelas) {
        String status;
        double valorOriginal;
        double jurosDiario;
        double jurosFixo;
        double jurosTotal;
        double valorTotal;

        for (int i = 0; i < parcelas.size(); i++) {
            if (parcelas.get(i).isStatus()) {
                status = "PAGO";
                valorOriginal = Double.parseDouble(parcelas.get(i).getValorQuitacao().replaceAll(",", "."));
                jurosTotal = Double.parseDouble(parcelas.get(i).getValorJuros().replaceAll(",", "."));
                valorTotal = jurosTotal + valorOriginal;
            } else {
                status = "EM ABERTO";
                valorOriginal = Double.parseDouble(parcelas.get(i).getValorQuitacao().replaceAll(",", "."));
                jurosDiario = Vencimentos.valorDosJurosDiarios(parcelas.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosDiario());
                jurosFixo = Vencimentos.valorDosJurosFixo(parcelas.get(i).getValorOriginal(), parcelas.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosFixo());
                jurosTotal = jurosDiario + jurosFixo;
                valorTotal = jurosTotal + Double.parseDouble(parcelas.get(i).getValorOriginal().replaceAll(",", "."));
            }
            Venda auxVen = ctlVenda.buscarVendaPorId(parcelas.get(i).getIdvenda());
            Cliente auxCli = ctlCliente.buscarClientePorId(auxVen.getIdCliente());

            Object row[] = {
                parcelas.get(i).getIdparcela(),
                parcelas.get(i).getIdvenda(),
                parcelas.get(i).getNumero(),
                 parcelas.get(i).getSequencial(),
                df.format(valorTotal),
                parcelas.get(i).getDataVencimento(),
                auxCli.getNome(),
                status};

            ((DefaultTableModel) tblParcelas.getModel()).addRow(row);
        }
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
            java.util.logging.Logger.getLogger(DlgRelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgRelatorioContasReceber dialog = new DlgRelatorioContasReceber(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisaCliente;
    public static javax.swing.JButton btnPesquisaParcela;
    private javax.swing.JComboBox<String> cmbEmAberto;
    private javax.swing.JComboBox<String> cmbOperacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private caroco.JmData jmDataAte;
    private caroco.JmData jmDataDe;
    private javax.swing.JLabel lblDataAte;
    private javax.swing.JLabel lblDataDe;
    private javax.swing.JTable tblParcelas;
    public static javax.swing.JTextField tfdIdCliente;
    private jnumberformatfield.JNumberFormatField tfdJurosDiario;
    private jnumberformatfield.JNumberFormatField tfdJurosFixo;
    public static javax.swing.JTextField tfdNomeCliente;
    private jnumberformatfield.JNumberFormatField tfdValor;
    private jnumberformatfield.JNumberFormatField tfdValorTotal;
    // End of variables declaration//GEN-END:variables
}
