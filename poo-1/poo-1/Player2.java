import greenfoot.*;  

public class Player2 extends Players
{

    public void act()
    {
        move();
    }
    
    protected void move()
        {
            if (Greenfoot.isKeyDown("up") )
            {
                setLocation(getX(), getY() - 4);
            }
            if (Greenfoot.isKeyDown("down"))
            {
                setLocation(getX(), getY() + 4);
            }
            if (Greenfoot.isKeyDown("left")){
                setLocation(getX()-2, getY());
            }
            if (Greenfoot.isKeyDown("right")){
                setLocation(getX() + 2, getY());
            }
    }
}
