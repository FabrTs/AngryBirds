import greenfoot.*;
import java.util.List;
public class Red extends SmoothMover
{
    double t=0.0,grav=9.8,Y;
    int Cloud=0,Cloud2=0,flag=0;
    public void Click()
    {
    }
    public Red()
    {
        
    }
    public double calcAngle()
    {
        double dx,dy,m,a1,a2=0;
        double y=475;
        double x=200;
        dx=getX()-x;
        dy=getY()-y;
        if(dx==0 || dy==0)
        {
            return 0;
        }    
        m=dy/dx;
        a1=Math.toDegrees(Math.atan2(dy,dx));
        a1=180-a1;
        //System.out.println(""+a1+" "+dx+" "+dy+"");
        //if(dx<0 && dy>0)
        //    a2=-180+a1;
        
        return a1;    
    }
    public int calcDistance()
    {
        double dist=Math.sqrt(Math.pow(150-getX(),2)+Math.pow(500-getY(),2));
        int di=(int)dist;
        return di;
    }
    public void addClouds()
    {
        if(Cloud%3==0)
        {
            if(Cloud2==0)
            {
               Fondo g=(Fondo) getWorld();
               Nube nubecita= new Nube(2);
               getWorld().addObject(nubecita,getX(),getY());
               Cloud2=1;
               //g.nube.add(nubecita);
              
            }
           else
           {
               Fondo g=(Fondo) getWorld();
               Cloud2=0;
               Nube nubecita= new Nube(1);
               getWorld().addObject(nubecita,getX(),getY());
               //g.nube.add(nubecita);              
            }
        }
    }
    double Vx,Vy,PX,PY,h;
    boolean b=false;
    public double altura(double x)
    {
        double z=Vy*x;
        z=z-(grav*Math.pow(t,2))/2;
        return z;
    }
    double d=0;
    public void Todo() 
    {
                if(b==false)
        {
            if(((Fondo)getWorld()).moverse==true)
            {
                setLocation(getX()-((Fondo)getWorld()).velocity,getY());
            }
            if(Greenfoot.mouseDragged(this)==true)
            {
                int Mx=Greenfoot.getMouseInfo().getX();
                int My=Greenfoot.getMouseInfo().getY();
                setLocation(Mx,My);
            }
            if(Greenfoot.mouseDragEnded(this) && b==false)
            {
                double angle=calcAngle();
                //System.out.println(angle);
                int dist=calcDistance();
                //System.out.println(dist);
                d=dist/2.6;
                Vx=d*((Math.cos(Math.toRadians(angle))));
                Vy=d*((Math.sin(Math.toRadians(angle))));
                Y=getExactY();
                b=true;
            }
        }
        if(b==true)
        {
            t+=.1;
            h=altura(t);
            //if(getX()<=1100)
            //{
                PX=getExactX()+(Vx*0.9);
            //}
            //else
            //{
            //    ((Fondo)getWorld()).dibujar(Vx);
            //}
            PY=Y-(16*h);
            setLocation(PX,PY);
            addClouds();
            if(getExactY()>550 && getExactX()>150 /*|| getExactX()>=1080*/)
            {
                
                ((Fondo)getWorld()).moverse=false;
                ((Fondo)getWorld()).back=1;
                ((Fondo)getWorld()).velocity*=-1;
                Greenfoot.delay(50);
                ((Fondo)getWorld()).moverse=true;
                ((Fondo)getWorld()).nextBird=true;
                getWorld().removeObject(this);
                return;
            }
            if(flag==0)
            {
                if(getX()>=570)
                {
                    ((Fondo)getWorld()).moverse=true;
                    ((Fondo)getWorld()).velocity=Vx;
                    flag=1;
                }
            }
            /*if(((Fondo)getWorld()).moverse==true)
            {
                //setLocation(getX()-((Fondo)getWorld()).velocity,getY());
                List<SmoothMover> objs=getWorld().getObjects(SmoothMover.class);
                for(SmoothMover S:objs)
                {
                    if(S.Fon==true)
                         S.move(((Fondo)getWorld()).velocity);
                    else
                        S.move(-(((Fondo)getWorld()).velocity));
                }
                System.out.println(((Fondo)getWorld()).velocity);
            }*/
        }
        
    } 
    public void otroTodo()
    {
        if(b==false)
            {
                if(((Fondo)getWorld()).moverse==true)
                {
                    setLocation(getX()-((Fondo)getWorld()).velocity,getY());
                }
                if(Greenfoot.mouseDragged(this)==true)
                {
                    int Mx=Greenfoot.getMouseInfo().getX();
                    int My=Greenfoot.getMouseInfo().getY();
                    setLocation(Mx,My);
                }
                if(Greenfoot.mouseDragEnded(this) && b==false)
                {
                    double angle=calcAngle();
                    //System.out.println(angle);
                    int dist=calcDistance();
                    //System.out.println(dist);
                    d=dist/2.6;
                    Vx=d*((Math.cos(Math.toRadians(angle))));
                    Vy=d*((Math.sin(Math.toRadians(angle))));
                    Y=getExactY();
                    b=true;
                }
            }
            if(b==true)
            {
                t+=.1;
                h=altura(t);
                //if(getX()<=1100)
                //{
                    PX=getExactX()+(Vx*0.9);
                //}
                //else
                //{
                //    ((Fondo)getWorld()).dibujar(Vx);
                //}
                PY=Y-(16*h);
                setLocation(PX,PY);
                addClouds();
                if(getExactY()>550 && getExactX()>200 /*|| getExactX()>=1080*/)
                {
                    
                    ((Fondo)getWorld()).moverse=false;
                    ((Fondo)getWorld()).back=1;
                    ((Fondo)getWorld()).velocity*=-1;
                    Greenfoot.delay(50);
                    ((Fondo)getWorld()).moverse=true;
                    //((Fondo)getWorld()).nextBird=true;
                    getWorld().removeObject(this);
                    return;
                }
                if(flag==0)
                {
                    if(getX()>=570)
                    {
                        ((Fondo)getWorld()).moverse=true;
                        ((Fondo)getWorld()).velocity=Vx;
                        flag=1;
                    }
                }
                /*if(((Fondo)getWorld()).moverse==true)
                {
                    //setLocation(getX()-((Fondo)getWorld()).velocity,getY());
                    List<SmoothMover> objs=getWorld().getObjects(SmoothMover.class);
                    for(SmoothMover S:objs)
                    {
                        if(S.Fon==true)
                             S.move(((Fondo)getWorld()).velocity);
                        else
                            S.move(-(((Fondo)getWorld()).velocity));
                    }
                    System.out.println(((Fondo)getWorld()).velocity);
                }*/
            }
    }
    public void act()
    {
        
            Todo();
    }
}
