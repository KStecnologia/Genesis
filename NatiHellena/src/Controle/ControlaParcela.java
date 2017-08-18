package Controle;

import Grafico.DlgLogin;
import Negocio.Parcela;
import Utilitario.FormataData;
import Utilitario.Funcoes;
import caroco.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControlaParcela {

    public static ArrayList<Parcela> parcelas;
    public static String[] auxDataString;// acrescentar
    public static ArrayList<Parcela> parcelasAux;

    public ControlaParcela() {
        parcelas = new ArrayList<>();
    }

    public boolean cadastraParcela(Parcela p) {
        return parcelas.add(p);
    }

    public static ArrayList<Parcela> consultarParcela() {
        return parcelas;
    }

    public void incluiParcelaBanco(Parcela auxPar) {// Faz a inclusão de uma parcela no Banco
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("insert into parcela values(default,?,?,?,?,?,?,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

            java.sql.Date data_vencimento = new java.sql.Date(date.parse(auxPar.getDataVencimento().toString()).getTime());
            java.sql.Date data_quitacao = new java.sql.Date(date.parse(auxPar.getDataQuitacao().toString()).getTime());

            instrucao.setLong(1, auxPar.getNumero());
            instrucao.setString(2, auxPar.getValorOriginal());
            instrucao.setString(3, auxPar.getValorJuros());
            instrucao.setString(4, auxPar.getValorQuitacao());
            instrucao.setDate(5, data_vencimento);
            instrucao.setDate(6, data_quitacao);
            instrucao.setBoolean(7, auxPar.isStatus());
            instrucao.setLong(8, auxPar.getIdvenda());
            instrucao.setDate(9, null);
            instrucao.setLong(10, auxPar.getSequencial());

            instrucao.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: incluiParcelaBanco" + e.getMessage());
        }
    }

    public ArrayList<Parcela> buscarTodasParcelas() { // Busca todas parcelas
        parcelas = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from parcela");

            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Parcela par = new Parcela();
                par.setIdparcela(rs.getLong("idparcela"));
                par.setNumero(rs.getLong("numero"));
                par.setValorOriginal(rs.getString("valor_original"));
                par.setValorJuros(rs.getString("valor_juros"));
                par.setValorQuitacao(rs.getString("valor_quitacao"));
                par.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                par.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                par.setStatus(rs.getBoolean("status"));
                par.setIdvenda(rs.getLong("idvenda"));
                if (rs.getDate("data_promessa") != null) {
                    par.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                } else {
                    par.setDataPromessa(null);
                }
                par.setSequencial(rs.getLong("sequencial"));
                parcelas.add(par);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarTodasParcelas");
        }
        return parcelas;
    }

    public ArrayList<Parcela> buscarTodasParcelasPorVenda(Long id) { // Busca todas parcelas por id de venda
        parcelas = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from parcela where idvenda = ?");
            instrucao.setLong(1, id);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Parcela par = new Parcela();
                par.setIdparcela(rs.getLong("idparcela"));
                par.setNumero(rs.getLong("numero"));
                par.setValorOriginal(rs.getString("valor_original"));
                par.setValorJuros(rs.getString("valor_juros"));
                par.setValorQuitacao(rs.getString("valor_quitacao"));
                par.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                par.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                par.setStatus(rs.getBoolean("status"));
                par.setIdvenda(rs.getLong("idvenda"));
                if (rs.getDate("data_promessa") != null) {
                    par.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                } else {
                    par.setDataPromessa(null);
                }
                par.setSequencial(rs.getLong("sequencial"));
                parcelas.add(par);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarTodasParcelasPorVenda");
        }
        return parcelas;
    }

    public void buscarParcelaDoBanco(Data dataDe, Data dataAte, String status) { // Busca todas parcelas com a data informada
        parcelas = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from parcela where data_vencimento >= ? and data_vencimento <= ? and status = " + status + " order by data_vencimento");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date date_de = new java.sql.Date(date.parse(dataDe.toString()).getTime());
            java.sql.Date date_ate = new java.sql.Date(date.parse(dataAte.toString()).getTime());

            instrucao.setDate(1, date_de);
            instrucao.setDate(2, date_ate);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Parcela par = new Parcela();
                par.setIdparcela(rs.getLong("idparcela"));
                par.setNumero(rs.getLong("numero"));
                par.setValorOriginal(rs.getString("valor_original"));
                par.setValorJuros(rs.getString("valor_juros"));
                par.setValorQuitacao(rs.getString("valor_quitacao"));
                par.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                par.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                par.setStatus(rs.getBoolean("status"));
                par.setIdvenda(rs.getLong("idvenda"));
                if (rs.getDate("data_promessa") != null) {
                    par.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                } else {
                    par.setDataPromessa(null);
                }
                par.setSequencial(rs.getLong("sequencial"));
                parcelas.add(par);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarParcelaDoBanco");
        }
    }

    public Parcela buscarParcelaPorId(long id) { // Busca a parcela com ID informado
        Parcela par = new Parcela();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from parcela where idparcela = ?");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

            instrucao.setLong(1, id);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                par.setIdparcela(rs.getLong("idparcela"));
                par.setNumero(rs.getLong("numero"));
                par.setValorOriginal(rs.getString("valor_original"));
                par.setValorJuros(rs.getString("valor_juros"));
                par.setValorQuitacao(rs.getString("valor_quitacao"));
                par.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                par.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                par.setStatus(rs.getBoolean("status"));
                par.setIdvenda(rs.getLong("idvenda"));
                if (rs.getDate("data_promessa") != null) {
                    par.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                } else {
                    par.setDataPromessa(null);
                }
                par.setSequencial(rs.getLong("sequencial"));
                parcelas.add(par);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarParcelaPorId");
        }
        return par;
    }

    public void buscarParcelaDoBanco(Data dataDe, Data dataAte, long id, String status) { // Busca as parcelas com ID do cliente e a data
        parcelas = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select parcela.* from parcela, venda, cliente where parcela.idvenda = venda.idvenda and venda.idcliente = cliente.idcliente and cliente.idcliente = ? and parcela.status =" + status + " and parcela.data_vencimento >= ? and parcela.data_vencimento <= ? group by parcela.idparcela order by parcela.data_vencimento");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date date_de = new java.sql.Date(date.parse(dataDe.toString()).getTime());
            java.sql.Date date_ate = new java.sql.Date(date.parse(dataAte.toString()).getTime());
            instrucao.setLong(1, id);
            instrucao.setDate(2, date_de);
            instrucao.setDate(3, date_ate);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Parcela par = new Parcela();
                par.setIdparcela(rs.getLong("idparcela"));
                par.setNumero(rs.getLong("numero"));
                par.setValorOriginal(rs.getString("valor_original"));
                par.setValorJuros(rs.getString("valor_juros"));
                par.setValorQuitacao(rs.getString("valor_quitacao"));
                par.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                par.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                par.setStatus(rs.getBoolean("status"));
                par.setIdvenda(rs.getLong("idvenda"));
                if (rs.getDate("data_promessa") != null) {
                    par.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                } else {
                    par.setDataPromessa(null);
                }
                par.setSequencial(rs.getLong("sequencial"));
                parcelas.add(par);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarParcelaDoBanco");
        }
    }

    public void buscarParcelaDoBanco(Data dataDe, Data dataAte, String nome, boolean status, String operacao) { // Busca as parcelas com ID do cliente e a data
        parcelas = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date date_de = new java.sql.Date(date.parse(dataDe.toString()).getTime());
            java.sql.Date date_ate = new java.sql.Date(date.parse(dataAte.toString()).getTime());
            if (nome.equalsIgnoreCase("")) {
                instrucao = DlgLogin.conexao.prepareStatement("select parcela.* from parcela, venda where parcela.idvenda = venda.idvenda and parcela.status = " + status + " and parcela.data_vencimento >= ? and parcela.data_vencimento <= ? and venda.operacao != ? group by parcela.idparcela order by parcela.data_vencimento");
                instrucao.setDate(1, date_de);
                instrucao.setDate(2, date_ate);
                instrucao.setString(3, operacao);
            } else {
                instrucao = DlgLogin.conexao.prepareStatement("select parcela.* from parcela, venda, cliente where parcela.idvenda = venda.idvenda and venda.idcliente = cliente.idcliente and cliente.nome = ? and parcela.status = ? and parcela.data_vencimento >= ? and parcela.data_vencimento <= ? and venda.operacao != ? group by parcela.idparcela order by parcela.data_vencimento");
                instrucao.setString(1, nome);
                instrucao.setBoolean(2, status);
                instrucao.setDate(3, date_de);
                instrucao.setDate(4, date_ate);
                instrucao.setString(5, operacao);
            }

            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Parcela par = new Parcela();
                par.setIdparcela(rs.getLong("idparcela"));
                par.setNumero(rs.getLong("numero"));
                par.setValorOriginal(rs.getString("valor_original"));
                par.setValorJuros(rs.getString("valor_juros"));
                par.setValorQuitacao(rs.getString("valor_quitacao"));
                par.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                par.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                par.setStatus(rs.getBoolean("status"));
                par.setIdvenda(rs.getLong("idvenda"));
                if (rs.getDate("data_promessa") != null) {
                    par.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                } else {
                    par.setDataPromessa(null);
                }
                par.setSequencial(rs.getLong("sequencial"));
                parcelas.add(par);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarParcelaDoBanco");
        }
    }

    public void atualizaParcelaBanco(long id, String status, String valorQuitacao, String valorJuros) throws ParseException {
        try {
            PreparedStatement instrucao;
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date date_Quitacao = new java.sql.Date(date.parse(Funcoes.getData()).getTime());
            instrucao = DlgLogin.conexao.prepareStatement("update parcela set status = " + status + ", data_quitacao = ?, valor_quitacao = ?, valor_juros = ? where idparcela = ?");
            instrucao.setDate(1, date_Quitacao);
            instrucao.setString(2, valorQuitacao);
            instrucao.setString(3, valorJuros);
            instrucao.setLong(4, id);

            instrucao.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: atualizaParcelaBanco");
        }
    }

    public void atualizaParcelaBanco(long id, Data dataPromessa) throws ParseException {//Altera valor do juros, valor da quitacao e data promessa de pagamento
        try {
            PreparedStatement instrucao;
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date date_Promessa = new java.sql.Date(date.parse(dataPromessa.toString()).getTime());
            instrucao = DlgLogin.conexao.prepareStatement("update parcela set data_promessa = ? where idparcela = ?");

            instrucao.setDate(1, date_Promessa);
            instrucao.setLong(2, id);

            instrucao.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: atualizaParcelaBanco");
        }
    }

    public void cancelarParcelasDaVenda(Long id) {
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("delete from parcela where idvenda = ?");
            instrucao.setLong(1, id);

            instrucao.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: cancelarParcelasDaVenda");
        }
    }
