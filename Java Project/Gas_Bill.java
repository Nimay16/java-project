import javax.swing.*;
import java.awt.event.*;
public class Gas_Bill
{
    public static void main (String[] args)
    {
        calculate obj=new calculate();
       
    }
}

class calculate extends JFrame implements ActionListener
{
    
    int previous_reading=0;
    JLabel l1, l2,l,l3,l4;
    JTextField t1,t2;
    JButton b;
    
    public calculate()
    {
        l1=new JLabel("Old Reading in meter cube:");
        l2=new JLabel("New Reading in meter cube:"); 
        l=new JLabel("Cost per meter cube is 9 Rs.");
        t1=new JTextField(5);
        t2=new JTextField(5);

        b=new JButton("Proceed");

        add(l1);
        add(l2);
        add(l);
        add(t1);
        add(t2);
        add(b);
    
        
        l1.setBounds(100,100,200,40);
        l2.setBounds(100,200,200,40);
        t1.setBounds(400,100,150,40);
        t2.setBounds(400,200,150,40);
        l.setBounds(200,300,200,40);
        b.setBounds(200,400,150,60);
        
        b.addActionListener(this);
        
       
        setTitle("Gas Bill");
        setLayout(null);
        setVisible(true);
        setSize(700,600);

        
    }
    public void actionPerformed(ActionEvent ae) 
    {
        
        int num1=Integer.parseInt(t2.getText());
        
        int value=num1-previous_reading;
        int cost=value*9;
        previous_reading=num1;
        l1.setVisible(false);
        l2.setVisible(false);
        l.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        b.setVisible(false);
        l3=new JLabel("Current month Reading in meter cube:"+value+" meter cube");
        l4=new JLabel("Cost:Rs. "+cost);
        
        add(l3);
        add(l4);
        
        l3.setBounds(100,100,500,40);
        l4.setBounds(100,200,200,40);
        
    }
   
    
   
}
