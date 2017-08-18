package Negocio;

import caroco.Data;

public class Venda {
    long idVenda;
    String descricao;
    Data data;
    String valorTotal;
    String valorEntrada;
    String operacao;
    long idCliente;
    String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
