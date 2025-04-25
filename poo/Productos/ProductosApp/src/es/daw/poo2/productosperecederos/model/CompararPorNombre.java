package es.daw.poo2.productosperecederos.model;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Producto>{

    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

}
