package Negocio;

public class VendaXFormaPagamento {
    private long idVenda; //código identificador da venda
    private long idFormaPamento; //código identificador da forma de pagamento
    private String valor; //valor pago apenas com aquela Forma de pagamento para aquela venda

    public long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(long idVenda) {
        this.idVenda = idVenda;
    }

    public long getIdFormaPamento() {
        return idFormaPamento;
    }

    public void setIdFormaPamento(long idFormaPamento) {
        this.idFormaPamento = idFormaPamento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
