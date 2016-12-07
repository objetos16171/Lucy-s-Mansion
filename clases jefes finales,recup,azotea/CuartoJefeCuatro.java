import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoJefeCuatro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoJefeCuatro extends CuartoJefe
{

    /**
     * Constructor for objects of class CuartoJefeCuatro.
     * 
     */
    public CuartoJefeCuatro()
    {
        super();
        
        Mesita m1;
        Mesita m2;

        m1 = new Mesita();
        m2 = new Mesita();
            
        addObject(m1,466,383);
        addObject(m2,191,367);       
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
        puertas[0] = new Puerta(2, 3, 0);   //Va al Pasillo 3, nivel 0
        puertas[1] = new Puerta(2, 5, 0);   //Va al Pasillo 5, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 425, 330);
        addObject(puertas[1], 50, 330);
    }
}
