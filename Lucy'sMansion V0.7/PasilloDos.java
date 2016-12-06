import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PasilloDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PasilloDos extends Pasillo
{
    /**
     * Constructor for objects of class PasilloDos.
     * 
     */
    public PasilloDos()
    {
        super(); 
        //iniciaPuertas();
        //colocaPuertas();
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    /**
     * Sobrecarga del Método inicia puertas, cada pasillo tiene puertas distintas.
     */
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(4, 2, 2);    //Cuarto jefe 2, nivel req 2
        puertas[1] = new Puerta(1, 0, 0);    //Recepcion, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 450, 330);
        addObject(puertas[1], 50, 330);
    }
}
