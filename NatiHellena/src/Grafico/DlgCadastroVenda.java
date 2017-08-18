package Grafico;

import Controle.*;
import Negocio.*;
import Utilitario.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DlgCadastroVenda extends javax.swing.JDialog {
    ControlaCliente ctlCliente = new ControlaCliente();
    ControlaVenda ctlVenda = new ControlaVenda();
    ControlaParcela ctlParcela = new ControlaParcela();
    Venda venda = new Venda();
    double valorParcela;
    DecimalFormat df = new DecimalFormat("0.00");
    boolean continuaLaco = true;//Variavel responsavel por gerenciar o Precionar do Enter automatizado
    
    
    public DlgCadastroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Cadastro de Venda");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        iniciaTabelaParcela();
        iniciaTabelaProduto();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFinalizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        tfdValorTotal = new jnumberformatfield.JNumberFormatField();
        jLabel1 = new javax.swing.JLabel();
        tfdValorEntrada = new jnumberformatfield.JNumberFormatField();
        lblFormaPagamento = new javax.swing.JLabel();
        cmbOperacao = new javax.swing.JComboBox<>();
        btnPesquisaCliente = new javax.swing.JButton();
        tfdNomeCliente = new javax.swing.JTextField();
        tfdIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jmDataDoPrimeiroVencimento = new caroco.JmData();
        btnGerarParcela = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParcela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        tfdValor = new jnumberformatfield.JNumberFormatField();
        tfdValorUnitario = new jnumberformatfield.JNumberFormatField();
        tfdDescricaoProduto = new javax.swing.JTextField();
        tfdQuantidade = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Salvar.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
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

        lblDescricao.setText("Produtos:");

        lblValorTotal.setText("Valor Total:");

        tfdValorTotal.setEnabled(false);

        jLabel1.setText("Valor Entrada:");

        lblFormaPagamento.setText("Operacão:");

        cmbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A vista", "1", "2", "3", "4", "5", "6", " " }));
        cmbOperacao.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbOperacaoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btnPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisaUsuario.png"))); // NOI18N
        btnPesquisaCliente.setText("Pesquisa Cliente");
        btnPesquisaCliente.setToolTipText("Pesquisar Cliente");
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        tfdNomeCliente.setToolTipText("Nome do Cliente");
        tfdNomeCliente.setEnabled(false);

        tfdIdCliente.setToolTipText("Codigo do Cliente");
        tfdIdCliente.setEnabled(false);

        jLabel2.setText("1º Vencimento:");

        btnGerarParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Desquitar.png"))); // NOI18N
        btnGerarParcela.setText("GERAR PARCELA");
        btnGerarParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarParcelaActionPerformed(evt);
            }
        });

        tblParcela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblParcela);

        jLabel3.setText("Cliente:");

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/novo.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIncluirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIncluirMouseReleased(evt);
            }
        });
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        btnIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIncluirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnIncluirKeyReleased(evt);
            }
        });

        tfdValor.setEnabled(false);

        tfdValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdValorUnitarioKeyPressed(evt);
            }
        });

        tfdDescricaoProduto.setText("Descrição do produto");
        tfdDescricaoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfdDescricaoProdutoFocusGained(evt);
            }
        });

        tfdQuantidade.setText("1");
        tfdQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfdQuantidadeFocusGained(evt);
            }
        });
        tfdQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdQuantidadeKeyPressed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblProduto);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/remove.png"))); // NOI18N
        btnExcluir.setText("Excluir Item");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisaCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFinalizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblValorTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfdQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdDescricaoProduto)
                                .addGap(14, 14, 14)
                                .addComponent(tfdValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIncluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescricao)
                                .addGap(0, 503, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFormaPagamento)
                                    .addGap(24, 24, 24)
                                    .addComponent(cmbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfdValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jmDataDoPrimeiroVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnGerarParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(2, 2, 2)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisaCliente)
                    .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncluir)
                            .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValorTotal)
                                .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFormaPagamento)
                            .addComponent(cmbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jmDataDoPrimeiroVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(btnGerarParcela)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaTela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
       
        Parcela p = new Parcela();
        if (!tfdValorTotal.getText().isEmpty() && !tfdValorTotal.getText().equals("0") && cmbOperacao.getSelectedItem().toString().equalsIgnoreCase("A vista")) {//Se valor total não está vazio e forma de pagamento é "A vista"
            if(salvarVenda()){
                p = ctlParcela.VendaVista(tfdValorTotal.getText(),ctlVenda.buscarUltimaVenda());
                ctlParcela.incluiParcelaBanco(p);
                limpaTela();
            }
        }else if (!cmbOperacao.getSelectedItem().toString().equalsIgnoreCase("A vista")) {
            if(salvarVenda()){
                if (jmDataDoPrimeiroVencimento.getData() == null) {
                    jmDataDoPrimeiroVencimento.setData(FormataData.tranformaParaData(Funcoes.getData()));
                }
                    ctlParcela.geraParcela(ctlVenda.buscarUltimaVenda(), cmbOperacao.getSelectedItem().toString(), valorParcela+"", jmDataDoPrimeiroVencimento.getData());
                for (int i = 0; i < ctlParcela.parcelas.size(); i++) {
                    ctlParcela.incluiParcelaBanco(ctlParcela.parcelas.get(i));
                }
                gerarCarne(ctlParcela.parcelas);
                limpaTela();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro. Você está tentando salvar um serviço sem valor");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        Janela.CLIENTE = new Cliente();
        DlgPesquisaCliente dlg = new DlgPesquisaCliente(this,true, false);
        DlgPesquisaCliente.btnEditar.setEnabled(false);
        dlg.setVisible(true);
        
        try {
            tfdNomeCliente.setText(Janela.CLIENTE.getNome());
            tfdIdCliente.setText(Janela.CLIENTE.getIdcliente()+"");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você não selecionou cliente para a venda");
        }
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void btnGerarParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarParcelaActionPerformed
        try {
            limpaTabelaParcela();
            double vt = Formatacao.formataDoubleRecebeString(tfdValorTotal.getText());
            int quantidadeParcelaParaCobrarJuros = Integer.parseInt(ControlaConfiguracao.buscaConfiguracao().getJurosQuantidadeParcela());
            Double porcentagemDeJurosCobrado = Double.parseDouble(ControlaConfiguracao.buscaConfiguracao().getJurosParcela());

            if (jmDataDoPrimeiroVencimento.getData() != null) {
                if (!cmbOperacao.getSelectedItem().toString().equalsIgnoreCase("A vista")) {
                    int parcela = Integer.parseInt(cmbOperacao.getSelectedItem().toString());
                    if (!tfdValorTotal.getText().isEmpty()) {
                        if (vt > 0) {
                            double ve = Formatacao.formataDoubleRecebeString(tfdValorEntrada.getText());
                            if (vt > ve) {
                                double v = vt - ve;
                                v = Formatacao.formataDoubleRecebeDouble(v / parcela);
                                if (parcela >= quantidadeParcelaParaCobrarJuros) {
                                    valorParcela = Formatacao.formataDoubleRecebeString(df.format((v * porcentagemDeJurosCobrado / 100 * parcela) + v));
                                } else {
                                    valorParcela = Formatacao.formataDoubleRecebeString(df.format(v));
                                }
                                ctlParcela.gerarDataVencimento(jmDataDoPrimeiroVencimento.getData(), parcela);
                                for (int i = 0; i < ControlaParcela.auxDataString.length; i++) {
                                    Object row[] = {ControlaParcela.auxDataString[i], // preenche vencimento
                                        df.format(valorParcela)};//valor
                                    // coloca o objeto na tabela
                                    ((DefaultTableModel) tblParcela.getModel()).addRow(row);
                                }
                                btnFinalizar.setEnabled(true);//Libera o botão salvar
                            } else {
                                JOptionPane.showMessageDialog(this, "Valor da entrada maior que valor total");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Valor total incorreto");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Venda à vista não é necessario gerar parcela");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Favor selecionar uma data para o primeiro vencimento");
            }
        } catch (Exception e) {
            //Não faz nada
        }
    }//GEN-LAST:event_btnGerarParcelaActionPerformed

    private void cmbOperacaoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbOperacaoPopupMenuWillBecomeInvisible
        if (cmbOperacao.getSelectedItem().toString().equalsIgnoreCase("A vista")) {
            tfdValorEntrada.setEnabled(false);
            btnFinalizar.setEnabled(true);
        }else{
            tfdValorEntrada.setEnabled(true);
            btnFinalizar.setEnabled(false);
        }
    }//GEN-LAST:event_cmbOperacaoPopupMenuWillBecomeInvisible

    private void tfdQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdQuantidadeFocusGained
        if(tfdQuantidade.getText().equals("1")){
            tfdQuantidade.setText("1");
        }
    }//GEN-LAST:event_tfdQuantidadeFocusGained

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tblProduto.getModel();
        if (tblProduto.getSelectedRow() >= 0){
            if (!cmbOperacao.getSelectedItem().toString().equals("A vista")) {//Se diferente de 'A vista'
                btnFinalizar.setEnabled(false);
            }
            //Soma os produtos no valor total da compra
            double valorTotal = Double.parseDouble(tfdValorTotal.getText().replace(",", "."));
            double valor = Double.parseDouble(tblProduto.getValueAt(tblProduto.getSelectedRow(), 3).toString().replace(",", "."));
            valorTotal = valorTotal - valor;
            tfdValorTotal.setText(df.format(valorTotal));
            //Limpa os campos após inserir produto na tabela
            tfdQuantidade.setText("1");
            tfdValorUnitario.setText("0.00");
            tfdValor.setText("0.00");
            tfdQuantidade.requestFocus();
            dtm.removeRow(tblProduto.getSelectedRow());
            tblProduto.setModel(dtm);
            tfdDescricaoProduto.setText("");
            tfdDescricaoProduto.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tfdDescricaoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdDescricaoProdutoFocusGained
        if (tfdDescricaoProduto.getText().equals("Descrição do produto")) {
            tfdDescricaoProduto.setText("");
        }
    }//GEN-LAST:event_tfdDescricaoProdutoFocusGained

    private void tfdValorUnitarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdValorUnitarioKeyPressed
        if (continuaLaco) {
            atualizaValor();
        }else if(evt.getKeyCode()!=KeyEvent.VK_ENTER){
            atualizaValor();
        }
        continuaLaco = true;
    }//GEN-LAST:event_tfdValorUnitarioKeyPressed

    private void tfdQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdQuantidadeKeyPressed
        if (continuaLaco) {
            atualizaValor();
        }else if(evt.getKeyCode()!=KeyEvent.VK_ENTER){
            atualizaValor();
        }
        continuaLaco = true;
    }//GEN-LAST:event_tfdQuantidadeKeyPressed

    private void btnIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIncluirKeyPressed
        continuaLaco = false;
    }//GEN-LAST:event_btnIncluirKeyPressed

    private void btnIncluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirMousePressed
        continuaLaco = false;
    }//GEN-LAST:event_btnIncluirMousePressed

    private void btnIncluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirMouseReleased
        if(tfdValor.getText().equals("0,00")||tfdDescricaoProduto.getText().equals("Descrição do produto")||tfdDescricaoProduto.getText().equals("")){// caso os campos valor ou descrição não forem preenchidos
            JOptionPane.showMessageDialog(this, "Produto inválido!");
        }else{
            if (!cmbOperacao.getSelectedItem().toString().equals("A vista")) {//Se diferente de 'A vista'
                btnFinalizar.setEnabled(false);
            }
            Object row[] = {tfdQuantidade.getText(),tfdDescricaoProduto.getText(),tfdValorUnitario.getText(),tfdValor.getText()};
            ((DefaultTableModel) tblProduto.getModel()).addRow(row);// coloca a linha na tabela
            //Soma os produtos no valor total da compra
            double valorTotal = Double.parseDouble(tfdValorTotal.getText().replace(",", "."));
            double valor = Double.parseDouble(tfdValor.getText().replace(",", "."));
            valorTotal = valorTotal + valor;
            tfdValorTotal.setText(df.format(valorTotal));
            //Limpa os campos após inserir produto na tabela
            tfdQuantidade.setText("1");
            tfdValorUnitario.setText("0.00");
            tfdValor.setText("0.00");
            tfdDescricaoProduto.setText("");
            tfdDescricaoProduto.requestFocus();
        }
    }//GEN-LAST:event_btnIncluirMouseReleased

    private void btnIncluirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIncluirKeyReleased
        if(tfdValor.getText().equals("0,00")||tfdDescricaoProduto.getText().equals("Descrição do produto")||tfdDescricaoProduto.getText().equals("")){// caso os campos valor ou descrição não forem preenchidos
            JOptionPane.showMessageDialog(this, "Produto inválido!");
        }else{
            if (!cmbOperacao.getSelectedItem().toString().equals("A vista")) {//Se diferente de 'A vista'
                btnFinalizar.setEnabled(false);
            }
            Object row[] = {tfdQuantidade.getText(),tfdDescricaoProduto.getText(),tfdValorUnitario.getText(),tfdValor.getText()};
            ((DefaultTableModel) tblProduto.getModel()).addRow(row);// coloca a linha na tabela
            //Soma os produtos no valor total da compra
            double valorTotal = Double.parseDouble(tfdValorTotal.getText().replace(",", "."));
            double valor = Double.parseDouble(tfdValor.getText().replace(",", "."));
            valorTotal = valorTotal + valor;
            tfdValorTotal.setText(df.format(valorTotal));
            //Limpa os campos após inserir produto na tabela
            tfdQuantidade.setText("1");
            tfdValorUnitario.setText("0.00");
            tfdValor.setText("0.00");
            tfdDescricaoProduto.setText("");
            tfdDescricaoProduto.requestFocus();
        }
    }//GEN-LAST:event_btnIncluirKeyReleased
    
    private void atualizaValor() {// Multiplica a quantidade pelo valor unitario da mercadoria
        try {
            double valorUnitario = Double.parseDouble(tfdValorUnitario.getText().replaceAll(",", "."));
            double quantidade = Double.parseDouble(tfdQuantidade.getText());
            double valor = valorUnitario * quantidade;
            tfdValor.setText(df.format(valor));

            try {
                Robot gc_bot = new Robot();
                gc_bot.keyPress(KeyEvent.VK_ENTER);
            } catch (Exception e) {
                //Não faz nada
            }
        } catch (Exception e) {
            tfdQuantidade.setText("0");
        }
    }
    
    private void camposNaoEditaveis(){
        tfdValorEntrada.setEnabled(false);
    }
    
    private void limpaTela() {// Limpa os campos TextField
        cmbOperacao.setSelectedItem("A vista");
        if (cmbOperacao.getSelectedItem().toString().equalsIgnoreCase("A vista")) {
            tfdValorEntrada.setEnabled(false);
            btnFinalizar.setEnabled(true);
        }else{
            tfdValorEntrada.setEnabled(true);
            btnFinalizar.setEnabled(false);
        }
        tfdQuantidade.setText("1");
        tfdDescricaoProduto.setText("Descrição do produto");
        tfdValorUnitario.setText(null);
        tfdValor.setText(null);
        tfdValorEntrada.setText("");
        tfdValorTotal.setText("");
        tfdIdCliente.setText("");
        tfdNomeCliente.setText("");
        tfdQuantidade.requestFocus();
        limpaTabelaParcela();
        limpaTabelaProduto();
    }
    
    private boolean salvarVenda(){
        Venda auxVen = new Venda();
        try {
            
        if (!tfdIdCliente.getText().isEmpty()&&!tfdIdCliente.getText().equals("0")) {// se diferente de vazio 
                auxVen.setIdCliente(Long.parseLong(tfdIdCliente.getText()));  //faz isso   
            } else // senão 
            {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }
            
        auxVen.setData(FormataData.tranformaParaData(Funcoes.getData())); 

        if(cmbOperacao.getSelectedItem().toString().equals("A vista")){
            auxVen.setOperacao("A vista");
        }else{
            auxVen.setOperacao("A prazo");
        }
        
        if (!tfdValorEntrada.getText().isEmpty()) {// se diferente de vazio 
                auxVen.setValorEntrada(tfdValorEntrada.getText());  //faz isso   
            } else // senão 
            {
                auxVen.setValorEntrada("");
            }

        if (!tfdValorTotal.getText().isEmpty()) {// se diferente de vazio 
                auxVen.setValorTotal(tfdValorTotal.getText());  //faz isso
            } else // senão 
            {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }

        auxVen.setStatus("Ativo");//Salva o Status como Ativo ao salvar uma venda
        
        if (tblProduto.getRowCount() != 0) {// se diferente de vazio
                String descricao = "";
                for(int i=0; i < tblProduto.getRowCount();i++){
                    if (i == tblProduto.getRowCount()-1) {
                        descricao += tblProduto.getModel().getValueAt(i,1);
                    }else{
                        descricao += tblProduto.getModel().getValueAt(i,1)+";";
                    }
                }
                auxVen.setDescricao(descricao);  //faz isso   
            } else // senão 
            {
                throw new Exception(); //Força um erro no Try/Catch, para não tentar salvar no Banco
            }

        ctlVenda.incluirVendaBanco(auxVen);//Faz o inclusão de um cliente no Banco
        
        JOptionPane.showMessageDialog(this, "Venda efetuada!");
        return true;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "A Venda não foi salva, faltam campos obrigatórios");
        }
        return false;
    }

    private void preencherCampos(Venda v){
        cmbOperacao.setSelectedItem(v.getOperacao());
        tfdValorEntrada.setText(v.getValorEntrada());
        tfdValorTotal.setText(v.getValorTotal());
        tfdIdCliente.setText(v.getIdCliente()+"");
        tfdNomeCliente.setText(ctlCliente.buscarClientePorId(v.getIdCliente()).getNome());
    }
    
    
    public void limpaTabelaParcela() {//Limpa a tabela antes da próxima comparação
        // limpeza da tabela dinamica
        ((DefaultTableModel) tblParcela.getModel()).setNumRows(0);
        tblParcela.updateUI();
    }
    
    public void limpaTabelaProduto() {//Limpa a tabela antes da próxima comparação
        // limpeza da tabela dinamica
        ((DefaultTableModel) tblProduto.getModel()).setNumRows(0);
        tblProduto.updateUI();
    }
    
    private boolean gerarCarne(ArrayList <Parcela> parcelas) {
        boolean pdf = false;
        Venda auxVen = ctlVenda.buscarVendaPorId(parcelas.get(0).getIdvenda());
        Cliente auxCli = ctlCliente.buscarClientePorId(auxVen.getIdCliente());
        
        Date data = new Date(System.currentTimeMillis());
        String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(data);
        dataFormatada = dataFormatada.replaceAll("/", ".");
        // criação do documento
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\genesis\\natiHellena\\PDF\\Conta."+auxCli.getNome()+"-"+ dataFormatada + ".pdf"));
            document.setMargins(10, 40,1, 0);
            document.open();
            // adicionando um parágrafo no documento           
            document.add(new Paragraph("Codigo: "+auxCli.getIdcliente()));// Nome do cliente            
            document.add(new Paragraph("Nome: "+auxCli.getNome()));// nome

            PdfPTable table = new PdfPTable(new float[]{0.12f, 0.18f, 0.12f, 0.15f, 0.16f, 0.16f, 0.1f});
            //  table.setWidthPercentage(60.0f);// quantidade que deve ser ocupada do pdf
            table.setHorizontalAlignment(Element.ALIGN_LEFT);// alinhamento(no caso a esquerda)
            PdfPCell header = new PdfPCell(new Paragraph("                                                          Nati Helena"));// nome da tabela
            header.setColspan(7);// numero de colunas da tabela
            table.addCell(header); // coloca nome na tabela           
            table.addCell("Parcela");// nome da coluna
            table.addCell("Vencimento");// nome da coluna
            table.addCell("Valor");// nome da coluna
            table.addCell("Juros fixo");// nome da coluna
            table.addCell("Juros Diario");// nome da coluna
            table.addCell("Valor Total");// nome da coluna
            table.addCell("Status");// nome da coluna
            for (int i = 0; i < parcelas.size(); i++) {
                table.addCell(" " + parcelas.get(i).getNumero());// Parcela 
                table.addCell(" " + parcelas.get(i).getDataVencimento());// venciemento
                table.addCell(" " + parcelas.get(i).getValorOriginal()); // Valor
                table.addCell("");// juros fixo (fica em branco, pois e preencido a mão)
                table.addCell("");// juros diario (fica em branco, pois e preencido a mão)
                table.addCell("");// juros valor total (fica em branco, pois e preencido a mão)
                table.addCell("");// juros status (fica em branco, pois e preencido a mão) 
            }
            document.add(table);// adiciona tabela no pdf
            document.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------------------- "));//linha de recorte
            pdf = true;
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        document.close();
        return pdf;
    }
    
    private void iniciaTabelaParcela(){
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblParcela.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("Vencimento");
        modelo.addColumn("Valor");
        // estabelece o tamanho de cada coluna
        tblParcela.getColumnModel().getColumn(0).setPreferredWidth(150);//Vencimento
        tblParcela.getColumnModel().getColumn(1).setPreferredWidth(70); // Valor
    }
    
    private void iniciaTabelaProduto(){
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("Quantidade");
        modelo.addColumn("Produto");
        modelo.addColumn("Valor Unitario");
        modelo.addColumn("Valor Total");
        // estabelece o tamanho de cada coluna
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(80);// Quantidade
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(270); // Produto
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);// Valor UN
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100); // Valor Total
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
            java.util.logging.Logger.getLogger(DlgCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadastroVenda dialog = new DlgCadastroVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnGerarParcela;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JComboBox<String> cmbOperacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private caroco.JmData jmDataDoPrimeiroVencimento;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblFormaPagamento;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTable tblParcela;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField tfdDescricaoProduto;
    private javax.swing.JTextField tfdIdCliente;
    private javax.swing.JTextField tfdNomeCliente;
    private javax.swing.JTextField tfdQuantidade;
    private jnumberformatfield.JNumberFormatField tfdValor;
    private jnumberformatfield.JNumberFormatField tfdValorEntrada;
    private jnumberformatfield.JNumberFormatField tfdValorTotal;
    private jnumberformatfield.JNumberFormatField tfdValorUnitario;
    // End of variables declaration//GEN-END:variables
}
