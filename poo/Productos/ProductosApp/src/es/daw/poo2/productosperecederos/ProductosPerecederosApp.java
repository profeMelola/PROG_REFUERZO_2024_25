package es.daw.poo2.productosperecederos;

import es.daw.poo2.productosperecederos.model.CompararPorNombre;
import es.daw.poo2.productosperecederos.model.Perecedero;
import es.daw.poo2.productosperecederos.model.Producto;
import es.daw.poo2.productosperecederos.dao.ProductoDAO;
import es.daw.poo2.productosperecederos.exceptions.CantidadIncorrectaException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;

/**
 *
 * @author melol
 */
public class ProductosPerecederosApp {

    /**
     * @param args the command line arguments
     * @throws CantidadIncorrectaException 
     */
    public static void main(String[] args) {

        ProductoDAO dao = new ProductoDAO();
        ArrayList<Producto> productos = dao.select();

        // System.out.println("************** LISTADO DE PRODUCTOS **************");
        // for (Producto producto : productos) {
        //     System.out.println(producto.toString());
        // }

        // System.out.println("*********** LISTADO DE PRODUCTOS 2 *******************");
        // productos.forEach(System.out::println);

        for (Producto producto : productos) {

            System.out.println("\n* Descripción del producto: "+producto);

            try {
                System.out.println("\t*Precio total al comprar 5 productos de "+producto.getNombre() +" es: "+producto.calcular(5));
            } catch (CantidadIncorrectaException e) {
                System.out.println("\texcepción!!!!");
                System.err.println("\t"+e.getMessage());
            }

            System.out.println("\t*Permite devolución: "+producto.permiteDevolucion());

            System.out.println("\t XML:");
            System.out.println("\t"+producto.convert2XML());

        }

        System.out.println("************ PRODUCTOS QUE PERMITEN DEVOLUCIÓN ************");
        for (Producto producto : productos) {
            if (producto.permiteDevolucion())
                System.out.println(producto);
        }
        System.out.println("**************************************************************");

        System.out.println("**************************************************************");
        System.out.println("********************** ORDENACIONES **************************");
        System.out.println("**************************************************************");

        System.out.println("************* [CRITERIO NATURAL DE ORDENACIÓN] PRODUCTOS ORDENADOS POR PRECIO ASCENDENTE ***********");
        Collections.sort(productos);
        //productos.sort(Comparator.naturalOrder()); // es lo mismo que lo anterior
        productos.forEach(System.out::println);

        System.out.println("\n************* [CRITERIO NATURAL DE ORDENACIÓN] PRODUCTOS ORDENADOS POR PRECIO DESCENDENTE ***********");
        //productos.sort(Comparator.reverseOrder());
        Collections.reverse(productos); // criterio natural
        productos.forEach(System.out::println);

        System.out.println("\n************* [CRITERIO DE ORDENACIÓN] PRODUCTOS ORDENADOS POR NOMBRE ASCENDENTE ***********");
        // Opción 1: con lambda
        productos.sort( (p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));

        // Opción 2: Comparator clásico
        Collections.sort(productos,new CompararPorNombre());

        productos.forEach(System.out::println);


        System.out.println("\n************* [CRITERIO DE ORDENACIÓN] PRODUCTOS ORDENADOS POR NOMBRE DESCENDENTE ***********");
        // Opción 1: con lambda y truqui del almendruqui
        //productos.sort( (p1,p2) -> p2.getNombre().compareTo(p1.getNombre()));

        // Opción 2: con comparing (avanzado...)
        //productos.sort(Comparator.comparing(Producto::getNombre).reversed());

        // Opción 3: comparator clásico y usar reverseOrder de Collections.
        Collections.sort(productos,Collections.reverseOrder(new CompararPorNombre()));

        // Collections.reverse(productos); // ordena descendente por el criterio natural 

        productos.forEach(System.out::println);

        
    }
    
}
