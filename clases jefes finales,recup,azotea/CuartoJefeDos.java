import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoJefeDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoJefeDos extends CuartoJefe
{

    /**
     * Constructor for objects of class CuartoJefeDos.
     * 
     */
    public CuartoJefeDos()
    {
        super();
              
        Silloncito s1;
        Silloncito s2;
    
        s1 = new Silloncito();
        s2 = new Silloncito();
            
        addObject(s1,419,340);
        addObject(s2,523,346);       

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
        puertas[0] = new Puerta(2, 2, 0);   //Va al Pasillo 2, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
    }
}
