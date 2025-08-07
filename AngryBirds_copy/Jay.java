import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jay extends Red
{
    public Jay(double X,double Yei,int f,double time,double YY)
    {
        Vx=X;
        Vy=Yei;
        flag=f;
        t=time;
        b=true;
        PY=0;
        PX=0;
        Y=YY;
    }
    public void act() 
    {
        Todo();
    }    
}
