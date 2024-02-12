import greenfoot.*;  

public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Controls()
    {    
        super(1200, 700, 1); 
    }
    
    public void act()
    {   
        if (Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new Nivel1()); 
    }
    
    
}
