import greenfoot.*;  

public class Barbie extends Player1
{
    private int chavesApanhadasBarbie = 0;
    VidaPlayer1 vp1 = new VidaPlayer1();
    Score scr = new Score();
    public void act()
    {
        move();
        apanhaChave(this);
        tiraVida();
    }

    public int getChavesApanhadasBarbie()
    {
        return chavesApanhadasBarbie;
    }
    
    public void tiraVida()
    {
        if (isTouching(Spy.class))
        {
            Greenfoot.playSound("dead.mp3");
            vp1.removeHealthBarbie(2);
        }
    }
    
    protected void move()
    {
        if (Greenfoot.isKeyDown("W"))
            {   
                if (!checkForBGWall('u') && !checkForBGWall('u'))
                {
                    setLocation(getX(), getY() - 2);
                }
            }
        if (Greenfoot.isKeyDown("S"))
            {
                if (!checkForBGWall('d') && !checkForBGWall('d'))
                {
                    setLocation(getX(), getY() + 2);
                }
            }
        if (Greenfoot.isKeyDown("A"))

            {
                if (!checkForBGWall('l') && !checkForBGWall('l'))
                {
                    setLocation(getX() - 2, getY());
                }
            }
        if (Greenfoot.isKeyDown("D"))
            {
                if (!checkForBGWall('r') && !checkForBGWall('r'))
                {
                    setLocation(getX() + 2, getY());
                }
            }
    }
}
