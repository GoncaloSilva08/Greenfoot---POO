import greenfoot.*;  

public class Fim extends World
{
    Score scr = new Score();
    
    public Fim()
    {    
        super(1200, 700, 1); 
        Greenfoot.playSound("Victory.mp3");
        showText("Score: " + scr.getScore(), getWidth()/2, getHeight() - getHeight()/3);
    }
}

