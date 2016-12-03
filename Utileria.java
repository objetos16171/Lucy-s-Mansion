import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * SuperClase para los muebles, no es gran cosa, pero de aquí habrá distintos muebles, imágenes y posiciones.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * //@author Lucy "LadyBug" Cárdenas
 * @author Daniel Wong :v ... no te daras cuenta maldito :v;
 * 
 * @version 1.0:03.11.16
 */

public class Utileria extends Actor
{
    protected GreenfootImage imagenMueble;  //Variable para imagen
    private Jugador player; //Variable para el player de tipo Jugador
   
    /**
     * Constructor que recibe una cadena como parámetro
     * @author Aurora
     * @version 1.2.28.11.16
     */
    public Utileria(String cadena)  
    { 
        imagenMueble =  new GreenfootImage(cadena);
    }
        
    /**
     * Act Method
     * @author Aurora
     * @version 1.2.28.11.16
     */
    public void act()
    {  
        if(isTouching(Jugador.class))
        {
            Escenario w =(Escenario) getWorld();    
            player = w.getJugador();
            if(player.getIsAttack())
                destruye();
        }
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
             getWorld().addObject(new Pastilla(), this.getX(), this.getY());
        }
        else if(aleatorio > 10 && aleatorio < 20)
        {
             getWorld().addObject(new Muffin(), getX(), getY());
        }
    }    
    
    /**
     * Método explota. 
     * Coloca imagen de explosión y elimina el objeto
     * @author Aurora
     * @version 1.1.23.11.16
     */
    public void explota()
    {
        imagenMueble = new GreenfootImage("explosion.png"); //Imagen de la explosión
        getWorld().repaint();   //Repintar el mundo
        getWorld().removeObject(this);  //Remueve ese objeto
    }
    
    /**
     * Método destruye.
     * @author Aurora
     * @version 1.1.23.11.16
     */
    public void destruye()
    {
        dropObj();  //Manda a llamar al método dropObj
        explota();  //Manda a llamar al método explota
    }
}    