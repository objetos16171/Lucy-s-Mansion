import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PasilloUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PasilloUno extends Pasillo
{   
    
    /**
     * Constructor for objects of class PasilloUno.
     * 
     */
    public PasilloUno()
    {
        super();
        //addObject(player, 782, 316);
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
        puertas[0] = new Puerta(4, 1, 1);
        puertas[1] = new Puerta(3, 1, 0);
        puertas[2] = new Puerta(1, 0, 0);
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 247, 257);
        addObject(puertas[1], 594, 257);
        addObject(puertas[2], 782, 316);
    }
}
