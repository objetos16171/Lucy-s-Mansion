import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * no entiendoni madres :I
 * Write a description of class Fantasma here.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:31.10.16
 */
class Fantasma extends Personaje
{
    protected SimpleTimer reloj;    //Es para llevar control sobre el movimiento del fantasma y no este atacando a lo loco... :v
    protected boolean secuencia;    //Es para saber si el fantasma sigue atacando... ... creo que se puede quitar cn la variable de abajo.
    protected boolean isMov;        //Esta variable nos va a decir si el fantasma va a estar en movimiento constante.
    
    protected int contadorSec;      //Esta variable es para saber cuantos ataques le quedan a una secuencia de ataque :v
    protected int distanciaRec;     //Esta es una variable para ver cuanta distancia se va a mover cuando se active la bandera isMov
    
    public Fantasma(int atk, String stdDer, String stdIzq, String atkDer, String atkIzq, String movDer, String movIzq, String muerte)
    {
        super(atk, stdDer, stdIzq, atkDer, atkIzq, movDer, movIzq, muerte);
        reloj = new SimpleTimer();
        reloj.mark();
        secuencia = false;
        isMov = false;
        contadorSec=0;
        distanciaRec = 0;
    }
    
    /**
     * Este metodo es la accion de cualquier fantasma... no se si cambiar
     */
    public void act()
    {
        if(!morido)
        {
            if(!secuencia && !isAttack && !isMov)
            {
                int diferencia = ((Escenario)getWorld()).getJugador().getX() - this.getX();
                /*
                 * Este siguiente condicional es para cambiar la direccion, y sacar el absoluto de la diferencia entre los actores.
                 * Si la diferencia es negativa, entonces hay que tomar su valor absoluto.
                 */
                if(diferencia < 0)
                {
                    if(direccion < 0)
                    {
                        ;
                    }
                    else
                    {
                        direccion = -1;
                        setAnStd();
                    }
                    diferencia *= -1;
                }
                else
                {
                    if(direccion > 0)
                        ;
                    else
                    {
                        direccion = 1;
                        setAnStd();
                    }
                }
                /*
                 * Si el fantasma esta lo suficientemente cerca del jugador, y ya pasó el tiempo suficiente, lo va a atacar. Si aun no pasa el tiempo suficiente
                 * solo va a actualizar la animacion.
                 * Si pasa que el jugador se encuentra demasia lejos, el fantasmas se mueve en su direccion (inserte lectura con acento arabes :v), pero si no pasa 
                 * el tiempo suficiente igual actualizara la animacion... espero funcione
                 */
                if( diferencia <= 300 )
                {
                    if(reloj.millisElapsed()>=2000)
                    {
                        ataca();
                    }
                    else
                    {
                        //actualiza la animacion en curso (osease la animacion de movimiento
                        actualizaAnm();
                    }
                }
                else
                {
                    if(reloj.millisElapsed()>=1000)
                    {
                        this.muevete();
                    }
                    else
                    {
                        actualizaAnm();
                    }
                }
            }
            else
            {
                if(secuencia || isAttack)
                {
                    ataca();
                }
                else
                {
                    if(isMov)
                    {
                        this.muevete();
                    }
                }
            }
        }
        else
        {
            //pss se muere y ya alv;
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Este metodo va a controlar la variable secuencia, y el modo de atacar, y puede ser variable... o algo asi... ademas, debe de poner el reloj en cero.
     * Hace un random para ver si solo va a atacar o va a hacer una secuencia. Si activa una secuencia se debe poner el contador de secuencia en alguna 
     * cantidad, y luego restarle por cada ataque logrado.
     * 
     * Se va a requerir de una funcion extra para generar o poner la animacion de ataque, y luego lanzar el disparo, cuando esa funcion (ya sea que se deje
     * en la clase personaje, o aqui mismo en esta clase) termine, manda una señal y alli es cuando se resta el contador. Ademas esta funcion va a jugar con
     * la posicion del fantasma y su direccion para que se este teletransportando.
     * 
     * NOTA: Hay que cambiar la documentacion de este metodo.
     */
    protected void ataca()
    {
        if(secuencia)
        {
            isAttack = disparo();
            if(!isAttack)
            {
                if(contadorSec != 0)
                {   
                    isAttack = true;
                    contadorSec--;
                    setDireccion();
                    setAnAtk();
                    //Ademas, se puede teletransportar este objeto pa que se ve asi bien poderoso :v, pero esos son mas condicionales y no... que flojera...
                    //por que se tiene que checar si esta lo suficientemente lejos de la orilla pa poder teletransportarlo a ese lado, y que el jugador este
                    //en rango de disparo... y no, que flojerita :v xD
                }
                else
                {
                    secuencia = false;
                    reloj.mark();
                }
            }
        }
        else
        {
            if(isAttack) // Continua el ataque normal
            {
                isAttack = disparo();
                if(!isAttack) // Cuando disparo() regrese falso significa que ya acabo la animacion
                {
                    reloj.mark();
                }
            }
            else
            {
                if(Greenfoot.getRandomNumber(6) == 2) //Activa la secuencia
                {
                    secuencia = true;
                    contadorSec = 4;
                    setAnAtk();
                    isAttack = true;
                }
                else //Lanza un ataque normal
                {
                    isAttack = true;
                    setAnAtk();
                }
            }
        }
    }
    
    /**
     *  Este metodo va controlar el movimiento de los fantasmas... o eso se supone, debe activar la variable isMov cuando el jugador quede muy lejos, y desactivarla
     *  cuando entre en el rango de disparo del fantasma. Si el fantasma le queda poca vida, debe de elevarse, y solo bajar cuando vaya a atacar. Ademas, despues de 
     *  terminar cada movimiento se debe resetear el reloj.
     */
    protected void muevete()
    {
        if(!isMov)
        {
            int diferencia = ((Escenario)getWorld()).getJugador().getX() - this.getX();
            if(diferencia < 0)
            {
                diferencia *= -1;
            }
            setAnMov();
            if(diferencia > 350)
            {
                isMov = true;
                distanciaRec = diferencia - (diferencia%10); 
            }
            else
            {
                super.muevete();
                setAnStd();
                reloj.mark();
            }
        }
        else
        {
            if(distanciaRec <= 0)
            {
                isMov = false;
                setAnStd();
                reloj.mark();
            }
            else
            {
                super.muevete();
                distanciaRec -= 10;
            }
        }
    }
    
    /**
     * Este metodo sirve para poner la animacion que va a hacer cuando reciva un golpe. Cuando se mande a llamar, todas
     * las banderas, contadores y marca de reloj, asi como la animacion se regresan a sus valores originales.
     */
    public void golpeado(int cantDanio)
    {
        secuencia = false;
        contadorSec = 0;
        //Aqui se debe insertar la animacion de dolor, y hacer un repaint... y luego continuar como sigue aqui...
        reloj.mark();
        isMov = true;
        if(direccion == 1)
        {
            distanciaRec = getX() - (getX()%10);
        }
        else
        {
            distanciaRec = getWorld().getWidth() - getX();
            distanciaRec -= (distanciaRec%10);
        }
        setSalud(-cantDanio);
        direccion *=-1;
        setAnMov();
    }
    
    protected void setDireccion()
    {
        int diferencia = ((Escenario)getWorld()).getJugador().getX() - this.getX();
        if(diferencia < 0)
        {
            direccion = -1;
        }
        else
        {
            direccion = 1;
        }
    }
}
