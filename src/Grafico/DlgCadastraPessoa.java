package Grafico;

import Controle.ControlaPessoa;
import DAO.CidadeDAO;
import DAO.PessoaDAO;
import DAO.UfDAO;
import Negocio.Cidade;
import Negocio.Pessoa;
import Negocio.Uf;
import Utilitario.FormataData;
import Utilitario.Funcoes;
import Utilitario.TeclasPermitidas;
import caroco.Data;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.PopupMenuEvent;
import javax.swing.text.MaskFormatter;

public class DlgCadastraPessoa extends javax.swing.JDialog {

    ControlaPessoa ctlPessoa = new ControlaPessoa();
    PessoaDAO pessoaDAO = new PessoaDAO();
    CidadeDAO cidadeDAO = new CidadeDAO();
    UfDAO ufDAO = new UfDAO();
    
    String idNovo; //Variavel criada para armazenador o proximo ID válido do banco

    public DlgCadastraPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null); //Inicia a Janela no centro da tela
        this.setTitle("Cadastro de Pessoas"); //Muda o titulo da Janela
        bloquearLetras(); //Bloquea o uso de letras em campos de numerais
        btnNovo.doClick(); //Pressiona o botao novo
        preencherComboUf(ufDAO.buscaTodasUfs()); //Pega os estados do banco de dados e carrega o combo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotoes = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnDuplicar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAuditoria = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        cmbTipo = new javax.swing.JComboBox<>();
        tfdNomeRazaoSocial = new javax.swing.JTextField();
        lblNomeRazaoSocial = new javax.swing.JLabel();
        tfdIdPessoa = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblApilidoNomeFantasia = new javax.swing.JLabel();
        tfdApilidoNomeFantasia = new javax.swing.JTextField();
        lblCpfCnpj = new javax.swing.JLabel();
        tfdCpfCnpj = new javax.swing.JTextField();
        lblRgIe = new javax.swing.JLabel();
        tfdRgIe = new javax.swing.JTextField();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        tfdInscricaoMunicipal = new javax.swing.JTextField();
        lblInscricaoMunicipal = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        ccbCliente = new javax.swing.JCheckBox();
        ccbFornecedor = new javax.swing.JCheckBox();
        ccbFuncionario = new javax.swing.JCheckBox();
        ccbTransportadora = new javax.swing.JCheckBox();
        ccbOrgaoPublico = new javax.swing.JCheckBox();
        ccbStatus = new javax.swing.JCheckBox();
        jmDataNascimento = new caroco.JmData();
        lblCodigo = new javax.swing.JLabel();
        tfdCodigo = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        pnlAbas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblLogradouro = new javax.swing.JLabel();
        tfdLogradouro = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        tfdComplementoEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        tfdNumeroEndereco = new javax.swing.JTextField();
        tfdBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        lblCepLogradoura = new javax.swing.JLabel();
        tfdCepLogradouro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        tfdCidade = new javax.swing.JTextField();
        btnBuscaCep = new javax.swing.JButton();
        cmbUf = new javax.swing.JComboBox<>();
        lblUf = new javax.swing.JLabel();
        cmbNomeCidade = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblTelefoneFixo = new javax.swing.JLabel();
        tfdTelefoneFixo = new javax.swing.JTextField();
        tfdTelefoneCelular = new javax.swing.JTextField();
        lblTelefoneCelular = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        lblEmailCobranca = new javax.swing.JLabel();
        tfdEmailCobranca = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblMda = new javax.swing.JLabel();
        tfdMda = new javax.swing.JTextField();
        lblMa = new javax.swing.JLabel();
        tfdMa = new javax.swing.JTextField();
        lblAtualizacao = new javax.swing.JLabel();
        jmDataAtualizacao = new caroco.JmData();
        jPanel4 = new javax.swing.JPanel();
        lblLocalTrabalho = new javax.swing.JLabel();
        tfdLocalTrabalho = new javax.swing.JTextField();
        tfdFuncaoTrabalho = new javax.swing.JTextField();
        lblFuncaoTrabalho = new javax.swing.JLabel();
        lblRenda = new javax.swing.JLabel();
        tfdRenda = new jnumberformatfield.JNumberFormatField();
        lblCasaPropria = new javax.swing.JLabel();
        cmbCasaPropria = new javax.swing.JComboBox<>();
        lblLimite = new javax.swing.JLabel();
        tfdLimite = new jnumberformatfield.JNumberFormatField();
        jPanel5 = new javax.swing.JPanel();
        lblNomeReferencia = new javax.swing.JLabel();
        tfdNomeReferencia = new javax.swing.JTextField();
        lblTelefoneReferencia = new javax.swing.JLabel();
        tfdTelefoneReferencia = new javax.swing.JTextField();
        lblPessoaAutorizada = new javax.swing.JLabel();
        tfdPessoaAutorizada = new javax.swing.JTextField();
        lblReferenciaComercial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaReferenciaComercial = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        lblNomeMae = new javax.swing.JLabel();
        lblNomePai = new javax.swing.JLabel();
        tfdNomePai = new javax.swing.JTextField();
        tfdNomeMae = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaObservacao = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        lblTamanhoCamisa = new javax.swing.JLabel();
        tfdTamanhoCamisa = new javax.swing.JTextField();
        lblTamanhoCalca = new javax.swing.JLabel();
        tfdTamanhoCalca = new javax.swing.JTextField();
        lblTamanhoSapatos = new javax.swing.JLabel();
        tfdTamanhoSapatos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlBotoes.setPreferredSize(new java.awt.Dimension(800, 70));

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/anterior32.png"))); // NOI18N
        btnAnterior.setText("Anterior (F1)");
        btnAnterior.setAlignmentY(0.0F);
        btnAnterior.setBorder(null);
        btnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnterior.setPreferredSize(new java.awt.Dimension(75, 60));
        btnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/proximo32.png"))); // NOI18N
        btnProximo.setText("Próximo (F2)");
        btnProximo.setAlignmentY(0.0F);
        btnProximo.setBorder(null);
        btnProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProximo.setPreferredSize(new java.awt.Dimension(75, 60));
        btnProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pesquisa32.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar (F4)");
        btnPesquisar.setAlignmentY(0.0F);
        btnPesquisar.setBorder(null);
        btnPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisar.setPreferredSize(new java.awt.Dimension(75, 60));
        btnPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/novo32.png"))); // NOI18N
        btnNovo.setText("Novo (F5)");
        btnNovo.setAlignmentY(0.0F);
        btnNovo.setBorder(null);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setPreferredSize(new java.awt.Dimension(75, 60));
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnDuplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/duplicar32.png"))); // NOI18N
        btnDuplicar.setText("Duplicar (F6)");
        btnDuplicar.setAlignmentY(0.0F);
        btnDuplicar.setBorder(null);
        btnDuplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDuplicar.setPreferredSize(new java.awt.Dimension(75, 60));
        btnDuplicar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/impressora32.png"))); // NOI18N
        btnImprimir.setText("Imprimir (F7)");
        btnImprimir.setAlignmentY(0.0F);
        btnImprimir.setBorder(null);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setPreferredSize(new java.awt.Dimension(75, 60));
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/auditoria32.png"))); // NOI18N
        btnAuditoria.setText("Auditoria (F8)");
        btnAuditoria.setAlignmentY(0.0F);
        btnAuditoria.setBorder(null);
        btnAuditoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAuditoria.setPreferredSize(new java.awt.Dimension(75, 60));
        btnAuditoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Salvar32.png"))); // NOI18N
        btnSalvar.setText("Salvar (F3)");
        btnSalvar.setAlignmentY(0.0F);
        btnSalvar.setBorder(null);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setPreferredSize(new java.awt.Dimension(75, 60));
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/cancel32.png"))); // NOI18N
        btnSair.setText("Cancelar (F9)");
        btnSair.setAlignmentY(0.0F);
        btnSair.setBorder(null);
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setPreferredSize(new java.awt.Dimension(75, 60));
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDuplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDuplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PESSOA FÍSICA", "PESSOA JURIDICA" }));
        cmbTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbTipoFocusLost(evt);
            }
        });
        cmbTipo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbTipoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lblNomeRazaoSocial.setText("Nome/Razão Social:");

        tfdIdPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdIdPessoaKeyPressed(evt);
            }
        });

        lblId.setText("ID:");

        lblApilidoNomeFantasia.setText("Apelido/Nome Fantasia:");

        lblCpfCnpj.setText("CPF/CNPJ:");

        lblRgIe.setText("RG/Inscrição Estadual:");

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SOLTEIRO(A)", "CASADO(A)", "DIVORCIADO(A)", "VIÚVO(A)", "SEPARADO(A)", "UNIÃO ESTÁVEL" }));

        lblEstadoCivil.setText("Estado Civil:");

        lblInscricaoMunicipal.setText("Inscrição Municipal:");

        lblDataNascimento.setText("Data de Nascimento:");

        lblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "MASCULINO", "FEMININO" }));
        cmbSexo.setToolTipText("");

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
                    .addComponent(ccbFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ccbTransportadora)
                    .addComponent(ccbFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ccbOrgaoPublico)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccbCliente)
                    .addComponent(ccbFuncionario)
                    .addComponent(ccbOrgaoPublico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccbFornecedor)
                    .addComponent(ccbTransportadora))
                .addContainerGap())
        );

        ccbStatus.setSelected(true);
        ccbStatus.setText("Ativo");

        jmDataNascimento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jmDataNascimentoPropertyChange(evt);
            }
        });

        lblCodigo.setText("Código:");

        lblIdade.setText("Idade");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRgIe)
                            .addComponent(lblInscricaoMunicipal)
                            .addComponent(lblCpfCnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblEstadoCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addGap(41, 41, 41)
                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jmDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblIdade)
                                .addContainerGap())
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApilidoNomeFantasia)
                            .addComponent(lblNomeRazaoSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfdNomeRazaoSocial)
                            .addComponent(tfdApilidoNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(ccbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeRazaoSocial)
                    .addComponent(tfdNomeRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(tfdIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbStatus))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApilidoNomeFantasia)
                    .addComponent(tfdApilidoNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpfCnpj)
                        .addComponent(tfdCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstadoCivil))
                    .addComponent(lblDataNascimento)
                    .addComponent(jmDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSexo)
                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRgIe)
                                .addComponent(tfdRgIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInscricaoMunicipal))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblLogradouro.setText("Logradouro:");

        lblComplemento.setText("Complemento:");

        lblNumero.setText("Número:");

        lblBairro.setText("Bairro:");

        lblCepLogradoura.setText("CEP Logradouro:");

        lblCidade.setText("Cidade:");

        tfdCidade.setEnabled(false);

        btnBuscaCep.setText("Busca CEP");

        cmbUf.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbUfPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lblUf.setText("UF:");

        cmbNomeCidade.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbNomeCidadePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblLogradouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfdLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfdNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblComplemento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCepLogradoura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdCepLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnBuscaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(tfdComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addGap(26, 26, 26)
                        .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUf)
                        .addGap(18, 18, 18)
                        .addComponent(cmbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogradouro)
                    .addComponent(tfdLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento)
                    .addComponent(tfdComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(tfdNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(tfdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf)
                    .addComponent(cmbNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCepLogradoura)
                    .addComponent(tfdCepLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCep))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Endereço", jPanel1);

        lblTelefoneFixo.setText("Telefone Fixo:");

        lblTelefoneCelular.setText("Telefone Celular:");

        lblEmail.setText("E-mail pessoal:");

        lblEmailCobranca.setText("E-mail de cobrança:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefoneCelular)
                    .addComponent(lblTelefoneFixo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfdTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfdTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmailCobranca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdEmailCobranca, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneFixo)
                    .addComponent(tfdTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdEmailCobranca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefoneCelular)
                        .addComponent(tfdTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmailCobranca)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Contato", jPanel2);

        lblMda.setText("Média de dias de atrazo:");

        tfdMda.setEnabled(false);

        lblMa.setText("Maior Atrazo:");

        tfdMa.setEnabled(false);

        lblAtualizacao.setText("Última Atualização:");

        jmDataAtualizacao.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMda)
                    .addComponent(lblMa)
                    .addComponent(lblAtualizacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdMa, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(tfdMda, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jmDataAtualizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMda)
                    .addComponent(tfdMda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa)
                    .addComponent(tfdMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAtualizacao)
                    .addComponent(jmDataAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Cadastro/quitacões", jPanel3);

        lblLocalTrabalho.setText("Local de trabalho:");

        lblFuncaoTrabalho.setText("Função:");

        lblRenda.setText("Renda:");

        lblCasaPropria.setText("Casa Própria:");

        cmbCasaPropria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SIM", "NÃO" }));

        lblLimite.setText("Limite:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLocalTrabalho)
                    .addComponent(lblFuncaoTrabalho)
                    .addComponent(lblRenda)
                    .addComponent(lblCasaPropria)
                    .addComponent(lblLimite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfdFuncaoTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(tfdLocalTrabalho))
                    .addComponent(cmbCasaPropria, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalTrabalho)
                    .addComponent(tfdLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdFuncaoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncaoTrabalho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenda)
                    .addComponent(tfdRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimite)
                    .addComponent(tfdLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCasaPropria)
                    .addComponent(cmbCasaPropria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pnlAbas.addTab("Financeiro", jPanel4);

        lblNomeReferencia.setText("Nome de pessoa referência:");

        lblTelefoneReferencia.setText("Telefone da pessoa referência:");

        lblPessoaAutorizada.setText("Pessoa Autorizada:");

        lblReferenciaComercial.setText("Referência Comercial:");

        txaReferenciaComercial.setColumns(20);
        txaReferenciaComercial.setRows(5);
        jScrollPane1.setViewportView(txaReferenciaComercial);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefoneReferencia)
                            .addComponent(lblPessoaAutorizada)
                            .addComponent(lblReferenciaComercial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tfdPessoaAutorizada, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdTelefoneReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 27, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNomeReferencia)
                        .addGap(18, 18, 18)
                        .addComponent(tfdNomeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeReferencia)
                    .addComponent(tfdNomeReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneReferencia)
                    .addComponent(tfdTelefoneReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPessoaAutorizada)
                    .addComponent(tfdPessoaAutorizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReferenciaComercial)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Referências", jPanel5);

        lblNomeMae.setText("Nome da Mãe:");

        lblNomePai.setText("Nome do Pai:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeMae)
                    .addComponent(lblNomePai))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMae)
                    .addComponent(tfdNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePai)
                    .addComponent(tfdNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Filiação", jPanel6);

        txaObservacao.setColumns(20);
        txaObservacao.setRows(5);
        jScrollPane2.setViewportView(txaObservacao);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAbas.addTab("Observação", jPanel7);

        lblTamanhoCamisa.setText("Tamanho Camisa:");

        lblTamanhoCalca.setText("Tamanho Calça:");

        lblTamanhoSapatos.setText("Tamanho Sapatos:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblTamanhoSapatos)
                        .addGap(18, 18, 18)
                        .addComponent(tfdTamanhoSapatos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTamanhoCamisa)
                            .addComponent(lblTamanhoCalca))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdTamanhoCalca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdTamanhoCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(598, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamanhoCamisa)
                    .addComponent(tfdTamanhoCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamanhoCalca)
                    .addComponent(tfdTamanhoCalca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamanhoSapatos)
                    .addComponent(tfdTamanhoSapatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Outros", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAbas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(!tfdIdPessoa.getText().isEmpty()&&!tfdCidade.getText().isEmpty()){
        Pessoa pessoa = new Pessoa();// Cria um objeto Pessoa para armazenar os dados da parte visual
        pessoa.setIdPessoa(Long.parseLong(tfdIdPessoa.getText()));
        pessoa.setCodigo(tfdCodigo.getText().equals("") ? null : tfdCodigo.getText().toUpperCase());
        pessoa.setTipo(cmbTipo.getSelectedItem().toString());
        pessoa.setNome(tfdNomeRazaoSocial.getText().equals("") ? null : tfdNomeRazaoSocial.getText().toUpperCase());
        pessoa.setApelido(tfdApilidoNomeFantasia.getText().equals("") ? null : tfdApilidoNomeFantasia.getText().toUpperCase());
        pessoa.setCpfCnpj(tfdCpfCnpj.getText().equals("") ? null : tfdCpfCnpj.getText().toUpperCase());
        pessoa.setRgIe(tfdRgIe.getText().equals("") ? null : tfdRgIe.getText());
        pessoa.setInscricaoMunicipal(tfdInscricaoMunicipal.getText().equals("") ? null : tfdInscricaoMunicipal.getText());
        pessoa.setTelefoneFixo(tfdTelefoneFixo.getText().equals("") ? null : tfdTelefoneFixo.getText());
        pessoa.setTelefoneCelular(tfdTelefoneCelular.getText().equals("") ? null : tfdTelefoneCelular.getText());
        pessoa.setEstadoCivil(cmbEstadoCivil.getSelectedItem().toString());
        pessoa.setEmail(tfdEmail.getText().equals("") ? null : tfdEmail.getText().toUpperCase());
        pessoa.setEmailCobranca(tfdEmailCobranca.getText().equals("") ? null : tfdEmailCobranca.getText().toUpperCase());
        pessoa.setDataNascimento(jmDataNascimento.getData());
        pessoa.setLogradouro(tfdLogradouro.getText().equals("") ? null : tfdLogradouro.getText().toUpperCase());
        pessoa.setComplementoEndereco(tfdComplementoEndereco.getText().equals("") ? null : tfdComplementoEndereco.getText().toUpperCase());
        pessoa.setNumeroEndereco(tfdNumeroEndereco.getText().equals("") ? null : tfdNumeroEndereco.getText().toUpperCase());
        pessoa.setBairro(tfdBairro.getText().equals("") ? null : tfdBairro.getText().toUpperCase());
        pessoa.setCepLogradouro(tfdCepLogradouro.getText().equals("") ? null : tfdCepLogradouro.getText().toUpperCase());
        pessoa.setSexo(cmbSexo.getSelectedItem().toString().toUpperCase());
        pessoa.setLocalTrabalho(tfdLocalTrabalho.getText().equals("") ? null : tfdLocalTrabalho.getText().toUpperCase());
        pessoa.setFuncaoTrabalho(tfdFuncaoTrabalho.getText().equals("") ? null : tfdFuncaoTrabalho.getText().toUpperCase());
        pessoa.setRenda(tfdRenda.getText());
        pessoa.setLimite(tfdLimite.getText());
        pessoa.setNomeReferencia(tfdNomeReferencia.getText().equals("") ? null : tfdNomeReferencia.getText().toUpperCase());
        pessoa.setTelefoneReferencia(tfdTelefoneReferencia.getText().equals("") ? null : tfdTelefoneReferencia.getText());
        pessoa.setCasaPropria(cmbCasaPropria.getSelectedItem().toString().toUpperCase());
        pessoa.setPessoaAutorizada(tfdPessoaAutorizada.getText().equals("") ? null : tfdPessoaAutorizada.getText().toUpperCase());
        pessoa.setReferenciaComercial(txaReferenciaComercial.getText().equals("") ? null : txaReferenciaComercial.getText().toUpperCase());
        pessoa.setNomeMae(tfdNomeMae.getText().equals("") ? null : tfdNomeMae.getText().toUpperCase());
        pessoa.setNomePai(tfdNomePai.getText().equals("") ? null : tfdNomePai.getText().toUpperCase());
        pessoa.setObservacao(txaObservacao.getText().equals("") ? null : txaObservacao.getText().toUpperCase());
        pessoa.setOrgaoPublico(ccbOrgaoPublico.isSelected());
        pessoa.setFornecedor(ccbFornecedor.isSelected());
        pessoa.setFuncionario(ccbFuncionario.isSelected());
        pessoa.setTransportadora(ccbTransportadora.isSelected());
        pessoa.setCliente(ccbCliente.isSelected());
        pessoa.setDataAtualizacao(jmDataAtualizacao.getData());
        pessoa.setStatus(ccbStatus.isSelected());
        pessoa.setCidade(Long.parseLong(tfdCidade.getText()));
        
        if (ctlPessoa.verificaPessoa(pessoa).isEmpty()) { //Se não voltar nenhum erro, seguir para salvar a pessoa no banco
            if (pessoaDAO.pessoaEstaCadastrada(pessoa.getIdPessoa())) {// Verifica se a pessoa já está cadastrada
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar os dados do cadastro?", "Atualizar", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) { //Se quiser atualizar
                    if (pessoaDAO.atualizaPessoa(pessoa, pessoaDAO.buscaPessoaPorId(pessoa.getIdPessoa()))) {//Passa a Nova pessoa e o cadastro antigo para fazer update das informacoes
                        JOptionPane.showMessageDialog(this, "Cadastro atualizado com sucesso");
                    }
                } else if (resposta == JOptionPane.NO_OPTION) { //Se não quiser atualizar
                    preencherCampos(pessoaDAO.buscaPessoaPorId(Long.parseLong(tfdIdPessoa.getText())));
                }
            } else {
                if (pessoaDAO.cadastraPessoa(pessoa)) { //Volta verdadeiro se não houver erro na classe DAO
                    JOptionPane.showMessageDialog(this, "Cadastro salvo com sucesso");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, ctlPessoa.verificaPessoa(pessoa));
        }
        }else{
            JOptionPane.showMessageDialog(this, "Compos obrigatórios não preenchidos");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaTela();
        try {
            idNovo = String.valueOf(pessoaDAO.ultimaPessoaCadastrada() + 1); //Pega o ID da ultima pessoa cadastrada e soma 1 para criar um novo ID
            tfdIdPessoa.setText(idNovo);
            tfdIdPessoa.selectAll();//Seleciona o conteudo do campo
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void cmbTipoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbTipoPopupMenuWillBecomeInvisible
        if (cmbTipo.getSelectedItem().toString().equals("PESSOA FÍSICA")) {
            tfdInscricaoMunicipal.setText(null);
            tfdInscricaoMunicipal.setEnabled(false);
            cmbEstadoCivil.setSelectedIndex(0);
            cmbEstadoCivil.setEnabled(true);
            cmbSexo.setSelectedIndex(0);
            cmbSexo.setEnabled(true);
            tfdLocalTrabalho.setText(null);
            tfdLocalTrabalho.setEnabled(true);
            tfdFuncaoTrabalho.setText(null);
            tfdFuncaoTrabalho.setEnabled(true);
            tfdRenda.setText(null);
            tfdRenda.setEnabled(true);
            cmbCasaPropria.setSelectedIndex(0);
            cmbCasaPropria.setEnabled(true);
            tfdNomeMae.setText(null);
            tfdNomeMae.setEnabled(true);
            tfdNomePai.setText(null);
            tfdNomePai.setEnabled(true);
        } else {
            tfdInscricaoMunicipal.setText(null);
            tfdInscricaoMunicipal.setEnabled(true);
            cmbEstadoCivil.setSelectedIndex(0);
            cmbEstadoCivil.setEnabled(false);
            cmbSexo.setSelectedIndex(0);
            cmbSexo.setEnabled(false);
            tfdLocalTrabalho.setText(null);
            tfdLocalTrabalho.setEnabled(false);
            tfdFuncaoTrabalho.setText(null);
            tfdFuncaoTrabalho.setEnabled(false);
            tfdRenda.setText(null);
            tfdRenda.setEnabled(false);
            cmbCasaPropria.setSelectedIndex(0);
            cmbCasaPropria.setEnabled(false);
            tfdNomeMae.setText(null);
            tfdNomeMae.setEnabled(false);
            tfdNomePai.setText(null);
            tfdNomePai.setEnabled(false);
        }
    }//GEN-LAST:event_cmbTipoPopupMenuWillBecomeInvisible

    private void tfdIdPessoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdIdPessoaKeyPressed
        Pessoa pessoa = new Pessoa();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tfdIdPessoa.getText().isEmpty()) {
                long id = Long.parseLong(tfdIdPessoa.getText());
                try {
                    pessoa = pessoaDAO.buscaPessoaPorId(id);
                    preencherCampos(pessoa);
                } catch (Exception e) {
                    tfdNomeRazaoSocial.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Favor informar o ID");
            }
        }
    }//GEN-LAST:event_tfdIdPessoaKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cmbUfPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbUfPopupMenuWillBecomeInvisible
        try {
            preencherComboCidade(cidadeDAO.buscaCidadesPorUf(cmbUf.getSelectedItem().toString())); //Preenche o combo de cidades apartir do estado selecionado
            cmbNomeCidadePopupMenuWillBecomeInvisible(evt);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbUfPopupMenuWillBecomeInvisible

    private void cmbNomeCidadePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbNomeCidadePopupMenuWillBecomeInvisible
        try {
            Cidade cidade = cidadeDAO.buscaCidadePorNome(cmbNomeCidade.getSelectedItem().toString());// pega os dados da cidade selecionada e poem em uma variavel local
            tfdCidade.setText(String.valueOf(cidade.getIdCidade())); //Atribui o ID da cidade no textField
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbNomeCidadePopupMenuWillBecomeInvisible

    private void cmbTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTipoFocusLost
        javax.swing.event.PopupMenuEvent evt2 = new PopupMenuEvent(evt); //Cria um evento para ser usado abaixo
        cmbTipoPopupMenuWillBecomeInvisible(evt2);//Executa o evento do comboTipo caso o usuario use o teclado para navegar e nao o mouse
    }//GEN-LAST:event_cmbTipoFocusLost

    private void jmDataNascimentoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jmDataNascimentoPropertyChange
        try { //Calcula a idade
            Data dataNascimento = jmDataNascimento.getData();
            if (dataNascimento.compareTo(FormataData.tranformaParaData(Funcoes.getData()))== 1){
                JOptionPane.showMessageDialog(this, "Data de nascimento é maior que a data atual");
                jmDataNascimento.setData(null);
            }else{
                int anos[] = dataNascimento.obterDiferença(FormataData.tranformaParaData(Funcoes.getData())); // Traz a diferença de anos, meses e dias entre datas
                lblIdade.setText(anos[0]+" Anos"); //Mostra na label apenas a diferença em anos
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmDataNascimentoPropertyChange

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        long idAntigo = Long.parseLong(tfdIdPessoa.getText());
        long idNovo = idAntigo-1;
        if (idNovo < pessoaDAO.primeiraPessoaCadastrada() || idNovo > pessoaDAO.ultimaPessoaCadastrada()) {
            JOptionPane.showMessageDialog(this, "Não existem cadastros anteriores ao atual");
        }else{
            tfdIdPessoa.setText(String.valueOf(idNovo));
            try {
                    Pessoa pessoa = pessoaDAO.buscaPessoaPorId(idNovo);
                    preencherCampos(pessoa);
                } catch (Exception e) {
                    tfdIdPessoa.setText(String.valueOf(idAntigo));
                    tfdNomeRazaoSocial.requestFocus();
                }
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        long idAntigo = Long.parseLong(tfdIdPessoa.getText());
        long idNovo = idAntigo+1;
        if (idNovo < pessoaDAO.primeiraPessoaCadastrada() || idNovo > pessoaDAO.ultimaPessoaCadastrada()) {
            JOptionPane.showMessageDialog(this, "Não existem cadastros alem do atual");
        }else{
            tfdIdPessoa.setText(String.valueOf(idNovo));
            try {
                    Pessoa pessoa = pessoaDAO.buscaPessoaPorId(idNovo);
                    preencherCampos(pessoa);
                } catch (Exception e) {
                    tfdIdPessoa.setText(String.valueOf(idAntigo));
                    tfdNomeRazaoSocial.requestFocus();
                }
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void limpaTela() { // Limpa todos os componentes da DialogPessoa para os valores default
        tfdIdPessoa.setText(null);
        cmbTipo.setSelectedIndex(0); // seleciona o primeiro objeto da caixa de seleção (PESSOA FÍSICA)
        PopupMenuEvent evt = null;
        cmbTipoPopupMenuWillBecomeInvisible(evt);
        tfdCodigo.setText(null);
        tfdNomeRazaoSocial.setText(null);
        tfdApilidoNomeFantasia.setText(null);
        tfdCpfCnpj.setText(null);
        tfdRgIe.setText(null);
        tfdInscricaoMunicipal.setText(null);
        tfdTelefoneFixo.setText(null);
        tfdTelefoneCelular.setText(null);
        cmbEstadoCivil.setSelectedIndex(0);// seleciona o primeiro objeto da caixa de seleção (-)
        tfdEmail.setText(null);
        tfdEmailCobranca.setText(null);
        Data dataPadrao = FormataData.tranformaParaData("01/01/1990"); //Gera uma data padrao para os compos em nao ficarem em branco
        jmDataNascimento.setData(dataPadrao);
        Data dataDeHoje = FormataData.tranformaParaData(Funcoes.getData()); //Pega a data de hoje para data de atualizacao
        jmDataAtualizacao.setData(dataDeHoje);
        tfdLogradouro.setText(null);
        tfdComplementoEndereco.setText(null);
        tfdNumeroEndereco.setText(null);
        tfdBairro.setText(null);
        tfdCepLogradouro.setText(null);
        cmbSexo.setSelectedIndex(0);// seleciona o primeiro objeto da caixa de seleção (-)
        tfdLocalTrabalho.setText(null);
        tfdFuncaoTrabalho.setText(null);
        tfdRenda.setText(null);
        tfdLimite.setText(null);
        tfdNomeReferencia.setText(null);
        cmbCasaPropria.setSelectedIndex(0);// seleciona o primeiro objeto da caixa de seleção (-)
        tfdPessoaAutorizada.setText(null);
        txaReferenciaComercial.setText(null);
        tfdNomeMae.setText(null);
        tfdNomePai.setText(null);
        txaObservacao.setText(null);
        ccbOrgaoPublico.setSelected(false);
        ccbFornecedor.setSelected(false);
        ccbFuncionario.setSelected(false);
        ccbTransportadora.setSelected(false);
        ccbCliente.setSelected(false);
        ccbStatus.setSelected(true);
        tfdCidade.setText(null);
        cmbNomeCidade.removeAllItems();
        cmbUf.setSelectedItem(null);
    }

    private void bloquearLetras() { //Responsavel por impedir o uso de letras nos campos
        tfdIdPessoa.setDocument(new TeclasPermitidas());
        tfdCpfCnpj.setDocument(new TeclasPermitidas());
        tfdRgIe.setDocument(new TeclasPermitidas());
        tfdInscricaoMunicipal.setDocument(new TeclasPermitidas());
        tfdCepLogradouro.setDocument(new TeclasPermitidas());
        tfdNumeroEndereco.setDocument(new TeclasPermitidas());
        tfdTelefoneCelular.setDocument(new TeclasPermitidas());
        tfdTelefoneFixo.setDocument(new TeclasPermitidas());
        tfdTelefoneReferencia.setDocument(new TeclasPermitidas());
        tfdCidade.setDocument(new TeclasPermitidas());
    }

    private void preencherCampos(Pessoa pessoa) {
        cmbTipo.setSelectedItem(pessoa.getTipo());
        PopupMenuEvent evt = null;
        cmbTipoPopupMenuWillBecomeInvisible(evt);
        tfdCodigo.setText(pessoa.getCodigo());
        tfdNomeRazaoSocial.setText(pessoa.getNome());
        tfdApilidoNomeFantasia.setText(pessoa.getApelido());
        tfdCpfCnpj.setText(pessoa.getCpfCnpj());
        tfdRgIe.setText(pessoa.getRgIe());
        tfdInscricaoMunicipal.setText(pessoa.getInscricaoMunicipal());
        tfdTelefoneFixo.setText(pessoa.getTelefoneFixo());
        tfdTelefoneCelular.setText(pessoa.getTelefoneCelular());
        cmbEstadoCivil.setSelectedItem(pessoa.getEstadoCivil());
        tfdEmail.setText(pessoa.getEmail());
        tfdEmailCobranca.setText(pessoa.getEmailCobranca());
        jmDataNascimento.setData(pessoa.getDataNascimento());
        jmDataAtualizacao.setData(pessoa.getDataAtualizacao());
        tfdLogradouro.setText(pessoa.getLogradouro());
        tfdComplementoEndereco.setText(pessoa.getComplementoEndereco());
        tfdNumeroEndereco.setText(pessoa.getNumeroEndereco());
        tfdBairro.setText(pessoa.getBairro());
        tfdCepLogradouro.setText(pessoa.getCepLogradouro());
        cmbSexo.setSelectedItem(pessoa.getSexo());
        tfdLocalTrabalho.setText(pessoa.getLocalTrabalho());
        tfdFuncaoTrabalho.setText(pessoa.getFuncaoTrabalho());
        tfdRenda.setText(pessoa.getRenda());
        tfdLimite.setText(pessoa.getLimite());
        tfdNomeReferencia.setText(pessoa.getNomeReferencia());
        cmbCasaPropria.setSelectedItem(pessoa.getCasaPropria());
        tfdPessoaAutorizada.setText(pessoa.getPessoaAutorizada());
        txaReferenciaComercial.setText(pessoa.getReferenciaComercial());
        tfdNomeMae.setText(pessoa.getNomeMae());
        tfdNomePai.setText(pessoa.getNomePai());
        txaObservacao.setText(pessoa.getObservacao());
        ccbOrgaoPublico.setSelected(pessoa.isOrgaoPublico());
        ccbFornecedor.setSelected(pessoa.isFornecedor());
        ccbFuncionario.setSelected(pessoa.isFuncionario());
        ccbTransportadora.setSelected(pessoa.isTransportadora());
        ccbCliente.setSelected(pessoa.isCliente());
        ccbStatus.setSelected(pessoa.isStatus());
        tfdCidade.setText(String.valueOf(pessoa.getCidade())); //Recebe o id da cidade para textField
        Cidade cidade = cidadeDAO.buscaCidadePorId(pessoa.getCidade()); //Cria uma cidade auxiliar para armazenas os dados do banco
        Uf uf = ufDAO.buscaUfporId(cidade.getUf()); //Cria uma UF auxiliar para armazenas os dados do banco
        cmbUf.setSelectedItem(uf.getNome()); //Carrega o combo com a Uf cadastrada
        cmbUfPopupMenuWillBecomeInvisible(evt); //Chama o método da combo de UF para preencher a combo cidade
        cmbNomeCidade.setSelectedItem(cidade.getNome()); //Carrega o combo com a cidade cadastrada
    }
    
    private void preencherComboUf(ArrayList<Uf> ufs){
        for (int i = 0; i < ufs.size(); i++) {
            cmbUf.addItem(ufs.get(i).getNome());
        }
    }
    
    private void preencherComboCidade(ArrayList<Cidade> cidades){
        cmbNomeCidade.removeAllItems();
        for (int i = 0; i < cidades.size(); i++) {
            cmbNomeCidade.addItem(cidades.get(i).getNome());
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
            java.util.logging.Logger.getLogger(DlgCadastraPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadastraPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadastraPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadastraPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadastraPessoa dialog = new DlgCadastraPessoa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAuditoria;
    private javax.swing.JButton btnBuscaCep;
    private javax.swing.JButton btnDuplicar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ccbCliente;
    private javax.swing.JCheckBox ccbFornecedor;
    private javax.swing.JCheckBox ccbFuncionario;
    private javax.swing.JCheckBox ccbOrgaoPublico;
    private javax.swing.JCheckBox ccbStatus;
    private javax.swing.JCheckBox ccbTransportadora;
    private javax.swing.JComboBox<String> cmbCasaPropria;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JComboBox<String> cmbNomeCidade;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbUf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private caroco.JmData jmDataAtualizacao;
    private caroco.JmData jmDataNascimento;
    private javax.swing.JLabel lblApilidoNomeFantasia;
    private javax.swing.JLabel lblAtualizacao;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCasaPropria;
    private javax.swing.JLabel lblCepLogradoura;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailCobranca;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFuncaoTrabalho;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblInscricaoMunicipal;
    private javax.swing.JLabel lblLimite;
    private javax.swing.JLabel lblLocalTrabalho;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblMda;
    private javax.swing.JLabel lblNomeMae;
    private javax.swing.JLabel lblNomePai;
    private javax.swing.JLabel lblNomeRazaoSocial;
    private javax.swing.JLabel lblNomeReferencia;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPessoaAutorizada;
    private javax.swing.JLabel lblReferenciaComercial;
    private javax.swing.JLabel lblRenda;
    private javax.swing.JLabel lblRgIe;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTamanhoCalca;
    private javax.swing.JLabel lblTamanhoCamisa;
    private javax.swing.JLabel lblTamanhoSapatos;
    private javax.swing.JLabel lblTelefoneCelular;
    private javax.swing.JLabel lblTelefoneFixo;
    private javax.swing.JLabel lblTelefoneReferencia;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTabbedPane pnlAbas;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField tfdApilidoNomeFantasia;
    private javax.swing.JTextField tfdBairro;
    private javax.swing.JTextField tfdCepLogradouro;
    private javax.swing.JTextField tfdCidade;
    private javax.swing.JTextField tfdCodigo;
    private javax.swing.JTextField tfdComplementoEndereco;
    private javax.swing.JTextField tfdCpfCnpj;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdEmailCobranca;
    private javax.swing.JTextField tfdFuncaoTrabalho;
    private javax.swing.JTextField tfdIdPessoa;
    private javax.swing.JTextField tfdInscricaoMunicipal;
    private jnumberformatfield.JNumberFormatField tfdLimite;
    private javax.swing.JTextField tfdLocalTrabalho;
    private javax.swing.JTextField tfdLogradouro;
    private javax.swing.JTextField tfdMa;
    private javax.swing.JTextField tfdMda;
    private javax.swing.JTextField tfdNomeMae;
    private javax.swing.JTextField tfdNomePai;
    private javax.swing.JTextField tfdNomeRazaoSocial;
    private javax.swing.JTextField tfdNomeReferencia;
    private javax.swing.JTextField tfdNumeroEndereco;
    private javax.swing.JTextField tfdPessoaAutorizada;
    private jnumberformatfield.JNumberFormatField tfdRenda;
    private javax.swing.JTextField tfdRgIe;
    private javax.swing.JTextField tfdTamanhoCalca;
    private javax.swing.JTextField tfdTamanhoCamisa;
    private javax.swing.JTextField tfdTamanhoSapatos;
    private javax.swing.JTextField tfdTelefoneCelular;
    private javax.swing.JTextField tfdTelefoneFixo;
    private javax.swing.JTextField tfdTelefoneReferencia;
    private javax.swing.JTextArea txaObservacao;
    private javax.swing.JTextArea txaReferenciaComercial;
    // End of variables declaration//GEN-END:variables
}
