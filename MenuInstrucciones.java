import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * -----------------------------TERMINADA------------------------------------
 * Clase menú intrucciones, se encarga de dibujar el menu de instrucciones y ya.
 * 
 * @author Aurora "Hoshi" Gonzales
 * @version 1.0.15.11.16 
 */
class MenuInstrucciones extends World
{
    private GreenfootImage fondo;   //Variable de la imagen "instrucciones"
    private World w;                //Variable de World
    
    /**
     * Constructor de objetos de la clase MenuInstrucciones.
     */
    public MenuInstrucciones()
    {   
        super(850, 480, 1);
    }
    
    /**
     * act - El ciclo principal que repetira una y otra vez
     */
    public void act()
    {
        setBackground(fondo); //Establece imagen como fondo de pantalla.
        
        if(Greenfoot.isKeyDown("enter"))
        {
            w = new MenuPrincipal();
            Greenfoot.setWorld(w);
        }
    }
}
