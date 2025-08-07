import greenfoot.*;
public class Chuck extends Red
{
    boolean fl,bb;
    public void Click()
    {
        if(bb==false)
        {
            Vx*=2.6;
            fl=true;
            //setImage("Chuck.png");
            bb=true;
            getWorld().addObject(new Nube(3),getX(),getY());
        }
    }
    public void act() 
    {
        Todo();
        if(fl==true)
        {
            grav+=.44;
        }
    }    
}
