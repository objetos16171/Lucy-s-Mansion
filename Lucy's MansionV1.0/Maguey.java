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
    
    
    /**
     *  Constructor que coloca la imagen nwn
     *  @author Aurora
     *  @version 1.2.21.11.16
     */
    public Maguey()
    {
        super();  
       
    }
    
    public void destruye()
    {
        getWorld().addObject(new Llave(10), this.getX(), this.getY());
		getWorld().removeObject(this);
    }
    
}