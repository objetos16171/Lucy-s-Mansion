import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoUno extends CuartoNormal
{

    /**
     * Constructor for objects of class CuartoUno.
     * 
     */
    public CuartoUno()
    {
        super();      
        iniciaPuertas();
        colocaPuertas();
    }
    
    /**
     * iniciaPuertas -  Este método inicia el arreglo de puertas del Escenario
     * Pasillo???? WTF?!
     * 
     */
    protected void iniciaPuertas()
    {   
        puertas[0] = new Puerta(2, 1, 0);   //Va al Pasillo 1, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
    }
}
