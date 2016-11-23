import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
import java.lang.Class;

/**
 * Write a description of class Sillita here.
 * 
 * @author Aurora 
 * @version 1.2.21.11.16
 */
public class Sillita extends Utileria
{
    private int danio = 0;
     
    /**
     *  Constructor que coloca la imagen nwn
     *  @author Aurora
     *  @version 1.2.21.11.16
     */
    public Sillita()
    {
        super("silla.png");   
    }
    
    /**
     * Act - do whatever the Sillita wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * Método para comprobar si la silla ha sido destruida, si es así te dará una pastilla o muffin para recuperar vida
     * @author Aurora
     * @version 1.2.21.11.16
     */
    public void sillaDestruida()
    {
		int aleatorio = Greenfoot.getRandomNumber(5);

		if(aleatorio == 1)
       	{
           	 getWorld().addObject(new Pastilla(), 200, 200);
       	}
  		else if(aleatorio == 0)
   		{
       		getWorld().addObject(new Muffin(), 200, 200);
   		}
		
   		getWorld().removeObject(this);
    }
    
    public void getDanio()
    {
        if(isTouching(Jugador.class))
        {
        	danio++;
            if(danio >= 3)
            {
                    sillaDestruida();
            }
        }
    }
}