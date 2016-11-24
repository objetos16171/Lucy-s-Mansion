import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeleccionNivel here.
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
     *
     */
    public void act()
    {
        setBackground(fondo);           //Coloca de fondo la imagen de la Recepción
        addObject(facil, 212, 240);
        addObject(medio, 424, 240);
        addObject(proPrro, 636, 240);
    }
}