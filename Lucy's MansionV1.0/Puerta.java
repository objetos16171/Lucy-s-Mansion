import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la clase encargada de cargar los escenarios del juego. Los objetos de está clase serán los encargados de
 * decir al mundo si se puede acceder al siguiente mundo (O al que se quiere accesar en todo caso)
 * Sólo servirá para verificar si se puede pasar, y pa' dibujar una vil puerta/escalera en pantasha
 * 
 * 
 * Falta algo que se aplique a jugador para que sepa de que cuarto está saliendo y a cual está llegando
 * Para saber en que ubicación debe comenzar en la siguiente habitación
 * Ta complejo pero facilitará el trabajo del cpu un shorro, igual shingos de mswitchs anidados
 * más atributos pero ni pedo, con que todo salga shido
 * P.D.: No dormirás :'v 
 * 
 * 
 * @author Damián "Mad" Martínez
 * @version 1.7:30.11.16
 */
class Puerta extends Actor{
    private int hacia;                          // Es el numero de cuarto a donde se dirige la puerta
    private int haciaSub;                       // Es el numero de sub-cuarto al que se dirije
    //private Escenario desde;                  //Para saber desde que tipo de Escenario viene, pa' cargar las puertas y pasillos
    private int nivelReq;                       // Es el nivel de la puerta. 0 significa que es de acceso libre.
    private int posX;                           // Posición de la puerta en el eje de las X, dado que nose mmoverá en Y.
    private Jugador jugador;                    // Jugador Recibido de Mundo
    
    protected Puerta(int haciaD, int subDes , int nivel)
    {
        hacia =  haciaD;
        haciaSub = subDes;
        nivelReq = nivel;
    }
    
    /**
     * Act - hace lo que quiero que la vaina Puerta haga. Wiririri
     * Comentarios...
     */
    public void act()
    {    
        Escenario w = (Escenario)getWorld();
        jugador = w.getJugador();
        if(jugador != null && this.intersects(jugador) && Greenfoot.isKeyDown("up"))
        {
            if(jugador.getNivel() >= nivelReq)
            {
                decideMundoSiguiente();
            }
            else
            {
                //Mostrar un mensaje que no se puede entrar y que se necesita una llave
            }
        }
    }
    
    /**
     * decideMundoSiguiente - Este método está encargado de decidir el siguiente mundo a crear, 
     * en base al identificador que recibe el objeto de la clase Puerta por parte
     * del mundo antigüo.
     */
    protected void decideMundoSiguiente()
    {
        Escenario nuevoMundo = null;
        switch(hacia)
        {
            case 1:     //A la Recepción
                 nuevoMundo = new Recepcion();
                break;
            
            case 2:     //A un pasillo
                 nuevoMundo = iniciaMundoSiguiente(hacia, haciaSub);
                break;
                
            case 3:     //A un cuarto normal
                 nuevoMundo = iniciaMundoSiguiente(hacia, haciaSub);
                break;
            
            case 4:     //A un cuarto Jefe
                nuevoMundo = iniciaMundoSiguiente(hacia, haciaSub);
                break;
            
            case 5:     //A un comedor (cuarto de recuperación)
                nuevoMundo = iniciaMundoSiguiente(hacia, haciaSub);
                break;
            
            case 6:     //A un cuarto de Azotea
                nuevoMundo = new CuartoAzotea();
                break;
            
            case 7:     //A la azotea
                nuevoMundo = new Azotea();
                break;
            
            case 8:     //Al cuarto final
                nuevoMundo = new CuartoMaguey();
                break;
        }
        
        setMundoSiguiente(nuevoMundo);
    }
    
    /**
     * iniciaMundoSiguiente - Este método se encarga de iniciar lo mundos correctamente, si, es un switch anidado en otro, pero aunque no lo
     * parezca, es la mejor manera de conservar memoria.
     * Regresa un Escenario que creara él mismo
     */
    protected Escenario iniciaMundoSiguiente(int des, int sub)
    {
        Escenario mundo = null;
        
        switch(des)
        {
            case 2:         //Va a un pasillo
                switch(sub)
                {
                    case 1:         //Pasillo 1
                        mundo = new PasilloUno();
                        break;
                    case 2:         //Pasillo 2
                        mundo = new PasilloDos();
                        break;
                    case 3:         //Pasillo 3
                        mundo = new PasilloTres();
                        break;
                    case 4:         //Pasillo 4
                        mundo = new PasilloCuatro();
                        break;
                    case 5:         //Pasillo 5
                        mundo = new PasilloCinco();
                        break;
                }
                break;
            case 3:         //Va a un cuarto Normal
                switch(sub)
                {
                    case 1:         //Cuarto Normal 1
                        mundo = new CuartoUno();
                        break;
                    case 2:         //Cuarto Normal 2
                        mundo = new CuartoDos();
                        break;
                    case 3:         //Cuarto Normal 3
                        mundo = new CuartoTres();
                        break;
                    case 4:         //Cuarto Normal 4
                        mundo = new CuartoCuatro();
                        break;
                    case 5:         //Cuarto Normal 5
                        mundo = new CuartoCinco();
                        break;
                }
                break;
            case 4:         //Va a un cuarto Jefe
                 switch(sub)
                {
                    case 1:         //Cuarto Jefe 1
                        mundo = new CuartoJefeUno();
                        break;
                    case 2:         //Cuarto Jefe 2
                        mundo = new CuartoJefeDos();
                        break;
                    case 3:         //Cuarto Jefe 3
                        mundo = new CuartoJefeTres();
                        break;
                    case 4:         //Cuarto Jefe 4
                        mundo = new CuartoJefeCuatro();
                        break;
                    case 5:         //Cuarto Jefe 5
                        mundo = new CuartoJefeCinco();
                        break;
                }
                break;
            case 5:
                switch(sub)
                {
                    case 1:
                        mundo = new RecuperacionUno();
                        break;
                    case 2:
                        mundo = new RecuperacionDos();
                        break;
                }
                break;
        }
        return mundo;
    }
    
    /**
     * setMundoSiguiente - Sólo hace el cambio de mundo
     */
    protected void setMundoSiguiente(Escenario mundoSig)
    {
        mundoSig.setJugador(jugador);
        Greenfoot.setWorld(mundoSig);
    }
}
