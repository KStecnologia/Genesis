package caroco;

public class Horario
{

    private ModuloNumerico hora;
    private ModuloNumerico minuto;
    private ModuloNumerico segundo;
    private int config;

    final public static int HHMMSS = 1;
    final public static int HHMM = 2;
    final public static int MMSS = 3;

    public Horario()
    {
        this.hora = new ModuloNumerico(24);
        this.minuto = new ModuloNumerico(60);
        this.segundo = new ModuloNumerico(60);
        this.config = HHMMSS;
    }

    public Horario(int config)
    {
        this.hora = new ModuloNumerico(24);
        this.minuto = new ModuloNumerico(60);
        this.segundo = new ModuloNumerico(60);
        this.config = config;
    }

    public void avançar()
    {
        if (config == HHMMSS)
        {
            segundo.avançar();
            if (segundo.getNumero() == 0)
            {
                minuto.avançar();
                if (minuto.getNumero() == 0)
                {
                    hora.avançar();
                }
            }
        } 
        else if ((config == HHMM))
        {
            minuto.avançar();
            if (minuto.getNumero() == 0)
            {
                hora.avançar();
            }
        }
        else if ((config == MMSS))
        {
            segundo.avançar();
            if (segundo.getNumero() == 0)
            {
                minuto.avançar();
            }
        }
    }

    public void retroceder()
    {
        if (config == HHMMSS)
        {
            segundo.retroceder();
            if (segundo.getNumero() == 59)
            {
                minuto.retroceder();
                if (minuto.getNumero() == 59)
                {
                    hora.retroceder();
                }
            }
        }
        else if (config == HHMM)
        {
            minuto.retroceder();
            if (minuto.getNumero() == 59)
            {
                hora.retroceder();
            }
        }
        else if (config == MMSS)
        {
            segundo.retroceder();
            if (segundo.getNumero() == 59)
            {
                minuto.retroceder();
            }
        }
    }

    public String obterHorário()
    {
        String retorno = hora.getNumeroFormatado() + ":" + minuto.getNumeroFormatado() + ":" + segundo.getNumeroFormatado();
        if (config == HHMM)
        {
            retorno = hora.getNumeroFormatado() + ":" + minuto.getNumeroFormatado();
        }
        else if (config == MMSS)
        {
            retorno = minuto.getNumeroFormatado() + ":" + segundo.getNumeroFormatado();
        }
        return retorno;
    }

    public void definirHora(int numero)
    {
        hora.setNumero(numero);
    }

    public void definirMinuto(int numero)
    {
        minuto.setNumero(numero);
    }

    public void definirSegundo(int numero)
    {
        segundo.setNumero(numero);
    }
    
    public int obterTempoEmSegundos()
    {
        return hora.getNumero() * 3600 + minuto.getNumero() * 60 + segundo.getNumero();
    }
    
}
