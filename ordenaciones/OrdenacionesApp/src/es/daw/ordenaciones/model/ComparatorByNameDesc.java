package es.daw.ordenaciones.model;

import java.util.Comparator;

public class ComparatorByNameDesc implements Comparator<Persona>{

    // (p1,p2) -> p1.getNombre().compareTo(p2.getNombre())

    @Override
    public int compare(Persona p1, Persona p2) {
        return p2.getNombre().compareTo(p1.getNombre());
    }

}
