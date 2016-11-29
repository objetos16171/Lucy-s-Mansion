import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Superclase de personaje, de aquí heredarán métodos y atributos las clases de Jugador y Fantasma.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:30.10.16
 */
class Personaje extends Actor{
    protected int ataque;                       //Capacidad que tiene cada fantasma para golpear
    protected int pV = 10;                      //puntos de vida restantes al jugador
    protected final int salud = 10;             //puntos de vida Totales
    protected int posX;                         //Posición del jugador en X
    protected int posY;                         //Posicion del jugador en Y
    protected GreenfootImage imagenPersonaje;   //Imagen del personaje
    protected int nvLlave;                      //Variable para el nivel de la llave
    
    public Personaje(int atk, int posX, int posY, String nomImg)
    {
        ataque = atk;
        nvLlave = 0;
        imagenPersonaje = new GreenfootImage(nomImg);
    }
    
    void muevete(){;}
    
    void disparo(){;}
    
    void recibeDanio(int danio){;}
    
    void setUbicacion(int lugar)
    {
        posX = lugar;
    }
    
    int getUbicacion()
    {
        return posX;
    }
    
    void setSalud(int nuevaSalu)
    {
        pV = pV + nuevaSalu;
    }
    
    int getSalud()
    {
        return pV;
    }
    
    int getNvLlave()
    {
        return nvLlave;
    }
    
    /**
     * @author Aurora
     * @version 1.1.23.11.16
     * Método para modificar la vida del personaje.
     */
    int setAumentoVida(int nuevaVida) 
    {
        pV += nuevaVida;    
        if(pV > 10)  //Si los puntos de vida son ¿mayor? que 10
        {
            pV = 10;  //Los puntos de vida son igual a 10
        }
        else if(pv < 0) //Si los pV son ¿menores? a 0
        {
            pV = 0; //Los pV son igual a 0
        }
    }
}
