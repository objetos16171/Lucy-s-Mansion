import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoCuatro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoCuatro extends CuartoNormal
{

    /**
     * Constructor for objects of class CuartoCuatro.
     * 
     */
    public CuartoCuatro()
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
        
        addObject(m, 155, 386);
        addObject(s1, 585, 331);
        addObject(s2, 702, 329); 
        addObject(f1, 457, 374);
        addObject(f2, 182, 316);
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
