import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author Lucy
 * @version 1.0  23/11/16
 */
public class Disparo extends Actor
{
    private int dir;                //sirve para checar la dirección 
    private int ubicacionX;         //ubicacion en x
    protected int danio;              //variable para el daño
    private boolean destruir;       //variable boleana para activar el método destruir
    protected GifImage anBala;
    
    /**
     * Constructor Disparo
     * @author Lucy
     * @version 1.0  23/11/16
    */
    public Disparo(int x, int ataque, int direccion)
    {
        ubicacionX = x;
        danio = ataque;
        dir = direccion;
        destruir = false;
        anBala = new GifImage("bala.gif");
    }
    
    public Disparo(int ataque, String anBal)
    {
        ubicacionX = 0;
        dir = 0;
        destruir = false;
        danio = ataque;
        anBala = new GifImage(anBal);
    }
    
    /**
     * Act Method 
     * @author Aurora
     * @version 1.3.28.11.16
     */
     public void act() 
    {
       muevete();   //Manda a llamar al método muevete
       if(!destruir)  //Si la variable sigue siendo falsa
       {
           if(!isAtEdge())  //Si no está al borde
           {
                if(isTouching(Personaje.class))  //Si estátocando algo
                {
                    Personaje obj = (Personaje)getOneIntersectingObject(Personaje.class);
                    ((Personaje)obj).setSalud(-danio);
                    destruir = true;
                }
                else
                {
                    if( isTouching(Utileria.class))
                    {
                        Utileria obj =(Utileria)getOneIntersectingObject(Utileria.class);
                        obj.destruye();
                        destruir = true;
                    }
                }
            }
            else
            {
                destruir = true; //Cambia el valor de la variable boleana
            }
        }
        else
        {
            getWorld().removeObject(this);  //Remueve el objeto
        }
    }
                       
    /**
     * Establece la dirección de la bala: Izquierda o derecha
     * @author Aurora
     * @version 1.2.25.11.16
     */
    public void muevete()  //Método muevete
    {
        setImage(anBala.getCurrentImage()); 
        move(15*dir);
        int dif = getX() - ubicacionX;
        if(dif<0)
            dif *= -1;
        
        if(dif > 349) //Si getX - ubicaciónX es mayor a 249
        {
            destruir = true;    //Cambia el valor de la variable boleana
        }
    }
} 