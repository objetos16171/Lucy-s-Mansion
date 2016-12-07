import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoTres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoTres extends CuartoNormal
{
    /**
     * Constructor for objects of class CuartoTres.
     * 
     */
    public CuartoTres()
    {
        super();        
        
        Mesita m;
        FGenerico f1, f2;
        
        m = new Mesita();
        f1 = new FGenerico();
        f2 = new FGenerico();
        
        addObject(m, 430, 364);
        addObject(f1, 296, 268);
        addObject(f2, 673, 162);
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
        puertas[0] = new Puerta(2, 4, 0);   //Va al Pasillo 4, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);
    }
}
