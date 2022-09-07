import java.applet.*; 
import java.awt.*; 
public class banner extends Applet implements Runnable 
{ 
   String text = " Advertisement Banner "; 
   Thread t; 
  
   public void init() 
   { 
       setBackground(Color.RED); 
   } 
   
   public void start() 
   { 
 	t = new Thread(this);  	t.start(); 
   } 
   
   public void run() 
   { 
       while(true) 
 	{ 
 	    try 
 	    { 
 	        repaint(); 
 	  
               Thread.sleep(1000); 
   
               text = text.substring(1) + text.charAt(0); 
 	    } 
 	    catch(Exception e) 
 	    { 
 	    } 
 	} 
   } 
   
   public void paint(Graphics g) 
   { 
 	g.setFont(new Font("TimesRoman",Font.BOLD,25)); 
 	g.drawString(text,100,100); 
   } 
}