import greenfoot.*;  

public class Bonus extends Level2
{
    public void act()
    {
        move();
        removerbalao();
    }

    public void move()
    {
        setLocation(getX(), getY() -1);
    }
    
    public void removerbalao()
    {
        if (atWorldEdge() == true) 
        { 
            getWorld().removeObject(this); 
        }
    }
    
    public boolean atWorldEdge()  
    { 
         if (getY() == 0) {
            return true;
         } else {
            return false;
         }
     } 
}
