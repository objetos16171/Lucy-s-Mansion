import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoCinco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoCinco extends CuartoNormal
{

    /**
     * Constructor for objects of class CuartoCinco.
     * 
     */
    public CuartoCinco()
    {
        super();        
        
        Mesita m;
        Sillita s1;
        Silloncito s2;
        FGenerico f1, f2;
        
        m = new Mesita();
        s1 = new Sillita();
        s2 = new Silloncito();
        f1 = new FGenerico();
        f2 = new FGenerico();
        
        addObject(m, 549, 391);
        addObject(s1, 403, 337);
        addObject(s2, 726, 372); 
        addObject(f1, 242, 283);
        addObject(f2, 645, 220);
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
        puertas[0] = new Puerta(2, 5, 0);   //Va al Pasillo 1, nivel 0
        puertas[1] = new Puerta(4, 5, 5);   //Va a un cuarto Jefe 5, nivel 5
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);
        addObject(puertas[1], 782, 316);
    }
}
