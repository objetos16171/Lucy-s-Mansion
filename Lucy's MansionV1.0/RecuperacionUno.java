import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReuperacionUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecuperacionUno extends CuartoRecuperacion
{
    /**
     * Constructor for objects of class ReuperacionUno.
     * 
     */
    public RecuperacionUno()
    {
        super();
        Sillita s1;
        Muffin  m1;
        
        m1 = new Muffin();
        s1 = new Sillita();
            
        addObject(m1,431,332);
        addObject(s1,324,362); 
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(1, 0, 0);
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);        
    }
}
