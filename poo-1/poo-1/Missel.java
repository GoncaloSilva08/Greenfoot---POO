import greenfoot.*;  

public class Missel extends Player2
{
    public void act()
    {
        movermissil();
        removermissel();
    }
    
    public void movermissil()
    {
        setLocation(getX() + 5,getY());
    }

    public boolean atWorldEdge()  
    { 
     if (getX() >= 1199) {
            return true;
     } else {
            return false;
     }
    } 
    
    public void removermissel()
    {
        Actor rocha = getOneIntersectingObject(Rocha.class);
        if (rocha != null){
        getWorld().removeObject(rocha);
        getWorld().removeObject(this);
        }
        else if (atWorldEdge() == true) 
        { 
        getWorld().removeObject(this); 
        }
    }
}

