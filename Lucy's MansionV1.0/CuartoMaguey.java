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
        super();
        Maguey ma1;
        Mesita m1;
        Silloncito s1;
        
        ma1 = new Maguey();
        m1 = new Mesita();
        s1 = new Silloncito();
            
        addObject(ma1, 700, 385);
        addObject(m1, 264, 331);
        addObject(s1, 377, 335); 
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(7, 0, 5);
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);
    }
}

