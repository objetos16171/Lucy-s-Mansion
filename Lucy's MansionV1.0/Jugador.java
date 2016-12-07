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
    private GloboDeTexto texto;
    
    
    /**
     * Constructor de objetos de la clase Jugador
     */
    public Jugador(int atk, int posX, int posY, String nomImg)
    {
        super(atk, "lucystd_der.gif", "lucystd_izq.gif", "lucyatk_der.gif", "lucyatk_izq.gif", "lucymov_der.gif", "lucymov_izq.gif", "lucymuerte.gif");
        nivel = 0;             //Inicia en -1 para poder mostrar la historia, despues de mostrar la historia, se hace 0
        movJug = false;
    }
    
    /**
     * Act - Es lo que el usuario hará mientras el juego esté corriendo.
     * siempre y cuando exista en el mundo.
     */
    public void act()
    {
        if(!morido)
        {
            if(!isAttack)
            {
                if(Greenfoot.isKeyDown("left"))
                {
                    if(direccion < 0)
                        ;
                    else
                    {
                        direccion = -1;
                        setAnMov();
                    }
                    super.muevete();
                }
                else if(Greenfoot.isKeyDown("right"))
                {
                    if(direccion < 0)
                    {
                        direccion = 1;
                        setAnMov();
                    }
                    super.muevete();
                }
                else if(Greenfoot.isKeyDown("space"))
                {
                    //movJug = true;
                    //setAnBrn();
                    //move(y--);
                }
                else if(Greenfoot.isKeyDown("z"))
                {
                    isAttack = true;
                    setAnAtk();
                }
                else if(Greenfoot.isKeyDown("x"))
                {
                    //golpea(2);
                }
                else
                    super.actualizaAnm();
            }
            else
            {
                isAttack = disparo();
                if(!isAttack)
                {
                     setAnStd();
                }
            }
        }
        else
        {
            setAnMuere();
            texto = new GloboDeTexto("muerto.png");
            getWorld().addObject(texto, 425, this.getY());
            Greenfoot.delay(500);
            Greenfoot.setWorld(new MenuPrincipal());            
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
     * getNivel - Este método devolverá el nivel que tiene el jugador al momento de que la puerta se lo pregunte
     */
    int getNivel()
    {
        return nivel;
    }
    
    /**
     * golpea - Éste método sólo pondrá la animación del golpe y activará la variable de ataque, para poder
     * infligir un daño en el enemigo
     */
    void golpea(int tipo)
    {
        if(tipo == 2)        //Si no, el golpe será escupiendo cruz
        {
            isAttack = true;
            setAnAtk();
        }
    }
}
