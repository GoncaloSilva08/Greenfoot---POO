import greenfoot.*;  

public class Score extends Objetos
{
    private static int score;
    
    public void act()
    {
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setScore(int scr)
    {
        score = scr;
    }
    
    public void addScore(int scr)
    {
        score = score + scr;
    }
}
