package Negocio;
public class Uf {
    private long idUf; //código identificador do estado
    private String nome; //descrição do nome do estado
    private String sigla; //abreviatura do estado
    private boolean status; //Ativo ou inativo

    public long getIdUf() {
        return idUf;
    }

    public void setIdUf(long idUf) {
        this.idUf = idUf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
