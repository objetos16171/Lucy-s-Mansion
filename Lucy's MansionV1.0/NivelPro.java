import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NivelPro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class NivelPro extends Boton
{
    private Jugador player;
    private Escenario mundoSig;
    
    public NivelPro(String nombreBoton)
    {
        super(nombreBoton);
    }
    
    /**
     * act - Este act sólo se encarga de recibir un click, asignar atributos y mandar al usuario a la ver... a la recepción
     * 
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            player = new Jugador(1, 425, 380, "Lucy0.png");
            mundoSig = new Recepcion();
            mundoSig.setJugador(player);
            Greenfoot.setWorld(mundoSig);
        }
    }    
}
