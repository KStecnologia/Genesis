package Grafico;

import Controle.ControlaCliente;
import Controle.ControlaParcela;
import Controle.ControlaVenda;

import Negocio.Cliente;
import Negocio.Parcela;
import Negocio.Venda;
import Utilitario.FormataData;
import caroco.Data;
import java.util.ArrayList;
import Utilitario.Formatacao;
import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class DlgPesquisaVenda extends javax.swing.JDialog {
    ControlaCliente ctlCliente = new ControlaCliente();
    ControlaVenda ctlVenda = new ControlaVenda();
    ControlaParcela ctlParcela = new ControlaParcela();
    DecimalFormat df = new DecimalFormat("0.00");
    
    public DlgPesquisaVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setLocationRelativeTo(null);
        this.setTitle("Pesquisa de Vendas");
        criandoTabela();
    }
    
    public DlgPesquisaVenda(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setLocationRelativeTo(null);
        this.setTitle("Pesquisa de Vendas");
        criandoTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelecionar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        btnCancelar1 = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        tfdNomeCliente = new javax.swing.JTextField();
        tfdIdCliente = new javax.swing.JTextField();
        DataEntrada = new javax.swing.JLabel();
        lblDataSaida = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        tfdValorMaior = new jnumberformatfield.JNumberFormatField();
        jmDataEntrada = new caroco.JmData();
        jmDataSaida = new caroco.JmData();
        btnLimpar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        tfdTotal = new javax.swing.JTextField();
        btnGerarPDF = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Selecionar.png"))); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/btnPesquisarConta.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVenda);

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisaUsuario.png"))); // NOI18N
        btnBuscarCliente.setText("Pesquisar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tfdNomeCliente.setText("Cliente");
        tfdNomeCliente.setEnabled(false);

        tfdIdCliente.setEnabled(false);

        DataEntrada.setText("Data Entrada");

        lblDataSaida.setText("Data Sáida");

        lblValor.setText("Valor Total maior que:");

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/limpa.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblTotal.setText("Total:");

        btnGerarPDF.setText("Gerar PDF");
        btnGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarPDFActionPerformed(evt);
            }
        });

        btnCancelarVenda.setText("Cancelar Venda");
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", "Ambos" }));

        lblStatus.setText("Status da Venda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelecionar)
                                .addGap(62, 62, 62)
                                .addComponent(btnGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar1))
                            .addComponent(jScrollPane1))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DataEntrada)
                                        .addGap(18, 18, 18)
                                        .addComponent(jmDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDataSaida)
                                        .addGap(29, 29, 29)
                                        .addComponent(jmDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblValor)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdValorMaior, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStatus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jmDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DataEntrada)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jmDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataSaida)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(tfdValorMaior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatus))))
                .addGap(15, 15, 15)
                .addComponent(btnPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(tfdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(btnSelecionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar1)
                            .addComponent(btnLimpar)
                            .addComponent(btnGerarPDF)
                            .addComponent(btnCancelarVenda))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            Janela.VENDA = ctlVenda.buscarVendaPorId(Long.parseLong(tblVenda.getValueAt(tblVenda.getSelectedRow(), 0).toString()));
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você não selecionou veiculo");
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        ctlVenda.vendas = new ArrayList<>();//Limpa o vetor local de vendas
        limpaTabela(); //Limpa a tabela de vendas
        try {
            
            if (jmDataEntrada.getData() == null) {
                jmDataEntrada.setData(FormataData.tranformaParaData("01/01/1800"));
            }
 
            if (jmDataSaida.getData() == null) {
                jmDataSaida.setData(FormataData.tranformaParaData("01/01/2100"));
            }
            
            if(tfdIdCliente.getText().isEmpty()) {// se está vazio
                ctlVenda.buscarVendasDoBanco(jmDataEntrada.getData(), jmDataSaida.getData(), tfdValorMaior.getText(), cmbStatus.getSelectedItem().toString());
            }else{
                ctlVenda.buscarVendasDoBanco(jmDataEntrada.getData(), jmDataSaida.getData(), tfdValorMaior.getText(), Long.parseLong(tfdIdCliente.getText()),  cmbStatus.getSelectedItem().toString());
            }
            atualizarTabelaVenda(ctlVenda.vendas);
            somaTotalVenda();
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(this, "Sua pesquisa não foi precisa o bastante");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        DlgPesquisaCliente dlg = new DlgPesquisaCliente(this,true, true);
        DlgPesquisaCliente.btnEditar.setEnabled(false);
        dlg.setVisible(true);
        
        try {
            tfdNomeCliente.setText(Janela.CLIENTE.getNome());
            tfdIdCliente.setText(Janela.CLIENTE.getIdcliente()+"");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você não selecionou cliente para a venda");
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        tfdIdCliente.setText("");
        tfdNomeCliente.setText("");
        tfdValorMaior.setText("");
        jmDataEntrada.setData(null);
        jmDataSaida.setData(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarPDFActionPerformed
        // criação do documento
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\genesis\\Tokaya\\PDF\\TabelaDeVendas.pdf"));
            document.setMargins(10, 40,1, 0);
            document.open();
            Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);

            // adicionando um parágrafo no documento
            Paragraph p1 = new Paragraph("RELATÓRIO DE VENDAS", f);
            p1.setAlignment(Element.ALIGN_CENTER);
            document.add(p1);
            Paragraph p2 = new Paragraph("Período: "+jmDataEntrada.getData()+" a "+jmDataSaida.getData());
            p2.setAlignment(Element.ALIGN_CENTER);
            document.add(p2);
            document.add(new Paragraph("\n"));
            for (int i = 0; i < tblVenda.getRowCount(); i++) {
                document.add(new Paragraph("Data: "+tblVenda.getValueAt(i, 2).toString()+" Valor: "+tblVenda.getValueAt(i, 3).toString()+" Nome: "+tblVenda.getValueAt(i, 6).toString()));
            }
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("TOTAL: R$"+tfdTotal.getText()));
            Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", "C:\\genesis\\Tokaya\\PDF\\TabelaDeVendas.pdf"});
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        document.close();
    }//GEN-LAST:event_btnGerarPDFActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        boolean cancela = false;
        ArrayList<Parcela> parcelas = new ArrayList<>();
        try {
            Venda venda = ctlVenda.buscarVendaPorId(Long.parseLong(tblVenda.getValueAt(tblVenda.getSelectedRow(), 0).toString()));
            parcelas = ctlParcela.buscarTodasParcelasPorVenda(venda.getIdVenda());
            if (venda.getOperacao().equalsIgnoreCase("A vista")) {
                ctlVenda.cancelaVenda(venda.getIdVenda());
                JOptionPane.showMessageDialog(this, "Venda cancelada com sucesso!");
            }else{
                for (int i = 0; i < parcelas.size(); i++) {
                    if (parcelas.get(i).getIdvenda() == venda.getIdVenda()) {
                        if (parcelas.get(i).isStatus() == true) {
                            JOptionPane.showMessageDialog(this, "Existem parcelas quitadas para essa Venda, você não pode cancelar a venda");
                            cancela = false;
                            break;
                        }else{
                            cancela = true;
                        }
                    }
                }
                if (cancela) {
                    ctlParcela.cancelarParcelasDaVenda(venda.getIdVenda()); // Cancela as parcelas da venda para poder cancelar a venda
                    ctlVenda.cancelaVenda(venda.getIdVenda()); // Chama o método cancela venda
                    JOptionPane.showMessageDialog(this, "Venda cancelada com sucesso!");
                }
            }
            btnPesquisarActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você não selecionou venda");
        }
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    public void criandoTabela(){
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblVenda.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("ID");
        modelo.addColumn("Descricao");
        modelo.addColumn("Data");
        modelo.addColumn("Valor Total");
        modelo.addColumn("Valor Entrada");
        modelo.addColumn("Forma pagamento");
        modelo.addColumn("Nome");
        modelo.addColumn("Status");
        
        // estabelece o tamanho de cada coluna
        tblVenda.getColumnModel().getColumn(0).setPreferredWidth(50);//IDvenda
        tblVenda.getColumnModel().getColumn(1).setPreferredWidth(325);//Descricao
        tblVenda.getColumnModel().getColumn(2).setPreferredWidth(100);//Data
        tblVenda.getColumnModel().getColumn(3).setPreferredWidth(75);//Valor Total
        tblVenda.getColumnModel().getColumn(4).setPreferredWidth(75);//Valor Entrada
        tblVenda.getColumnModel().getColumn(5).setPreferredWidth(100);//Forma pagamento
        tblVenda.getColumnModel().getColumn(6).setPreferredWidth(75);//Nome cliente
        tblVenda.getColumnModel().getColumn(7).setPreferredWidth(50);//Status
    }
    
    public void limpaTabela() { //Responsavel por limpar todos os campos da tabela
        ((DefaultTableModel) tblVenda.getModel()).setNumRows(0);
        tblVenda.updateUI();
    }
    
    public void atualizarTabelaVenda(ArrayList<Venda> ar) {
        // primeiro limpa a tabela
        limpaTabela();
        // agora popula com valores atualizados
        for (int i = 0; i < ar.size(); i++) {
            Object row[] = {
                        ar.get(i).getIdVenda(),
                        ar.get(i).getDescricao(),
                        ar.get(i).getData(),
                        ar.get(i).getValorTotal(),
                        ar.get(i).getValorEntrada(),
                        ar.get(i).getOperacao(),
                        ctlCliente.buscarClientePorId(ar.get(i).getIdCliente()).getNome(),
                        ar.get(i).getStatus()};
                    ((DefaultTableModel) tblVenda.getModel()).addRow(row);
            }
    }
    
    private void somaTotalVenda(){// Faz a soma dos totais das vendas
        double valor = 0;
        for (int i = 0; i < tblVenda.getRowCount(); i++) {
            valor += Formatacao.formataDoubleRecebeString(tblVenda.getValueAt(i, 3).toString());
        }
        tfdTotal.setText(df.format(valor));
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
            java.util.logging.Logger.getLogger(DlgPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgPesquisaVenda dialog = new DlgPesquisaVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel DataEntrada;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnGerarPDF;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    public static javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private caroco.JmData jmDataEntrada;
    private caroco.JmData jmDataSaida;
    private javax.swing.JLabel lblDataSaida;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tblVenda;
    public static javax.swing.JTextField tfdIdCliente;
    public static javax.swing.JTextField tfdNomeCliente;
    private javax.swing.JTextField tfdTotal;
    private jnumberformatfield.JNumberFormatField tfdValorMaior;
    // End of variables declaration//GEN-END:variables
}
