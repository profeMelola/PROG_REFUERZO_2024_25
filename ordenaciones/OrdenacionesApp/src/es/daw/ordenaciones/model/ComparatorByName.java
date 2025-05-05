package es.daw.ordenaciones.model;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Persona>{

    // (p1,p2) -> p1.getNombre().compareTo(p2.getNombre())

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

}
