import greenfoot.*;
public class Bomb extends Red
{
    public void Click()
    {
        getWorld().addObject(new Xp(),getX(),getY());
        ((Fondo)getWorld()).moverse=false;
        getWorld().removeObject(this);
        return;
    }
    public void act() 
    {
        Todo();
    }    
}
