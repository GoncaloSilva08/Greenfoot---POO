import greenfoot.*;  

public class Nivel2 extends World
{
    public static int bonusApanhados;
    
    int contagempedra = 0;
    int contagempeixe=0;
    Algas algas = new Algas();
    Algas algas1 = new Algas();
    Algas algas2 = new Algas();
    Algas algas3 = new Algas();
    Algas algas4 = new Algas();
    Kelp kelp = new Kelp();
    Kelp kelp1 = new Kelp();
    Kelp kelp2 = new Kelp();
    Kelp kelp3 = new Kelp();
    Kelp kelp4 = new Kelp();
    Bonus bonus = new Bonus();
    Score scr = new Score();
    Portal portal = new Portal();
    
    Estrela estrela = new Estrela();
    Estrela estrela1 = new Estrela();

    public Nivel2()
    {    
        super(1200, 700, 1); 
        
        Submarino submarino = new Submarino();
        addObject(submarino, 50, 350);
        

        submarino.getImage().scale(70,70);
        
        addObject(algas, 370, 690);       
        addObject(algas1,460,690);       
        addObject(algas2,700,690);       
        addObject(algas3,120,690);
        addObject(algas4,842,690);
        addObject(kelp, 800, 690);       
        addObject(kelp1,500,690);       
        addObject(kelp2,40,690);       
        addObject(kelp3,220,690);
        addObject(kelp4,1100,690);
        addObject(estrela,40,690);       
        addObject(estrela1,970,690);
        addObject(bonus,120,690);
        addObject(portal,1150,350);
        resetBonusApanhados(0);
        addbonus_azul1();
    }
    
    public void act(){
        showText("SCORE: " + scr.getScore(), getWidth()/2, 50);
        contagempedra++; 
        if (contagempedra>30)
        {
        addrocha1();
        contagempedra=0;
        }
    }
    
    public void addrocha1(){
        addObject(new Rocha(), 1200,Greenfoot.getRandomNumber(700));
    }
    
    public void addbonus_azul1(){
        addObject(new Bonus_Azul(), 1200,500 + Greenfoot.getRandomNumber(200));
    }
    
    public void resetBonusApanhados(int bonus)
    {
        bonusApanhados = bonus;
    }
 } 
    
