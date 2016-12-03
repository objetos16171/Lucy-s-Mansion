import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terraza here.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:31.10.16
 */
public class Azotea extends Escenario{
    /**
     * Constructor for objects of class Terraza.
     * 
     */
    public Azotea()
    {
        super("FondoAzotea.png");
        iniciaPuertas();
        colocaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(6, 0, 5);       //Al cuarto de azotea, nivel 5
        puertas[1] = new Puerta(8, 0, 6);       //Al cuarto de Maguey, nivel 6
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
        addObject(puertas[1], 800, 330);
    }
}
