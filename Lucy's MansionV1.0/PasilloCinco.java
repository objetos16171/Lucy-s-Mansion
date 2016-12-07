import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PasilloCinco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PasilloCinco extends Pasillo
{
    /**
     * Constructor for objects of class PasilloCinco.
     * 
     */
    public PasilloCinco()
    {
        super(); 
        //iniciaPuertas();
        //colocaPuertas();
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    /**
     * Sobrecarga del Método inicia puertas, cada pasillo tiene puertas distintas.
     */
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(4, 4, 4);    //Al Jefe 4, nivel 4
        puertas[1] = new Puerta(5, 2, 4);    //A Recuperación 2  
        puertas[2] = new Puerta(3, 5, 4);    //Al cuarto 5, nivel 4
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);
        addObject(puertas[1], 250, 257);
        addObject(puertas[2], 602, 257);   
    }
}