// ------------------ACRESCENTAR ------------------------------------------

    public void geraParcela(long idvenda, String QNTVezes, String valor, Data vencimento) {
        Parcela p = new Parcela();
        Data d = new Data();
        parcelas = new ArrayList<>();
        int quantidadeDeVezes = Integer.parseInt(QNTVezes);
        gerarDataVencimento(vencimento, quantidadeDeVezes);
        for (int i = 0; i < quantidadeDeVezes; i++) {
            p.setIdvenda(idvenda);// id do serviço
            p.setNumero(i + 1);	// numero da parcela
            p.setValorOriginal(valor);
            p.setValorJuros("0.00");
            p.setValorQuitacao("0.00");
            p.setDataVencimento(FormataData.tranformaParaData(auxDataString[i]));
            p.setDataQuitacao(FormataData.tranformaParaData("01/01/1900"));
            p.setStatus(false);
            p.setDataPromessa(null);
            p.setSequencial(1);
            parcelas.add(p);
            p = new Parcela();
        }
    }

    public Parcela VendaVista(String valor, long idvenda) {
        Parcela p = new Parcela();
        p.setNumero(1);
        p.setValorOriginal(valor);
        p.setValorJuros("0.00");
        p.setValorQuitacao(valor);
        Date data = new Date(System.currentTimeMillis());
        String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(data);
        p.setDataVencimento(FormataData.tranformaParaData(dataFormatada));
        p.setDataQuitacao(FormataData.tranformaParaData(dataFormatada));
        p.setStatus(true);
        p.setIdvenda(idvenda);
        p.setDataPromessa(null);
        p.setSequencial(1);
        return p;
    }

    public String[] gerarDataVencimento(Data data, int QtdVezes) {// metodo responsalvel por criar as datas de vencimento
        String s = data.toString();
        String v[] = s.split("/");
        int dia = Integer.parseInt(v[0]);
        int mes = Integer.parseInt(v[1]);
        int ano = Integer.parseInt(v[2]);
        int auxD = dia;
        auxDataString = new String[QtdVezes];
        for (int i = 0; i < QtdVezes; i++) {
            if (mes == 2 && auxD > 28) {
                auxD = 28;
                mes = 2;
            } else if (mes == 4 && auxD > 30) {
                auxD = 30;
                mes = 4;
            } else if (mes == 6 && auxD > 30) {
                auxD = 30;
                mes = 6;
            } else if (mes == 9 && auxD > 30) {
                auxD = 30;
                mes = 9;
            } else if (mes == 11 && auxD > 30) {
                auxD = 30;
                mes = 11;
            }

            data.definirMes(mes);
            data.definirDia(auxD);
            data.definirMes(mes);
            data.definirAno(ano);

            auxDataString[i] = data.toString();
            mes = mes + 1;
            auxD = dia;

            if (mes > 12) {
                mes = 1;
                ano = ano + 1;
            }

        }

        return auxDataString;
    }

    public void buscarParcelasPorId(long[] id) { // Busca a parcela com os IDs informado no vetor
        parcelasAux = new ArrayList<>();
        for (int i = 0; i < id.length; i++) {
            Parcela par = new Parcela();
            try {
                PreparedStatement instrucao;
                instrucao = DlgLogin.conexao.prepareStatement("select * from parcela where idparcela = ?");
                SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

                instrucao.setLong(1, id[i]);
                ResultSet rs = instrucao.executeQuery();
                while (rs.next()) {
                    par.setIdparcela(rs.getLong("idparcela"));
                    par.setNumero(rs.getLong("numero"));
                    par.setValorOriginal(rs.getString("valor_original"));
                    par.setValorJuros(rs.getString("valor_juros"));
                    par.setValorQuitacao(rs.getString("valor_quitacao"));
                    par.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                    par.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                    par.setStatus(rs.getBoolean("status"));
                    par.setIdvenda(rs.getLong("idvenda"));
                    if (rs.getDate("data_promessa") != null) {
                        par.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                    } else {
                        par.setDataPromessa(null);
                    }
                    par.setSequencial(rs.getLong("sequencial"));
                    parcelasAux.add(par);
                    par = new Parcela();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ControlaParcela: buscarParcelaPorId");
            }
        }
    }

    public void geraParcelaSequencial(long idvenda, long numero, long sequencial, Data vencimento, String valor) {

        Parcela p = new Parcela();
        Data d = new Data();

        parcelas = new ArrayList<>();
        p.setIdvenda(idvenda);// id do serviço
        p.setNumero(numero);	// numero da parcela
        p.setSequencial(sequencial);
        p.setDataVencimento((vencimento));
        p.setValorOriginal(valor);
        p.setValorJuros("0.00");
        p.setValorQuitacao("0.00");
        p.setDataQuitacao(FormataData.tranformaParaData("01/01/1900"));
        p.setStatus(false);
        p.setDataPromessa(null);
        parcelas.add(p);
        incluiParcelaBanco(p);
        p = new Parcela();

    }

    public ArrayList<Parcela> buscaTodasParcelasVenda(long idvenda) {
        ArrayList<Parcela> auxPar = new ArrayList<>();
        Parcela p = new Parcela();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from parcela where idvenda = ?");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

            instrucao.setLong(1, idvenda);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                p.setIdparcela(rs.getLong("idparcela"));
                p.setNumero(rs.getLong("numero"));
                p.setValorOriginal(rs.getString("valor_original"));
                p.setValorJuros(rs.getString("valor_juros"));
                p.setValorQuitacao(rs.getString("valor_quitacao"));
                p.setDataVencimento(FormataData.tranformaDateEmData(rs.getDate("data_vencimento")));
                p.setDataQuitacao(FormataData.tranformaDateEmData(rs.getDate("data_quitacao")));
                p.setStatus(rs.getBoolean("status"));
                p.setIdvenda(rs.getLong("idvenda"));
                if (rs.getDate("data_promessa") != null) {
                    p.setDataPromessa(FormataData.tranformaDateEmData(rs.getDate("data_promessa")));
                } else {
                    p.setDataPromessa(null);
                }
                p.setSequencial(rs.getLong("sequencial"));
                auxPar.add(p);
                p = new Parcela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarParcelaPorId");
        }

        return auxPar;
    }

    public boolean verificaParcelasAnteriores(long idvenda, long numeroParcela) {
        boolean valida = true;
        for (int i = 0; i < buscaTodasParcelasVenda(idvenda).size(); i++) {
            if (buscaTodasParcelasVenda(idvenda).get(i).getNumero() < numeroParcela && !buscaTodasParcelasVenda(idvenda).get(i).isStatus()) {
                valida = false;
            }

        }
        return valida;
    }

    public boolean buscarParcelaPorIdCliente(long id) { // Busca a parcela com ID do cliente
        boolean podeInativar = true;
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select parcela.status from parcela, venda, cliente where cliente.idcliente = ? and venda.idcliente= cliente.idcliente and parcela.idvenda=venda.idvenda");
            instrucao.setLong(1, id);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                if (rs.getBoolean("status") != true) {
                    podeInativar = false;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaParcela: buscarParcelaPorId");
        }
        return podeInativar;
    }

}
