package DAO;

import Negocio.Cidade;
import Grafico.DlgConfBanco;
import Grafico.DlgLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CidadeDAO {
    DlgConfBanco dlgCB = new DlgConfBanco();

    public CidadeDAO() {
    }
        
    public ArrayList<Cidade> buscaTodasCidades(){ //Busca todas cidades cadastradas no banco
        ArrayList<Cidade> cidades = new ArrayList<Cidade>();
        Cidade cidade = new Cidade();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from cidade");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                cidade = new Cidade();
                cidade.setIdCidade(rs.getLong("idcidade"));
                cidade.setNome(rs.getString("nome"));
                cidade.setCep(rs.getString("cep"));
                cidade.setCodigoIbge(rs.getString("codigo_ibge"));
                cidade.setStatus(rs.getBoolean("status"));
                cidade.setUf(rs.getLong("iduf"));
                
                cidades.add(cidade);
            }
            return cidades;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaTodasCidades\n"+e.getMessage());
            return cidades;
        }
    }
    
    public ArrayList<Cidade> buscaCidadesPorUf(String nome){ //Busca todas cidades de um determinado estado
        ArrayList<Cidade> cidades = new ArrayList<Cidade>();
        Cidade cidade = new Cidade();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from cidade, uf where cidade.iduf = uf.iduf and uf.nome = ?");
            instrucao.setString(1, nome);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                cidade = new Cidade();
                cidade.setIdCidade(rs.getLong("idcidade"));
                cidade.setNome(rs.getString("nome"));
                cidade.setCep(rs.getString("cep"));
                cidade.setCodigoIbge(rs.getString("codigo_ibge"));
                cidade.setStatus(rs.getBoolean("status"));
                cidade.setUf(rs.getLong("iduf"));
                
                cidades.add(cidade);
            }
            return cidades;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaCidadesPorUf\n"+e.getMessage());
            return cidades;
        }
    }
    
    public Cidade buscaCidadePorNome(String nome){ //Busca cidade pelo nome dela
        Cidade cidade = new Cidade();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from cidade where nome = ?");
            instrucao.setString(1, nome);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                cidade = new Cidade();
                cidade.setIdCidade(rs.getLong("idcidade"));
                cidade.setNome(rs.getString("nome"));
                cidade.setCep(rs.getString("cep"));
                cidade.setCodigoIbge(rs.getString("codigo_ibge"));
                cidade.setStatus(rs.getBoolean("status"));
                cidade.setUf(rs.getLong("iduf"));
            }
            return cidade;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaCidadePorNome\n"+e.getMessage());
            return cidade;
        }
    }
    
    public Cidade buscaCidadePorId(long id){ //Busca cidade pelo id recebido
        Cidade cidade = new Cidade();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from cidade where idcidade = ?");
            instrucao.setLong(1, id);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                cidade = new Cidade();
                cidade.setIdCidade(rs.getLong("idcidade"));
                cidade.setNome(rs.getString("nome"));
                cidade.setCep(rs.getString("cep"));
                cidade.setCodigoIbge(rs.getString("codigo_ibge"));
                cidade.setStatus(rs.getBoolean("status"));
                cidade.setUf(rs.getLong("iduf"));
            }
            return cidade;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaCidadePorId\n"+e.getMessage());
            return cidade;
        }
    }
}
