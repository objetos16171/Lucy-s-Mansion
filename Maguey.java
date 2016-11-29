import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maguey here.
 * @author Aurora 
 * @version 1.2.21.11.16
 */
public class Maguey extends Utileria
{
    /**
     *  Constructor que coloca la imagen nwn
     *  @author Aurora
     *  @version 1.3.23.11.16
     */
    public Maguey(String cadena)
    {
        super("maguey.png");   
    }
    
    /**
     * Act - do whatever the Maguey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * Método para comprobar si el maguey ha sido destruido, si es así te dará la llave final.
     * @author Aurora
     * @version 1.2.21.11.16
     */
    public void getMagueyDestruido()
    {
		getWorld().addObject(new Llave(), 200, 200);
		getWorld().removeObject(this);
    }
}