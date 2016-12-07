import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoDos extends CuartoNormal
{

    /**
     * Constructor for objects of class CuartoDos.
     * 
     */
    public CuartoDos()
    {
        super();
        
        Sillita s1, s2;
        FGenerico f1, f2;
         
        s1 = new Sillita();
        s2 = new Sillita();
        f1 = new FGenerico();
        f2 = new FGenerico();
        
        addObject(s1, 336, 342);
        addObject(s2, 435, 342);
        addObject(f1, 709, 386);
        addObject(f2, 234, 332);
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
        puertas[0] = new Puerta(1, 0, 0);   //Va a La Recepcion, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);
    }
}
