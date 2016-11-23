import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase jugador.
 * Hereda de personaje, será controlado por el usuario
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:31.10.16
 */
class Jugador extends Personaje
{   
    private int nivel;          //Nivel del personaje segun las shaves
    
    /**
     * Constructor de objetos de la clase Jugador
     */
    public Jugador(int atk, int posX, int posY, String nomImg)
    {
        super(atk, posX, posY, nomImg);
        nivel = 0;
    }
    
    /**
     * Act - Es lo que el usuario hará mientras el juego esté corriendo.
     * siempre y cuando exista en el mundo.
     */
    public void act(){
        muevete();
        if(Greenfoot.isKeyDown("z"))
        {
            golpea(1);
        }
        if(Greenfoot.isKeyDown("x"))
        {
            golpea(2);
        }
    }
    
    /**
     * setNivel - Este método sólo asigna un nivel (según la llave) al jugador
     * @version 1.0.20.11.16
     * 
     * Notas: Hace falta considerar si el usuario tiene un nivel mayor, no puede hacerse downgrade
     * o sea, si el jugador tiene nivel 3 y consigue (por alguna razón) una llave de nivel 2, no lo deje
     */
    void setNivel(int nivelNuevo)
    {
        nivel = nivelNuevo;
    }
    
    /**
     * muevete - Este método se encarga de colocar las animaciones correspondientes al botón presionado, aparte
     * de mover en pantalla al personaje
     * @version 1.0.20.11.16
     * 
     * Notas: le hace falta que se considere cuando el jugador está en alguna de las esquinas de la pantalla.
     */
    void muevete()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setAnimacion("derecha");
            move(5);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setAnimacion("izquierda");
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            setAnimacion("salta");
            //move(paSaltar);
        }
    }
    
    /**
     * golpea - Éste método sólo pondrá la animación del golpe y activará la variable de ataque, para poder
     * infligir un daño en el enemigo
     */
    void golpea(int tipo)
    {
        if(tipo == 1)   //El golpe será con el paraguas (creo)
        {
            isAttack = true;
            setAnimacion("golpeaParaguas");
            isAttack = false;
        }else if(tipo == 2)        //Si no, el golpe será escupiendo cruz
        {
            isAttack = true;
            setAnimacion("disparaCruz");
            disparo();
            isAttack = false;
        }
    }
}
