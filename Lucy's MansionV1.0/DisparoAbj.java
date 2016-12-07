import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisparoAbj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisparoAbj extends Disparo
{
    public DisparoAbj(int danio)
    {
        super(danio, "bala2.gif");
    }
    
    public void muevete()
    {
        setLocation(this.getX(), this.getY()+10);
    }
}
