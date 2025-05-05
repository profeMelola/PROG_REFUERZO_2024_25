package es.daw.poo2.electrodomesticos;

import java.util.ArrayList;

import es.daw.poo2.electrodomesticos.dao.ElectrodomesticoDAO;
import es.daw.poo2.electrodomesticos.model.Electrodomestico;
import es.daw.poo2.electrodomesticos.model.Lavadora;
import es.daw.poo2.electrodomesticos.model.Television;

/**
 *
 * @author melol
 */
public class ElectrodomesticosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos;

        ElectrodomesticoDAO dao = new ElectrodomesticoDAO();

        electrodomesticos = dao.select();

        for (Electrodomestico e : electrodomesticos) {
            System.out.println(e);
            System.out.println("El precio final es:"+e.getPrecioFinal());
            System.out.println();
        }



        // ------------------

        float sumaPrecioLavadoras=0, sumaPrecioTelevisiones=0;

        for (Electrodomestico e : electrodomesticos) {
            System.out.println(e);
            System.out.println("El precio final es:"+e.getPrecioFinal());
            System.out.println();

            // Mejor un enfoque indicando el tipo de electrodoméstico. Una propiedad
            if (e instanceof Lavadora)
                sumaPrecioLavadoras += e.getPrecioFinal();
            else if (e instanceof Television)
                sumaPrecioTelevisiones += e.getPrecioFinal();

        }

        System.out.println("EL PRECIO TOTAL DE LAS LAVADORAS ES: "+sumaPrecioLavadoras);
        System.out.println("EL PRECIO TOTAL DE LAS TV ES: "+sumaPrecioTelevisiones);
        System.out.println("EL PRECIO TOTAL: "+(sumaPrecioLavadoras+sumaPrecioTelevisiones));

                
        
    }
    
}
