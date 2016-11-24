import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la clase encargada de cargar los escenarios del juego. Los objetos de está clase serán los encargados de
 * decir al mundo si se puede acceder al siguiente mundo (O al que se quiere accesar en todo caso)
 * Sólo servirá para verificar si se puede pasar, y pa' dibujar una vil puerta/escalera en pantasha
 * 
 * @author Damián "Mad" Martínez
 * @version 0.5
 */
class Puerta extends Actor{
    private int hacia;                          // Es el numero de cuarto a donde se dirige la puerta
    private int nivelReq;                       // Es el nivel de la puerta. 0 significa que es de acceso libre.
    private int posX;                           // Posiición d el actor en el eje de las X, dado que nose mmoverá en Y,
    private Jugador jugador;                  // Jugador Recibido de Mundo
    protected Escenario mundoSiguiente;
    
    protected Puerta(int haciaD, int nivel)
    {
        hacia =  haciaD;
        nivelReq = nivel;
    }
    
    /**
     * Act - hace lo que quiero que la vaina Puerta haga. Wiririri
     * Comentarios...
     * 
     */
    public void act()
    {    
        Escenario w = (Escenario)getWorld();
        jugador = w.getJugador();
        
        if(this.intersects(jugador) && Greenfoot.isKeyDown("up"))
        {
            if(jugador.getNivel() >= nivelReq)
            {
                setMundoSiguiente();
            }
            else
            {
                //Mostrar un mensaje que no se puede entrar y que se necesita una llave
            }
        }
    }
    
    /**
     * setMundoSiguiente - Este método está encargado de decidir el siguiente mundo a crear, 
     * en base al identificador que recibe el objeto de la clase Puerta por parte
     * del mundo antigüo.
     */
    protected void setMundoSiguiente()
    {
        switch(hacia)
        {
            case 1:     //A la Recepción
                mundoSiguiente = new Recepcion("NombreFodoRecepcion.png", 5, jugador, true);
                break;
            
            case 2:     //A un pasillo
                mundoSiguiente = new Pasillo("FondoPasillo.png", 2, jugador);
                break;
                
            case 3:     //A un cuarto normal
                mundoSiguiente = new CuartoNormal("FondoCuartoNor.png", 2, jugador);
                break;
            
            case 4:     //A un cuarto Jefe
                mundoSiguiente = new CuartoJefe("FondoCuartoJef.png", 2, jugador);
                //if(mundoSiguiente.)
                break;
            
            case 5:     //A un comedor (cuarto de recuperación)
                mundoSiguiente = new CuartoRecuperacion("FondoCuartoRec.png", 1, jugador);
                break;
            
            case 6:     //A un cuarto de Azotea
                mundoSiguiente = new CuartoAzotea("FondoCuartoAzotea.png", 2, jugador);
                break;
            
            case 7:     //A la azotea
                mundoSiguiente = new Azotea("FondoAzotea.png", 2, jugador);
                break;
            
            case 8:     //Al cuarto final
                mundoSiguiente = new CuartoMaguey("FondoMaguey.png", 1, jugador);
                break;
        }
        
        Greenfoot.setWorld(mundoSiguiente);
    }
}
