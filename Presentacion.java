import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase hereda de Fondo, su objetivo es que en el mundo Intro pueda
 * cambiar al fondo con mensaje, el título del juego y presionar una tecla.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LadyBug" Cárdenas
 * 
 * @version 1.1:28.10.16
 */
class Presentacion extends World{
    private int bandera;    //Para saber que fondo está activo
    private GreenfootImage fondo0;   //Creador para el Actor de fondo
    private GreenfootImage fondo1;   //Creador para el Actor de fondo
    private World menu;     //Creador para el siguiente menú

    /**
     * Constructor para objetos de la clase Intro.
     * 
     */
    public Presentacion(){    
        // Crea un nuevo mundo de tamaño 850x480 celdas, con celdas de tamaño 1x1 pixeles.
        super(850, 480, 1);
        bandera = 0;
        fondo0 = new GreenfootImage("Fondo1.png");
        fondo1 = new GreenfootImage("Fondo0.png");
        menu = new MenuPrincipal();
    }

    /**
     * Act - aquí está lo que se quiere que el actor haga. Este método es
     * llamado cada que los botones 'Act' o 'Run' son presionados. Un ciclo.
     */
    public void act(){
        setBackground(fondo1);
        setFondo();        
        setMundo();
    }

    /**
     * setFondo - Este método es usado para cambiar lo que se presentará en la pantalla
     * Utiliza una bandera para saber cual es el fondo que se presenta actualmente.
     */
    private void setFondo(){
        if(bandera == 0){
            setBackground(fondo0);
            bandera = 1;
            Greenfoot.delay(50);
        }else{
            setBackground(fondo1);
            bandera = 0;
            Greenfoot.delay(50);
        }
    }

    /**
     * setMundo - Este método es usado para cambiar el mundo 
     * actual por el siguiente, en este caso, el menú
     */
    private void setMundo(){
        if(Greenfoot.isKeyDown("enter") == true){
            Greenfoot.setWorld(menu);
        }
    }
}
