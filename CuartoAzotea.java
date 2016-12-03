import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cocina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class CuartoAzotea extends Escenario{
    /**
     * Constructor for objects of class Cocina.
     * 
     */
    public CuartoAzotea(){
        super("FondoAzotea.png");
        iniciaPuertas();
        colocaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(4, 5, 5);       //Va al cuarto de Jefe 5, nivel 5
        puertas[1] = new Puerta(7, 0, 5);       //Va a la azotea, jefe final, nivel 5
    }
}
