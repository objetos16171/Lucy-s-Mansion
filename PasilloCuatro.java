import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PasilloCuatro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PasilloCuatro extends Pasillo
{
    /**
     * Constructor for objects of class PasilloCuatro.
     * 
     */
    public PasilloCuatro()
    {
        super(); 
        iniciaPuertas();
        colocaPuertas();
    }
    
    /**
     * Sobrecarga del Método inicia puertas, cada pasillo tiene puertas distintas.
     */
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(2, 3, 0);    //Al pasillo 3
        puertas[1] = new Puerta(3, 3, 2);    //Al cuarto 3, nivel 2  
        puertas[2] = new Puerta(3, 4, 3);    //Al cuarto 4, nivel 3
        puertas[3] = new Puerta(4, 3, 3);    //Al jefe 3, nivel 3
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 425, 430);
        addObject(puertas[1], 50, 330);
        addObject(puertas[2], 500, 330);
        addObject(puertas[3], 700, 330);
    }
}
