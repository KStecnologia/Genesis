package Negocio;
import caroco.Data;
public class Parcela {
    long idparcela;
    long numero;
    String valorOriginal;
    String valorJuros;
    String valorQuitacao;
    Data dataVencimento;
    Data dataQuitacao;
    boolean status;
    long idvenda;
    Data dataPromessa;
    long sequencial;

    public long getSequencial() {
        return sequencial;
    }

    public void setSequencial(long sequencial) {
        this.sequencial = sequencial;
    }

    public long getIdparcela() {
        return idparcela;
    }

    public void setIdparcela(long idparcela) {
        this.idparcela = idparcela;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(String valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public String getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(String valorJuros) {
        this.valorJuros = valorJuros;
    }

    public String getValorQuitacao() {
        return valorQuitacao;
    }

    public void setValorQuitacao(String valorQuitacao) {
        this.valorQuitacao = valorQuitacao;
    }

    public Data getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Data dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Data getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(Data dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(long idvenda) {
        this.idvenda = idvenda;
    }

    public Data getDataPromessa() {
        return dataPromessa;
    }

    public void setDataPromessa(Data dataPromessa) {
        this.dataPromessa = dataPromessa;
    }
}
