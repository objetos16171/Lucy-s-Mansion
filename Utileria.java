import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * SuperClase para los muebles, no es gran cosa, pero de aquí habrá distintos muebles, imágenes y posiciones.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:03.11.16
 */
public class Utileria extends Actor
{
    protected int ubicacionX;
    protected int ubicacionY;
    protected GreenfootImage imagenMueble;
    private Jugador player;
   
    public Utileria(String cadena)
    { 
        //imagenMueble = new GreenfootImage(cadena);
    }
        
    public void act()
    {  
        if(isTouching(Jugador.class))
        {
            Escenario w =(Escenario) getWorld();
            player = w.getJugador();
            if(player.getIsAttack())
                destruye();
        }
        else if(isTouching(Disparo.class))
           destruye();
    }
  
    /**
     * Drop
     * se usa un random para ver si tiene un elemento de la subclase PowerUp
     * según sea el caso aperecera una llave,un muffin o una pastilla
     * @author Lucy Cárdenas
     * 
     * @version 15.11.16 
     */
    public void dropObj()
    {
        int aleatorio = Greenfoot.getRandomNumber(100);
        if(aleatorio < 10)
        {
             getWorld().addObject(new Pastilla(), ubicacionX, ubicacionY);
        }
        else if(aleatorio > 10 && aleatorio < 20)
        {
             getWorld().addObject(new Muffin(), ubicacionX, ubicacionY);
        }
    }    
    
    /**
     * Explota
     * sirve para checar que si el objeto recibe 3 golpes se destruya   
     * se elimina la mesita, la sillita,el silloncito,el maguey.        
     * @author Lucy Cárdenas
     * 
     * @version 16.11.16 
     */
    public void explota()
    {
        imagenMueble = new GreenfootImage("explosion.png");
        getWorld().repaint();
        getWorld().removeObject(this);
       //Luego se elimina de memoria;
    }
    
    /**
     * destruye - Se encarga de destruir el objeto, en animacion y en memoria
     * También se encarga de ver si se tira algún objeto
     */
    private void destruye()
    {
        dropObj();
        explota();
    }
}    
            