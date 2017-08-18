package Grafico;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Janela extends javax.swing.JFrame {

    public Janela() {
        initComponents();
        this.setTitle("GÊNESIS"+" - "+"Versão 1.0.0"); //Muda o título da Janela
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagem/LogoGenesis.png")).getImage()); //Faz a troca to ícone pela imagem designada
        Toolkit tk = Toolkit.getDefaultToolkit(); //Identifica resolução do monitor e aplica na janela
        Dimension d = tk.getScreenSize();
        int largura = d.width;
        int altura = d.height;
        this.setSize(largura, 160); //Define o tamanho da janela principal
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemPessoa = new javax.swing.JMenuItem();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuItemFormaPagamento = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemCidade = new javax.swing.JMenuItem();
        jMenuItemUF = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuContasReceber = new javax.swing.JMenu();
        jMenuItemQuitacao = new javax.swing.JMenuItem();
        jMenuItemDesquitacao = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelatorioContas = new javax.swing.JMenuItem();
        jMenuItemRelatorioAniversario = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        pnlTop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemPessoa.setText("Pessoa");
        jMenuItemPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPessoaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemPessoa);

        jMenuItemVenda.setText("Venda");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemVenda);

        jMenuItemFormaPagamento.setText("Forma de pagamento");
        jMenuItemFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormaPagamentoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFormaPagamento);

        jMenuItemUsuario.setText("Usuário");
        jMenuCadastro.add(jMenuItemUsuario);

        jMenuItemCidade.setText("Cidade");
        jMenuCadastro.add(jMenuItemCidade);

        jMenuItemUF.setText("UF");
        jMenuCadastro.add(jMenuItemUF);

        jMenuItemProduto.setText("Produto");
        jMenuCadastro.add(jMenuItemProduto);

        jMenuBar.add(jMenuCadastro);

        jMenuFinanceiro.setText("Financeiro");

        jMenuContasReceber.setText("Contas a receber");

        jMenuItemQuitacao.setText("Quitacao");
        jMenuItemQuitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitacaoActionPerformed(evt);
            }
        });
        jMenuContasReceber.add(jMenuItemQuitacao);

        jMenuItemDesquitacao.setText("Desquitacao");
        jMenuItemDesquitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDesquitacaoActionPerformed(evt);
            }
        });
        jMenuContasReceber.add(jMenuItemDesquitacao);

        jMenuFinanceiro.add(jMenuContasReceber);

        jMenuBar.add(jMenuFinanceiro);

        jMenuRelatorio.setText("Relatórios");

        jMenuItemRelatorioContas.setText("Contas a receber");
        jMenuItemRelatorioContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioContasActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioContas);

        jMenuItemRelatorioAniversario.setText("Aniversários");
        jMenuItemRelatorioAniversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioAniversarioActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioAniversario);

        jMenuBar.add(jMenuRelatorio);

        jMenuConfiguracoes.setText("Configurações");
        jMenuBar.add(jMenuConfiguracoes);

        jMenuAjuda.setText("Ajuda");
        jMenuBar.add(jMenuAjuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPessoaActionPerformed
        DlgCadastraPessoa dlg = new DlgCadastraPessoa(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemPessoaActionPerformed

    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed
        
    }//GEN-LAST:event_jMenuItemVendaActionPerformed

    private void jMenuItemQuitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuitacaoActionPerformed

    }//GEN-LAST:event_jMenuItemQuitacaoActionPerformed

    private void jMenuItemDesquitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDesquitacaoActionPerformed

    }//GEN-LAST:event_jMenuItemDesquitacaoActionPerformed

    private void jMenuItemRelatorioContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioContasActionPerformed

    }//GEN-LAST:event_jMenuItemRelatorioContasActionPerformed

    private void jMenuItemRelatorioAniversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioAniversarioActionPerformed

    }//GEN-LAST:event_jMenuItemRelatorioAniversarioActionPerformed

    private void jMenuItemFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormaPagamentoActionPerformed
        
    }//GEN-LAST:event_jMenuItemFormaPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenu jMenuContasReceber;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItemCidade;
    private javax.swing.JMenuItem jMenuItemDesquitacao;
    private javax.swing.JMenuItem jMenuItemFormaPagamento;
    private javax.swing.JMenuItem jMenuItemPessoa;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemQuitacao;
    private javax.swing.JMenuItem jMenuItemRelatorioAniversario;
    private javax.swing.JMenuItem jMenuItemRelatorioContas;
    private javax.swing.JMenuItem jMenuItemUF;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenuItem jMenuItemVenda;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables
}
