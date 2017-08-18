package Controle;

import Grafico.DlgLogin;
import Negocio.Configuracao;
import caroco.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlaConfiguracao {
    public static Configuracao configuracao;
    
    public ControlaConfiguracao() {
        configuracao = new Configuracao();
    }
    
    public void incluiConfiguracaoBanco (Configuracao auxConf){// Faz o inclusão de uma configuracao no Banco
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("insert into configuracao values(default,?,?,?,?,?,?)");
                
                instrucao.setString(1, auxConf.getJurosDiario());
                instrucao.setString(2, auxConf.getJurosFixo());
                instrucao.setString(3, auxConf.getTempoAtualizacao());
                instrucao.setString(4, auxConf.getJurosAposDias());
                instrucao.setString(5, auxConf.getJurosParcela());
                instrucao.setString(6, auxConf.getJurosQuantidadeParcela());
                instrucao.executeUpdate();
                
                } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
    }
    
    public void atualizaConfiguracaoBanco (Configuracao auxConf){
        try {
           PreparedStatement instrucao;
           instrucao = DlgLogin.conexao.prepareStatement("update configuracao set juros_diario = ?, juros_fixo = ?, tempo_atualizacao =?, juros_apos_dias = ?, juros_parcela = ?, juros_quantidade_parcela = ? where idconfiguracao = 1");
           instrucao.setString(1, auxConf.getJurosDiario());
           instrucao.setString(2, auxConf.getJurosFixo());
           instrucao.setString(3, auxConf.getTempoAtualizacao());
           instrucao.setString(4, auxConf.getJurosAposDias());
           instrucao.setString(5, auxConf.getJurosParcela());
           instrucao.setString(6, auxConf.getJurosQuantidadeParcela());
           instrucao.executeUpdate();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
      }
    }
    
    public void carregaConfiguracaoDoBanco (){
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from configuracao");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                configuracao.setIdconfiguracao(rs.getLong("idconfiguracao"));
                configuracao.setJurosDiario(rs.getString("juros_diario"));
                configuracao.setJurosFixo(rs.getString("juros_fixo"));
                configuracao.setTempoAtualizacao(rs.getString("tempo_atualizacao"));
                configuracao.setJurosAposDias(rs.getString("juros_apos_dias"));
                configuracao.setJurosParcela(rs.getString("juros_parcela"));
                configuracao.setJurosQuantidadeParcela(rs.getString("juros_quantidade_parcela"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
    }
    
    public String buscaTempoAtualizao(){
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from configuracao");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                configuracao.setIdconfiguracao(rs.getLong("idconfiguracao"));
                configuracao.setJurosDiario(rs.getString("juros_diario"));
                configuracao.setJurosFixo(rs.getString("juros_fixo"));
                configuracao.setTempoAtualizacao(rs.getString("tempo_atualizacao"));
                configuracao.setJurosAposDias(rs.getString("juros_apos_dias"));
                configuracao.setJurosParcela(rs.getString("juros_parcela"));
                configuracao.setJurosQuantidadeParcela(rs.getString("juros_quantidade_parcela"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
        return configuracao.getTempoAtualizacao();
    }
    
    public String buscaJurosDiario(){
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from configuracao");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                configuracao.setIdconfiguracao(rs.getLong("idconfiguracao"));
                configuracao.setJurosDiario(rs.getString("juros_diario"));
                configuracao.setJurosFixo(rs.getString("juros_fixo"));
                configuracao.setTempoAtualizacao(rs.getString("tempo_atualizacao"));
                configuracao.setJurosAposDias(rs.getString("juros_apos_dias"));
                configuracao.setJurosParcela(rs.getString("juros_parcela"));
                configuracao.setJurosQuantidadeParcela(rs.getString("juros_quantidade_parcela"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
        return configuracao.getJurosDiario();
    }
    
    public String buscaJurosFixo(){
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from configuracao");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                configuracao.setIdconfiguracao(rs.getLong("idconfiguracao"));
                configuracao.setJurosDiario(rs.getString("juros_diario"));
                configuracao.setJurosFixo(rs.getString("juros_fixo"));
                configuracao.setTempoAtualizacao(rs.getString("tempo_atualizacao"));
                configuracao.setJurosAposDias(rs.getString("juros_apos_dias"));
                configuracao.setJurosParcela(rs.getString("juros_parcela"));
                configuracao.setJurosQuantidadeParcela(rs.getString("juros_quantidade_parcela"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
        return configuracao.getJurosFixo();
    }
    
     public static Configuracao buscaConfiguracao(){
        try {
            PreparedStatement instrucao;
            instrucao = DlgLogin.conexao.prepareStatement("select * from configuracao");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                configuracao.setIdconfiguracao(rs.getLong("idconfiguracao"));
                configuracao.setJurosDiario(rs.getString("juros_diario"));
                configuracao.setJurosFixo(rs.getString("juros_fixo"));
                configuracao.setTempoAtualizacao(rs.getString("tempo_atualizacao"));
                configuracao.setJurosAposDias(rs.getString("juros_apos_dias"));
                configuracao.setJurosParcela(rs.getString("juros_parcela"));
                configuracao.setJurosQuantidadeParcela(rs.getString("juros_quantidade_parcela"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL:"+e.getMessage());
        }
        return configuracao;
    }
}