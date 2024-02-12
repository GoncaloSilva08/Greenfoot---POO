import greenfoot.*;  

public class Player1 extends Players
{
    public void act()
    {
        move();
    }
    
    protected void move()
    {
        if (Greenfoot.isKeyDown("W") )
            {
                setLocation(getX(), getY() - 2);
            }
        if (Greenfoot.isKeyDown("S"))
            {
                setLocation(getX(), getY() + 2);
            }
        if (Greenfoot.isKeyDown("A")){
                setLocation(getX()-2, getY());
            }
        if (Greenfoot.isKeyDown("D")){
                setLocation(getX() + 2, getY());
            }
    }
}
