import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class button extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5;
    JLabel l;
    public button() 
    {
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        l=new JLabel();
        b5=new JButton();

        
        b1.setBounds(20, 50, 100, 60);
        b2.setBounds(20, 200, 100, 60);
        b3.setBounds(220, 50, 100, 60);
        b4.setBounds(220, 200, 100, 60);
        l.setBounds(100,300, 100, 60);

        


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l);
        add(b5);
        l.setVisible(false);
        b5.setVisible(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    

        setVisible(true);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {  
            l.setVisible(true); 
            l.setText("Button 1 Preesed");
        }
        if(e.getSource()==b2)
        {  
            l.setVisible(true); 
            l.setText("Button 2 Preesed");
        }
        if(e.getSource()==b3)
        {  
            l.setVisible(true); 
            l.setText("Button 3 Preesed");
        }
        if(e.getSource()==b4)
        {  
            l.setVisible(true); 
            l.setText("Button 4 Preesed");
        }


    }
}



public class Fourbutton
 {
     public static void main(String[] args) {
         button obj=new button();
     }
 }