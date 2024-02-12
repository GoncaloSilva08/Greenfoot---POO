import greenfoot.*;  

public class VidaPlayer2 extends Vidas
{
    private static int healthKen;
    private Greenfoot Image;
    Score scr = new Score();
    
    public void act()
    {
    }
    
    public int getHealthKen()
    {
        return healthKen;
    }
    
    public void setHealthKen(int hk)
    {
         healthKen = hk;
    }
    
    public void removeHealthKen(int hk)
    {
        healthKen = healthKen - hk; 
    }
}
