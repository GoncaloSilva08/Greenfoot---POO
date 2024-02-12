import greenfoot.*;  

public class Spy extends Level1
{   
    public void act()
    {
        move(2);
        avoidWall();
    }
    
    private void avoidWall()
    { 
        if(isTouching(Wall.class))
        {
            turn(180);
            getImage().mirrorVertically();
        }
    }
}
