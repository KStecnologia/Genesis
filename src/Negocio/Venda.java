package Negocio;

import javafx.scene.chart.PieChart.Data;

public class Venda {
    private long idVenda; //código identificador da venda
    private String descricao; //descrição da venda
    private Data data; //data da venda
    private Data hora; //hora da venda
    private String valorTotal; //valor total da venda
    private String valorEntrada; //valor da entrada
    private String operacao; //A vista ou A prazo
    private long idCliente; //código identificador do cliente

    public long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(long idVenda) {
        this.idVenda = idVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getHora() {
        return hora;
    }

    public void setHora(Data hora) {
        this.hora = hora;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(String valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
    
}
