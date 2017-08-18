package Grafico;

import Negocio.Cliente;
import Negocio.Configuracao;
import Negocio.Venda;
import Utilitario.Temporizador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Janela extends javax.swing.JFrame {

    public static Cliente CLIENTE;
    public static Venda VENDA;

    Temporizador t;

    public Janela() {
    //-------------------------------------------------------------------
        // responsavel por modificar o grafico para windows, Deve estar no construtor da tela
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        initComponents(); // Inicia os componentes visuais
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagem/LogoGenesis.png")).getImage());//Faz a troca to ícone pela imagem designada
        this.setTitle("GÊNESIS" + " - " + "Versão 1.1.0");
        t = new Temporizador(this);
        t.executar();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        DlgLogin dlg = new DlgLogin(this, true);
        dlg.setVisible(true);

    }

    public void atualizarDataHora(String s) {
        lblDataHora.setText(s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogoCliente = new javax.swing.JLabel();
        lblVersao = new javax.swing.JLabel();
        lblEstacao = new javax.swing.JLabel();
        lblNati = new javax.swing.JLabel();
        lblDataHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroVenda = new javax.swing.JMenuItem();
        jMenuPesquisa = new javax.swing.JMenu();
        jMenuItemPesquisaCliente = new javax.swing.JMenuItem();
        jMenuItemPesquisaVenda = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuContasReceber = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemQuitacao = new javax.swing.JMenuItem();
        jMenuItemDesquitacao = new javax.swing.JMenuItem();
        jMenuRelatorioContasReceber = new javax.swing.JMenu();
        jMenuItemRelatorioContas = new javax.swing.JMenuItem();
        jMenuItemRelatorioAniversario = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemSistema = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        btnLicenca = new javax.swing.JMenuItem();
        btnNotas = new javax.swing.JMenuItem();
        jMenuItemSuporteRemoto = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LogoCliente.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblVersao.setText("Versão: 1.3.2");

        lblEstacao.setText("Estação Principal");

        lblNati.setText("Nati Helena");

        lblDataHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataHora.setText("Data e hora");

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/usuario.png"))); // NOI18N
        jMenuItemCadastroCliente.setText("Cliente");
        jMenuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroCliente);

        jMenuItemCadastroVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/tp.png"))); // NOI18N
        jMenuItemCadastroVenda.setText("Venda");
        jMenuItemCadastroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroVendaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroVenda);

        jMenuBar1.add(jMenuCadastro);

        jMenuPesquisa.setText("Pesquisa");

        jMenuItemPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisaUsuario.png"))); // NOI18N
        jMenuItemPesquisaCliente.setText("Cliente");
        jMenuItemPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisaClienteActionPerformed(evt);
            }
        });
        jMenuPesquisa.add(jMenuItemPesquisaCliente);

        jMenuItemPesquisaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/PesquisaConta.png"))); // NOI18N
        jMenuItemPesquisaVenda.setText("Venda");
        jMenuItemPesquisaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisaVendaActionPerformed(evt);
            }
        });
        jMenuPesquisa.add(jMenuItemPesquisaVenda);

        jMenuBar1.add(jMenuPesquisa);

        jMenuFinanceiro.setText("Financeiro");

        jMenuContasReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Conta.png"))); // NOI18N
        jMenuContasReceber.setText("Contas a receber");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/quitacaoLOte.png"))); // NOI18N
        jMenuItem1.setText("Quitação em Lote");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuContasReceber.add(jMenuItem1);

        jMenuItemQuitacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Selecionar Cliente.png"))); // NOI18N
        jMenuItemQuitacao.setText("Quitacao");
        jMenuItemQuitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitacaoActionPerformed(evt);
            }
        });
        jMenuContasReceber.add(jMenuItemQuitacao);

        jMenuItemDesquitacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/desquitaçãoCliente.png"))); // NOI18N
        jMenuItemDesquitacao.setText("Desquitacao");
        jMenuItemDesquitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDesquitacaoActionPerformed(evt);
            }
        });
        jMenuContasReceber.add(jMenuItemDesquitacao);

        jMenuFinanceiro.add(jMenuContasReceber);

        jMenuBar1.add(jMenuFinanceiro);

        jMenuRelatorioContasReceber.setText("Relatórios");

        jMenuItemRelatorioContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IC123581.png"))); // NOI18N
        jMenuItemRelatorioContas.setText("Contas a receber");
        jMenuItemRelatorioContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioContasActionPerformed(evt);
            }
        });
        jMenuRelatorioContasReceber.add(jMenuItemRelatorioContas);

        jMenuItemRelatorioAniversario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/aniversario.png"))); // NOI18N
        jMenuItemRelatorioAniversario.setText("Aniversários");
        jMenuItemRelatorioAniversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioAniversarioActionPerformed(evt);
            }
        });
        jMenuRelatorioContasReceber.add(jMenuItemRelatorioAniversario);

        jMenuBar1.add(jMenuRelatorioContasReceber);

        jMenuConfiguracoes.setText("Configurações");

        jMenuItemSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Configuração.png"))); // NOI18N
        jMenuItemSistema.setText("Sistema");
        jMenuItemSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSistemaActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemSistema);

        jMenuBar1.add(jMenuConfiguracoes);

        jMenuAjuda.setText("Ajuda");

        btnLicenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/sobre.png"))); // NOI18N
        btnLicenca.setText("Sobre...");
        btnLicenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicencaActionPerformed(evt);
            }
        });
        jMenuAjuda.add(btnLicenca);

        btnNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/editar.png"))); // NOI18N
        btnNotas.setText("Notas");
        btnNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotasActionPerformed(evt);
            }
        });
        jMenuAjuda.add(btnNotas);

        jMenuItemSuporteRemoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/SuporteTR.jpg"))); // NOI18N
        jMenuItemSuporteRemoto.setText("Suporte Remoto");
        jMenuItemSuporteRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSuporteRemotoActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSuporteRemoto);

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sair.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSair);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNati)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEstacao)
                .addGap(102, 102, 102)
                .addComponent(lblVersao)
                .addGap(70, 70, 70)
                .addComponent(lblDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblDataHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstacao)
                        .addComponent(lblVersao)
                        .addComponent(lblNati)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteActionPerformed
        DlgCadastroCliente dlg = new DlgCadastroCliente(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroClienteActionPerformed

    private void jMenuItemPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisaClienteActionPerformed
        DlgPesquisaCliente dlg = new DlgPesquisaCliente(this, true);
        DlgPesquisaCliente.btnSelecionar.setEnabled(false);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemPesquisaClienteActionPerformed

    private void jMenuItemCadastroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroVendaActionPerformed
        DlgCadastroVenda dlg = new DlgCadastroVenda(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroVendaActionPerformed

    private void jMenuItemPesquisaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisaVendaActionPerformed
        DlgPesquisaVenda dlg = new DlgPesquisaVenda(this, true);
        DlgPesquisaVenda.btnSelecionar.setEnabled(false);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemPesquisaVendaActionPerformed

    private void jMenuItemQuitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuitacaoActionPerformed
        DlgQuitacaoParcela dlg = new DlgQuitacaoParcela(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemQuitacaoActionPerformed

    private void jMenuItemDesquitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDesquitacaoActionPerformed
        DlgDesquitacaoParcela dlg = new DlgDesquitacaoParcela(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemDesquitacaoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSistemaActionPerformed
        DlgConfiguracao dlg = new DlgConfiguracao(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemSistemaActionPerformed

    private void jMenuItemSuporteRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSuporteRemotoActionPerformed
        try {
            Process p = new ProcessBuilder("C:\\genesis\\NatiHellena\\Suporte TR.exe").start();
            if (p.exitValue() == 0) {
                JOptionPane.showMessageDialog(null, "A conexão remota foi encerrada");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItemSuporteRemotoActionPerformed

    private void btnLicencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicencaActionPerformed
        JOptionPane.showMessageDialog(this, "Empresa: Transistor Soluções em Informática\n\n"
                + "Data da versão 1.3.2: 27/07/2017\n"
                + "Programa que gerencia cadastros de clientes e vendas\n"
                + "Curta nossa Pagina no facebook: @transistorInformatica  \n"
                + "Contado: (51)99746-1493 / (51)99562-6321\n"
                + "E-mail: atendimento@transistorinformatica.com\n"
                + "Av. Senador Alberto Pasqualine, 3511 - Universitário - Lajeado/RS\n\n"
        );

    }//GEN-LAST:event_btnLicencaActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        JOptionPane.showMessageDialog(this, "Nota da atualização\n"
                + "Versão 1.3.2: 29/07/2017\n\n"
                + "- Acrescentado status no cliente, para ser possivel inativar \n"
                
        );

    }//GEN-LAST:event_btnNotasActionPerformed

    private void jMenuItemRelatorioContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioContasActionPerformed
        DlgRelatorioContasReceber dlg = new DlgRelatorioContasReceber(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelatorioContasActionPerformed

    private void jMenuItemRelatorioAniversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioAniversarioActionPerformed
        DlgRelatorioAniversario dlg = new DlgRelatorioAniversario(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelatorioAniversarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DlgQuitacaoLote dlg = new DlgQuitacaoLote(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenuItem btnLicenca;
    private javax.swing.JMenuItem btnNotas;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenu jMenuContasReceber;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadastroCliente;
    private javax.swing.JMenuItem jMenuItemCadastroVenda;
    private javax.swing.JMenuItem jMenuItemDesquitacao;
    private javax.swing.JMenuItem jMenuItemPesquisaCliente;
    private javax.swing.JMenuItem jMenuItemPesquisaVenda;
    private javax.swing.JMenuItem jMenuItemQuitacao;
    private javax.swing.JMenuItem jMenuItemRelatorioAniversario;
    private javax.swing.JMenuItem jMenuItemRelatorioContas;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSistema;
    private javax.swing.JMenuItem jMenuItemSuporteRemoto;
    private javax.swing.JMenu jMenuPesquisa;
    private javax.swing.JMenu jMenuRelatorioContasReceber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblEstacao;
    private javax.swing.JLabel lblLogoCliente;
    private javax.swing.JLabel lblNati;
    private javax.swing.JLabel lblVersao;
    // End of variables declaration//GEN-END:variables
}
