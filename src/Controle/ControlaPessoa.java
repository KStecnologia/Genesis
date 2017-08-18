package Controle;

import Negocio.Pessoa;
import Grafico.Janela;
import javax.swing.JOptionPane;

public class ControlaPessoa {
    
    public ControlaPessoa(){
        
    }
    
    public String verificaPessoa(Pessoa pessoa){ //Chama todos metodos responsaveis pela verificação dos dados da pessoa
        String erro = "";
        for (int i = 0; i < 1; i++) {

                erro = verificaNome(pessoa.getNome());
                if (erro.isEmpty()) {
                    break;
                }

            if (!VerificaCidade(pessoa.getCidade()).isEmpty()) { //Se verificaCidade tiver conteudo, para o laço
                erro = VerificaCidade(pessoa.getCidade());
                if (erro.isEmpty()) {
                    break;
                }
            }
        }
        return erro;
    }
    
    private String verificaNome(String nome){ //Faz a verificação das regras aceitas para nome da Pessoa
        String erro = "";
        if (nome==null) { //Verifica se nome está vazio
            erro = "Campo Nome está vazio";
            return erro;
        }

        if (nome.length()>200){ //Verifica se nome tem mais de 200 caracteres
            erro = "Nome excede 200 caracteres";
            return erro;
        }
        return erro;
    }
    
    private String VerificaCidade(Long cidade){ //Faz a verificação das regras aceitas para cidade da Pessoa
        String erro = "";
        if (cidade==null) { //Verifica se nome está vazio
            erro = "Campo Cidade está vazio";
            return erro;
        }
        return erro;
    }
}
