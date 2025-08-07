import greenfoot.*;
public class Blues extends Red
{
    boolean bb;
    public void Click()
    {
        if(bb==false)
        {
            getWorld().addObject(new Jim(Vx*.7,Vy,1,t+.25,Y),getX(),getY());
            getWorld().addObject(new Jay(Vx*1.3,Vy,1,t-.25,Y),getX(),getY());
            getWorld().addObject(new Nube(3),getX(),getY());
            bb=true;
        }
    }
    public void act() 
    {
        if(bb==true)
            otroTodo();
        else
            Todo();
    }    
}
