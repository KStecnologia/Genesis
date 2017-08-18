package Utilitario;

import caroco.Data;
import java.util.Date;

public class FormataData {
    
    public static Data tranformaParaData(String data) {
        String vet[] = data.split("/");
        Data auxData = new Data();
        int dia = Integer.parseInt(vet[0]);
        int mes = Integer.parseInt(vet[1]);
        int ano = Integer.parseInt(vet[2]);
        auxData.definirDia(dia);
        auxData.definirMes(mes);
        auxData.definirAno(ano);
        return auxData;
    }
    
    public static Data tranformaDateEmData(Date date) {
        String vet[] = date.toString().split("-");
        Data auxData = new Data();
        int dia = Integer.parseInt(vet[2]);
        int mes = Integer.parseInt(vet[1]);
        int ano = Integer.parseInt(vet[0]);
        auxData.definirDia(dia);
        auxData.definirMes(mes);
        auxData.definirAno(ano);
        return auxData;
    }
}
