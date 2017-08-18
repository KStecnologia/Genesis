package Negocio;
public class FormaPagamento {
    private long idFormaPagamento; //código identificador da Forma de pagamento
    private String descricao; //descrição da forma de pagamento
    private boolean status; //Ativa ou inativo
    
    public long getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public void setIdFormaPagamento(long idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
