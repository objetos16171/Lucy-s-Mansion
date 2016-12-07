import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoUno extends CuartoNormal
{
    /**
     * Constructor for objects of class CuartoUno.
     * 
     */
    public CuartoUno()
    {
        super();
        
        Mesita m;
        Sillita s1, s2;
        FGenerico f1, f2; 
        
        m = new Mesita();
        s1 = new Sillita();
        s2 = new Sillita();
        //f1 = new FGenerico();
        //f2 = new FGenerico();
        
        addObject(m, 671, 356);
        addObject(s1, 281, 352);
        addObject(s2, 551, 352);
        //addObject(f1, 176, 218);
        //addObject(f2, 697, 276);
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
        puertas[0] = new Puerta(2, 1, 0);   //Va al Pasillo 1, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
    }
}
