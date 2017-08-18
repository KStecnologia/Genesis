package Negocio;

import caroco.Data;

public class Cliente {
    long idcliente;
    String nome;
    String cpfCnpj;
    String rgIe;
    Data dataNascimento;
    String renda;
    String telefone;
    String celular;
    String endereco;

   
    String cidade;
    Data dataAtualizacao;
    String mda;
    String ma;
    String numeroQuitacoes;
    String todosAtrasos;
    String localTrabalho;
    String funcaoTrabalho;
    String nomeReferencia;
    String telefoneReferencia;
    String casaPropria;
    String pessoaAutorizada;
     boolean status;
    
    public long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(long idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Data getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Data dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getMda() {
        return mda;
    }

    public void setMda(String mda) {
        this.mda = mda;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNumeroQuitacoes() {
        return numeroQuitacoes;
    }

    public void setNumeroQuitacoes(String numeroQuitacoes) {
        this.numeroQuitacoes = numeroQuitacoes;
    }

    public String getTodosAtrasos() {
        return todosAtrasos;
    }

    public void setTodosAtrasos(String todosAtrasos) {
        this.todosAtrasos = todosAtrasos;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getFuncaoTrabalho() {
        return funcaoTrabalho;
    }

    public void setFuncaoTrabalho(String funcaoTrabalho) {
        this.funcaoTrabalho = funcaoTrabalho;
    }

    public String getNomeReferencia() {
        return nomeReferencia;
    }

    public void setNomeReferencia(String nomeReferencia) {
        this.nomeReferencia = nomeReferencia;
    }

    public String getTelefoneReferencia() {
        return telefoneReferencia;
    }

    public void setTelefoneReferencia(String telefoneReferencia) {
        this.telefoneReferencia = telefoneReferencia;
    }

    public String getCasaPropria() {
        return casaPropria;
    }

    public void setCasaPropria(String casaPropria) {
        this.casaPropria = casaPropria;
    }

    public String getPessoaAutorizada() {
        return pessoaAutorizada;
    }

    public void setPessoaAutorizada(String pessoaAutorizada) {
        this.pessoaAutorizada = pessoaAutorizada;
    }
     public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
