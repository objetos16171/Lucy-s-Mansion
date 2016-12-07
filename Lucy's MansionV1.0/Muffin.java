import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muffin here.
 * 
 * @author (Aurora) 
 * @version (1.1.14.11.16)
 */
public class Muffin extends PowerUp
{ 
    private Jugador jug; //Apuntador del jugador
    
    /**
     * Constructor que coloca la imagen :D
     * @author Aurora 
     * @version 1.1.14.11.16
     */
    public Muffin()
    {
        super("muffin.png"); //Colocar imagen del muffin.
    }
    
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Jugador.class))  //Si estátocando algo
        {
            Jugador obj = (Jugador)getOneIntersectingObject(Personaje.class);
            ((Jugador)obj).setSalud(5);
            getWorld().removeObject(this);
        }
    }    
    
    /**
     * Metodo modifica -> modifica los atributos del jugador y el muffin modifica vida de golpe xD 
     * @author Aurora
     * @version 1.2.15.11.16
     */
    
    public void modifica()
    {
        Escenario w = (Escenario) getWorld(); //Obtiene el mundo de jugador. 
        jug = w.getJugador(); //Obtener el objeto jugador.
        jug.setSalud(5); //que el jugador modifique su vida de golpe
        w.removeObject(this); //Quita el objeto "muffin"
    }
}