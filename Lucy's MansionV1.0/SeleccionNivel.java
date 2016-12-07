import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase muetra los botones y el fondo para la selección de nivel.
 * 
 * @author Damián "Mad" Martínez
 * @author Aurora "Hoshi" Gonzalez
 * @author Lucy "LaGuacamaya" Cárdenas
 * 
 * @version 1.4:15.11.16
 */
class SeleccionNivel extends World
{
    private GreenfootImage fondo;
    private NivelFacil facil;
    private NivelMedio medio;
    private NivelPro proPrro;
    
    /**
     * Constructor for objects of class SeleccionNivel.
     * 
     */
    public SeleccionNivel()
    {   
        super(850, 480, 1);
        facil = new NivelFacil("ImagenBoton.png");
        medio = new NivelMedio("ImagenBoton.png");
        proPrro = new NivelPro("ImagenBoton.png");
        //fondo = new GreenfootImage("FondoSeleccion.png");
    }
    
    /**
     * act - Ciclo principa, aquí va lo que se quiere que el mundo/actores hagan
     */
    public void act()
    {
        //setBackground(fondo);           //Coloca de fondo la imagen de la Recepción
        addObject(facil, 212, 240);
        addObject(medio, 424, 240);
        addObject(proPrro, 636, 240);
    }
}