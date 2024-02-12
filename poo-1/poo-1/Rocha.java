import greenfoot.*;  

public class Rocha extends Level2
{
    public void act() 
    {
        removerrocha();
    }

    public void removerrocha()
    {
        setLocation(getX() - 3, getY());
        if (atWorldEdge() == true) 
        { 
             getWorld().removeObject(this); 
        }
    }
    
    public boolean atWorldEdge()  
    { 
        if (getX() == 0) {
            return true;
         } else {
            return false;
         }
    } 
    
    
    }