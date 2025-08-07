import greenfoot.*;  
import java.awt.Color;
public class Nube extends SmoothMover
{ 
    GreenfootImage im;
    public Nube(int j)
    {
        im = new GreenfootImage("Nube.png");
        if(j==1)
        {
           im.scale(15,10);
           setImage(im);
        }
        if(j==2)
        {
            im.scale(10,5);
             setImage(im);
        }
        if(j==3)
        {
            im.scale(40,40);
             setImage(im);
        }
    }
    int c=0;
    public void act() 
    {
        c++;
        if(c==200)
        {
            getWorld().removeObject(this);
            return;
        }
        if(((Fondo)getWorld()).moverse==true)
        {
            //setLocation(getX()-((Fondo)getWorld()).velocity,getY());
        }
    }    
}
