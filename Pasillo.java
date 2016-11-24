import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * clase Pasillo
 * clase pasillo se encarga de hacer las modificaciones de la super clase pasillo
 * hace el arreglo de puertas
 * @author Lucy 
 * @version 1.0 22/11/16
 */
class Pasillo extends Escenario
{
    private GreenfootImage fondo;                //fondo de las imagenes
    private Puerta[] puertas;                    //arreglo de puertas  
    private int tipoPasillo;                     //tipo de pasillo
    private final int ubicationY;                    //ubicacion y esta es constante
    /**
     * Constructor para objetod de la clase Pasillo.
     * aqui se maneja el numero de puertas y el jugador el cual debera de aparecer en este mundo
     * 
     */
    public Pasillo(String nombreFondo, int tpPas, Jugador jug)
    {
        super(nombreFondo, numPuertas, jug); 
        player = jug;                               //El jugador que se irá pasando de mundo en mundo
        fondo = new GreenfootImage(nombreFondo);
        tipoPasillo = tpPas;
    }
       
    /**
     * metodo pasillo
     * en este metodo se generara el arreglo de las puertas de cada pasillo, dependiendo de que pasillo sea.
     *
     */   
    public void arPasillo(tpPas)
    {
       switch()
        {
                                                    //pasillo 1 maneja 3 puertas, una para ir a recepcion,cuarto1 y la otra para el jefe1
           case 1:  if(tpPas==1)
                    {                
                     tpPass[i]= new pasillo();
                     addObject(puerta, ubicationX, ubicationY);
                     addObject(puerta, ubicationX/2, ubicationY);
                     addObject(puerta, (ubicationX*2), ubicationY);
                    }         
                    break:
            
            case 2:                                         // pasillo 2 maneja dos puertas, una para jefe2 y cuarto2
                    if(tpPas==2)
                    {                
                     tpPass[i]= new pasillo();
                     addObject(puerta, ubicationX, ubicationY);
                     addObject(puerta, ubicationX/2, ubicationY);
                    }
                    break;      
            
                            
            case 3:                                         //pasillo 3 maneja 3 puertas, pasillo4, jefe4, escaleras
                    if(tpPas==3)
                    {                
                     tpPass[i]= new pasillo();
                     addObject(puerta, ubicationX, ubicationY);
                     addObject(puerta, ubicationX/2, ubicationY);
                     addObject(puerta, (ubicationX*2), ubicationY);
                    }
                    break;
            case 4:                                         //pasillo 4 maneja 4 puertas cuarto3,cuarto4,jefe3 y pasillo3
                     if(tpPas==4)
                    {                
                     tpPass[i]= new pasillo();
                     addObject(puerta, ubicationX, ubicationY);
                     addObject(puerta, ubicationX/2, ubicationY);
                     addObject(puerta, (ubicationX*2), ubicationY);
                     addObject(puerta, (ubicationX*3), ubicationY);
                    }
                    break; 
                  
            
            case 5:                        //pasillo 5 maneja 3 puertas, recuperacion,cuarto5,jefe4
                     if(tpPas==5)
                    {                
                     tpPass[i]= new pasillo();
                     addObject(puerta, ubicationX, ubicationY);
                     addObject(puerta, ubicationX/2, ubicationY);
                     addObject(puerta, (ubicationX*2), ubicationY);
                    }
                    break;  
                                       
            case 6:                        //pasillo 6 maneja el acceso al cuarto de azotea, y jefe final
                      if(tpPas==2)
                    {                
                     tpPass[i]= new pasillo();
                     addObject(puerta, ubicationX, ubicationY);
                     addObject(puerta, ubicationX/2, ubicationY);
                    }
                    break;
                }
    }
}
       