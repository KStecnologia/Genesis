package Grafico;

import Controle.ControlaCliente;
import Negocio.Cliente;
import Utilitario.FormataData;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jrockit.jfr.tools.ConCatRepository;

public class DlgRelatorioAniversario extends javax.swing.JDialog {
    ControlaCliente ctlCliente = new ControlaCliente();
    public DlgRelatorioAniversario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Relatório de Aniversários");
        this.setLocationRelativeTo(null);
        criandoTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAniversariantes = new javax.swing.JTable();
        jmDataInicio = new caroco.JmData();
        jmDataFim = new caroco.JmData();
        lblDataInicio = new javax.swing.JLabel();
        lblDataFim = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGerarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblAniversariantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAniversariantes);

        lblDataInicio.setText("Data inicio:");

        lblDataFim.setText("Data Fim:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/btn pesqusar 16x16.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
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

        btnGerarPDF.setText("Gerar PDF");
        btnGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDataInicio)
                        .addGap(18, 18, 18)
                        .addComponent(jmDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblDataFim)
                        .addGap(18, 18, 18)
                        .addComponent(jmDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(btnGerarPDF)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jmDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataInicio)
                            .addComponent(lblDataFim))
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnGerarPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        limpaTabela(); //Limpa a tabela de parcelas

        try {
            if (jmDataInicio.getData() == null) {
                jmDataInicio.setData(FormataData.tranformaParaData("01/01/1800"));
            }
            if (jmDataFim.getData() == null) {
                jmDataFim.setData(FormataData.tranformaParaData("01/01/2100"));
            }
            atualizarTabelaAniversariantes(ctlCliente.buscarAniversariantes(jmDataInicio.getData(), jmDataFim.getData()));
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(this, "Sua pesquisa não foi precisa o bastante");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarPDFActionPerformed
        boolean pdf = false;

        Date data = new Date(System.currentTimeMillis());
        String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(data);
        dataFormatada = dataFormatada.replaceAll("/", ".");
        // criação do documento
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\genesis\\Tokaya\\PDF\\TabelaAniversario."+ dataFormatada + ".pdf"));
            document.setMargins(10, 40,1, 0);
            document.open();
            // adicionando um parágrafo no documento           
            document.add(new Paragraph("Relatório de aniversário"));        
            document.add(new Paragraph("Data aniversario: "+jmDataInicio.getData()+" a "+jmDataFim.getData()));
            document.add(new Paragraph("\n"));
            PdfPTable table = new PdfPTable(new float[]{0.60f, 0.40f});
            //  table.setWidthPercentage(60.0f);// quantidade que deve ser ocupada do pdf
            table.setHorizontalAlignment(Element.ALIGN_LEFT);// alinhamento(no caso a esquerda)
            PdfPCell header = new PdfPCell(new Paragraph("                                                          Tokaya"));// nome da tabela
            header.setColspan(7);// numero de colunas da tabela
            table.addCell(header); // coloca nome na tabela           
            table.addCell("Nome");// nome da coluna
            table.addCell("Data Aniversário");// nome da coluna
        
            for (int i = 0; i < tblAniversariantes.getRowCount(); i++) {
                table.addCell(tblAniversariantes.getValueAt(i, 0).toString());
                table.addCell(tblAniversariantes.getValueAt(i, 1).toString());
            }
            
            document.add(table);// adiciona tabela no pdf
            JOptionPane.showMessageDialog(this, "Relatório gerado com sucesso!");
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        document.close();
    }//GEN-LAST:event_btnGerarPDFActionPerformed

    private void criandoTabela() {
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblAniversariantes.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("Nome");
        modelo.addColumn("Data de aniversário");

        tblAniversariantes.getColumnModel().getColumn(0).setPreferredWidth(300);//Nome
        tblAniversariantes.getColumnModel().getColumn(1).setPreferredWidth(100);//Data de aniversário
    }
    
    public void limpaTabela() {//Limpa a tabela antes da proxima pesquisa
        // limpeza da tabela dinamica
        ((DefaultTableModel) tblAniversariantes.getModel()).setNumRows(0);
        tblAniversariantes.updateUI();
    }
    
    public void atualizarTabelaAniversariantes(ArrayList<Cliente> clientes){
        for (int i = 0; i < clientes.size(); i++) {

            Object row[] = {
                clientes.get(i).getNome(),
                clientes.get(i).getDataNascimento()};

            ((DefaultTableModel) tblAniversariantes.getModel()).addRow(row);
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
            java.util.logging.Logger.getLogger(DlgRelatorioAniversario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorioAniversario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorioAniversario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorioAniversario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgRelatorioAniversario dialog = new DlgRelatorioAniversario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGerarPDF;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private caroco.JmData jmDataFim;
    private caroco.JmData jmDataInicio;
    private javax.swing.JLabel lblDataFim;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JTable tblAniversariantes;
    // End of variables declaration//GEN-END:variables
}
