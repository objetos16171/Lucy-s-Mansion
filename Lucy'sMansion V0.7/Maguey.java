import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maguey here.
 * 
 * Algo aquí no va a funcionar bien
 * 
 * @author Aurora 
 * @version 1.2.21.11.16
 */
public class Maguey extends Utileria
{
    private int danio = 0;
    
    /**
     *  Constructor que coloca la imagen nwn
     *  @author Aurora
     *  @version 1.2.21.11.16
     */
    public Maguey()
    {
        super("maguey.png");   
    }
    
    /**
     * Act - do whatever the Maguey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getDanio();
    }    
    
    /**
     * Método para comprobar si el maguey ha sido destruido, si es así te dará la llave final.
     * @author Aurora
     * @version 1.2.21.11.16
     */
    private void getMagueyDestruido()
    {
		getWorld().addObject(new Llave(), 200, 200);
		getWorld().removeObject(this);
    }
    
    private void getDanio()
    {
        if(isTouching(Jugador.class))
        {
            danio++;
            if(danio >= 3)
            {
                getMagueyDestruido();
            }
        }
    }
}