import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoDos extends CuartoNormal
{

    /**
     * Constructor for objects of class CuartoDos.
     * 
     */
    public CuartoDos()
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
        puertas[0] = new Puerta(1, 0, 0);   //Va a La Recepcion, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
    }
}
