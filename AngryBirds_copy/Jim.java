 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jim extends Red
{
    public Jim(double X,double Yei,int f,double time,double YY)
    {
        Vx=X;
        Vy=Yei;
        flag=f;
        t=time;
        b=true;
        Y=YY;
    }
    public void act() 
    {
        otroTodo();
    }    
}
