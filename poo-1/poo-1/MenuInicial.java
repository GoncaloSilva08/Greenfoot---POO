import greenfoot.*;  

public class MenuInicial extends World
{
    private GreenfootSound sound;
    
    public MenuInicial()
    {    
        super(1200, 700, 1); 
           
        int larg = getWidth();
        int comp = getHeight();
        
        sound = new GreenfootSound("Pink.mp3");
        sound.setVolume(50);
        
        BarbieFace barbieface = new BarbieFace();
        addObject(barbieface, larg/2, comp/2 + 190);
        
        StartTitulo startTitulo = new StartTitulo();
        addObject(startTitulo,larg/2,150);
        
        SpaceToPlay spacetoplay = new SpaceToPlay();
        addObject(spacetoplay,larg/2,220);
    }
    
    public void act()
    {   
        if (Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new Controls());
        soundplay();
        soundstop();
    }
    
        public void soundplay()
    {   
        sound.play();
    }
    
         public void soundstop()
    {   
        if (Greenfoot.isKeyDown("space"))
        sound.stop();
    }
}
