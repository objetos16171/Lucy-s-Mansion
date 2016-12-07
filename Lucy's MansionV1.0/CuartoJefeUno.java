import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoJefeUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoJefeUno extends CuartoJefe
{

    /**
     * Constructor for objects of class CuartoJefeUno.
     * 
     */
    public CuartoJefeUno()
    {
        super();
        Mesita m1;
        Silloncito s1;
        FGenerico f1;
        FGenerico f2;
        FGenerico f3;
    
        m1 = new Mesita();
        s1 = new Silloncito();
        f1 = new FGenerico();
        f2 = new FGenerico();
        f3 = new FGenerico();
            
        addObject(m1,289,363);
        addObject(s1,169,332);
        addObject(f1, 176, 218);
        addObject(f2, 176, 218);
        addObject(f3, 176, 218);
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
        addObject(puertas[0], 64, 316);
    }
}
