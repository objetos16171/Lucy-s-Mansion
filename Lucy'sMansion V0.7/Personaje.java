import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Superclase de personaje, de aquí heredarán métodos y atributos las clases de Jugador y Fantasma.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.0:30.10.16
 */
class Personaje extends Actor
{
    private String anStdDer;
    private String anStdIzq;
    private String anAtkDer;
    private String anAtkIzq;
    private String anMovDer;
    private String anMovIzq;
    
    protected GifImage anActual;        //Animacion actual del personaje
    protected List<GreenfootImage> gif; //Lista de imagenes que poseera el gif de la animacion actual.
    
    private int posicionEnLista;        // Es el contador para la variable gif
    protected int ataque;               //Capacidad que tiene cada fantasma para golpear
    protected int pV;                   //puntos de vida restantes al jugador
    protected int direccion;            //1= DERECHA, -1=IZQUIERDA;
    
    protected final int salud = 10;     //puntos de vida Totales
    
    protected boolean isAttack;         //Boleano para saber si está atacando
    
    public Personaje(int atk, String stdDer, String stdIzq, String atkDer, String atkIzq, String movDer, String movIzq)
    {
        anStdDer = stdDer;  anStdIzq = stdIzq;
        anAtkDer = atkDer;  anAtkIzq = atkIzq;
        anMovDer = movDer;  anMovIzq = movIzq;
        ataque = atk;
        
        pV = salud;
        isAttack = false;
        direccion = 1;
        //anActual = new GifImage(anStdDer);
        gif = null;
    }
    
    /**
     * muevete - Método que usan los personajes para moverse, cada personaje se mueve de manera diferente
     */
    void muevete()
    {
        setImage(anActual.getCurrentImage());
        move(10*direccion);
    }
    
    /**
     * disparo - Todo los personajes disparan (escupen), pero escupen de manera distinta (al 20 de nov de 2016 creo eso, probablemente sea falso)
     * 
     */
   /* boolean disparo()
    {
        ;
    }*/
    
    /**
     * setSalud - Modifica el atributo de salud, principalmente al jugador, los fantasmas, sería curioso que tambien recuperasen salud
     * 
     */
    void setSalud(int nuevaSalu)
    {
        pV = pV + nuevaSalu;
    }
    
    /**
     * getSalud - Pa' saber que tanta salud tienen los personajes en todo momento y poderla expresar en pantalla
     */
    int getSalud()
    {
        return pV;
    }
    
    /**
     * getIsAttack - Para preguntarle al jugador si está haciendo daño (En retrospectiva eso se escucha estúpido, pero tiene sentido)
     */
    boolean getIsAttack()
    {
        return isAttack;
    }
    
    /**
     *  El metodo va a cambiar la animacion actual por la de ataque, y va a depender de la direccion que tenga. Ademas, va a cargar las imagenes de la animacion
     *  actual a la variable gif(que es un arreglo de imagenes), y luego va a liberar la animacion actual.
     */
    void setAnAtk()
    {
        if(direccion == 1)
        {
            //anActual = new GifImage(anAtkDer);
        }
        else
        {
            //anActual = new GifImage(anAtkIzq);
        }
        
        gif = anActual.getImages();
        anActual = null;
    }
    
    /**
     *  Este metodo va a poner la animacion de movimiento como la actual, igual va a depender de la direccion del personaje
     */
    void setAnMov()
    {
        if(direccion ==1)
        {
            //anActual = new GifImage(anMovDer);
        }
        else
        {
            //anActual = new GifImage(anMovIzq);
        }
    }
    
}