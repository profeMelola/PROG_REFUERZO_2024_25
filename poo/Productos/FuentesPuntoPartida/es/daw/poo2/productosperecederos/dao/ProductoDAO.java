package es.daw.poo2.productosperecederos.dao;

import es.daw.poo2.productosperecederos.model.NoPerecedero;
import es.daw.poo2.productosperecederos.model.Perecedero;
import es.daw.poo2.productosperecederos.model.Producto;
import java.util.ArrayList;
import es.daw.poo2.productosperecederos.model.NoPerecedero.TIPO;
/**
 *
 * @author melol
 */
public class ProductoDAO {
    private final ArrayList<Producto> productos = new ArrayList<>();
    
    public ProductoDAO(){
        // int diasCaducar, String nombre, double precio
        productos.add(new Perecedero(1,"Perecedero 1",100));
        productos.add(new Perecedero(2,"Perecedero 2",100));
        productos.add(new Perecedero(3,"Perecedero 1",100));
        // TIPO tipo, String nombre, double precio)
        productos.add(new NoPerecedero(TIPO.PERMITE_DEVOLUCION,"No P 1",10));
        productos.add(new NoPerecedero(TIPO.SIN_DEVOLUCION,"No P 2",20));
        productos.add(new NoPerecedero(TIPO.PERMITE_DEVOLUCION,"No P 2",30));
        
        //DATOS PARA AMPLIACIÓN DEL PROGRAMA
        productos.add(new Perecedero(5,"Perecedero 4",100));
        productos.add(new Perecedero(6,"Perecedero 5",100));
        
    }
    public ArrayList<Producto> select(){
        return (ArrayList<Producto>) productos.clone();
    }
}
