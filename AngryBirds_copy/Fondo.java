import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
public class Fondo extends World
{
    //GreenfootImage Fondo=new GreenfootImage("Fondo3.png");
    GreenfootImage Visible= new GreenfootImage(1120,600);
    
    Red R= new Red();
    Blues B=new Blues();
    Chuck C=new Chuck();
    Matild M=new Matild();
    Terry T=new Terry();
    Bomb Bo=new Bomb();
    
    Fondoo F=new Fondoo();
    int back=0;
    double velocity=0;
    boolean moverse,nextBird;
    List<Red> Birds=new ArrayList<Red>();
    Y Tir=new Y();
    public Fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1140, 630, 1,false); 
        addObject(F,1140,330);
        //setBackground(Fondo);
        addObject(Tir,200,500);
        addObject(new Line(),150,300);
        Birds.add(R);
        Birds.add(B);
        Birds.add(C);
        Birds.add(M);
        Birds.add(T);
        Birds.add(Bo);
        addObject(Birds.get(0),200,470);        
    }
    /*public void dibujar(double PX)
    {
        int X=(int)PX;
        Visible.clear();
        Visible.drawImage(Fondo,-X,0);
        setBackground(Visible);
    }*/
    public void act()
    {
        if(moverse==true)
        {
            //setLocation(getX()-((Fondo)getWorld()).velocity,getY());
            List<SmoothMover> objs=getObjects(SmoothMover.class);
            for(SmoothMover S:objs)
            {
                //if(S.Fon==true)
                     S.move(-(velocity));
                //else
                //    S.move(velocity);
            }
            //System.out.println(velocity);
        }
        if(nextBird==true && moverse==false)
        {
            Birds.remove(0);
            addObject(Birds.get(0),200,470);
            nextBird=false;
        }
    }
}
