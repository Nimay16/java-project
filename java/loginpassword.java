import java.awt.*;
import java.awt.event.*;
public class loginpassword extends Frame implements ActionListener
{
	Label label1=new Label("Login ID: ");
	Label label2=new Label("Password: ");
	Label label3=new Label();
	TextField text1=new TextField();
	TextField text2=new TextField();
	Button b1=new Button("OK");
	Button b2=new Button("RESET");
	TextField text3=new TextField();
	public loginpassword()
	{
		label1.setBounds(20,50,70,20); 
		text1.setBounds(180,50,200,20);
		label2.setBounds(20,80,70,20);
		text2.setBounds(180,80,200,20);
		b1.setBounds(20,170,50,20);
		b2.setBounds(80,170,50,20);
		text3.setBounds(50,250,300,20);
		label3.setBounds(350,350,50,50);
        add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(b1);
		add(b2);
		add(text3);
		add(label3);
		text2.setEchoChar('*');
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			text3.setText("The login id is: " + text1.getText() + " and password is: " + text2.getText());
		}
		else if(e.getSource()==b2)
		{
			text1.setText("");
			text2.setText("");
			text3.setText("");
		}
	}
	public static void main(String args[])
    {
		loginpassword l=new loginpassword();
		l.setSize(new Dimension(400,400));
		l.setTitle("Login-60004190074");
        l.setVisible(true);
        
    }
}