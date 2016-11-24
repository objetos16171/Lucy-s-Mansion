import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Pastilla here.
 * 
 * @author Hoshi 
 * @version 1.1.14.11.16
 */
public class Pastilla extends PowerUp
{     
    private Jugador jug; //Apuntador del jugador
    
    /**
     * Constructor que coloca la imagen nwn
     * @author Aurora
     * @version 1.2.23.11.16
     */
    public Pastilla()
    {
        super("pastilla.png"); //Colocar imagen de la pastilla.
    }
    
    /**
     *  Metodo modifica -> modifica los atributos del jugador y la pastilla cada cierto tiempo n.n
     *  @author Aurora
     *  @version 1.5.23.11.16
     */
    public void modifica()
    {
        Escenario w = (Escenario) getWorld(); //Obtiene el mundo de jugador. 
        jug = w.getJugador(); //Obtener el objeto jugador. 
        jug.setAumentoVida(1); //Decirle al jugador que modifique su vida cada cierto tiempo.
        w.removeObject(this); //Quita el objeto "Pastilla"(Pastilla.class); //Quita el objeto "Pastilla"
    }
}