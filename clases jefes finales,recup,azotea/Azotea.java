import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terraza here.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:31.10.16
 */
public class Azotea extends Escenario{
    /**
     * Constructor for objects of class Terraza.
     * 
     */
    public Azotea()
    {
        super("FondoAzotea.png");
     
        Mesita m1;
        Sillita s1,s2;
       
        m1 = new Mesita();
        s1 = new Sillita();
        s2 = new Sillita();
        
        addObject(m1,229,404);
        addObject(s1,460,375);
        addObject(s2,359,419);
    }
    
    public void act() 
    {
        compruebaPuertas();
    }
    
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(6, 0, 5);       //Al cuarto de azotea, nivel 5
        puertas[1] = new Puerta(8, 0, 6);       //Al cuarto de Maguey, nivel 6
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
        addObject(puertas[1], 800, 330);
    }
}
