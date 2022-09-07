import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
public class Register extends JFrame implements ActionListener
{
JLabel l1=new JLabel("Name:");
JLabel l2=new JLabel("Password:");

JLabel l3=new JLabel("Gender");
JTextField t1=new JTextField();
JCheckBox c1=new JCheckBox("Male");
JCheckBox c2=new JCheckBox("Female");
ButtonGroup bg=new ButtonGroup();

JButton b=new JButton("Submit");
JPasswordField p=new JPasswordField();

public Register()
{
this.setLayout(null);
this.setVisible(true);
this.setSize(700,600);
l1.setBounds(100,100,200,40);
l2.setBounds(100,200,200,40);

l3.setBounds(100,300,200,40);

add(l1);
add(l2);

add(l3);

t1.setBounds(250,100,150,40);
add(t1);
p.setBounds(250,200,150,40);
add(p);
c1.setBounds(250,300,100,40);
c2.setBounds(350,300,100,40);
add(c1);
add(c2);
bg.add(c1);
bg.add(c2);


b.setBounds(150,400,200,60);
add(b);
b.addActionListener(this);
}
public static void main(String[] args)
{
new Register();
}
public void actionPerformed(ActionEvent ar)
{
if(ar.getSource()==b)
{
this.hide();
String aa=t1.getText();

}
}
}