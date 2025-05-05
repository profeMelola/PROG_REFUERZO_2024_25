package es.daw.poo2.electrodomesticos.model;

import es.daw.poo2.electrodomesticos.enumerados.COLOR;
import es.daw.poo2.electrodomesticos.enumerados.CONSUMO_ENERGETICO;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    private static final int RESOLUCION_DEF=20;

    /*

    Un constructor por defecto.
    Un constructor con el precio y peso. El resto por defecto.
    Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
     
     */
/*
        electrodomesticos.add(new Television(500, 80, 'E', "Negro", 42, false));
        electrodomesticos.add(new Television(250, 70));
        electrodomesticos.add(new Television(200, 60, 'C', "naranja", 30, true));
        electrodomesticos.add(new Television(50, 10));
 
 */
    public Television(){
    }

    public Television(float precio, float peso){
        super(precio, COLOR_DEF,CONSUMO_ENERGETICO_DEF,peso);
        resolucion = RESOLUCION_DEF;
        sintonizadorTDT = false;
    }

    public Television(float precio, float peso, CONSUMO_ENERGETICO consumo, COLOR color, int resolucion, boolean siTDT){
        super(precio,color,consumo,peso);
        sintonizadorTDT = siTDT;
    }

    @Override
    public float getPrecioFinal() {
        float precioFinal = super.getPrecioFinal();

        if (resolucion > 40)
            precioFinal += precioFinal * 0.3;

        if (sintonizadorTDT)
            precioFinal += 50;

        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + "]";
    }

    


}