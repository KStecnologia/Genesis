package Utilitario;

import Grafico.Janela;

public class Temporizador implements Runnable {
    
    Janela janela;
    boolean acao = true;
    Thread t;
    
    public Temporizador(Janela j) {
        janela = j;
        t = new Thread(this);
    }
    
    public void executar() {
        t.start();
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                if (acao) {
                    for (int i = 0; i < 10; i++) {
                        janela.atualizarDataHora(Funcoes.getDataHora());
                        Thread.sleep(1000);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("erro thread: " + e);
        }
    }
}