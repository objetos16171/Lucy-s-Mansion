import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class FinalDisp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalDisp extends Disparo
{
    private String anInit;
    private boolean listo;
    private List<GreenfootImage> gif;
    private int contadorLista;
    private int posX;
    private int contador;
    public FinalDisp(int daño, int posicionX)
    {
        super(daño*2, "disdos_fin.gif");
        posX = posicionX;
        contador = posX + 1;
        anInit = "disdos_ini.gif";
        listo = false;
        gif = null;
        contadorLista = 0;
    }
    
    public void act() 
    {
        if(listo)
        {
            if(!isAtEdge())  //Si no está al borde
            {
                muevete();
                if(isTouching(null))
                {
                    Actor obj = getOneIntersectingObject(null);
                    if(obj.getClass() == Jugador.class)
                    {
                        ((Jugador)obj).setSalud(-danio);
                    }
                    else
                    {
                        if(obj.getClass() == Utileria.class)
                        {
                            ((Utileria)obj).destruye();
                        }
                    }
                }
            }
        }
        else
        {
            if(gif == null)
            {
                anBala = new GifImage(anInit);
                gif = anBala.getImages();
                anBala = new GifImage("disparo_final.gif");
            }
            
            if(contadorLista < gif.size())
            {
                setImage(gif.get(contadorLista));
                contadorLista++;
            }
            else
            {
                listo = true;
                gif = null;
            }
        }
    }
    
    /**
     * En este metodo se aplica una asintota donde el proyectil no toca la recta que se forma en y = 31... :3 la neta me rife :v
     */
    public void muevete()
    {
        setImage(anBala.getCurrentImage());
        int y = getWorld().getHeight()-50 + (contador + posX)/(contador-posX);
        setLocation(contador, y);
        contador ++;
    }
}
