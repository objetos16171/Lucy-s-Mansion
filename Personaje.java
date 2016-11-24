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
class Personaje extends Actor
{
    protected int ataque;                       //Capacidad que tiene cada fantasma para golpear
    protected boolean isAttack;                  //Boleano para saber si está atacando
    protected int pV = 10;                      //puntos de vida restantes al jugador
    protected final int salud = 10;             //puntos de vida Totales
    protected int posX;                         //Posición del jugador en X
    protected int posY;                         //Posicion del jugador en Y
    protected GreenfootImage imagenPersonaje;   //Imagen del personaje
    
    public Personaje(int atk, int posX, int posY, String nomImg)
    {
        ataque = atk;
        isAttack = false;
        //imagenPersonaje = new GreenfootImage(nomImg);
    }
    
    /**
     * muevete - Método que usan los personajes para moverse, cada personaje se mueve de manera diferente
     */
    void muevete()
    {;}
    
    /**
     * disparo - Todo los personajes disparan (escupen), pero escupen de manera distinta (al 20 de nov de 2016 creo eso, probablemente sea falso)
     */
    void disparo()
    {;}
    
    /**
     * recibeDanio - Es daño, pero no quiero problemas con la ñ y cosas así...
     * Me distraigo: todos los personajes reciben daño de una cierta manerea, igual que arriba, a este dia 20 de nov creo que reciben ddaño de manera distinta, pero
     * mientras escribo esto creo que no es así
     */
    void recibeDanio(int danio)
    {;}
    
    /**
     * setUbicacion - Para colocar al personaje en un cierto lugar, creo que con el addObjetc() esto puede ser eliminado
     */
    void setUbicacion(int lugar)
    {
        posX = lugar;
    }
    
    /**
     *  getUbicacion -  Para saber en que lugar está el objeto, igual creo que sobra...
     *  los odio a todos...
     *  y a mi vida
     *  ojalá fuese broma eso
     */
    int getUbicacion()
    {
        return posX;
    }
    
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
     * setAnimación - Para modificar la animación que se reproduce en pantalla, dependiendo de la acción
     */
    void setAnimacion(String animacion)
    {
        //Aqui cambiara de animación, y no avanzará hasta que termine
    }
}
