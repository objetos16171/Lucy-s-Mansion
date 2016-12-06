import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoJefeCinco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoJefeCinco extends CuartoJefe
{
    /**
     * Constructor for objects of class CuartoJefeCinco.
     * 
     */
    public CuartoJefeCinco()
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
        puertas[0] = new Puerta(3, 5, 0);   //Va al Cuarto 5, nivel 5
        puertas[1] = new Puerta(6, 0, 0);   //Va al Cuarto de Azotea, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
        addObject(puertas[1], 800, 330);
    }
}
