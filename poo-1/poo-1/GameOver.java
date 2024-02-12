import greenfoot.*;  

public class GameOver extends World
{
    Score scr = new Score();
    
    public GameOver()
    {    
        super(1200, 700, 1); 
        
        Greenfoot.playSound("GameOver.mp3");
        showText("Score: " + scr.getScore(), getWidth()/2, getHeight() - getHeight()/3);
    }
}
