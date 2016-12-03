import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RecuperacionDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecuperacionDos extends CuartoRecuperacion
{
    /**
     * Constructor for objects of class RecuperacionDos.
     * 
     */
    public RecuperacionDos()
    {
        super();
        iniciaPuertas();
        colocaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(2, 5, 0);
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
    }
}
