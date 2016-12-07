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
        Mesita m1;
        Pastilla p1;
        Pastilla p2;

        m1 = new Mesita();
        p1 = new Pastilla();
        p2 = new Pastilla();

        addObject(m1,145,383);
        addObject(p1,448,378);
        addObject(p2,522,358);
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(2, 5, 0);
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);
    }
}
