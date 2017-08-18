package Controle;

import Grafico.DlgLogin;
import Negocio.Cliente;
import Negocio.Parcela;
import Utilitario.FormataData;
import caroco.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControlaCliente {
        
    public static ArrayList <Cliente> clientes;

    public ControlaCliente() {
        clientes = new ArrayList<>();
    }
    
    public boolean cadastraCliente(Cliente c){
        return clientes.add(c);
    }
    
    public static ArrayList <Cliente> consultarCliente(){
        return clientes;
    }
    
    public void incluirClienteBanco (Cliente auxCli){// Faz o inclusão de um cliente no Banco
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("insert into cliente values(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            
            java.sql.Date data_nascimento = new java.sql.Date(date.parse(auxCli.getDataNascimento().toString()).getTime());
            java.sql.Date data_atualizacao = new java.sql.Date(date.parse(auxCli.getDataAtualizacao().toString()).getTime());
            
                instrucao.setString(1, auxCli.getNome());
                instrucao.setString(2, auxCli.getCpfCnpj());
                instrucao.setString(3, auxCli.getRgIe());
                instrucao.setDate(4, data_nascimento);
                instrucao.setString(5, auxCli.getRenda());
                instrucao.setString(6, auxCli.getTelefone());
                instrucao.setString(7, auxCli.getCelular());
                instrucao.setString(8, auxCli.getEndereco());
                instrucao.setString(9, auxCli.getCidade());
                instrucao.setDate(10, data_atualizacao);
                instrucao.setString(11, "0");
                instrucao.setString(12, "0");
                instrucao.setString(13, "0");
                instrucao.setString(14, "0");
                instrucao.setString(15, auxCli.getLocalTrabalho());
                instrucao.setString(16, auxCli.getFuncaoTrabalho());
                instrucao.setString(17, auxCli.getNomeReferencia());
                instrucao.setString(18, auxCli.getTelefoneReferencia());
                instrucao.setString(19, auxCli.getCasaPropria());
                instrucao.setString(20, auxCli.getPessoaAutorizada());
                instrucao.setBoolean(21, auxCli.isStatus());
                instrucao.executeUpdate();
                } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
    }
    
    public void buscarClientesDoBanco(String nome, String cpfCnpj, String cidade, boolean status){ // Busca todos clientes com o nome informado
        clientes = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from cliente where nome like ? and cpf_cnpj like ? and cidade like ? and status=? order by nome");
            instrucao.setString(1, '%'+nome+'%');
            instrucao.setString(2, '%'+cpfCnpj+'%');
            instrucao.setString(3, '%'+cidade+'%');
            instrucao.setBoolean(4, status);
            
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setIdcliente(rs.getLong("idcliente"));
                cli.setNome(rs.getString("nome"));
                cli.setCpfCnpj(rs.getString("cpf_cnpj"));
                cli.setRgIe(rs.getString("rg_ie"));
                cli.setDataNascimento(FormataData.tranformaDateEmData(rs.getDate("data_nascimento")));
                cli.setRenda(rs.getString("renda"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCelular(rs.getString("celular"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setCidade(rs.getString("cidade"));
                cli.setDataAtualizacao(FormataData.tranformaDateEmData(rs.getDate("data_atualizacao")));
                cli.setMda(rs.getString("mda"));
                cli.setMa(rs.getString("ma"));
                cli.setNumeroQuitacoes(rs.getString("numero_quitacoes"));
                cli.setTodosAtrasos(rs.getString("todos_atrasos"));
                cli.setLocalTrabalho(rs.getString("local_trabalho"));
                cli.setFuncaoTrabalho(rs.getString("funcao_trabalho"));
                cli.setNomeReferencia(rs.getString("nome_referencia"));
                cli.setTelefoneReferencia(rs.getString("telefone_referencia"));
                cli.setCasaPropria(rs.getString("casa_propria"));
                cli.setPessoaAutorizada(rs.getString("pessoa_autorizada"));
                cli.setStatus(rs.getBoolean("status"));
                clientes.add(cli);
           }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
        
    public  Cliente buscarClientePorId(long i){ //Busca o cliente pelo seu ID
        Cliente cli = new Cliente();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from cliente where idcliente = ?");
            instrucao.setLong(1, i);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                cli.setIdcliente(rs.getLong("idcliente"));
                cli.setNome(rs.getString("nome"));
                cli.setCpfCnpj(rs.getString("cpf_cnpj"));
                cli.setRgIe(rs.getString("rg_ie"));
                cli.setDataNascimento(FormataData.tranformaDateEmData(rs.getDate("data_nascimento")));
                cli.setRenda(rs.getString("renda"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCelular(rs.getString("celular"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setCidade(rs.getString("cidade"));
                cli.setDataAtualizacao(FormataData.tranformaDateEmData(rs.getDate("data_atualizacao")));
                cli.setMda(rs.getString("mda"));
                cli.setMa(rs.getString("ma"));
                cli.setNumeroQuitacoes(rs.getString("numero_quitacoes"));
                cli.setTodosAtrasos(rs.getString("todos_atrasos"));
                cli.setLocalTrabalho(rs.getString("local_trabalho"));
                cli.setFuncaoTrabalho(rs.getString("funcao_trabalho"));
                cli.setNomeReferencia(rs.getString("nome_referencia"));
                cli.setTelefoneReferencia(rs.getString("telefone_referencia"));
                cli.setCasaPropria(rs.getString("casa_propria"));
                cli.setPessoaAutorizada(rs.getString("pessoa_autorizada"));
                cli.setStatus(rs.getBoolean("status"));
            }
        } catch (Exception e) {
            System.out.println("erro");
        }
        return cli;
    }
    
    public static ArrayList<Cliente> buscarAniversariantes(Data dataInicio, Data dataFim){ //Busca o cliente pelo seu ID
        Cliente cli = new Cliente();
        ArrayList<Cliente> vetCli = new ArrayList<>();
        int inicio = dataInicio.obterDiaNoAno();
        int fim = dataFim.obterDiaNoAno();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from cliente");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                cli = new Cliente();
                cli.setNome(rs.getString("nome"));
                cli.setDataNascimento(FormataData.tranformaDateEmData(rs.getDate("data_nascimento")));
                int aniversario = cli.getDataNascimento().obterDiaNoAno();

                if (inicio <= aniversario && aniversario <= fim) {
                    vetCli.add(cli);
                }
            }
        } catch (Exception e) {
            System.out.println("erro ao buscar aniversariantes");
        }
        return vetCli;
    }
    
    public void atualizaClienteBanco (Cliente novo, Cliente antigo) throws ParseException{
        try {
            PreparedStatement instrucao;
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            
            java.sql.Date data_nascimento = new java.sql.Date(date.parse(novo.getDataNascimento().toString()).getTime());
            java.sql.Date data_atualizacao = new java.sql.Date(date.parse(novo.getDataAtualizacao().toString()).getTime());
            instrucao = DlgLogin.conexao.prepareStatement("update cliente set nome = ?, cpf_cnpj = ?, rg_ie = ?, data_nascimento = ?, renda = ?, telefone = ?, celular = ?, endereco = ?, cidade = ?, data_atualizacao = ?, local_trabalho = ?, funcao_trabalho = ?, nome_referencia = ?, telefone_referencia = ?, casa_propria = ?, pessoa_autorizada = ?, status = ? where idcliente = ?");
            instrucao.setString(1, novo.getNome());
            instrucao.setString(2, novo.getCpfCnpj());
            instrucao.setString(3, novo.getRgIe());
            instrucao.setDate(4, data_nascimento);
            instrucao.setString(5, novo.getRenda());
            instrucao.setString(6, novo.getTelefone());
            instrucao.setString(7, novo.getCelular());
            instrucao.setString(8, novo.getEndereco());
            instrucao.setString(9, novo.getCidade());
            instrucao.setDate(10, data_atualizacao);
            instrucao.setString(11, novo.getLocalTrabalho());
            instrucao.setString(12, novo.getFuncaoTrabalho());
            instrucao.setString(13, novo.getNomeReferencia());
            instrucao.setString(14, novo.getTelefoneReferencia());
            instrucao.setString(15, novo.getCasaPropria());
            instrucao.setString(16, novo.getPessoaAutorizada());
            instrucao.setBoolean(17, novo.isStatus());
            instrucao.setLong(18, antigo.getIdcliente());
            instrucao.executeUpdate();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
      }
    }

    public void atualizaMaCliente (Cliente cli, int diasAtrasados) {
        try {
            PreparedStatement instrucao;
            int ma = Integer.parseInt(cli.getMa());
            if (diasAtrasados >= ma) {//Ve se a parcela é a mais atrasada
                ma = diasAtrasados;
            }

            instrucao = DlgLogin.conexao.prepareStatement("update cliente set ma = ? where idcliente = ?");
            instrucao.setString(1, ma+"");
            instrucao.setLong(2, cli.getIdcliente());
            instrucao.executeUpdate();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
      }
    }
    
    public void atualizaMdaCliente (Cliente cli) {// Atualiza MDA da tela de Quitacao
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("update cliente set mda = ? where idcliente = ?");
            int mda = calculaMda(Integer.parseInt(cli.getNumeroQuitacoes()),Integer.parseInt(cli.getTodosAtrasos()));
            instrucao.setString(1, mda+"");
            instrucao.setLong(2, cli.getIdcliente());
            instrucao.executeUpdate();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
      }
    }
    
    public void aumentarQuitacoes(Cliente cli){
        try {
            int num = Integer.parseInt(cli.getNumeroQuitacoes());
            num++;
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("update cliente set numero_quitacoes = ? where idcliente = ?");
            instrucao.setString(1, num+"");
            instrucao.setLong(2, cli.getIdcliente());
            instrucao.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
    }
    
    public void diminuirQuitacoes(Cliente cli){
        try {
            int num = Integer.parseInt(cli.getNumeroQuitacoes());
            num--;
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("update cliente set numero_quitacoes = ? where idcliente = ?");
            instrucao.setString(1, num+"");
            instrucao.setLong(2, cli.getIdcliente());
            instrucao.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
    }
    
    public void aumentarTotalAtraso(Cliente cli, int atraso){
        try {
            int total = Integer.parseInt(cli.getTodosAtrasos());
            total += atraso;
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("update cliente set todos_atrasos = ? where idcliente = ?");
            instrucao.setString(1, total+"");
            instrucao.setLong(2, cli.getIdcliente());
            instrucao.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
    }
    
    public void diminuirTotalAtraso(Cliente cli, int atraso){
        try {
            int total = Integer.parseInt(cli.getTodosAtrasos());
            total -= atraso;
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("update cliente set todos_atrasos = ? where idcliente = ?");
            instrucao.setString(1, total+"");
            instrucao.setLong(2, cli.getIdcliente());
            instrucao.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
    }
    
    public int calculaMda(int quantidadeQuitacao, int totalDiasAtraso){
        int mda = 0;
        if (totalDiasAtraso > 0) {
            mda = totalDiasAtraso/quantidadeQuitacao;
        }
        return mda;
    }
    
}
