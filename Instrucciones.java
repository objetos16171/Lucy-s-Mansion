import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Instrucciones extends Boton{
    
    public Instrucciones(String nombreImagen){
        super(nombreImagen);
    }
    
    public void act(){
         if(Greenfoot.mouseClicked(this)){
            mundoSig = new MenuInstrucciones();
            Greenfoot.setWorld(mundoSig);
        }
    }    
}
