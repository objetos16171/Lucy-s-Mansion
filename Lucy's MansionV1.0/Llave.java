import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Llave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Llave extends PowerUp
{
    private int nivel;
    
    public Llave(int nuevoNivel)
    {
        super("Llave.png");
        nivel = nuevoNivel;
    }
    
    public void act() 
    {
        if(isTouching(Jugador.class))  //Si estátocando algo
        {
            Jugador obj = (Jugador)getOneIntersectingObject(Personaje.class);
            ((Jugador)obj).setNivel(nivel);
            getWorld().removeObject(this);
        }
    }    
}
