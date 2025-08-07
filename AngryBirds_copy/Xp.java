import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Xp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Xp extends Actor
{
    int c=1;
    public void act() 
    {
        if(c<=4)
        {
            setImage("NubeM"+c+".png");
        }
        else
        {
            getWorld().removeObject(this);
            return;
        }
        c++;
    }    
}
