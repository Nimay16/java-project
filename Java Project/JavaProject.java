import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Payment extends JFrame implements ActionListener, Runnable
{
    JRadioButton r1, r2, r3;
    JLabel l1, l2, l3, l4, l5, l6, l;
    JTextField t1, t2, t3;
    JButton b;
    int currentReading;

    public Payment(int amount, int currentReading)
    {
        this.currentReading = currentReading;
        setTitle("Payment");
        setLayout(null);
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel("Choose payment method");
        r1 = new JRadioButton("Credit Card");
        r2 = new JRadioButton("Debit Card");
        r3 = new JRadioButton("Net Banking");
        l1 = new JLabel("Card Number: ");
        l2 = new JLabel("Transaction Password: ");
        l3 = new JLabel("OTP: ");
        l4 = new JLabel();
        l5 = new JLabel("Bill Amount: " + amount + "");
        l6 = new JLabel("Mahanagar Gas");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b = new JButton("Pay");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        add(l);
        add(r1);
        add(r2);
        add(r3);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(t1);
        add(t2);
        add(t3);
        add(b);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        l.setBounds(20,75,180,20);
        r1.setBounds(20,105,120,20);
        r2.setBounds(20,135,120,20);
        r3.setBounds(20,165,120,20);
        l1.setBounds(220,105,150,20);
        l2.setBounds(220,135,150,20);
        l3.setBounds(220,165,150,20);
        l4.setBounds(300,235,90,20);
        l5.setBounds(20,205,120,20);
        l6.setBounds(200,20,200,40);
        t1.setBounds(380,105,120,20);
        t2.setBounds(380,135,120,20);
        t3.setBounds(380,165,120,20);
        b.setBounds(335,205,60,20);
        b.addActionListener(this);

        l6.setFont(new Font("Arial",Font.BOLD,22));
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == r1)
        {
            l1.setText("Card Number: ");
            l2.setText("Transaction Password: ");
            l3.setText("OTP: ");
        }
        if(e.getSource() == r2)
        {
            l1.setText("Card Number: ");
            l2.setText("CVV: ");
            l3.setText("OTP: ");
        }
        if(e.getSource() == r3)
        {
            l1.setText("Account Number: ");
            l2.setText("Transaction Password: ");
            l3.setText("OTP: ");
        }
        if(e.getSource() == b)
        {
            l4.setText("Processing...");
            // Thread.sleep(1000);
            setVisible(false);
            Login login2 = new Login(currentReading);
        }
    }

    public void run()
    {
        System.out.println("Run");
    }
}

class Bill extends JFrame implements ActionListener
{
    int previousReading;
    JLabel l1, l, l2;
    JTextField t1;
    JButton b;
    public Bill(int previousReading)
    {
        this.previousReading = previousReading;
        l1=new JLabel("Current Reading:");
        l2=new JLabel("Mahanagar Gas");
        l=new JLabel("Cost per meter cube is 9 Rs.");
        t1=new JTextField();

        b=new JButton("Proceed");

        add(l2);
        add(l1);
        add(l);
        add(t1);
        add(b);
    
        l2.setBounds(200,20,200,50);
        l1.setBounds(175,115,100,20);
        t1.setBounds(285,115,100,20);
        l.setBounds(210,180,200,20);
        b.setBounds(232,250,100,20);
        
        b.addActionListener(this); 
       
        l2.setFont(new Font("Arial",Font.BOLD,22));
        setTitle("Bill");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        int currentReading=Integer.parseInt(t1.getText());
        int value=currentReading-previousReading;
        int amount=value*9;
        l1.setVisible(false);
        l.setVisible(false);
        t1.setVisible(false);
        b.setVisible(false);
        JLabel l3=new JLabel("Current Reading(meter cube): "+value);
        JLabel l4=new JLabel("Cost:Rs. "+amount);
        add(l3);
        add(l4);
        l3.setBounds(100,100,500,40);
        l4.setBounds(100,200,200,40);
        setVisible(false);
        Payment pay = new Payment(amount, currentReading);
    }
}

class Login extends JFrame implements ActionListener
{
    JTextField t1;
    JPasswordField t2;
    JLabel l,l1,l2,l3;
    JButton b1;
    int previousReading;

    public Login(int previousReading)
    {
        this.previousReading = previousReading;
        l = new JLabel("Mahanagar Gas");
        l1 = new JLabel("User ID: ");
        l2 = new JLabel("Password: ");
        l3 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");

        setTitle("Login");
        setLayout(null);
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setFont(new Font("Arial",Font.BOLD,22));

        l.setBounds(200,20,200,50);
        l1.setBounds(150,120,75,20);
        l2.setBounds(150,170,75,20);
        l3.setBounds(150,250,200,20);
        add(l);
        add(l1);
        add(l2);
        add(l3);
        t1.setBounds(250,120,150,20);
        t2.setBounds(250,170,150,20);
        add(t1);
        add(t2);
        b1.setBounds(250,250,70,20);
        add(b1);
        b1.addActionListener(this);
        t2.setEchoChar('*');
    }

    public void actionPerformed(ActionEvent ae)
    {
        String id = t1.getText();
        String pass = t2.getText();
        if(Validate(id, pass) == true)
        {
            setVisible(false);
            Bill obj = new Bill(previousReading);
        }
        else
        {
            l3.setForeground(Color.red);
            l3.setText("Invalid Credentials");
        }        
    }

    public boolean Validate(String id, String pass)
    {
        if( id.equals("rrahe") && pass.equals("ja") )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class JavaProject
{
    public static void main(String[] args)
    {
        Login login1 = new Login(0);
    }
}