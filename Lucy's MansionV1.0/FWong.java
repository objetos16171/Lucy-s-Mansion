import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FWong here.
 * 
 * @author it is me :v
 * @version is now :v
 */
public class FWong extends Fantasma
{
    private String anDipAbajo;
    private String anDEP;
    private String anFinal;
    
    private boolean secuencia2; //Esta variable va a indicar que entrara en una secuencia extra a la normal
    private int contadorSec2;   //Variable para sber si aun puede hacer la secuencia...
    private boolean DEJAME_EN_PAZ; //Ultimo ataque que se va a efectuar antes de morir... lo dejare en mayusculas porque yolo
    private boolean isAtk2;
    private int millisAtk;      //Variable entera que indica cada cuanto tiempo realizara un ataque... esta se puede poner para todos los fantasmas
    /**
     * Constructor de mi clase :v
     */
    public FWong()
    {
        super(5, "wongstd_der.gif", "wongstd_izq.gif", "wongatk_der.gif", "wongatk_izq.gif", "wongmov_der.gif", "wongmov_izq.gif", "wong_muerte.gif");
        secuencia2 = false;
        contadorSec2 = 0;
        DEJAME_EN_PAZ = false;
        isAtk2 = false;
        millisAtk = 1500;
        anDipAbajo = "wongdis_abj.gif";
        anDEP = "wongdep.gif";
        anFinal = "wongfinal.gif";
    }
    
    /**
     * Act - do whatever the FWong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!morido)
        {
            if(!DEJAME_EN_PAZ)
            {
                if(!secuencia2 && !secuencia && !isAttack && !isMov)
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
                    
                    if( diferencia <= 280 )
                    {
                        if(reloj.millisElapsed() >= millisAtk)
                        {
                            this.ataca();
                        }
                        else
                        {
                            actualizaAnm();
                        }
                    }
                    else
                    {
                        if(reloj.millisElapsed() >= (millisAtk / 2))
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
                    if(secuencia || isAttack || secuencia2)
                    {
                        this.ataca();
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
                secuencia = dejameEnPazDis();
                if(!secuencia)
                {
                    teletransportacion(this.getX(), getWorld().getHeight()-120,1);
                    actualizaAnm();
                }
            }
        }
        else
        {
            //pss...
            //cambias gif, actualizas el gif, repintas el mundo, y luego ->
            getWorld().removeObject(this);
        }
    }
    
    private boolean dejameEnPazDis()
    {
        if(gif != null && posicionEnLista < gif.size())
        {
            setImage(gif.get(posicionEnLista));
            posicionEnLista ++ ;
            return true;
        }
        else
        {
            if(gif == null)
            {
                return false;
            }
            else
            {
                anActual = new GifImage(anFinal);
                getWorld().addObject(new FinalDisp(ataque*2, this.getX()+40), this.getX()+40, this.getY());
                gif = null;
                return false;
            }
        }
    }
    
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
            if(secuencia2)
            {
                isAttack = disparo2();
                if(!isAttack)
                {
                    if(contadorSec > 0)
                    {
                        contadorSec--;
                        teletransportacion(((Escenario)getWorld()).getJugador().getX(), 60, 0);
                    }
                    else
                    {
                        secuencia2 = false;
                        setDireccion();
                        setAnStd();
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
                    int random = Greenfoot.getRandomNumber(5);
                    if(random == 2 || random == 4) //Activa la secuencia
                    {
                        secuencia = true;
                        contadorSec = 4;
                        setAnAtk();
                        isAttack = true;
                    }
                    else //Lanza un ataque normal
                    {
                        if(random ==3)
                        {
                            secuencia2 = true;
                            isAttack = true;
                            teletransportacion(((Escenario)getWorld()).getJugador().getX(), 60, 0);
                            contadorSec = 3;
                        }
                        else
                        {
                            isAttack = true;
                            setAnAtk();
                        }
                    }
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
            if(diferencia > 320)
            {
                isMov = true;
                distanciaRec = diferencia - (diferencia%10); 
            }
            else
            {
                mueveteRap(20);
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
                mueveteRap(20);
                distanciaRec -= 20;
            }
        }
    }
    
    /**
     * mueveteRap - Sobrecarga del metodo el cual recibe un entero multiplo de 10, para que se mueva esa cantidad de pixeles.
     */
    void mueveteRap(int distancia)
    {
        setImage(anActual.getCurrentImage());
        move(distancia * direccion);
    }
    
    /**
     * Este el metodo sobrecargado que indica que el fantasma recibio algun daño. En este caso el metodo recibe la cantidad de daño a recibir, y hace
     * que el fantasma se transporte a lado contrario de la pantalla (el lado mas lejano) de donde este el personaje. Esta ultima parte se le deja a 
     * otro metodo. Ademas, dependiendo de la vida que le quede, cambiara otros parametros de este fantasma.
     * Ademas, 
     */
    public void golpeado(int cantDanio)
    {
        isMov = false;
        secuencia = false;
        secuencia2 = false;
        contadorSec = 0;
        contadorSec2 = 0;
        
        if(getSalud() <= cantDanio && !DEJAME_EN_PAZ)
        {
            setSalud(-(getSalud()-1));
            DEJAME_EN_PAZ = true;
            teletransportacion(60, 60, 1);
            anActual = new GifImage(anDEP);
            gif = anActual.getImages();
            posicionEnLista = 0;
            anActual = null;
        }
        else
        {
            setSalud(-cantDanio);
            millisAtk -= cantDanio * 50;
            //Inserte animacion de dolor y repaint del mundo.
            teletransportacion();
        }
        
    }
    
    /**
     * Este metodo cambiara la posicion del fantasma al lado mas alejado del que se encuentre el personaje... ademas, cambiara la orientacion del 
     * fantasma y su animacion correspondiente (la estandar).
     */
    public void teletransportacion()
    {
        int posX = ((Escenario)getWorld()).getJugador().getX();
        if(posX >= getWorld().getWidth()/2 )
        {
            this.setLocation(50, ((Escenario)getWorld()).getJugador().getY());
        }
        else
        {
            this.setLocation(getWorld().getWidth()-50, ((Escenario)getWorld()).getJugador().getY());
        }
        setDireccion();
        setAnStd();
        reloj.mark();
    }
    
    /**
     * Este metodo teletransporta al wong a una ubicacion dada, junto con una direccion dada. Si la direccion es 0, pone la animacion de disparo hacia abajo
     * 
     */
    public void teletransportacion(int x, int y, int dir)
    {
        if(dir ==0)
        {
            anActual = new GifImage(anDipAbajo);
            gif = anActual.getImages();
            anActual = null;
            posicionEnLista = 0;
        }
        else
        {
            direccion = dir;
        }
        setLocation(x, y);
    }
    
    /**
     * En este metodo se dispara hacia abajo.Cuando acaba la animacion de escupir y pone la bala en el mundo, regresa falso, mientras tanto regresa verdadero
     */
    private boolean disparo2()
    {
        if(posicionEnLista < gif.size())
        {
            setImage(gif.get(posicionEnLista));
            posicionEnLista++;
            return true;
        }
        else
        {
            setAnStd();
            getWorld().addObject(new DisparoAbj(ataque), this.getX(), this.getY()+60);
            gif = null;
            return false;
        }
    }
}
