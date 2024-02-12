import greenfoot.*;  

public class Bonus_Azul extends Level2
{
    public void act()
    {
        move();
        removerbalao();
    }

    public void move()
    {
        setLocation(getX()- 2, getY() );
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
         if (getX() == 0) {
            return true;
         } else {
            return false;
         }
     } 
}