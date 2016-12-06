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
class Escenario extends World
{
    protected int noPuertas;                          // Numero de puertas que tendrá el escenario
    protected Puerta[] puertas = new Puerta[5];       // Arreglo para la cantidad de puertas que se usarán, que según mis cálculos son 4
    protected Jugador player;                         // Jugador, se agregará cuando el jugador llegue al mundo, siempre existirá
    protected boolean colPuertas;
    
    /**
     * Constructor de objetos de la clase Escenario.
     * 
     */
    public Escenario(String nombreFondo)
    {    
        super(850, 480, 1);                           //Crea un mundo de 850 x 480
        colPuertas = true;
        //setBackground(nombreFondo);                 //Pos el fondo del escenario wey!
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
            player.setLocation(10, 330);          //A la izquierda del escenario
        }
        else
        {
            player.setLocation(800, 330);         //A la derecha del escenario
        }
    }
    
    protected void compruebaPuertas()
    {
        if(colPuertas)
        {
            iniciaPuertas();
            colocaPuertas(); 
            colPuertas = false;
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
    
    protected Jugador getJugador()
    {
        return player;
    }
    
    protected void setJugador(Jugador jugador)
    {
       player = jugador;
    }
    
    protected void iniciaPuertas()
    {;}
    
    protected void colocaPuertas()
    {;}
}
