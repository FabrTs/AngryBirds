import greenfoot.*;
public class Fondoo extends SmoothMover
{
    public Fondoo()
    {
        Fon=true;
    }
    public void act() 
    {
        /*if(((Fondo)getWorld()).moverse==true)
        {
            //setLocation(getX()-((Fondo)getWorld()).velocity,getY());
        }*/
        if(getX()<=50 || getX()>=1140)
        {
            ((Fondo)getWorld()).moverse=false;
        }
        if(Greenfoot.mouseClicked(this)==true)
        {
            ((Fondo)getWorld()).Birds.get(0).Click();
            
        }
    }    
}
