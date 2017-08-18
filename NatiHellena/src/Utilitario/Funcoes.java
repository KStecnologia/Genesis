package Utilitario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcoes {
        public static String getData() {
        Date dataAgora = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String data = df.format(dataAgora);

        return data;
    }

    public static String getHora() {
        Date dataAgora = new Date();
        DateFormat df = new SimpleDateFormat("HH:mm");
        String hora = df.format(dataAgora);

        return hora;
    }

    public static String getDataHora() {
        Date dataAgora = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHora = df.format(dataAgora);

        return dataHora;
    }
}
