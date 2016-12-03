import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * -------------------------------------TERMINADA------------------------------------------------
 * Escenaio de recepcion, Muestra la historia y es el primer escenario en el que el jugador tendrá contacto. 
 * 
 * @author Damian "Mad" Martínez
 * @version 1.8:30.11.16
 */
class Recepcion extends Escenario
{
    /**
     * Este es el constructor de la recepción.
     * 
     */
    Recepcion()
    {
        super("FondoRecepcion.png");
        iniciaPuertas();
        colocaPuertas();
    }
    
    /**
     * Act - Hace lo que se le pide que se haga para cada objeto creado de la clase
     * 
     */
    public void act() 
    {
        if(player.getNivel() == -1)//Significa que no ha mostrado ningún texto y debe de volverse a crear; Nota: Debe resolverse que el usuario entra y vuelve a pasar la historia
        {
            muestraHistoria();                  //Muestra la historia por que el jugador estará haciendo todo por primera vez
            player.setNivel(0);                 //Aqui es donde el nivel se hace 0 para comenzar el juego
            addObject(player, 425, 330);        //Colocará al jugador en una posicion en X al medio, y en Y a una altura de 150 de la parte baja
        }
        
    }    
        
    /**
     * iniciaPuertas - Inicializa el número de puertas para tal Escenario (Recepcion en este caso)
     * Sólo las mantiene preparadas.
     * 
     */
    protected void iniciaPuertas()
    {
        puertas[0] = new Puerta(2, 1, 0);  //Puerta 0, que va al pasillo 1, se requieren 0 llaves para entrar
        puertas[1] = new Puerta(2, 2, 2);  //Puerta 1, que va al pasillo 2, se requieren 2 llaves para entrar
        puertas[2] = new Puerta(2, 3, 2);  //Puerta 2, que va al pasillo 3, escalera, no sube hasta ser nivel 2
        puertas[3] = new Puerta(3, 2, 1);  //Puerta 3, que va al cuarto 2, requiere nivel 1 para entrar
        puertas[4] = new Puerta(5, 1, 1);  //Puerta 4, que va al cuarto de recuperacion, requiere nivel 1 para entrar
    }
    
    /**
     * muestraTexto - Crea un nuevo objeto de la clase GloboDeTexto y lo coloca en pantalla
     */
    private void muestraTexto(String nombreImagen)
    {
        GloboDeTexto texto = new GloboDeTexto(nombreImagen);
        addObject(texto, 400, 425);
    }
    
    /**
     * muestraHistoria - se encarga de mostrar globos de testo con la historia principal, y un wongsote
     */
    private void muestraHistoria()
    {
        FWong guonsote = new FWong(0, 250, 250, "WongMayor.png");   //Crea el objeto Wongsote
        addObject(guonsote, 250, 250);                              //Añade el personaje Wongsote, sólo para narrar la historia, seguro hay forma de optimizar esta cochinada...
        do{ muestraTexto("texto1.png"); }while(Greenfoot.isKeyDown("enter")==false);
        do{ muestraTexto("texto2.png"); }while(Greenfoot.isKeyDown("enter")==false);
        do{ muestraTexto("texto3.png"); }while(Greenfoot.isKeyDown("enter")==false);
        do{ muestraTexto("texto4.png"); }while(Greenfoot.isKeyDown("enter")==false);
        removeObject(guonsote);
    }
    
    protected void colocaPuertas()
    {
        addObject(puertas[0], 50, 330);
        addObject(puertas[1], 250, 330);
        addObject(puertas[2], 425, 330);
        addObject(puertas[3], 350, 330);
        addObject(puertas[4], 600, 330);
    }
}
