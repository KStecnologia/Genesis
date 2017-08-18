package caroco;

import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;

public class JmCurrencyField extends JFormattedTextField
{

    public JmCurrencyField()
    {
        setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,##0.00"))));
        setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        NumberFormatter nf = (NumberFormatter)this.getFormatter();
        nf.setAllowsInvalid(true);
    }
    
    public double getDoubleValue()
    {
        double r = 0;
        if (this.getValue() instanceof Double)
        {
            r = (Double)this.getValue();
        }
        else if (this.getValue() instanceof Long)
        {
            Long aux = (Long)this.getValue();
            r = aux.doubleValue();
        }
        return r;
    }
    
    
}
