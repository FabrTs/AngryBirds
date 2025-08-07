import greenfoot.*;
public class Egg extends Red
{
    int vel=9;
    public Egg()
    {
        t=4;
    }
    public void act() 
    {
        setLocation(getX(),getY()+t*grav);
        t+=.1;
    }    
}
