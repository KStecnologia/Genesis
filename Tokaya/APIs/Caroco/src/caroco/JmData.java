package caroco;

import java.util.Calendar;

public class JmData extends com.toedter.calendar.JDateChooser
{
    public Data getData()
    {
        if (this.getDate() != null)
        {
            Calendar c = Calendar.getInstance();
            c.setTime( this.getDate() );
            int dia = c.get( Calendar.DAY_OF_MONTH );
            int mês = c.get( Calendar.MONTH )+1;    
            int ano = c.get( Calendar.YEAR );
            return new Data(dia,mês,ano);
        }
        return null;
    }
    
    public void setData(Data data)
    {
        if (data == null)
        {
            this.setDate(null);
        }
        else
        {
            Calendar c = Calendar.getInstance();
            c.set( Calendar.DAY_OF_MONTH, data.obterDia() );
            c.set( Calendar.MONTH, data.obterMes()-1 );
            c.set( Calendar.YEAR, data.obterAno() );
            this.setDate(c.getTime());
        }
    }
}