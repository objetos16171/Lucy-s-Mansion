import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la clase encargada de cargar los escenarios del juego. Los objetos de está clase serán los encargados de
 * decir al mundo si se puede acceder al siguiente mundo (O al que se uiere accesar en todo caso)
 * 
 * @author Damián "Mad" Martínez
 * @version 0.1
 */
class Puerta extends Actor{
    //private int desde;                        // Es el numero de cuarto de donde viene el personaje... o algo asi.
    private int hacia;                          // Es el numero de cuarto a donde se dirige la puerta
    private int nivelReq;                       // Es el nivel de la puerta. 0 significa que es de acceso libre.
    private int posX;                           // Posiición d el actor en el eje de las X, dado que nose mmoverá en Y, a menos que salte
    //private boolean side;                     // FALSE para cargar 'to'; TRUE para cargar FROM;
    private Jugador jugador;                    // Jugador Recibido de Mundo
    protected Escenario mundoSiguiente;
    private boolean bloqueo;
    
    protected Puerta(int haciaD, int nivel){
        hacia =  haciaD;
        nivelReq = nivel;
        bloqueo = false;
    }
    
    /**
     * Act - hace lo que quiero que la vaina Puerta haga. Wiririri
     * Comentarios...
     * 
     */
    public void act(){
        if(this.intersects(jugador) && Greenfoot.isKeyDown("up")){
            setMundoSiguiente();
        }
    }
    
    /**
     * setMundoSiguiente - Este método está encargado de decidir el siguiente mundo a crear, 
     * en base al identificador que recibe el objeto de la clase Puerta por parte
     * del mundo antigüo.
     */
    protected void setMundoSiguiente(){
        switch(hacia){
            case 1:     //A la Recepción
                mundoSiguiente = new Recepcion("NombreFodoRecepcion.png", 5);
                break;
            
            case 2:     //A un pasillo
                mundoSiguiente = new Pasillo("FondoPasillo.png", 2);
                break;
                
            case 3:     //A un cuarto normal
                mundoSiguiente = new CuartoNormal("FondoCuartoNor.png", 2);
                break;
            
            case 4:     //A un cuarto Jefe
                mundoSiguiente = new CuartoJefe("FondoCuartoJef.png", 2);
                //if(mundoSiguiente.)
                break;
            
            case 5:     //A un comedor (cuarto de recuperación)
                mundoSiguiente = new CuartoRecuperacion("FondoCuartoRec.png", 1);
                break;
            
            case 6:     //A un cuarto de Azotea
                mundoSiguiente = new CuartoAzotea("FondoCuartoAzotea.png", 2);
                break;
            
            case 7:     //A la azotea
                mundoSiguiente = new Azotea("FondoAzotea.png", 2);
                break;
            
            case 8:     //Al cuarto final
                mundoSiguiente = new CuartoMaguey("FondoMaguey.png", 1);
                break;
        }
    }
}
