import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IniciaJuego here.
 * 
 * @author Damián "Mad" Martínez
 * @version 1.0.15.11.16
 */
class IniciaJuego extends Boton{
    
    public IniciaJuego(String nombreImagen){
        super(nombreImagen);
    }
    
    public void act() {
        if(Greenfoot.mouseClicked(this)){
            mundoSig = new SeleccionNivel();
            Greenfoot.setWorld(mundoSig);
        }
    }    
}
