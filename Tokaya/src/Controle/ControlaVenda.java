package Controle;

import Grafico.DlgLogin;
import Negocio.Venda;
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

public class ControlaVenda {
        
    public static ArrayList <Venda> vendas;

    public ControlaVenda() {
        vendas = new ArrayList<>();
    }
    
    public boolean cadastraVenda(Venda v){
        return vendas.add(v);
    }
    
    public static ArrayList <Venda> consultarVenda(){
        return vendas;
    }
    
    public void incluirVendaBanco (Venda auxVen){// Faz o inclusão de um cliente no Banco
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("insert into venda values(default,?,?,?,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            
            java.sql.Date data = new java.sql.Date(date.parse(auxVen.getData().toString()).getTime());
            
                instrucao.setString(1, auxVen.getDescricao());
                instrucao.setDate(2, data);
                instrucao.setString(3, auxVen.getValorTotal());
                instrucao.setString(4, auxVen.getValorEntrada());
                instrucao.setString(5, auxVen.getOperacao());
                instrucao.setLong(6, auxVen.getIdCliente());
                instrucao.setString(7, auxVen.getStatus());
                
                instrucao.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ControlaVenda: incluirVendaBanco");
        }
    }
    
    public void buscarVendasDoBanco(Data dataInicio, Data dataFim, String valorMaior, Long idCliente, String status){ // Busca todas vendas pela data, valor e cliente informado
        vendas = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from venda where ? <= data and ? >= data and valor_total >= ? and idcliente = ? and status = ?");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

            java.sql.Date data_Inicio = new java.sql.Date(date.parse(dataInicio.toString()).getTime());
            java.sql.Date data_Fim = new java.sql.Date(date.parse(dataFim.toString()).getTime());
            
            instrucao.setDate(1,data_Inicio);
            instrucao.setDate(2,data_Fim);
            instrucao.setString(3, valorMaior);
            instrucao.setLong(4, idCliente);
            instrucao.setString(5, status);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Venda v = new Venda();
                
                v.setIdVenda(rs.getLong("idvenda"));
                v.setDescricao(rs.getString("descricao"));
                v.setData(FormataData.tranformaDateEmData(rs.getDate("data")));
                v.setValorTotal(rs.getString("valor_total"));
                v.setValorEntrada(rs.getString("valor_entrada"));
                v.setOperacao(rs.getString("operacao"));
                v.setIdCliente(rs.getLong("idcliente"));
                v.setStatus(rs.getString("status"));
                vendas.add(v);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaVenda: buscarVendasDoBanco");
        }
    }
    
    public void buscarVendasDoBanco(Data dataInicio, Data dataFim, String valorMaior, String status){ // Busca todas vendas pela data, valor e cliente informado
        vendas = new ArrayList<>();
        try {
            PreparedStatement instrucao;
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data_Inicio = new java.sql.Date(date.parse(dataInicio.toString()).getTime());
            java.sql.Date data_Fim = new java.sql.Date(date.parse(dataFim.toString()).getTime());
            if (status.equalsIgnoreCase("Ambos")) {
                instrucao = DlgLogin.conexao.prepareStatement("select * from venda where ? <= data and ? >= data and valor_total >= ?");
                instrucao.setDate(1,data_Inicio);
                instrucao.setDate(2,data_Fim);
                instrucao.setString(3, valorMaior);
            }else{
                instrucao = DlgLogin.conexao.prepareStatement("select * from venda where ? <= data and ? >= data and valor_total >= ? and status = ?");
                instrucao.setDate(1,data_Inicio);
                instrucao.setDate(2,data_Fim);
                instrucao.setString(3, valorMaior);
                instrucao.setString(4, status);
            }
            
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                Venda v = new Venda();
                
                v.setIdVenda(rs.getLong("idvenda"));
                v.setDescricao(rs.getString("descricao"));
                v.setData(FormataData.tranformaDateEmData(rs.getDate("data")));
                v.setValorTotal(rs.getString("valor_total"));
                v.setValorEntrada(rs.getString("valor_entrada"));
                v.setOperacao(rs.getString("operacao"));
                v.setIdCliente(rs.getLong("idcliente"));
                v.setStatus(rs.getString("status"));
                vendas.add(v);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaVenda: buscarVendasDoBanco");
        }
    }
    
    public static Venda buscarVendaPorId(long i){ //Busca a venda pelo seu ID
        Venda ven = new Venda();
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from venda where idvenda = ?");
            instrucao.setLong(1, i);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                ven.setIdVenda(rs.getLong("idvenda"));
                ven.setDescricao(rs.getString("descricao"));
                ven.setData(FormataData.tranformaDateEmData(rs.getDate("data")));
                ven.setValorTotal(rs.getString("valor_total"));
                ven.setValorEntrada(rs.getString("valor_entrada"));
                ven.setOperacao(rs.getString("operacao"));
                ven.setIdCliente(rs.getLong("idcliente"));
                ven.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaVenda: buscarVendaPorId");
        }
        return ven;
    }
    
    public void atualizaVendaBanco (Venda novo, Venda antigo) throws ParseException{
        try {
            PreparedStatement instrucao;
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data = new java.sql.Date(date.parse(novo.getData().toString()).getTime());

            instrucao = DlgLogin.conexao.prepareStatement("update venda set descricao = ?, valor_total = ?, valor_entrada = ?, operacao = ?, idcliente = ?, status = ? where idvenda = ?");
            
            instrucao.setString(1, novo.getDescricao());
            instrucao.setString(2, novo.getValorTotal());
            instrucao.setString(3, novo.getValorEntrada());
            instrucao.setString(4, novo.getOperacao());
            instrucao.setLong(5, novo.getIdCliente());
            instrucao.setString(6, novo.getStatus());
            instrucao.setLong(7, antigo.getIdVenda());

            instrucao.executeUpdate();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "ControlaVenda: atualizaVendaBanco");
      }
    }
    
    public long buscarUltimaVenda(){ //Busca a ultima venda do banco
        long id = 0;
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from venda where idvenda = (select max(idvenda) from venda)");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                id = rs.getLong("idvenda");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ControlaVenda: buscarUltimaVenda");
        }
        return id;
    }
    
    public void cancelaVenda(Long id){//Cancela a venda, mudando seu satus para Inativo
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("update venda set status = ? where idvenda = ?");
            instrucao.setString(1, "Inativo");
            instrucao.setLong(2, id);
            instrucao.executeUpdate();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "ControlaVenda: cancelaVenda");
        }
    }
}
