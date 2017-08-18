package caroco;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class JmTextField extends JTextField
{
    public JmTextField()
    {
        this.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e)
            {
                setBackground(Color.yellow);
            }

            @Override
            public void focusLost(FocusEvent e)
            {
                setBackground(Color.white);
            }
        }  );
    }
    
    

//    private class MeuFocusListener implements FocusListener
//    {
//        @Override
//        public void focusGained(FocusEvent e)
//        {
//            setBackground(Color.yellow);
//        }
//
//        @Override
//        public void focusLost(FocusEvent e)
//        {
//            setBackground(Color.white);
//        }
//    }

    

    
    
    
}
