package DAO;

import Negocio.Pessoa;
import Utilitario.FormataData;
import Utilitario.Funcoes;
import Grafico.DlgConfBanco;
import Grafico.DlgLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PessoaDAO {
    DlgConfBanco dlgCB = new DlgConfBanco();

    public PessoaDAO() {
    }
    
    public boolean cadastraPessoa(Pessoa pessoa){ // cadastra pessoa no banco
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("insert into pessoa values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data_nascimento = new java.sql.Date(date.parse(pessoa.getDataNascimento().toString()).getTime());
            java.sql.Date data_atualizacao = new java.sql.Date(date.parse(pessoa.getDataAtualizacao().toString()).getTime());

            instrucao.setLong(1, pessoa.getIdPessoa());
            instrucao.setString(2, pessoa.getCodigo());
            instrucao.setString(3, pessoa.getTipo());
            instrucao.setString(4, pessoa.getNome());
            instrucao.setString(5, pessoa.getApelido());
            instrucao.setString(6, pessoa.getCpfCnpj());
            instrucao.setString(7, pessoa.getRgIe());
            instrucao.setString(8, pessoa.getInscricaoMunicipal());
            instrucao.setString(9, pessoa.getTelefoneFixo());
            instrucao.setString(10, pessoa.getTelefoneCelular());
            instrucao.setString(11, pessoa.getEstadoCivil());
            instrucao.setString(12, pessoa.getEmail());
            instrucao.setString(13, pessoa.getEmailCobranca());
            instrucao.setDate(14, data_nascimento);
            instrucao.setString(15, pessoa.getLogradouro());
            instrucao.setString(16, pessoa.getComplementoEndereco());
            instrucao.setString(17, pessoa.getNumeroEndereco());
            instrucao.setString(18, pessoa.getBairro());
            instrucao.setString(19, pessoa.getCepLogradouro());
            instrucao.setString(20, pessoa.getSexo());
            instrucao.setString(21, null); //Esses campos são atualizados com a alteração das parcelas
            instrucao.setString(22, null); //Esses campos são atualizados com a alteração das parcelas
            instrucao.setString(23, null); //Esses campos são atualizados com a alteração das parcelas
            instrucao.setString(24, null); //Esses campos são atualizados com a alteração das parcelas
            instrucao.setString(25, pessoa.getLocalTrabalho()); 
            instrucao.setString(26, pessoa.getFuncaoTrabalho());
            instrucao.setString(27, pessoa.getRenda());
            instrucao.setString(28, pessoa.getLimite());
            instrucao.setString(29, pessoa.getNomeReferencia());
            instrucao.setString(30, pessoa.getTelefoneReferencia());
            instrucao.setString(31, pessoa.getCasaPropria());
            instrucao.setString(32, pessoa.getPessoaAutorizada());
            instrucao.setString(33, pessoa.getReferenciaComercial());
            instrucao.setString(34, pessoa.getNomeMae());
            instrucao.setString(35, pessoa.getNomePai());
            instrucao.setString(36, pessoa.getObservacao());
            instrucao.setBoolean(37, pessoa.isOrgaoPublico());
            instrucao.setBoolean(38, pessoa.isFornecedor());
            instrucao.setBoolean(39, pessoa.isFuncionario());
            instrucao.setBoolean(40, pessoa.isTransportadora());
            instrucao.setBoolean(41, pessoa.isCliente());
            instrucao.setDate(42, data_atualizacao);
            instrucao.setBoolean(43, pessoa.isStatus());
            instrucao.setLong(44, pessoa.getCidade());
            instrucao.setLong(45, 1);
            instrucao.executeUpdate();
            return true;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: cadastraPessoa\n"+e.getMessage());
            return false;
        }
    }
    
    public boolean atualizaPessoa(Pessoa nova, Pessoa antiga){ // atualiza pessoa no banco
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("update pessoa set codigo = ?, tipo = ?, nome = ?, apelido = ?, cpf_cnpj = ?, rg_ie = ?, inscricao_municipal = ?, telefone_fixo = ?, telefone_celular = ?, estado_civil = ?, email = ?, email_cobranca = ?, data_nascimento = ?, logradouro = ?, complemento_endereco = ?, numero_endereco = ?, bairro = ?, cep_logradouro = ?, sexo = ?, local_trabalho = ?, funcao_trabalho = ?, renda = ?, limite = ?, nome_referencia = ?, telefone_referencia = ?, casa_propria = ?, pessoa_autorizada = ?, referencia_comercial = ?, nome_mae = ?, nome_pai = ?, observacao = ?, orgao_publico = ?, fornecedor = ?, funcionario = ?, transportadora = ?, cliente = ?, data_atualizacao = ?, status = ?, cidade = ? where idpessoa = ?");
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            
            java.sql.Date data_nascimento = new java.sql.Date(date.parse(nova.getDataNascimento().toString()).getTime());
            java.sql.Date data_atualizacao = new java.sql.Date(date.parse(Funcoes.getData()).getTime());
            
            instrucao.setString(1, nova.getCodigo());
            instrucao.setString(2, nova.getTipo());
            instrucao.setString(3, nova.getNome());
            instrucao.setString(4, nova.getApelido());
            instrucao.setString(5, nova.getCpfCnpj());
            instrucao.setString(6, nova.getRgIe());
            instrucao.setString(7, nova.getInscricaoMunicipal());
            instrucao.setString(8, nova.getTelefoneFixo());
            instrucao.setString(9, nova.getTelefoneCelular());
            instrucao.setString(10, nova.getEstadoCivil());
            instrucao.setString(11, nova.getEmail());
            instrucao.setString(12, nova.getEmailCobranca());
            instrucao.setDate(13, data_nascimento);
            instrucao.setString(14, nova.getLogradouro());
            instrucao.setString(15, nova.getComplementoEndereco());
            instrucao.setString(16, nova.getNumeroEndereco());
            instrucao.setString(17, nova.getBairro());
            instrucao.setString(18, nova.getCepLogradouro());
            instrucao.setString(19, nova.getSexo());
            instrucao.setString(20, nova.getLocalTrabalho());
            instrucao.setString(21, nova.getFuncaoTrabalho());
            instrucao.setString(22, nova.getRenda());
            instrucao.setString(23, nova.getLimite());
            instrucao.setString(24, nova.getNomeReferencia());
            instrucao.setString(25, nova.getTelefoneReferencia());
            instrucao.setString(26, nova.getCasaPropria());
            instrucao.setString(27, nova.getPessoaAutorizada());
            instrucao.setString(28, nova.getReferenciaComercial());
            instrucao.setString(29, nova.getNomeMae());
            instrucao.setString(30, nova.getNomePai());
            instrucao.setString(31, nova.getObservacao());
            instrucao.setBoolean(32, nova.isOrgaoPublico());
            instrucao.setBoolean(33, nova.isFornecedor());
            instrucao.setBoolean(34, nova.isFuncionario());
            instrucao.setBoolean(35, nova.isTransportadora());
            instrucao.setBoolean(36, nova.isCliente());
            instrucao.setDate(37, data_atualizacao);
            instrucao.setBoolean(38, nova.isStatus());
            instrucao.setLong(39, nova.getCidade());
            instrucao.setLong(40, antiga.getIdPessoa());
            
            instrucao.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: atualizaPessoa\n"+e.getMessage());
            return false;
        }
    }
    
    public Pessoa buscaPessoaPorId(long id){ // busca pessoa pelo ID recebido
        Pessoa pessoa = new Pessoa();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from pessoa where idpessoa = ?");
            instrucao.setLong(1, id);
            ResultSet rs = instrucao.executeQuery();
                while (rs.next()) {
                    pessoa.setIdPessoa(rs.getLong("idpessoa"));
                    pessoa.setCodigo(rs.getString("codigo"));
                    pessoa.setTipo(rs.getString("tipo"));
                    pessoa.setNome(rs.getString("nome"));
                    pessoa.setApelido(rs.getString("apelido"));
                    pessoa.setCpfCnpj(rs.getString("cpf_cnpj"));
                    pessoa.setRgIe(rs.getString("rg_ie"));
                    pessoa.setInscricaoMunicipal(rs.getString("inscricao_municipal"));
                    pessoa.setTelefoneFixo(rs.getString("telefone_fixo"));
                    pessoa.setTelefoneCelular(rs.getString("telefone_celular"));
                    pessoa.setEstadoCivil(rs.getString("estado_civil"));
                    pessoa.setEmail(rs.getString("email"));
                    pessoa.setEmailCobranca(rs.getString("email_cobranca"));
                    pessoa.setDataNascimento(FormataData.tranformaDateEmData(rs.getDate("data_nascimento")));
                    pessoa.setLogradouro(rs.getString("logradouro"));
                    pessoa.setComplementoEndereco(rs.getString("complemento_endereco"));
                    pessoa.setNumeroEndereco(rs.getString("numero_endereco"));
                    pessoa.setBairro(rs.getString("bairro"));
                    pessoa.setCepLogradouro(rs.getString("cep_logradouro"));
                    pessoa.setSexo(rs.getString("sexo"));
                    pessoa.setMda(rs.getString("mda"));
                    pessoa.setMa(rs.getString("ma"));
                    pessoa.setNumeroQuitacao(rs.getString("numero_quitacao"));
                    pessoa.setTodosAtrasos(rs.getString("todos_atrasos"));
                    pessoa.setRenda(rs.getString("renda"));
                    pessoa.setLimite(rs.getString("limite"));
                    pessoa.setNomeReferencia(rs.getString("nome_referencia"));
                    pessoa.setTelefoneReferencia(rs.getString("telefone_referencia"));
                    pessoa.setCasaPropria(rs.getString("casa_propria"));
                    pessoa.setPessoaAutorizada(rs.getString("pessoa_autorizada"));
                    pessoa.setReferenciaComercial(rs.getString("referencia_comercial"));
                    pessoa.setNomeMae(rs.getString("nome_mae"));
                    pessoa.setNomePai(rs.getString("nome_pai"));
                    pessoa.setObservacao(rs.getString("observacao"));
                    pessoa.setOrgaoPublico(rs.getBoolean("orgao_publico"));
                    pessoa.setFornecedor(rs.getBoolean("fornecedor"));
                    pessoa.setFuncionario(rs.getBoolean("funcionario"));
                    pessoa.setTransportadora(rs.getBoolean("transportadora"));
                    pessoa.setCliente(rs.getBoolean("cliente"));
                    pessoa.setInformacaoAdicional(rs.getLong("informacao_adicional"));
                    pessoa.setDataAtualizacao(FormataData.tranformaDateEmData(rs.getDate("data_atualizacao")));
                    pessoa.setStatus(rs.getBoolean("status"));
                    pessoa.setCidade(rs.getLong("cidade"));
                }
            return pessoa;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaPessoaPorId\n"+e.getMessage());
            return pessoa;
        }
    }
            
    public ArrayList<Pessoa> buscaTodasPessoas(){ //Busca todas as pessoas cadastradas no banco
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select * from pessoa");
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getLong("idpessoa"));
                pessoa.setCodigo(rs.getString("codigo"));
                pessoa.setTipo(rs.getString("tipo"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setApelido(rs.getString("apelido"));
                pessoa.setCpfCnpj(rs.getString("cpf_cnpj"));
                pessoa.setRgIe(rs.getString("rg_ie"));
                pessoa.setInscricaoMunicipal(rs.getString("inscricao_municipal"));
                pessoa.setTelefoneFixo(rs.getString("telefone_fixo"));
                pessoa.setTelefoneCelular(rs.getString("telefone_celular"));
                pessoa.setEstadoCivil(rs.getString("estado_civil"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setEmailCobranca(rs.getString("email_cobranca"));
                pessoa.setDataNascimento(FormataData.tranformaDateEmData(rs.getDate("data_nascimento")));
                pessoa.setLogradouro(rs.getString("logradouro"));
                pessoa.setComplementoEndereco(rs.getString("complemento"));
                pessoa.setNumeroEndereco(rs.getString("numero"));
                pessoa.setBairro(rs.getString("bairro"));
                pessoa.setCepLogradouro(rs.getString("cep_logradouro"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setMda(rs.getString("mda"));
                pessoa.setMa(rs.getString("ma"));
                pessoa.setNumeroQuitacao(rs.getString("numero_quitacao"));
                pessoa.setTodosAtrasos(rs.getString("todos_atrasos"));
                pessoa.setRenda(rs.getString("renda"));
                pessoa.setLimite(rs.getString("limite"));
                pessoa.setNomeReferencia(rs.getString("nome_referencia"));
                pessoa.setTelefoneReferencia(rs.getString("telefone_referencia"));
                pessoa.setCasaPropria(rs.getString("casa_propria"));
                pessoa.setPessoaAutorizada(rs.getString("pessoa_autorizado"));
                pessoa.setReferenciaComercial(rs.getString("referencia_comercial"));
                pessoa.setNomeMae(rs.getString("nome_mae"));
                pessoa.setNomePai(rs.getString("nome_pai"));
                pessoa.setObservacao(rs.getString("obervacao"));
                pessoa.setOrgaoPublico(rs.getBoolean("orgao_publico"));
                pessoa.setFornecedor(rs.getBoolean("fornecedor"));
                pessoa.setFuncionario(rs.getBoolean("funcionario"));
                pessoa.setTransportadora(rs.getBoolean("transportadora"));
                pessoa.setCliente(rs.getBoolean("cliente"));
                pessoa.setInformacaoAdicional(rs.getLong("informacao_adicional"));
                pessoa.setDataAtualizacao(FormataData.tranformaDateEmData(rs.getDate("data_atualizacao")));
                pessoa.setStatus(rs.getBoolean("status"));
                pessoa.setCidade(rs.getLong("cidade"));
                pessoas.add(pessoa);
            }
            return pessoas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: buscaTodasPessoas\n"+e.getMessage());
            return pessoas;
        }
    }

    public long ultimaPessoaCadastrada(){ //Volta do banco o ID da ultima pessoa cadastrada
        long id = 0;
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select idpessoa from pessoa order by idpessoa desc limit 1");
            ResultSet rs = instrucao.executeQuery();
            rs.next();
            id = rs.getLong("idpessoa");
            return id;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: ultimaPessoaCadastrada\n"+e.getMessage());
            return id;
        }
    }
    
    public long primeiraPessoaCadastrada(){ //Volta do banco o ID a primeira pessoa cadastrada
        long id = 0;
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select idpessoa from pessoa order by idpessoa limit 1");
            ResultSet rs = instrucao.executeQuery();
            rs.next();
            id = rs.getLong("idpessoa");
            return id;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: primeiraPessoaCadastrada()\n"+e.getMessage());
            return id;
        }
    }
    
    public boolean pessoaEstaCadastrada (long id){ //Verifica se a pessoa já está cadastrada apartir do ID
        boolean cadastrado = false;
        try {
            PreparedStatement instrucao = DlgLogin.conexao.prepareStatement("select nome from pessoa where idpessoa = ?");
            instrucao.setLong(1, id);
            ResultSet rs = instrucao.executeQuery();
                while (rs.next()) {
                    if (rs.getString("nome")==null) {
                        cadastrado = false;
                    }else{
                        cadastrado = true;
                    }
                }
            return cadastrado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO SQL: pessoaEstaCadastrada\n"+e.getMessage());
            return cadastrado;
        }
    }
}