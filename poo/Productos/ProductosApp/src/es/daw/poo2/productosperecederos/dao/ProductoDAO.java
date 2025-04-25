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
        productos.add(new Perecedero(1,"Yogur",10));
        productos.add(new Perecedero(2,"Leche",20));
        productos.add(new Perecedero(3,"Tomate frito",5));
        
        // TIPO tipo, String nombre, double precio)
        productos.add(new NoPerecedero(TIPO.PERMITE_DEVOLUCION,"Mueble",10));
        productos.add(new NoPerecedero(TIPO.SIN_DEVOLUCION,"Ropa interior",20));
        productos.add(new NoPerecedero(TIPO.PERMITE_DEVOLUCION,"Electrodoméstico",30));
        
        //DATOS PARA AMPLIACIÓN DEL PROGRAMA
        productos.add(new Perecedero(5,"Ensalada",2.5));
        productos.add(new Perecedero(6,"Salmorejo",1.25));
        
    }
    public ArrayList<Producto> select(){
        return new ArrayList<>(productos);
    }
}
