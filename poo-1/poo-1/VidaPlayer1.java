import greenfoot.*;  

public class VidaPlayer1 extends Vidas
{
    private static int healthBarbie;
    private Greenfoot Image;
    Score scr = new Score();
    
    public void act()
    {
    }
    
    public int getHealthBarbie()
    {
        return healthBarbie;
    }
    
    public void setHealthBarbie(int hb)
    {
         healthBarbie = hb;
    }
    
    public void removeHealthBarbie(int hb)
    {
        healthBarbie = healthBarbie - hb; 
    }
}
