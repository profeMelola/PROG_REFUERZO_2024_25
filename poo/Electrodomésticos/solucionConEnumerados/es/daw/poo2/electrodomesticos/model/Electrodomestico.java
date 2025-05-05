

package es.daw.poo2.electrodomesticos.model;

import es.daw.poo2.electrodomesticos.enumerados.COLOR;
import es.daw.poo2.electrodomesticos.enumerados.CONSUMO_ENERGETICO;

/**
 * 
 * @author idesadadaw
 *
 */

public class Electrodomestico {

    /*
     Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. 

     Por defecto, el color será blanco, el consumo energético sera F, 
     El precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.

     Los colores disponibles son blanco, negro, rojo, azul y gris.
     */
    //VALORES POR DEFECTO USANDO CONSTANTES
    //protected final static String COLOR_DEF="Blanco";
    protected final static COLOR COLOR_DEF = COLOR.BLANCO;

    //protected final static char CONSUMO_ENERGETICO_DEF='F';
    protected final static CONSUMO_ENERGETICO CONSUMO_ENERGETICO_DEF=CONSUMO_ENERGETICO.F;

    protected final static float PRECIO_BASE_DEF=100;
    protected final static float PESO_DEF=5;
    
    //private final static String[] COLORES = {"BLANCO","NEGRO","ROJO","AZUL","GRIS"};
    //private final static char[] CONSUMO_ENERGETICO = {'A','B','C','D','E','F'};
    //private final static int[]  SUPLEMENTO_ENERGETICO ={100,80,60,50,30,10};
    
    //ATRIBUTOS
    private float precioBase;
    private COLOR color;
    private CONSUMO_ENERGETICO consumoEnergetico;
    private float peso;
   
    
    //CONSTRUCTORES
    /*
    Un constructor por defecto.
    Un constructor con el precio y peso. El resto por defecto.
    Un constructor con todos los atributos.
    */
    public Electrodomestico() {
    }


    public Electrodomestico(float precioBase, float peso) {
        /*this.precioBase = precioBase;
        this.peso = peso;
        consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        color = COLOR_DEF;*/
        this(precioBase,COLOR_DEF,CONSUMO_ENERGETICO_DEF,peso);
    }

    public Electrodomestico(float precioBase, COLOR color, CONSUMO_ENERGETICO consumoEnergetico, float peso) {
        this.precioBase = precioBase;

        // CON TIPOS ENUMERADOS NO NECESITO COMPROBAR SI EL COLOR ES CORRECTO
        // YA QUE SOLO DEJA TRABAJAR CON LOS COLOR Y CONSUMO ENERGÉTICO CORRECTO
        // if (comprobarColor(color))
        //     this.color = color;
        // else
        //     this.color = COLOR_DEF;
        
        // if (comprobarConsumoEnergetico(consumoEnergetico))
        //     this.consumoEnergetico = consumoEnergetico;
        // else
        //     this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;

        this.consumoEnergetico = consumoEnergetico;
        this.color = color;

        this.peso = peso;
    }


    
    // OTROS MÉTODOS
    /*
comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
si no es correcta usara la letra por defecto. 
Se invocara al crear el objeto y no será visible.

comprobarColor(String color): 
comprueba que el color es correcto, 
si no lo es usa el color por defecto. 
Se invocara al crear el objeto y no será visible.

precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también.     
     */

    // private boolean comprobarConsumoEnergetico(char letraConsumo){

    //     for (int i = 0; i < CONSUMO_ENERGETICO.length; i++) {
    //         if(CONSUMO_ENERGETICO[i] == letraConsumo)    
    //             return true;
    //     }
    //     return false;
    // }

    // private boolean comprobarColor(String color){
    //     for (String c : COLORES) {
    //         if (c.equalsIgnoreCase(color))
    //             return true;
    //     }
    //     return false;

    // }

    public float getPrecioFinal(){
        // Pendiente meter toda la lógica para incrementar el precioBase 
        // según la letra energética y el peso

        float precioFinal;

        //1. DEPENDIENDO DE LA LETRA ENERGÉTICA HAY UN COSTE
        precioFinal = precioBase + consumoEnergetico.getPrecioExtra();

        //2. DEPENDIENDO DEL PESO
        if (peso >= 0 && peso <19) 
            precioFinal += 10;
        else if (peso >= 20 && peso <49)
            precioFinal += 50;
        else if (peso >=50 && peso <=79)
            precioFinal += 80;
        else if (peso >= 80)
            precioFinal += 100;

        return precioFinal;
    }


    @Override
    public String toString() {
        return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
                + consumoEnergetico + ", peso=" + peso + "]";
    }

    

   
}