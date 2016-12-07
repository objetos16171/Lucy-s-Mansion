import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CuartoJefeCinco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartoJefeCinco extends CuartoJefe
{
    /**
     * Constructor for objects of class CuartoJefeCinco.
     * 
     */
    public CuartoJefeCinco()
    {
        super();
        Mesita m1;
        Mesita m2;
        FGenerico f1;
        m1 = new Mesita();
        m2 = new Mesita();
        f1 = new FGenerico();
            
        addObject(m1,373,341);
        addObject(m2,240,343);
        addObject(f1, 176, 218);
        addObject(new FWong(), 782, 316);
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    protected void iniciaPuertas()
    {   
        puertas[0] = new Puerta(3, 5, 0);   //Va al Cuarto 5, nivel 5
        puertas[1] = new Puerta(6, 0, 0);   //Va al Cuarto de Azotea, nivel 0
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 64, 316);
        addObject(puertas[1], 782, 316);
    }
}
