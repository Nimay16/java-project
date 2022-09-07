import java.applet.*;
import java.awt.*;

public class house extends Applet 
{
    
    public void paint (Graphics g) 
    {
        int xPoints[] = {100,150,200};
        int yPoints[] = {100,50,100};

        g.setColor(Color.GREEN);
        g.fillPolygon(xPoints, yPoints, 3);
        g.fillRect(100,100,100,100);
        g.setColor(Color.RED);
        g.drawPolygon(xPoints, yPoints, 3);
        g.drawRect(100,100,100,100);
        g.drawRect(135,150,30,50);
        g.drawRect(110,110,20,20);
        g.drawRect(170,110,20,20);
        g.setColor(Color.BLUE);
        g.fillRect(110,110,20,20);
        g.fillRect(170,110,20,20);   
    }
}
