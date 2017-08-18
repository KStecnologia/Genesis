/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitario;

import java.text.DecimalFormat;

/**
 *
 * @author informatica
 */
public class Formatacao {
   
    // formata uma String com virgula para uma double 
    public static double formataDoubleRecebeString(String desformatada){
        // passa a string para double, trocando a virgual por ponto
        Double formatada = Double.parseDouble(desformatada.replaceAll("\\.","").replace(",","."));
        // define um formato com apenas 2 casas decimais
        DecimalFormat defineFormatacao=new DecimalFormat("0.##");
        // passa a double com o formato correto para a string
         String dx = defineFormatacao.format(formatada);
         // troca a virgual por ponto e insere na double         
        formatada= Double.parseDouble(dx.replaceAll("\\.","").replace(",","."));
        return formatada;
    }
    
    // formata uma double desconfigurada
    public static double formataDoubleRecebeDouble(Double desformatada){
        
        Double formatada = desformatada;
        DecimalFormat defineFormatacao=new DecimalFormat("0.##");
        String dx = defineFormatacao.format(formatada);
        formatada= Double.parseDouble(dx.replaceAll("\\.","").replace(",","."));
        return formatada;
    }
    
    
}
