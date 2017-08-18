package DAO;

import Negocio.Uf;
import Grafico.DlgConfBanco;
import Grafico.DlgLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UfDAO {
    DlgConfBanco dlgCB = new DlgConfBanco();

    public UfDAO() {
    }
        
    public ArrayList<Uf> buscaTodasUfs(){ //Busca todas UFs cadastradas no banco
        ArrayList<Uf> ufs = new ArrayList<Uf>();
        Uf uf = new Uf();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from uf");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                uf = new Uf();
                uf.setIdUf(rs.getLong("iduf"));
                uf.setNome(rs.getString("nome"));
                uf.setSigla(rs.getString("sigla"));
                uf.setStatus(rs.getBoolean("status"));
                ufs.add(uf);
            }
            return ufs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaTodasUfs\n"+e.getMessage());
            return ufs;
        }
    }
    
    public Uf buscaUfporId(long id){ //Busca a Uf com id recebi
        Uf uf = new Uf();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from uf where iduf = ?");
            instrucao.setLong(1, id);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                uf = new Uf();
                uf.setIdUf(rs.getLong("iduf"));
                uf.setNome(rs.getString("nome"));
                uf.setSigla(rs.getString("sigla"));
                uf.setStatus(rs.getBoolean("status"));
            }
            return uf;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaUfporId\n"+e.getMessage());
            return uf;
        }
    }
}
