import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NivelMedio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class NivelMedio extends Boton{
    private Jugador player;
    
    public NivelMedio(String nombreBoton){
        super(nombreBoton);
    }
    
    /**
     * 
     */
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            player = new Jugador(2, 425, 380, "Lucy0.png");
            mundoSig = new Recepcion("FondoRecepcion.png", 4, player);
            Greenfoot.setWorld(mundoSig);
        }
    }    
}
