import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class;
import java.util.List;

/**
 * Write a description of class Pastilla here.
 * 
 * @author (Hoshi) 
 * @version (1.1.14.11.16)
 */
public class Pastilla extends PowerUp
{     
    private Jugador jug[] = {null}; //Arreglo de imagenes del jugador
    
    /**
     * Constructor que coloca la imagen nwn
     * @author Aurora 
     * @version 1.1.14.11.16
     */
    public Pastilla()
    {
        super("pastilla.png");
    }
    
    /**
     *  Metodo modifica -> modifica los atributos del jugador y la pastilla cada cierto tiempo n.n
     *  @author Aurora
     *  @version 1.2.15.11.16
     */
    public void modifica()
    {
        World w = getWorld(); //Obtiene el mundo de jugador 
        jug[0] = w.getObjects(jugador); //Obtener el objeto jugador.
        jug[0].setAumentoVida(10); //Decirle al jugador que modifique su vida cada cierto tiempo.
        removeTouching(Pastilla.class); //Quita el objeto "pastilla"
    }
}

