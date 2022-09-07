import javax.swing.*;
import java.awt.*;
import java.awt.event.*;    
class Myinfo {

 
static JTextField t1 ;
static JTextField t2 ;
static JTextField t3 ;
static JTextField t4;
static JButton b1;
static JTextArea t5;


public static void main(String args[])
{
		
	JFrame frame=new JFrame("MY INFORMATION");  
	frame.setVisible(true);      
	frame.setBounds(700,700,700,700 );    
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 
	Container c=frame.getContentPane();   
	c.setLayout(null);    
	c.setBackground(Color.white);     

	
	Font f=new Font("Arial",Font.ITALIC,32);  
		
	JLabel l=new JLabel();
	l.setBounds(250,70,400,40);
	l.setText("MY INFORMATION"); 
	
	l.setFont(f);



	
	Font f1=new Font("Arial",Font.ITALIC,20);
	
	
	JLabel l1=new JLabel("Name : ");
	l1.setBounds(50,150,200,30); 
	
	t1=new JTextField();
	t1.setBounds(180,150,250,30);  
	
	JLabel l2=new JLabel("Street : ");
	l2.setBounds(50,230,200,30);  
	
	t2=new JTextField();
	t2.setBounds(180,230,250,30);

	JLabel l3=new JLabel("City : ");
	l3.setBounds(50,310,200,30); 
	
	t3= new JTextField();
	t3.setBounds(180,310,250,30);
	
	Cursor cur=new Cursor(Cursor.HAND_CURSOR); 
	
	JLabel l4=new JLabel("Pincode: ");
	l4.setBounds(50,390,200,30);

	t4=new JTextField();
	t4.setBounds(180,390,250,30);
	b1=new JButton("MyInfo");
	b1.setBounds(300,450,160,40);
	b1.setCursor(cur);  
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent event)
		{
			submit_action(event); 
		} 
	});
	
	t5=new JTextArea();
	t5.setBounds(500,200,500,500);
	
	l1.setFont(f1);
	l2.setFont(f1);
	l4.setFont(f1);
	l3.setFont(f1);

	t1.setFont(f1);
	t2.setFont(f1);
	t3.setFont(f1);
	t4.setFont(f1);
	b1.setFont(f1);
	t5.setFont(f1);
	
	c.add(l); 
	c.add(l1); 
	c.add(l2);
	c.add(l3);
	c.add(l4);

	c.add(t3);
	c.add(t2);
	c.add(t1);
	c.add(t4);
	c.add(b1);
	c.add(t5); 
 }
 
public static void submit_action(ActionEvent event)
{
	String name=t1.getText();
	String cname=t3.getText();
	String sname=t2.getText();
	String pincode=t4.getText();

	t5.setText(" Name  : " +name + "\n\n Street  :  " +sname + "\n\n City     : "+cname +" \n\n Pincode : "+pincode + "\n ");
  }
}