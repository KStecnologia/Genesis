package Negocio;

public class Configuracao {
    long idconfiguracao;
    String jurosDiario;
    String jurosFixo;
    String tempoAtualizacao;
    String jurosAposDias;
    String jurosParcela;
    String jurosQuantidadeParcela;

    public long getIdconfiguracao() {
        return idconfiguracao;
    }

    public void setIdconfiguracao(long idconfiguracao) {
        this.idconfiguracao = idconfiguracao;
    }

    public String getJurosDiario() {
        return jurosDiario;
    }

    public void setJurosDiario(String jurosDiario) {
        this.jurosDiario = jurosDiario;
    }

    public String getJurosFixo() {
        return jurosFixo;
    }

    public void setJurosFixo(String jurosFixo) {
        this.jurosFixo = jurosFixo;
    }

    public String getTempoAtualizacao() {
        return tempoAtualizacao;
    }

    public void setTempoAtualizacao(String tempoAtualizacao) {
        this.tempoAtualizacao = tempoAtualizacao;
    }

    public String getJurosAposDias() {
        return jurosAposDias;
    }

    public void setJurosAposDias(String jurosAposDias) {
        this.jurosAposDias = jurosAposDias;
    }

    public String getJurosParcela() {
        return jurosParcela;
    }

    public void setJurosParcela(String jurosParcela) {
        this.jurosParcela = jurosParcela;
    }

    public String getJurosQuantidadeParcela() {
        return jurosQuantidadeParcela;
    }

    public void setJurosQuantidadeParcela(String jurosQuantidadeParcela) {
        this.jurosQuantidadeParcela = jurosQuantidadeParcela;
    }

}
