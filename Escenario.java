import greenfoot.*;                                 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase escenario, padre de las clases de cada uno de los escenarios.
 * Los escenarios (Como Pasillo, CuartoNormal, etc.) heredarán de aquí la mayoría de atributos y
 * métodos.
 * En caso de ser necesarios, en las clases hijas se asignarán más métodos/atributos.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:31.10.16
 */
class Escenario extends World{
    private GreenfootImage fondo;                   //fondo de las imágenes en un munto
    private int noPuertas;                          //Numero de puertas que tendrá el escenario
    private Puerta[] puertas;                       //Arreglo para la cantidad de puertas que se usarán, que según mis cálculos son 4
    private Jugador player;                         //Jugador, se agregará cuando el jugador llegue al mundo, siempre existirá
    
    /**
     * Constructor de objetos de la clase Escenario.
     * 
     */
    protected Escenario(String nombreFondo, int numPuertas, Jugador jug)
    {    
        super(850, 480, 1);                         //Crea un mundo de 850 x 480
        noPuertas = numPuertas;                     //El número de puertas que tendrá el mundo, pa no desperdiciar memoria  
        player = jug;                               //El jugador que se irá pasando de mundo en mundo
        //fondo = new GreenfootImage(nombreFondo);    //Pos el fondo del escenario wey!
    }
    
    /**
     *  reubicaJugador - Toma al jugador y reinicia sus posiciones a la derecha o izquierda de la pantalla.
     *  El parametro direccion sera 1 o -1, representando que 1 se rein ician las posiciones a la 
     *  derecha y -1 reinicia las posiciones a la izquierda.
     */
    protected void reubicaJugador(int direccion)
    {
        if(direccion < 0)
        {
            player.setUbicacion(10);          //A la izquierda del escenario
        }
        else
        {
            player.setUbicacion(800);         //A la derecha del escenario
        }
    }
    
    protected Puerta[] getArregloPuertas()
    {
        return puertas;
    }
    
    protected void setArregloPuertas(Puerta[] arrayPuertas)
    {
        puertas = arrayPuertas;        
    }
    
    protected int getNumeroPuertas()
    {
        return noPuertas;
    }
    
    public Jugador getJugador()
    {
        return player;
    }
    
    public void setJugador(Jugador jugador)
    {
        player = jugador;
    }
}
