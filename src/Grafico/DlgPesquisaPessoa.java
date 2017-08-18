package Grafico;
public class DlgPesquisaPessoa extends javax.swing.JFrame {
    public DlgPesquisaPessoa() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        cmbTipo = new javax.swing.JComboBox<>();
        tfdNomeRazaoSocial = new javax.swing.JTextField();
        lblNomeRazaoSocial = new javax.swing.JLabel();
        tfdIdPessoa = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblApilidoNomeFantasia = new javax.swing.JLabel();
        tfdApilidoNomeFantasia = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        ccbStatus = new javax.swing.JCheckBox();
        lblCodigo = new javax.swing.JLabel();
        tfdCodigo = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        ccbCliente = new javax.swing.JCheckBox();
        ccbFornecedor = new javax.swing.JCheckBox();
        ccbFuncionario = new javax.swing.JCheckBox();
        ccbTransportadora = new javax.swing.JCheckBox();
        ccbOrgaoPublico = new javax.swing.JCheckBox();
        lblCpfCnpj = new javax.swing.JLabel();
        tfdCpfCnpj = new javax.swing.JTextField();
        lblRgIe = new javax.swing.JLabel();
        tfdRgIe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PESSOA FÍSICA", "PESSOA JURIDICA" }));

        lblNomeRazaoSocial.setText("Nome/Razão Social:");

        lblId.setText("ID:");

        lblApilidoNomeFantasia.setText("Apelido/Nome Fantasia:");

        lblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "MASCULINO", "FEMININO" }));
        cmbSexo.setToolTipText("");

        ccbStatus.setSelected(true);
        ccbStatus.setText("Ativo");

        lblCodigo.setText("Código:");

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ccbCliente.setText("Cliente");

        ccbFornecedor.setText("Fornecedor");

        ccbFuncionario.setText("Funcionário");

        ccbTransportadora.setText("Transportadora");

        ccbOrgaoPublico.setText("Orgão Público");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ccbCliente)
                    .addComponent(ccbFornecedor)
                    .addComponent(ccbFuncionario)
                    .addComponent(ccbOrgaoPublico)
                    .addComponent(ccbTransportadora))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ccbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ccbFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ccbFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ccbOrgaoPublico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ccbTransportadora)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        lblCpfCnpj.setText("CPF/CNPJ:");

        lblRgIe.setText("RG/Inscrição Estadual:");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(lblSexo)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblCpfCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRgIe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApilidoNomeFantasia)
                            .addComponent(lblNomeRazaoSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdNomeRazaoSocial)
                            .addComponent(tfdApilidoNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbStatus))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(tfdIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbStatus)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpfCnpj)
                        .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRgIe)
                            .addComponent(tfdRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeRazaoSocial)
                    .addComponent(tfdNomeRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApilidoNomeFantasia)
                    .addComponent(tfdApilidoNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
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
            java.util.logging.Logger.getLogger(DlgPesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgPesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgPesquisaPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ccbCliente;
    private javax.swing.JCheckBox ccbFornecedor;
    private javax.swing.JCheckBox ccbFuncionario;
    private javax.swing.JCheckBox ccbOrgaoPublico;
    private javax.swing.JCheckBox ccbStatus;
    private javax.swing.JCheckBox ccbTransportadora;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblApilidoNomeFantasia;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNomeRazaoSocial;
    private javax.swing.JLabel lblRgIe;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField tfdApilidoNomeFantasia;
    private javax.swing.JTextField tfdCodigo;
    private javax.swing.JTextField tfdCpfCnpj;
    private javax.swing.JTextField tfdIdPessoa;
    private javax.swing.JTextField tfdNomeRazaoSocial;
    private javax.swing.JTextField tfdRgIe;
    // End of variables declaration//GEN-END:variables
}
