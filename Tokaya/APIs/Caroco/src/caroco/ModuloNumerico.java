package caroco;

public class ModuloNumerico 
{
    private int numero;
    private int limite;

    public ModuloNumerico(int limite)
    {
        this.numero = 0;
        this.limite = limite;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public String getNumeroFormatado()
    {
        String retorno = ""+numero;
        if (numero < 10)
        {
            retorno = "0"+numero;
        }
        return retorno;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public int getLimite()
    {
        return limite;
    }

    public void setLimite(int limite)
    {
        this.limite = limite;
    }
    
    public void avançar()
    {
        this.numero ++;
        if (this.numero == this.limite)
        {
            this.numero = 0;
        }
    }
    
    public void retroceder()
    {
        this.numero --;
        if (this.numero < 0)
        {
            this.numero = limite -1;
        }
    }
    
    
}
