import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SalirJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class SalirJuego extends Boton{
    public SalirJuego(String nombreImagen){
        super(nombreImagen);
    }
    
    /**
     * Act - do whatever the SalirJuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            System.exit(0);
        }
    }    
}
