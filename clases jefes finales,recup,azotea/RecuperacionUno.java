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
        Sillita s2;
        Silloncito si1;
        Silloncito si2;
        Muffin  m1;
        
        m1 = new Muffin();
        s1 = new Sillita();
        s2 = new Sillita();
        si1 = new Silloncito();
        si2 = new Silloncito();
        
        addObject(m1,487,379);
        addObject(s2,655,338);       
        addObject(s1,555,329);       
        addObject(si1,170,345);       
        addObject(si2,248,333);       
        
        
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
        addObject(puertas[0], 50, 330);        
    }
}
