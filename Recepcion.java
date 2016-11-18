import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Recepcion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Recepcion extends Escenario{
    /**
     * Este es el constructor de la recepcion.
     */
    Recepcion(String nombreFondo, int numPuertas, Jugador jug){
        super(nombreFondo, numPuertas, jug);
    }
    
    private void iniciaPuertas(){
        Puerta[] puertas;
        puertas[0] = new Puerta(2, 0);  //Puerta 0, que vá al pasillo 1, se requieren 0 llaves para entrar
        puertas[1] = new Puerta(2, 2);  //Puerta 1, que vá al pasillo 2, se requieren 2 llaves para entrar
        puertas[2] = new Puerta(2, 2);  //Puerta 2, que va al pasillo 3, escalera, no sube hasta ser nivel 2
        puertas[3] = new Puerta(3, 1);  //Puerta 3, que va al cuarto 2, requiere nivel 1 para entrar
        puertas[4] = new Puerta(5, 1);  //Puerta 4, Que va al cuarto de recuperacion, requiere nivel 1 para entrar
        setArregloPuertas(puertas);
    }
    
    private void muestraTexto(String nombreImagen){
        
        
    }
}
