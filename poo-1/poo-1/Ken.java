import greenfoot.*;  

public class Ken extends Player2
{
    Score scr = new Score();
    VidaPlayer2 vp2 = new VidaPlayer2();
    
    public void act()
    {
        move();
        apanhaChave(this);
        tiraVida();
    }
    
    public void tiraVida()
    {
        if (isTouching(Spy.class))
        {
            Greenfoot.playSound("dead.mp3");
            vp2.removeHealthKen(2);
        }
    }
    
    protected void move()
        {
            if (Greenfoot.isKeyDown("up"))
            {       
                if (!checkForBGWall('u') && !checkForBGWall('u'))
                    {
                    setLocation(getX(), getY() - 2);
                }
            }
            if (Greenfoot.isKeyDown("down"))
            {
                if (!checkForBGWall('d') && !checkForBGWall('d'))
                {
                    setLocation(getX(), getY() + 2);
                }
            }
            if (Greenfoot.isKeyDown("left"))
            {
                if (!checkForBGWall('l') && !checkForBGWall('l'))
                {
                    setLocation(getX() - 2, getY());
                }
            }
            if (Greenfoot.isKeyDown("right"))
            {
                if (!checkForBGWall('r') && !checkForBGWall('r'))
                {
                    setLocation(getX() + 2, getY());
                }
            }
    }
}