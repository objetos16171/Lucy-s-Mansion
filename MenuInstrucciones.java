import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase menú intrucciones, se encarga de dibujar el menu de instrucciones. y ya, lo juro :'v
 * 
 * @author Aurora "Hoshi" Gonzale
 * @version 1.0.15.11.16 
 */
class MenuInstrucciones extends World{
    private GreenfootImage fondo;   //Variable de la imagen "instrucciones"
    private World w;                //Variable de World
    
    /**
     * Constructor for objects of class MenuInstrucciones.
     * author
     * version 1.0.07.11.16
     */
    public MenuInstrucciones(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 480, 1);
        w = new MenuInstrucciones();
        //fondo = new GreenfootImage("Instrucciones.png"); //Guarda imagen en memoria
    }
    
    public void act(){
        setBackground(fondo); //Establece imagen como fondo de pantalla.
        if(Greenfoot.isKeyDown("enter")){
            w = new MenuPrincipal();
            Greenfoot.setWorld(w);
        }
    }
}
