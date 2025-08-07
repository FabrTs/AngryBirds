import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.lang.Object;
public class Line extends SmoothMover
{
   GreenfootImage line;
   public int x1,x2,y1,y2;
   public Line()
   {
       line=new GreenfootImage(300,600);
       //line.fillRect(150,270,20,20);
       //line.drawRect(0,0,299,599);
       setImage(line);
       x1=200;
       y1=475;
    }
    public void dibuja()
    {
        line.clear();
        line.setColor(new Color(84,40,15,255));
        
        line.drawLine(216,468,x2,y2);
        line.drawLine(216,469,x2,y2);
        line.drawLine(216,470,x2,y2);
        line.drawLine(216,471,x2,y2);
        line.drawLine(216,472,x2,y2);
        line.drawLine(216,473,x2,y2);
        line.drawLine(216,474,x2,y2);
        line.drawLine(216,475,x2,y2);
        
        
        line.drawLine(183,466,x2,y2);
        line.drawLine(183,467,x2,y2);
        line.drawLine(183,468,x2,y2);
        line.drawLine(183,469,x2,y2);
        line.drawLine(183,470,x2,y2);
        line.drawLine(183,471,x2,y2);
        line.drawLine(183,472,x2,y2);
        line.drawLine(183,473,x2,y2);
        line.drawLine(183,474,x2,y2);
        setImage(line);
    } 
    public void act() 
    {
        if(Greenfoot.mouseDragged(((Fondo)getWorld()).Birds.get(0)))
        { 
            x2=Greenfoot.getMouseInfo().getX();
            y2=Greenfoot.getMouseInfo().getY();
            x2-=2;
            y2+=2;
            dibuja();
        }
        if(Greenfoot.mouseDragEnded(((Fondo)getWorld()).Birds.get(0)))
        {           
           line.clear(); 
        }
        
    }    
}
