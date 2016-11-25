import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUp here.
 * 
 * @author (Aurora) 
 * @version (1.1.16.11.16)
 */
public abstract class PowerUp extends Actor
{
    private String str;
    private GreenfootImage imagen;
    
    /**
     * Constructor PowerUp
     * @author Aurora
     * @version 1.1.16.11.16
     */
    public PowerUp(String str)
    {
        imagen = new GreenfootImage(str);
    }
    
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isTouching(Jugador.class)) 
        {
            modifica();
        }
    }
    
    /**
     * Método protegido y abstracto llamado: modifica()
     * @author Aurora
     * @version 1.1.16.11.16
     * 
     */
    protected abstract void modifica();
}