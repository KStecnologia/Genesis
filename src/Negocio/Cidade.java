package Negocio;
public class Cidade {
    private long idCidade;
    private String nome;
    private String cep;
    private String codigoIbge;
    private boolean status;
    private long uf;

    public long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getUf() {
        return uf;
    }

    public void setUf(long uf) {
        this.uf = uf;
    }
    
}
