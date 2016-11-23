import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
import java.lang.Class;

/**
 * Write a description of class CuartoMaguey here.
 * @author (Aurora) 
 * @version (1.1.18.11.16)
 */

public class CuartoMaguey extends Escenario
{
    private Maguey magueysito; //Variable de tipo Maguey.
    
    /**
     * Constructor for objects of class CuartoMaguey.
     */
    public CuartoMaguey(String nombreFondo, int numPuertas, Jugador jug)
    {
        super(nombreFondo, numPuertas, jug);  
        magueysito = new Maguey(); //Crear un nuevo objeto Maguey.
        addObject(magueysito, 425, 240); //Agregar objeto maguey en las coordenadas centrales.
    }
    
    /**
     *  Act - aquí está lo que se quiere que el actor haga. Este método es
     * llamado cada que los botones 'Act' o 'Run' son presionados. Un ciclo. 
     * @author Aurora
     * @version 1.1.18.11.16
     */
    public void act()
    {
        if(getJugador().getNvLlave() <= 5) //Comprobar que tenga menos de 5 llaves el jugador
        {
            getJugador().setDanio() = 0; //El daño es igual a cero, por lo tanto no puede destruir el maguey.
        }
            else if (getMaguey().getMagueyDestruido()) //Comprobar si ha sido destruido el maguey. Al destruirse libera la llave final.
            {
                if(getJugador().getNvLlave() >= 6) //Pregunta si el jugador está en el nivel 6 o más
                {
                    Greenfoot.setWorld(new Creditos()); //Llama a los créditos para terminar el juego.
                }
            }
    }
}

