/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Controle.ControlaCliente;
import Controle.ControlaConfiguracao;
import Controle.ControlaParcela;
import static Controle.ControlaParcela.parcelas;
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
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan
 */
public class DlgQuitacaoLote extends javax.swing.JDialog {

    ControlaParcela ctlParcela = new ControlaParcela();
    ControlaCliente ctlCliente = new ControlaCliente();
    ControlaVenda ctlVenda = new ControlaVenda();
    ControlaConfiguracao ctlConfiguracao = new ControlaConfiguracao();
    DecimalFormat df = new DecimalFormat("0.00"); //Transforma o valor em uma unidade monetaria

    /**
     * Creates new form DlgQuitacaoLote
     */
    public DlgQuitacaoLote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Quitação de parcelas em lote");
        this.setLocationRelativeTo(null);
        criandoTabela();
        Janela.CLIENTE = new Cliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDataAte = new javax.swing.JLabel();
        jmDataAte = new caroco.JmData();
        tfdValor = new jnumberformatfield.JNumberFormatField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuitacaoLote = new javax.swing.JTable();
        tfdValorTotal = new jnumberformatfield.JNumberFormatField();
        btnCancelar = new javax.swing.JButton();
        btnPesquisaParcela = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        tfdIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdNomeCliente = new javax.swing.JTextField();
        btnPesquisaCliente = new javax.swing.JButton();
        jmDataDe = new caroco.JmData();
        lblDataDe = new javax.swing.JLabel();
        tfdJurosTotal = new jnumberformatfield.JNumberFormatField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblDataAte.setText("Ate:");

        jmDataAte.setEnabled(false);

        tfdValor.setEnabled(false);

        tblQuitacaoLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblQuitacaoLote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuitacaoLoteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuitacaoLote);

        tfdValorTotal.setEnabled(false);

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

        jLabel4.setText("Juros:");

        jLabel5.setText("Valor:");

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

        jmDataDe.setEnabled(false);

        lblDataDe.setText("De:");

        tfdJurosTotal.setEnabled(false);
        tfdJurosTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdJurosTotalKeyTyped(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
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
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(tfdJurosTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(102, 102, 102)
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
                            .addComponent(tfdJurosTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfdValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisaParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaParcelaActionPerformed
               
        if (tfdIdCliente.getText().equals("0") || tfdIdCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um Ciente");

        } else {
            limpaTabela(); //Limpa a tabela de parcelas

            tfdJurosTotal.setText("");
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

        }
    }//GEN-LAST:event_btnPesquisaParcelaActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int[] linhas = new int[0];// inicializa vetor que recebera as linhas
        long[] idParcelas = new long[0]; // inicializa vetor que vai receber id das parcelas
        ArrayList<Parcela> naoQuitadas = new ArrayList<>();// inicializa vetor das parcelas que não poderão ser quitadas
        if (tblQuitacaoLote.getRowCount() > 0) {// verifica se a planilha tem alguma linha
            String status = "true";// status que ira na parcela

            // recebe cliente selecionado
            Cliente auxCli = ctlCliente.buscarClientePorId(Long.parseLong(tfdIdCliente.getText()));
            linhas = tblQuitacaoLote.getSelectedRows();// recebe linhas selecionadas da tabela
            idParcelas = new long[linhas.length];// recebe o tamanho do vetor de linhas

            //passa os IDs do vetor de linhas para o de parcelas
            for (int i = 0; i < linhas.length; i++) {
                idParcelas[i] = Long.parseLong(tblQuitacaoLote.getValueAt(linhas[i], 0).toString());
            }

            Arrays.sort(idParcelas);// ordena o vetor de IDs das parcelas
            ctlParcela.buscarParcelasPorId(idParcelas);// busca as parcelas por id no banco de dados

            for (int i = 0; i < ControlaParcela.parcelasAux.size(); i++) {
                double valorTotal = 0;// valor total das parcelas
                double jurosDiario = 0;// valor dos juros diarios
                double jurosFixo = 0; // valor dos juros fixos
                double jurosTotal = 0; // valor total dos juros

                // Ve se a parcela anterior é da mesma vende e se ela ainda está em aberto 
                if (ctlParcela.buscarParcelaPorId(ControlaParcela.parcelasAux.get(i).getIdparcela()).getIdvenda() == ctlParcela.buscarParcelaPorId(ControlaParcela.parcelasAux.get(i).getIdparcela() - 1).getIdvenda() && !ctlParcela.buscarParcelaPorId(ControlaParcela.parcelasAux.get(i).getIdparcela() - 1).isStatus()) {
                    // recebe a parcela que não sera quitada.
                    naoQuitadas.add(ControlaParcela.parcelasAux.get(i));
                } else {
                    try {
                        // recebem os dados da parcela
                        valorTotal = Double.parseDouble(ControlaParcela.parcelasAux.get(i).getValorOriginal());
                        jurosDiario = Vencimentos.valorDosJurosDiarios(ControlaParcela.parcelasAux.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosDiario());
                        jurosFixo = Vencimentos.valorDosJurosFixo(ControlaParcela.parcelasAux.get(i).getValorOriginal(), ControlaParcela.parcelasAux.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosFixo());
                        jurosTotal = jurosDiario + jurosFixo;
                        valorTotal = valorTotal + jurosTotal;
                        // atualizam os dados da parcela no banco
                        ctlParcela.atualizaParcelaBanco(ControlaParcela.parcelasAux.get(i).getIdparcela(), status, valorTotal + "".replaceAll(",", "."), jurosTotal + "".replaceAll(",", "."));
                        ctlCliente.aumentarQuitacoes(auxCli);
                        int diasVencidos = Vencimentos.quantidadeDeDiasVencidos(ControlaParcela.parcelasAux.get(i).getDataVencimento());
                        ctlCliente.atualizaMaCliente(auxCli, diasVencidos);
                        ctlCliente.aumentarTotalAtraso(auxCli, diasVencidos);
                        ctlCliente.atualizaMdaCliente(ctlCliente.buscarClientePorId(auxCli.getIdcliente()));

                    } catch (Exception e) {// caso de algum erro na parcela
                        JOptionPane.showMessageDialog(this, "Você não selecionou uma parcela para quitar");
                    }

                }

            }
            String mensagem = "";// armazena a mensagem das parcelas não quitadas
            double totalgeral = 0;
            if (naoQuitadas.size() > 0) {//verifica se alguma parcela nao foi quitada
                double valorT = 0;
                double jurosD = 0;
                double jurosF = 0;
                double jurosT = 0;

                for (int i = 0; i < naoQuitadas.size(); i++) {// pega os dados das parcelas não quitadas
                    valorT = Double.parseDouble(naoQuitadas.get(i).getValorOriginal());
                    jurosD = Vencimentos.valorDosJurosDiarios(naoQuitadas.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosDiario());
                    jurosF = Vencimentos.valorDosJurosFixo(naoQuitadas.get(i).getValorOriginal(), ControlaParcela.parcelasAux.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosFixo());
                    jurosT = jurosD + jurosF;
                    valorT = valorT + jurosT;                    
                    totalgeral = totalgeral + valorT;
                    
                    mensagem = mensagem + "parcela numero " + naoQuitadas.get(i).getNumero() + "".replaceAll(",", ".")
                            + " da venda " + naoQuitadas.get(i).getIdvenda()
                            + " no valor total de " + df.format(valorT).replaceAll(",", ".") + "\n";
                }
                mensagem = mensagem + " TOTALIZANDO: " + df.format(totalgeral).replaceAll(",", ".") + "\n \n as demais parcelas foram quitadas!!!";
            } else {
                JOptionPane.showMessageDialog(this, "Parcelas Quitadas!!!");

            }
            if (mensagem.length() > 0) {
                JOptionPane.showMessageDialog(this, "As seguintes parcelas não foram quitadas, pois existiam parcelas anteriores \n" + mensagem);
            }
            btnPesquisaParcelaActionPerformed(evt);
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

    private void tfdJurosTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdJurosTotalKeyTyped
        atualizaValorTotal();
    }//GEN-LAST:event_tfdJurosTotalKeyTyped

    private void tblQuitacaoLoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuitacaoLoteMouseClicked

        double valor = 0;
        double jurosTotal = 0;
        double valorTotal = 0;
        if (tblQuitacaoLote.getRowCount() > 0) {
            int[] linhas = tblQuitacaoLote.getSelectedRows();
            for (int i = 0; i < linhas.length; i++) {
                valor = valor + Double.parseDouble(tblQuitacaoLote.getValueAt(linhas[i], 2).toString().replaceAll(",", "."));
                jurosTotal = jurosTotal + Double.parseDouble(tblQuitacaoLote.getValueAt(linhas[i], 3).toString().replaceAll(",", "."));
                valorTotal = valorTotal + Double.parseDouble(tblQuitacaoLote.getValueAt(linhas[i], 4).toString().replaceAll(",", "."));
            }
            tfdValor.setText(df.format(valor));
            tfdJurosTotal.setText(df.format(jurosTotal));
            tfdValorTotal.setText(df.format(valorTotal));
        }


    }//GEN-LAST:event_tblQuitacaoLoteMouseClicked

    private void atualizaValorTotal() {// Soma os novos valores dos juros e atualiza o valor da quitacao
        double valorOriginal = Double.parseDouble(tfdValor.getText().replaceAll(",", "."));
        double valorJurosFixo = Double.parseDouble(tfdJurosTotal.getText().replaceAll(",", "."));
        double valorTotal = valorOriginal + valorJurosFixo;
        tfdValorTotal.setText(df.format(valorTotal));
        try {
            Robot gc_bot = new Robot();
            gc_bot.keyPress(KeyEvent.VK_ENTER);
        } catch (Exception e) {
        }
    }

    private void criandoTabela() {
        // criacao da tabela dinamica
        DefaultTableModel modelo = (DefaultTableModel) tblQuitacaoLote.getModel();
        // nomes das colunas dinamicas
        modelo.addColumn("ID");
        modelo.addColumn("Numero");
        modelo.addColumn("Valor Original");
        modelo.addColumn("Juros");
        modelo.addColumn("Valor Total");
        modelo.addColumn("Data Vencimento");
        modelo.addColumn("Status");
        modelo.addColumn("IdVenda");
        modelo.addColumn("Data Promessa");

        // estabelece o tamanho de cada coluna
        tblQuitacaoLote.getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacaoLote.getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacaoLote.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacaoLote.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);// Deixa a coluna invisivel na tabela
        tblQuitacaoLote.getColumnModel().getColumn(1).setPreferredWidth(75);//Numero
        tblQuitacaoLote.getColumnModel().getColumn(2).setPreferredWidth(100);//Valor Original
        tblQuitacaoLote.getColumnModel().getColumn(3).setPreferredWidth(100); //Juros
        tblQuitacaoLote.getColumnModel().getColumn(4).setPreferredWidth(100);//Valor Total
        tblQuitacaoLote.getColumnModel().getColumn(5).setPreferredWidth(150);//Data Vencimento
        tblQuitacaoLote.getColumnModel().getColumn(6).setPreferredWidth(100);//Status
        tblQuitacaoLote.getColumnModel().getColumn(7).setPreferredWidth(75);//IdVenda
        tblQuitacaoLote.getColumnModel().getColumn(8).setPreferredWidth(150);//IdVenda
    }

    public void limpaTabela() {//Limpa a tabela antes da proxima pesquisa
        // limpeza da tabela dinamica
        ((DefaultTableModel) tblQuitacaoLote.getModel()).setNumRows(0);
        tblQuitacaoLote.updateUI();
    }

    private void limpaCampos() {
        tfdJurosTotal.setText("");
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
            double valorOriginal = Double.parseDouble(parcelas.get(i).getValorOriginal().replaceAll(",", "."));
            double jurosDiario = Vencimentos.valorDosJurosDiarios(parcelas.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosDiario());
            double jurosFixo = Vencimentos.valorDosJurosFixo(parcelas.get(i).getValorOriginal(), parcelas.get(i).getDataVencimento(), ctlConfiguracao.buscaJurosFixo());
            double jurosTotal = jurosDiario + jurosFixo;

            double valorTotal = jurosTotal + Double.parseDouble(parcelas.get(i).getValorOriginal().replaceAll(",", "."));

            Object row[] = {
                parcelas.get(i).getIdparcela(),
                parcelas.get(i).getNumero(),
                df.format(valorOriginal),
                df.format(jurosTotal),
                df.format(valorTotal),
                parcelas.get(i).getDataVencimento(),
                status,
                parcelas.get(i).getIdvenda(),
                parcelas.get(i).getDataPromessa()};

            ((DefaultTableModel) tblQuitacaoLote.getModel()).addRow(row);
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DlgQuitacaoLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgQuitacaoLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgQuitacaoLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgQuitacaoLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgQuitacaoLote dialog = new DlgQuitacaoLote(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private caroco.JmData jmDataAte;
    private caroco.JmData jmDataDe;
    private javax.swing.JLabel lblDataAte;
    private javax.swing.JLabel lblDataDe;
    private javax.swing.JTable tblQuitacaoLote;
    public static javax.swing.JTextField tfdIdCliente;
    private jnumberformatfield.JNumberFormatField tfdJurosTotal;
    public static javax.swing.JTextField tfdNomeCliente;
    private jnumberformatfield.JNumberFormatField tfdValor;
    private jnumberformatfield.JNumberFormatField tfdValorTotal;
    // End of variables declaration//GEN-END:variables
}
