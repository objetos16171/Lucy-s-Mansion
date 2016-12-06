import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoCuatro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoCuatro extends CuartoNormal
{

    /**
     * Constructor for objects of class CuartoCuatro.
     * 
     */
    public CuartoCuatro()
    {
        super();     
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    /**
     * iniciaPuertas -  Este método inicia el arreglo de puertas del Escenario
     * Pasillo???? WTF?!
     * 
     */
    protected void iniciaPuertas()
    {   
        puertas[0] = new Puerta(2, 4, 0);   //Va al Pasillo 4, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
    }
}
