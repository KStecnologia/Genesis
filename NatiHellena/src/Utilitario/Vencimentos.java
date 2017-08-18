package Utilitario;

import Controle.ControlaConfiguracao;
import static Controle.ControlaConfiguracao.configuracao;
import Negocio.Configuracao;
import caroco.Data;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Vencimentos {
   
    public static boolean verificaParcelaVencida(Data dataVencimentoParcela) {
        Data auxDataAtual = FormataData.tranformaParaData(Funcoes.getData()); //recebe a data atual
        auxDataAtual.retrocederDias(Integer.parseInt(ControlaConfiguracao.buscaConfiguracao().getJurosAposDias())); //Retrocede quantos dias estiverem na configuração de diasApósVencimento
        boolean vencida = false;
        
        // compara se a data de hoje é menor ou igual a do vencimento da parcela
        if (dataVencimentoParcela.compareTo(auxDataAtual) == -1) {
            vencida = true;
        }
        return vencida;
    }
    

    // mostra a quantos dias a parcela esta vencida
    public static int quantidadeDeDiasVencidos(Data dataVencimentoParcela) {
        int diasVencidos = 0;
//        Data auxDataAtual = FormataData.tranformaParaData(Funcoes.getData());
//        auxDataAtual.avançarDias(Integer.parseInt(ControlaConfiguracao.buscaConfiguracao().getJurosAposDias()));
        // verifica se a parcela esta vencida
        if (verificaParcelaVencida(dataVencimentoParcela)) {
            // dias vencidos recebe diferenca entre o vencimento e hoje
            diasVencidos = diasVencidos + dataVencimentoParcela.obterDiferençaEmDias(FormataData.tranformaParaData(Funcoes.getData()));
        }
        return diasVencidos;
    }

    // tranforma String em data


    /*
    calcula o juros diario da parcela 
    precisa receber data de vencimento da parcela e o juros diario
    devolve apenas o valor dos juros diario
     */
    public static Double valorDosJurosDiarios(Data DataVencimentoParcela, String jurosDiario) {
        double valorJurosDiario = 0;        
        double jDiario = Formatacao.formataDoubleRecebeString(jurosDiario);
        int diasVencidos = quantidadeDeDiasVencidos(DataVencimentoParcela);
        valorJurosDiario = Formatacao.formataDoubleRecebeDouble(diasVencidos * jDiario);// valor vai receber juros diario de 0,20 centavos ao dia        
        return valorJurosDiario;
    }

    /*
    calcula o juros fixo sobre o valor total da parcela apos estar vencida
    precisa receber o valor da parcela, data de vencimento da parcela e o juros fixo
    devolvendo apenas o valor do juros fixo
     */
    public static Double valorDosJurosFixo(String valorParcela, Data DataVencimentoParcela, String jurosFixo) {
        double valorJurosFixo = 0; 
        double jFixo = Formatacao.formataDoubleRecebeString(jurosFixo);
        jFixo=jFixo/100;
        if (verificaParcelaVencida(DataVencimentoParcela)) {
            valorJurosFixo = (Double.parseDouble(valorParcela.replaceAll(",", ".")) * jFixo); // valor recebe juros fixo de 2%
        }
        return valorJurosFixo;
    }

    //--------------------------MDA--------------------------------------
    // mostra a quantos dias a parcela foi paga com atraso
    // recebendo data de vencimento e data de quitação
    public int diferencaDeDiasEntreDatas(Data dataVencimentoParcela, Data dataQuitaçãoParcela) {
        int diferencaDias = 0;        
        diferencaDias = diferencaDias + dataVencimentoParcela.obterDiferençaEmDias(dataQuitaçãoParcela);
        return diferencaDias;
    }
    
}
