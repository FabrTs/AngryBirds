import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Matilda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matild extends Red
{
    boolean fl;
    public void Click()
    {
        t=0;
        Y=getExactY();
        Vx*=1.7;
        fl=true;
        setImage("Mat.png");
        ((Fondo)getWorld()).moverse=false;
        getWorld().addObject(new Nube(3),getX(),getY());
        getWorld().addObject(new Egg(),getX(),getY());
    }
    public void act() 
    {
        Todo();
        if(fl==true)
        {
            t+=.2;
        }
    }    
}
