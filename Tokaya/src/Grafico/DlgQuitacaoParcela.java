package Grafico;

import Controle.ControlaCliente;
import Controle.ControlaConfiguracao;
import Controle.ControlaParcela;
import Controle.ControlaVenda;
import Negocio.Cliente;
import Negocio.Parcela;
import Negocio.Venda;
import Utilitario.FormataData;
import Utilitario.Formatacao;
import Utilitario.Vencimentos;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DlgQuitacaoParcela extends javax.swing.JDialog {

    ControlaParcela ctlParcela = new ControlaParcela();
    ControlaCliente ctlCliente = new ControlaCliente();
    ControlaVenda ctlVenda = new ControlaVenda();
    ControlaConfiguracao ctlConfiguracao = new ControlaConfiguracao();
    DecimalFormat df = new DecimalFormat("0.00"); //Transforma o valor em uma unidade monetaria

    public DlgQuitacaoParcela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Quitação de parcelas");
        this.setLocationRelativeTo(null);
        criandoTabela();
        Janela.CLIENTE = new Cliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        tfdIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdNomeCliente = new javax.swing.JTextField();
        btnPesquisaCliente = new javax.swing.JButton();
        jmDataDe = new caroco.JmData();
        lblDataDe = new javax.swing.JLabel();
        lblDataAte = new javax.swing.JLabel();
        jmDataAte = new caroco.JmData();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuitacao = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnPesquisaParcela = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVisualizarParcela = new javax.swing.JButton();
        tfdJurosFixo = new jnumberformatfield.JNumberFormatField();
        tfdJurosDiario = new jnumberformatfield.JNumberFormatField();
        tfdValor = new jnumberformatfield.JNumberFormatField();
        tfdValorTotal = new jnumberformatfield.JNumberFormatField();
        btnAlterarJuros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cliente:");

        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Quitar.png"))); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.setToolTipText("Quitar Parcela(s)");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        tfdIdCliente.setToolTipText("Digite o Codigo Do Cliente");
        tfdIdCliente.setEnabled(false);

        jLabel2.setText("Valor Total:");

        tfdNomeCliente.setEditable(false);
        tfdNomeCliente.setToolTipText("Nome Do Funcionario");

        btnPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisaUsuario.png"))); // NOI18N
        btnPesquisaCliente.setText("Pesquisar Cliente");
        btnPesquisaCliente.setToolTipText("Abrir Janela De Pesquisa Funcionario");
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        lblDataDe.setText("De:");

        lblDataAte.setText("Ate:");

        tblQuitacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblQuitacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblQuitacaoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuitacao);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar e Fechar Janela");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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

        jLabel3.setText("Juros diario:");

        jLabel4.setText("Juros Fixo:");

        jLabel5.setText("Valor:");

        btnVisualizarParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/btn pesqusar 16x16.png"))); // NOI18N
        btnVisualizarParcela.setText("Visualizar Parcela");
        btnVisualizarParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarParcelaActionPerformed(evt);
            }
        });

        tfdJurosFixo.setEnabled(false);
        tfdJurosFixo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdJurosFixoKeyTyped(evt);
            }
        });

        tfdJurosDiario.setEnabled(false);
        tfdJurosDiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdJurosDiarioKeyTyped(evt);
            }
        });

        tfdValor.setEnabled(false);
        tfdValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdValorKeyTyped(evt);
            }
        });

        tfdValorTotal.setEnabled(false);

        btnAlterarJuros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/PesquisaConta.png"))); // NOI18N
        btnAlterarJuros.setText("Alterar");
        btnAlterarJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarJurosActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDataAte)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jmDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDataDe)
                                    .addGap(30, 30, 30)
                                    .addComponent(jmDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisualizarParcela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAlterarJuros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfdValor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfdIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(btnPesquisaParcela)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVisualizarParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterarJuros))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuitar)
                            .addComponent(btnCancelar))
                        .addGap(32, 32, 32))
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
                            .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
     
        if (tblQuitacao.getSelectedRow()>=0) {
            
        
        String status ="true"; 
        Parcela auxPar =new Parcela();
        auxPar = ctlParcela.buscarParcelaPorId(Long.parseLong(tblQuitacao.getValueAt(tblQuitacao.getSelectedRow(), 0).toString()));
        Long id = auxPar.getIdparcela();
        
        if (!ctlParcela.verificaParcelasAnteriores(auxPar.getIdvenda(), auxPar.getNumero())) {// Ve se a parcela anterior é da mesma vende e se ela ainda está em aberto
                JOptionPane.showMessageDialog(this, "Existem parcelas anteriores em aberto!");
        }else{
            Double valorParcela= Double.parseDouble(tblQuitacao.getValueAt(tblQuitacao.getSelectedRow(), 5).toString().replaceAll(",", "."));
            Double ValorInformado = Double.parseDouble(tfdValorTotal.getText().replaceAll(",", "."));
            
            
            if (valorParcela>ValorInformado) {// se valor original é maior que o quitado
               valorParcela= valorParcela-ValorInformado;                
                auxPar=ctlParcela.buscarParcelaPorId(Long.parseLong(tblQuitacao.getValueAt(tblQuitacao.getSelectedRow(), 0).toString()));
               ctlParcela.geraParcelaSequencial(auxPar.getIdvenda(), auxPar.getNumero(), auxPar.getSequencial()+1, auxPar.getDataVencimento(),df.format(valorParcela).replaceAll(",", "."));
            try {
                double jurosDiario = Formatacao.formataDoubleRecebeString(tfdJurosDiario.getText());
                double jurosFixo = Formatacao.formataDoubleRecebeString(tfdJurosFixo.getText());
                String jurosTotal = (jurosDiario + jurosFixo) + "";
                ctlParcela.atualizaParcelaBanco(Long.parseLong(tblQuitacao.getValueAt(tblQuitacao.getSelectedRow(), 0).toString()), status, tfdValorTotal.getText(), jurosTotal);
                Venda auxVen = ctlVenda.buscarVendaPorId(ctlParcela.buscarParcelaPorId(id).getIdvenda());
                Cliente auxCli = ctlCliente.buscarClientePorId(auxVen.getIdCliente());
                ctlCliente.aumentarQuitacoes(auxCli);
                int diasVencidos = Vencimentos.quantidadeDeDiasVencidos(auxPar.getDataVencimento());
                ctlCliente.atualizaMaCliente(auxCli, diasVencidos);           
                ctlCliente.aumentarTotalAtraso(auxCli, diasVencidos);
                ctlCliente.atualizaMdaCliente(ctlCliente.buscarClientePorId(auxCli.getIdcliente()));
                btnPesquisaParcelaActionPerformed(evt);
                JOptionPane.showMessageDialog(this, "Quitado!");
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(this, "Você não selecionou uma parcela para quitar");
            }
             }else{
            try {
                double jurosDiario = Formatacao.formataDoubleRecebeString(tfdJurosDiario.getText());
                double jurosFixo = Formatacao.formataDoubleRecebeString(tfdJurosFixo.getText());
                String jurosTotal = (jurosDiario + jurosFixo) + "";
                ctlParcela.atualizaParcelaBanco(Long.parseLong(tblQuitacao.getValueAt(tblQuitacao.getSelectedRow(), 0).toString()), status, tfdValorTotal.getText(), jurosTotal);
                Venda auxVen = ctlVenda.buscarVendaPorId(ctlParcela.buscarParcelaPorId(id).getIdvenda());
                Cliente auxCli = ctlCliente.buscarClientePorId(auxVen.getIdCliente());
                ctlCliente.aumentarQuitacoes(auxCli);
                int diasVencidos = Vencimentos.quantidadeDeDiasVencidos(auxPar.getDataVencimento());
                ctlCliente.atualizaMaCliente(auxCli, diasVencidos);           
                ctlCliente.aumentarTotalAtraso(auxCli, diasVencidos);
                ctlCliente.atualizaMdaCliente(ctlCliente.buscarClientePorId(auxCli.getIdcliente()));
                btnPesquisaParcelaActionPerformed(evt);
                JOptionPane.showMessageDialog(this, "Quitado!");
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(this, "Você não selecionou uma parcela para quitar");
            }
        }
            tfdJurosDiario.setEnabled(false);
            tfdJurosFixo.setEnabled(false);
            tfdValor.setEnabled(false);
            
        }
        }else{
            JOptionPane.showMessageDialog(this, "Favor selecionar parcela");
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        limpaTabela();
        DlgPesquisaCliente dlg = new DlgPesquisaCliente(this, true, false);
        dlg.btnEditar.setEnabled(false);
        dlg.setVisible(true);

        tfdIdCliente.setText(Janela.CLIENTE.getIdcliente() + "");
        tfdNomeCliente.setText(Janela.CLIENTE.getNome() + "");
      
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisaParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaParcelaActionPerformed
        if (tfdIdCliente.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Cliente não selecionado");
        }
        limpaTabela(); //Limpa a tabela de parcelas
        tfdJurosDiario.setText("");
        tfdJurosFixo.setText("");
        tfdValor.setText("");
        tfdValorTotal.setText("");
        String status = "false";
        try {
            if (jmDataDe.getData() == null) {
                jmDataDe.setData(FormataData.tranformaParaData("01/01/1800"));
            }
            if (jmDataAte.getData() == null) {
                jmDataAte.setData(FormataData.tranformaParaData("01/01/2100"));
            }
            if (tfdIdCliente.getText().isEmpty()) {// se está vazio
                ctlParcela.buscarParcelaDoBanco(jmDataDe.getData(), jmDataAte.getData(), status);
            } else {
                ctlParcela.buscarParcelaDoBanco(jmDataDe.getData(), jmDataAte.getData(), Long.parseLong(tfdIdCliente.getText()), status);
            }
            atualizarTabelaParcelas(ControlaParcela.parcelas);
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(this, "Sua pesquisa não foi precisa o bastante");
        }
    }//GEN-LAST:event_btnPesquisaParcelaActionPerformed

    private void tblQuitacaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuitacaoMouseReleased
        limpaCampos();
        Parcela auxPar = ctlParcela.buscarParcelaPorId(Long.parseLong(tblQuitacao.getValueAt(tblQuitacao.getSelectedRow(), 0).toString()));
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
    }//GEN-LAST:event_tblQuitacaoMouseReleased

    private void btnVisualizarParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarParcelaActionPerformed
        try {
            Parcela auxPar = ctlParcela.buscarParcelaPorId(Long.parseLong(tblQuitacao.getValueAt(tblQuitacao.getSelectedRow(), 0).toString()));
            Long id = auxPar.getIdparcela();
            DlgCadastroParcela dlg = new DlgCadastroParcela(this, true, id);
            dlg.setVisible(true);
            btnPesquisaParcelaActionPerformed(evt);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Você não selecionou uma parcela para alterar");
        }
    }//GEN-LAST:event_btnVisualizarParcelaActionPerformed

    private void btnAlterarJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarJurosActionPerformed
        tfdJurosDiario.setEnabled(true);
        tfdJurosFixo.setEnabled(true);
        tfdValor.setEnabled(true);
    }//GEN-LAST:event_btnAlterarJurosActionPerformed

    private void tfdJurosFixoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdJurosFixoKeyTyped
        atualizaValorTotal();
    }//GEN-LAST:event_tfdJurosFixoKeyTyped

    private void tfdJurosDiarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdJurosDiarioKeyTyped
        atualizaValorTotal();
    }//GEN-LAST:event_tfdJurosDiarioKeyTyped

    private void tfdValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdValorKeyTyped
        atualizaValorTotal();
    }//GEN-LAST:event_tfdValorKeyTyped

    private void atualizaValorTotal(){// Soma os novos valores dos juros e atualiza o valor da quitacao
        double valorOriginal = Double.parseDouble(tfdValor.getText().replaceAll(",", "."));
        double valorJurosDiario = Double.parseDouble(tfdJurosDiario.getText().replaceAll(",", "."));
        double valorJurosFixo = Double.parseDouble(tfdJurosFixo.getText().replaceAll(",", "."));
        double valorTotal = valorOriginal + valorJurosDiario + valorJurosFixo;
        tfdValorTotal.setText(df.format(valorTotal));
        try {
            Robot gc_bot = new Robot();
            gc_bot.keyPress(KeyEvent.VK_ENTER); 
        } catch (Exception e) {
        }
    }
    
    private void criandoTabela() {
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblQuitacao.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("ID");
        modelo.addColumn("Venda");
        modelo.addColumn("Par.");
        modelo.addColumn("seq.");
        modelo.addColumn("Data Vencimento");
        modelo.addColumn("Val. Original");
        modelo.addColumn("Val. Juros");
        modelo.addColumn("Val. Total");
        modelo.addColumn("Data Promessa");

        // estabelece o tamanho de cada coluna
        tblQuitacao.getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacao.getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacao.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacao.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacao.getColumnModel().getColumn(1).setPreferredWidth(40);//venda
        tblQuitacao.getColumnModel().getColumn(2).setPreferredWidth(30);//Parcela
        tblQuitacao.getColumnModel().getColumn(3).setPreferredWidth(30); //sequencial
        tblQuitacao.getColumnModel().getColumn(4).setPreferredWidth(100);//Data Vencimento
        tblQuitacao.getColumnModel().getColumn(5).setPreferredWidth(100);//calor original
        tblQuitacao.getColumnModel().getColumn(6).setPreferredWidth(100);//valor juros
        tblQuitacao.getColumnModel().getColumn(7).setPreferredWidth(100);//valor total
        tblQuitacao.getColumnModel().getColumn(8).setPreferredWidth(130);//data promessa
    }

    public void limpaTabela() {//Limpa a tabela antes da proxima pesquisa
        // limpeza da tabela dinamica
        ((DefaultTableModel) tblQuitacao.getModel()).setNumRows(0);
        tblQuitacao.updateUI();
    }

    private void limpaCampos() {
        tfdJurosDiario.setText("");
        tfdJurosFixo.setText("");
        tfdValorTotal.setText("");
    }

    private void atualizarTabelaParcelas(ArrayList<Parcela> parcelas) {
        String status;
        for (int i = 0; i < parcelas.size(); i++) {
            if (parcelas.get(i).isStatus()) {
                status = "PAGO";
            } else {
                status = "EM ABERTO";
            }
            double valorOriginal =  Double.parseDouble(parcelas.get(i).getValorOriginal().replaceAll(",", "."));
            double jurosDiario = Vencimentos.valorDosJurosDiarios(parcelas.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosDiario());
            double jurosFixo = Vencimentos.valorDosJurosFixo(parcelas.get(i).getValorOriginal(), parcelas.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosFixo());
            double jurosTotal = jurosDiario + jurosFixo;

            double valorTotal = jurosTotal + Double.parseDouble(parcelas.get(i).getValorOriginal().replaceAll(",", "."));
            
            Object row[] = {
                parcelas.get(i).getIdparcela(),                
                parcelas.get(i).getIdvenda(),
                parcelas.get(i).getNumero(),
                parcelas.get(i).getSequencial(),
                parcelas.get(i).getDataVencimento(),
                df.format(valorOriginal),
                df.format(jurosTotal),
                df.format(valorTotal),                               
                parcelas.get(i).getDataPromessa()};

            ((DefaultTableModel) tblQuitacao.getModel()).addRow(row);
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
            java.util.logging.Logger.getLogger(DlgQuitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgQuitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgQuitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgQuitacaoParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgQuitacaoParcela dialog = new DlgQuitacaoParcela(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterarJuros;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisaCliente;
    public static javax.swing.JButton btnPesquisaParcela;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVisualizarParcela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private caroco.JmData jmDataAte;
    private caroco.JmData jmDataDe;
    private javax.swing.JLabel lblDataAte;
    private javax.swing.JLabel lblDataDe;
    private javax.swing.JTable tblQuitacao;
    public static javax.swing.JTextField tfdIdCliente;
    private jnumberformatfield.JNumberFormatField tfdJurosDiario;
    private jnumberformatfield.JNumberFormatField tfdJurosFixo;
    public static javax.swing.JTextField tfdNomeCliente;
    private jnumberformatfield.JNumberFormatField tfdValor;
    private jnumberformatfield.JNumberFormatField tfdValorTotal;
    // End of variables declaration//GEN-END:variables
}
