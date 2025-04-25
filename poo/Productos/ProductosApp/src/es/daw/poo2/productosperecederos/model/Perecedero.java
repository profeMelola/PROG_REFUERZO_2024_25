package es.daw.poo2.productosperecederos.model;

import java.util.concurrent.CancellationException;

import es.daw.poo2.productosperecederos.exceptions.CantidadIncorrectaException;

public class Perecedero extends Producto{


    private int diasCaducar;

    public Perecedero(int diasCaducar,String nombre, double precio) {
        super(nombre, precio);
        this.diasCaducar = diasCaducar;
    }


    // public ProductoPerecedero(String nombre, double precio) {
    //     super(nombre, precio);
    //     //TODO Auto-generated constructor stub
    // }

    // Pendiente getters setters...

    @Override
    public double calcular(int cantidad) throws CantidadIncorrectaException{
        // Quiero reutilizar la del padre
        //return super.calcular(cantidad);
        double precioTotal = super.calcular(cantidad); // precio * cantidad

        // Añadir una nueva lógica

        /*
         * Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
         * Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
         * Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
         */
        // switch (diasCaducar) {
        //     case 1:
        //         //  75% de descuento (paga solo el 25%), es decir, el precio se reduce 4 veces
        //         // precioTotal = precioTotal - (precioTotal*0.75);
        //         //precioTotal = precioTotal / 4;
        //         precioTotal /= 4;
        //         break;
        //     case 2:
        //         precioTotal /= 3;
        //         break;
        //     case 3:
        //         precioTotal /= 2;
        //         break;
        //     default:
        //         break;
        // }

        switch (diasCaducar){
            case 1 -> precioTotal /= 4;
            case 2 -> precioTotal /=3;
            case 3 -> precioTotal /=2;
            //default -> {}
        }

        return precioTotal;


    }


    @Override
    public String toString() {
        return super.toString()+" , es Perecedero y caduca en " + diasCaducar + " días";
    }


    @Override
    public boolean permiteDevolucion() {
        if (diasCaducar > 5 ) 
            return true;
        return false;
    }

    @Override
    public String convert2XML() {
        // TODO Auto-generated method stub
        return super.convert2XML()+"</TAGS ADICIONALES DEL PRODUCTO PERECEDERO>";
    }

    


}
