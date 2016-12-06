import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoMaguey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoMaguey extends Escenario{
    /**
     * Constructor for objects of class CuartoMaguey.
     * 
     */
    public CuartoMaguey()
    {
        super("FondoCuartoMaguey.png");        
        iniciaPuertas();
        colocaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(7, 0, 5);
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
    }
}

