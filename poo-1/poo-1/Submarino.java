import greenfoot.*;  

public class Submarino extends Player1
{
    boolean podedisparar = true;
    int bonusapanhado = 0;

    /**
     * Act - do whatever the Submarino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      move();
      misselmandar();
      perdejogo();
      ganhajogo();
      apanhaBonus();
    }

    public void misselmandar()
    {
        if (Greenfoot.isKeyDown("space") && podedisparar == true){
            getWorld().addObject(new Missel(),getX()+33,getY()+28);
            podedisparar = false;
        }
        if (!Greenfoot.isKeyDown("space")){
            podedisparar = true;
        }
    }
    
    public void perdejogo()
    {
        if (isTouching(Rocha.class)){
            Greenfoot.playSound("dead.mp3");
            Greenfoot.setWorld(new GameOver());
            Greenfoot.stop();              
        }
    }
    
    public void ganhajogo()
    {
        if (atWorldEdge() == true) 
        { 
            Greenfoot.setWorld(new Fim());
        }             
    }
    
    public boolean atWorldEdge()  
    { 
        if (getX() >= 1100) 
        {
            return true;
        } else {
            return false;
        }
    }
}