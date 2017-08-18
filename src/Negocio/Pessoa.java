package Negocio;

import caroco.Data;

public class Pessoa {
    private long idPessoa; //identificador da pessoa (gerado pelo banco)
    private String codigo; //Código facultativo para pessoa (gerado pelo usuario)
    private String tipo; //Fisica ou juridica
    private String nome; //Nome da pessoa ou razão social da empresa
    private String apelido; //Apelido da pessoa ou nome fantasia da empresa
    private String cpfCnpj; //CPF ou CNPJ
    private String rgIe; //RG ou Inscrição estadual
    private String inscricaoMunicipal; //Inscrição municipal
    private String telefoneFixo;
    private String telefoneCelular;
    private String estadoCivil;
    private String email;
    private String emailCobranca;
    private Data dataNascimento;
    private String logradouro;
    private String complementoEndereco;
    private String numeroEndereco;
    private String bairro;
    private String cepLogradouro;
    private String sexo;
    private String mda; //Média de dias de atraso
    private String ma; //Maior numero dias de atraso
    private String numeroQuitacao; //Numero de parcelas pagas
    private String todosAtrasos;
    private String localTrabalho;
    private String funcaoTrabalho;
    private String renda; //Renda mensal
    private String limite; //Valor limite para compra com faturas em aberto
    private String nomeReferencia; //Nome de uma pessoa referencia
    private String telefoneReferencia; //Telefone da pessoa autorizada
    private String casaPropria; //tem ou não casa própria
    private String pessoaAutorizada; //Nome da pessoa autorizada a comprar na conta
    private String referenciaComercial;
    private String nomeMae;
    private String nomePai;
    
    private String observacao;
    
    private boolean orgaoPublico;
    private boolean fornecedor;
    private boolean funcionario;
    private boolean transportadora;
    private boolean cliente;
    private long InformacaoAdicional; //Tabela com variaveis adicionais daquela pessoa
    private Data dataAtualizacao; //Data da ultima atualização do cadastro
    private boolean status; //Ativo ou inativo
    
    private long Cidade;

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCobranca() {
        return emailCobranca;
    }

    public void setEmailCobranca(String emailCobranca) {
        this.emailCobranca = emailCobranca;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCepLogradouro() {
        return cepLogradouro;
    }

    public void setCepLogradouro(String cepLogradouro) {
        this.cepLogradouro = cepLogradouro;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getNumeroQuitacao() {
        return numeroQuitacao;
    }

    public void setNumeroQuitacao(String numeroQuitacao) {
        this.numeroQuitacao = numeroQuitacao;
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

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
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

    public String getReferenciaComercial() {
        return referenciaComercial;
    }

    public void setReferenciaComercial(String referenciaComercial) {
        this.referenciaComercial = referenciaComercial;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isOrgaoPublico() {
        return orgaoPublico;
    }

    public void setOrgaoPublico(boolean orgaoPublico) {
        this.orgaoPublico = orgaoPublico;
    }

    public boolean isFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    public boolean isTransportadora() {
        return transportadora;
    }

    public void setTransportadora(boolean transportadora) {
        this.transportadora = transportadora;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public long getInformacaoAdicional() {
        return InformacaoAdicional;
    }

    public void setInformacaoAdicional(long InformacaoAdicional) {
        this.InformacaoAdicional = InformacaoAdicional;
    }

    public Data getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Data dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getCidade() {
        return Cidade;
    }

    public void setCidade(long Cidade) {
        this.Cidade = Cidade;
    }

}