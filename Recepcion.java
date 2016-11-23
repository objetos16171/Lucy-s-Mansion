import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escenaio de recepcion, 
 * 
 * @author d WONG :V NO TE DARAS CUENTA :V
 * @version (a version number or a date)
 */
class Recepcion extends Escenario
{
    private Puerta[] puertasRecepcion;      //Arreglo de puertas que tendrá el Escenaio... Esto debe estar en Escenario
    private boolean historia;               //Para saber si la historia ya se ha presentado, de ser falso, la historia se presentará
    private Jugador player;
    
    /**
     * Este es el constructor de la recepción.
     * 
     */
    Recepcion(String nombreFondo, int numPuertas, Jugador jug, boolean historia)
    {
        super(nombreFondo, numPuertas, jug);
        iniciaPuertas();
        this.historia = historia;
        player = jug;
    }
    
    /**
     * Act - Hace lo que se le pide que se haga para cada objeto creado de la clase
     * 
     */
    public void act() 
    {
        if(historia == false)//Significa que no ha mostrado ningún texto y debe de volverse a crear; Nota: Debe resolverse que el usuario entra y vuelve a pasar la historia
        {
            muestraHistoria();
            historia = true;
        }
        else
        {
            addObject(player, player.getX(), player.getY());
        }
    }    
        
    /**
     * iniciaPuertas - Inicializa el número de puertas para tal Escenario (Recepcion en este caso)
     * Sólo las mantiene preparadas.
     * 
     */
    private void iniciaPuertas()
    {
        puertasRecepcion = getArregloPuertas();
        puertasRecepcion[0] = new Puerta(2, 0, false); //Puerta 0, que va al pasillo 1, se requieren 0 llaves para entrar
        puertasRecepcion[1] = new Puerta(2, 2, true);  //Puerta 1, que va al pasillo 2, se requieren 2 llaves para entrar
        puertasRecepcion[2] = new Puerta(2, 2, true);  //Puerta 2, que va al pasillo 3, escalera, no sube hasta ser nivel 2
        puertasRecepcion[3] = new Puerta(3, 1, true);  //Puerta 3, que va al cuarto 2, requiere nivel 1 para entrar
        puertasRecepcion[4] = new Puerta(5, 1, true);  //Puerta 4, que va al cuarto de recuperacion, requiere nivel 1 para entrar
        setArregloPuertas(puertasRecepcion);
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
    private void muestraHistoria(){
        FWong guonsote = new FWong(0, 250, 250, "WongMayor.png");
        do{ muestraTexto("texto1.png"); }while(Greenfoot.isKeyDown("enter")==false);
        do{ muestraTexto("texto2.png"); }while(Greenfoot.isKeyDown("enter")==false);
        do{ muestraTexto("texto3.png"); }while(Greenfoot.isKeyDown("enter")==false);
        do{ muestraTexto("texto4.png"); }while(Greenfoot.isKeyDown("enter")==false);
    }
}
