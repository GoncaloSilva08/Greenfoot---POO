import greenfoot.*;  

public class Players extends Actor
{
    Score scr = new Score();
    
    public void act()
    {
        apanhaBonus();
    }
    
    public void apanhaChave(Barbie b) 
    {
        if (isTouching(Key.class))
        {
            Nivel1.chavesApanhadas++;
            removeTouching(Key.class);
            Greenfoot.playSound("ksound.mp3");
            scr.addScore(50);
        }
    }
    
        public void apanhaChave(Ken k) 
    {
        if (isTouching(Key.class))
        {
            Nivel1.chavesApanhadas++;
            removeTouching(Key.class);
            Greenfoot.playSound("ksound.mp3");
            scr.addScore(50);
        }
    }
    
    public void apanhaBonus()
    {
        if (isTouching(Bonus.class))
        {
            Nivel2.bonusApanhados++;
            removeTouching(Bonus.class);
            Greenfoot.playSound("ksound.mp3");
            scr.addScore(150);
        }
        if (isTouching(Bonus_Azul.class))
        {
            Nivel2.bonusApanhados++;
            removeTouching(Bonus_Azul.class);
            Greenfoot.playSound("ksound.mp3");
            scr.addScore(200);
        }
    }
    
        public boolean checkForBGWall(char direcao)
    {
        Color cor = null;
        
        if (direcao == 'l')
        {
            cor = getWorld().getBackground().getColorAt(getX() - 20, getY());
        }
        else if (direcao == 'r')
        {
            cor = getWorld().getBackground().getColorAt(getX() + 20, getY());
        }
        else if (direcao == 'd')
        {
            cor = getWorld().getBackground().getColorAt(getX(), getY() + 20);
        }
        else if (direcao == 'u')
        {
            cor = getWorld().getBackground().getColorAt(getX(), getY() - 20);
        }
        
        int r = cor.getRed();
        int g = cor.getGreen();
        int b = cor.getBlue();
        
        if ((r < 30) && (g <30) && (b <30))
        {
            return true;
        }
        return false;
    }
}
