import greenfoot.*;  

public class Nivel1 extends World
{
    public static Wall w1 = new Wall();
    public static Wall w2 = new Wall();
    public static Wall w3 = new Wall();
    public static Wall w4 = new Wall();
    public static int chavesApanhadas;
    
    VidaPlayer1 vp1 = new VidaPlayer1();
    VidaPlayer2 vp2 = new VidaPlayer2();
    Barbie barbie = new Barbie();
    Ken ken = new Ken();
    Spy spy = new Spy();
    Spy spy1 = new Spy();
    Spy spy2 = new Spy();
    Spy spy3 = new Spy();
    Spy spy4 = new Spy();
    Spy spy5 = new Spy();
    Spy spy6 = new Spy();
    Spy spy7 = new Spy();
    Score scr = new Score();
    Key key = new Key();
    Key key1 = new Key();
    Key key2 = new Key();
    Key key3 = new Key();
    Key key4 = new Key();
    Key key5 = new Key();
    KenFace kenface = new KenFace();
    BarbieFace barbieface = new BarbieFace();
    
    public void act()
    {
        verificaChaves();
        indicaVidaBarbie();
        gameOver();
        
        showText("Vida Barbie: " + vp1.getHealthBarbie(), getWidth()/8, (getHeight()/4)+25);
        showText("Vida Ken: " + vp2.getHealthKen(), getWidth()-getWidth()/8, (getHeight()/4)+25);
        
        showText("SCORE: " + scr.getScore(), getWidth()/2, 50);
    }
    
    public Nivel1()
    {    
        super(1200, 700, 1); 
        
        addObject(w1,310,350);
        w1.getImage().scale(20,600);
        
        addObject(w2,890,350);
        w2.getImage().scale(20,600);
        
        addObject(w3,390,350);
        w3.getImage().scale(20,280);
        
        addObject(w4,810,350);
        w4.getImage().scale(20,280);
        
        addObject(barbie,350,100); 
        
        addObject(ken,850,600);
        
        addObject(spy,660,350);
        
        addObject(spy1,540,349);
        
        addObject(spy2,850,100);
        
        addObject(spy3,350,600);
        
        addObject(spy4,600,440);
        
        addObject(spy5,600,260);
        
        addObject(spy6,600,520);
        
        addObject(spy7,600,180);
    
        addObject(key,350,600);
        
        addObject(key1,540,349);
        
        addObject(key2,660,350);
        
        addObject(key3,850,100);
        
        addObject(key4,600,440);
        
        addObject(key5,600,260);
        
        addObject(kenface, getWidth()-getWidth()/8, getHeight()-getHeight()/5);
        
        addObject(barbieface, getWidth()/8, getHeight()-getHeight()/5);
        
        scr.setScore(0);
        vp1.setHealthBarbie(100);
        vp2.setHealthKen(100);
        resetChavesApanhadas(0);
    }
    
    public void gameOver()
    {
        if (vp1.getHealthBarbie() == 0 || vp2.getHealthKen() == 0)
        {
            Greenfoot.delay(15);
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    public void verificaChaves()
    {
        if (chavesApanhadas == 6)
        {
            Greenfoot.setWorld(new Nivel2());
            Greenfoot.playSound("NextLevel.mp3");
        }
    }
    
    public void indicaVidaBarbie()
    {
        addObject(new VidaPlayer1(), getWidth()/8, getHeight()/4);  
        addObject(new VidaPlayer2(), getWidth()-getWidth()/8, getHeight()/4);
    }
    
    public void resetChavesApanhadas(int chaves)
    {
        chavesApanhadas = chaves;
    }  
}