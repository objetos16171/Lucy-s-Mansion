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
    private int danio;              //variable para el daño
    private boolean destruir;       //variable boleana para activar el método destruir
    private GreenfootImage bum;     //variable para nueva imagen
    
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
        bum = new GreenfootImage("bum1.png");   //imagen de explosión 1;
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
               if(intersects(Personaje.class))  //Si está intersectando a algún personaje
               {
                   Personaje jug = (Personaje)getOneIntersectingObject(Personaje.class); //Regresa un objeto intersectado
                   jug.aumentaVida(-danio);  //Se modifica la vida
                   destruir = true;  //Cambia el valor de la variable boleana
                }
                else
                {
                    if(intersects(Utileria.class))  //Si está intersectando a alguna utilería
                    {
                        Utileria util = (Utileria)getOneIntersectingObject(Utileria.class);   //Regresa un objeto intersectado
                        util.destruye();    //Se manda a llamar al método destruye
                        destruir = true;    //Cambia el valor de la variable boleana
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
            this.setImage(bum); //Coloca imagen "bom"
            getWorld().repaint();   //Se repita el mundo
            getWorld().removeObject(this);  //Remueve el objeto
        }
    }
                       
    /**
     * Establece la dirección de la bala: Izquierda o derecha
     * @author Aurora
     * @version 1.2.25.11.16
     */
    private void muevete()  //Método muevete
    {
        if(dir < 0) //Derecha
        {
            move(5);    //Se mueve 5 casillas a la derecha
            if(getX()- ubicacionX >249) //Si getX - ubicaciónX es mayor a 249
            {
                destruir = true;    //Cambia el valor de la variable boleana
            }
        }
        
        else //Izquierda
        {
            move(-5);   //Se mueve 5 casillas a la izquierda
             if(ubicacionX - getX() >249) //Si getX - ubicaciónX es mayor a 249
            {
                destruir = true;    //Cambia el valor de la variable boleana
            }
        }
    }
} 