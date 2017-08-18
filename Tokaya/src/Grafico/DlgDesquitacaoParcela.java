package Grafico;

import Controle.ControlaCliente;
import Controle.ControlaParcela;
import Controle.ControlaVenda;
import Negocio.Cliente;
import Negocio.Parcela;
import Negocio.Venda;
import Utilitario.Formatacao;
import caroco.Data;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DlgDesquitacaoParcela extends javax.swing.JDialog {
    ControlaParcela ctlParcela = new ControlaParcela();
    ControlaVenda ctlVenda = new ControlaVenda();
    ControlaCliente ctlCliente = new ControlaCliente();
    DecimalFormat df = new DecimalFormat("0.00");
    public DlgDesquitacaoParcela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Desquitação de parcelas");
        this.setLocationRelativeTo(null);
        criandoTabela();
        Janela.CLIENTE = new Cliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncancelar = new javax.swing.JButton();
        btnDesquitacao = new javax.swing.JButton();
        btnPesquisaParcela = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfdValorTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdIdCliente = new javax.swing.JTextField();
        tfdNomeCliente = new javax.swing.JTextField();
        btnPesquisaCliente = new javax.swing.JButton();
        jmDataDe = new caroco.JmData();
        jmDataAte = new caroco.JmData();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDesquitacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setToolTipText("Cancelar e Fechar Janela");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnDesquitacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TipoDespesa.png"))); // NOI18N
        btnDesquitacao.setText("Desquitar");
        btnDesquitacao.setToolTipText("Desquitar Parcela(s)");
        btnDesquitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesquitacaoActionPerformed(evt);
            }
        });

        btnPesquisaParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/btnPesquisarConta.png"))); // NOI18N
        btnPesquisaParcela.setText("Pesquisar Parcelas");
        btnPesquisaParcela.setToolTipText("Pesquisar Conta Por Funcionario");
        btnPesquisaParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaParcelaActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor Total");

        tfdValorTotal.setEditable(false);
        tfdValorTotal.setToolTipText("Valor Total Das Contas");

        jLabel1.setText("Cliente:");

        tfdIdCliente.setToolTipText("Codigo Do Funcionario");
        tfdIdCliente.setEnabled(false);

        tfdNomeCliente.setEditable(false);
        tfdNomeCliente.setToolTipText("Nome Do Funcionario");

        btnPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisaUsuario.png"))); // NOI18N
        btnPesquisaCliente.setText("Pesquisar Cliente");
        btnPesquisaCliente.setToolTipText("Abrir Pesquisa De Funcionario");
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("De");

        jLabel3.setText("Ate");

        tblDesquitacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDesquitacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jmDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jmDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisaCliente))))
                            .addComponent(btnPesquisaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDesquitacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(btncancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisaCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jmDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jmDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisaParcela)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnDesquitacao)
                    .addComponent(jLabel4)
                    .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        limpaTabela();
        DlgPesquisaCliente dlg = new DlgPesquisaCliente(this, true, false);
        DlgPesquisaCliente.btnEditar.setEnabled(false);
        dlg.setVisible(true);
        
        tfdIdCliente.setText(Janela.CLIENTE.getIdcliente()+"");
        tfdNomeCliente.setText(Janela.CLIENTE.getNome()+"");
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void btnPesquisaParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaParcelaActionPerformed
       
        if (tfdIdCliente.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Cliente não selecionado");
        }
        limpaTabela(); //Limpa a tabela de parcelas
        String status = "true";// Pesquisa as parcelas quitadas
        try {
            
            if (jmDataDe.getData() == null) {
                jmDataDe.setData(tranformaParaData("01/01/1800"));
            }
 
            if (jmDataAte.getData() == null) {
                jmDataAte.setData(tranformaParaData("01/01/2100"));
            }
            
        if(tfdIdCliente.getText().isEmpty()) {// se está vazio
            ctlParcela.buscarParcelaDoBanco(jmDataDe.getData(), jmDataAte.getData(), status);
        }else{
            ctlParcela.buscarParcelaDoBanco(jmDataDe.getData(), jmDataAte.getData(), Long.parseLong(tfdIdCliente.getText()), status);
        }
        atualizarTabelaParcelas(ControlaParcela.parcelas);
        atualizaValorTotal(ControlaParcela.parcelas);
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(this, "Sua pesquisa não foi precisa o bastante");
        }
    }//GEN-LAST:event_btnPesquisaParcelaActionPerformed

    private void btnDesquitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesquitacaoActionPerformed
        String status = "false";
        try {
            Parcela par = new Parcela();
            par = ctlParcela.buscarParcelaPorId(Long.parseLong(tblDesquitacao.getValueAt(tblDesquitacao.getSelectedRow(), 0).toString()));
                ctlParcela.atualizaParcelaBanco(par.getIdparcela(), status, tfdValorTotal.getText(), "0");
                Long id = par.getIdparcela();
                Venda auxVen = ctlVenda.buscarVendaPorId(ctlParcela.buscarParcelaPorId(id).getIdvenda());
                Cliente auxCli = ctlCliente.buscarClientePorId(auxVen.getIdCliente());
                ctlCliente.diminuirQuitacoes(auxCli);
                ctlCliente.diminuirTotalAtraso(auxCli,par.getDataVencimento().obterDiferençaEmDias(par.getDataQuitacao()));
                ctlCliente.atualizaMdaCliente(ctlCliente.buscarClientePorId(auxCli.getIdcliente()));
            btnPesquisaParcelaActionPerformed(evt);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Você não selecionou uma parcela para quitar");
        }
    }//GEN-LAST:event_btnDesquitacaoActionPerformed

    private void criandoTabela(){
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblDesquitacao.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("ID");
        modelo.addColumn("Numero");
        modelo.addColumn("Valor Original");
        modelo.addColumn("Juros");
        modelo.addColumn("Valor Quitação");
        modelo.addColumn("Data Vencimento");
        modelo.addColumn("Data Quitação");
        modelo.addColumn("Status");
        modelo.addColumn("IdVenda");
        modelo.addColumn("Data Promessa");

        // estabelece o tamanho de cada coluna
        tblDesquitacao.getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblDesquitacao.getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblDesquitacao.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblDesquitacao.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblDesquitacao.getColumnModel().getColumn(1).setPreferredWidth(75);//Numero
        tblDesquitacao.getColumnModel().getColumn(2).setPreferredWidth(120);//Valor Original
        tblDesquitacao.getColumnModel().getColumn(3).setPreferredWidth(120);//Juros
        tblDesquitacao.getColumnModel().getColumn(4).setPreferredWidth(100);//Valor Quitacao
        tblDesquitacao.getColumnModel().getColumn(5).setPreferredWidth(100);//Data Vencimento
        tblDesquitacao.getColumnModel().getColumn(6).setPreferredWidth(100);//Data Quitacao
        tblDesquitacao.getColumnModel().getColumn(7).setPreferredWidth(100);//Status
        tblDesquitacao.getColumnModel().getColumn(8).setPreferredWidth(75);//IdVenda
        tblDesquitacao.getColumnModel().getColumn(9).setPreferredWidth(100);//Data Promessa
    }
    
    private void limpaTabela() {//Limpa a tabela antes da proxima pesquisa
        // limpeza da tabela dinamica
        ((DefaultTableModel) tblDesquitacao.getModel()).setNumRows(0);
        tblDesquitacao.updateUI();
    }
    
    public Data tranformaParaData(String data) {
        String vet[] = data.split("/");
        Data auxData = new Data();
        int dia = Integer.parseInt(vet[0]);
        int mes = Integer.parseInt(vet[1]);
        int ano = Integer.parseInt(vet[2]);
        auxData.definirDia(dia);
        auxData.definirMes(mes);
        auxData.definirAno(ano);
        return auxData;
    }
    
    private void atualizarTabelaParcelas(ArrayList<Parcela> parcelas){
        String status;
        for (int i = 0; i < parcelas.size(); i++) {
            if (parcelas.get(i).isStatus()) {
                status = "PAGO";
            }else{
                status = "EM ABERTO";
            }
            // Transforma os valores dos TFDs em double com ponto em vez de virgula
            double valorOriginal = Double.parseDouble(parcelas.get(i).getValorOriginal().replaceAll(",",".")); 
            double valorJuros = Double.parseDouble(parcelas.get(i).getValorJuros().replaceAll(",","."));
            double valorQuitacao = Double.parseDouble(parcelas.get(i).getValorQuitacao().replaceAll(",","."));
            
            
        Object row[] = {
                        parcelas.get(i).getIdparcela(),
                        parcelas.get(i).getNumero(),
                        df.format(valorOriginal),
                        df.format(valorJuros),
                        df.format(valorQuitacao),
                        parcelas.get(i).getDataVencimento(),
                        parcelas.get(i).getDataQuitacao(),
                        status,
                        parcelas.get(i).getIdvenda(),
                        parcelas.get(i).getDataPromessa(),};

                    ((DefaultTableModel) tblDesquitacao.getModel()).addRow(row);
        }
    }
    
    private void atualizaValorTotal (ArrayList<Parcela> parcelas){
        double total=0;
        for (int i = 0; i < parcelas.size(); i++) {
            total += Double.parseDouble(parcelas.get(i).getValorQuitacao().replaceAll(",", "."));
        }
        tfdValorTotal.setText(df.format(total));
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
            java.util.logging.Logger.getLogger(DlgDesquitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgDesquitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgDesquitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgDesquitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgDesquitacaoParcela dialog = new DlgDesquitacaoParcela(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDesquitacao;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JButton btnPesquisaParcela;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private caroco.JmData jmDataAte;
    private caroco.JmData jmDataDe;
    private javax.swing.JTable tblDesquitacao;
    public static javax.swing.JTextField tfdIdCliente;
    public static javax.swing.JTextField tfdNomeCliente;
    private javax.swing.JTextField tfdValorTotal;
    // End of variables declaration//GEN-END:variables
}
