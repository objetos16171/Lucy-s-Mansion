import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
/**
 * Write a description of class Globo_de_texto here.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:31.10.16
 */
public class GloboDeTexto extends Actor
{
    private GreenfootImage image; //Variable para una imagen privada
    final private int posX = 425; //Variable posición en X
    final private int posY = 405; //Variale posición en Y
    /**
     * Act - do whatever the Globo_de_texto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Aqui vas a poner una imagen de greenfoot para cada letra del abecedario, consumira memoria, pero no RAM.
    //Ademas una imagen para la nube. Vas a sustituir el ciclo principal en esta calse para hacer la animacion :v
    
    //El objetivo es mandarle una cadena desde el mundo con y que sólo pase una vez en la historia. 
    public void act() 
    {
        // Add your action code here.
    } 
    
    /**
     * Constructor que recibe una cadena para abrir una imagen.
     * @author Aurora
     * @version 1.1-09.11.16
     */
    public GloboDeTexto(String str)
    {
        image = new GreenfootImage(str);
    }
    
    /**
     * Método sin parámetros que regresa la posición en X de la imagen.
     * @author Aurora
     * @version 1.1.09.11.16
     **/
    public int getPosX()
    {
        return posX;
    }
    
    /**
     * Método sin parámetros que regresa la posición en Y de la imagen.
     * @author Aurora
     * @version 1.1.09.11.16
     */
    public int getPosY()
    {
        return posY;
    }
}
