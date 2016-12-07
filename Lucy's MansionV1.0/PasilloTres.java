import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PasilloTres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PasilloTres extends Pasillo
{
    /**
     * Constructor for objects of class PasilloTres.
     * 
     */
    public PasilloTres()
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
        puertas[0] = new Puerta(1, 0, 0);    //A la recepción
        puertas[1] = new Puerta(2, 4, 0);    //Al pasillo 4  
        puertas[2] = new Puerta(4, 4, 4);    //Cuarto Jefe 4, nivel 4
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 725, 275);
        addObject(puertas[1], 64, 316);
        addObject(puertas[2], 782, 316);
    }
}
