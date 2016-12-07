import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ---------------------------------TERMINADA--------------------------------
 * Esta clase se encarga de mostrar los créditos, o sea quien hizo este juego.
 * 
 * @author Aurora "Hoshi" Gonzales
 * @version 1.0:22.11.16
 */
public class Creditos extends World
{
    private GreenfootImage fondo;   //Variable de la imagen "Creditos"
    private World w;                //Variable de World
    
    /**
     * Constructor de objetos de la clase Creditos.
     */
    public Creditos()
    {    
        super(850, 480, 1);
        //fondo = new GreenfootImage("Creditos.png");         //Guarda imagen en memoria
    }
    
     public void act()
    {
        //setBackground(fondo); //Establece imagen como fondo de pantalla.
        
         if(Greenfoot.isKeyDown("enter"))
        {
             w = new MenuPrincipal();
            Greenfoot.setWorld(w);
        }
    }
}
