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
    
    public Fantasma(int atk, String stdDer, String stdIzq, String atkDer, String atkIzq, String movDer, String movIzq)
    {
        super(atk, stdDer, stdIzq, atkDer, atkIzq, movDer, movIzq);
        reloj = new SimpleTimer();
        reloj.mark();
        secuencia = false;
        contadorSec=0;
    }
    
    public void act()
    {
        if(!secuencia && !isAttack || !isMov)
        {
            int diferencia = ((Escenario)getWorld()).getJugador().getX() - this.getX();
            if(diferencia < 0)
            {
                direccion = -1;
                diferencia *= -1;
            }
            else
            {
                direccion = 1;
            }
            
            if( diferencia <= 300 )
            {
                if(reloj.millisElapsed()>2000)
                {
                    ataca();
                }
            }
            else
            {
                if(reloj.millisElapsed()>1000)
                {
                    muevete();
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
                    muevete();
                }
            }
        }
        ///Aqui debe actualizar el gif del fantasma, es decir, tiene que cambiarlo o actualizarlo
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
            ; //continua la secuencia
            
        }
        else
        {
            if(isAttack)
            {
                ; //continua el ataque
            }
            else
            {
                if(Greenfoot.getRandomNumber(4) == 2)
                {
                    secuencia = true;
                    contadorSec = 4;
                    isAttack = true;
                }
                else
                {
                    isAttack = true;
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
            
            if(diferencia > 400)
            {
                isMov = true;
                distanciaRec = diferencia - (diferencia%10); 
            }
            else
            {
                super.muevete();
            }
        }
        else
        {
            if(distanciaRec <= 0)
            {
                isMov = false;
            }
            else
            {
                super.muevete();
                distanciaRec -= 10;
            }
        }
    }
}