package es.daw.simpson.model;

import java.util.Comparator;

public class ComparadorPorPuntos implements Comparator<Simpson>{

    @Override
    public int compare(Simpson s1, Simpson s2) {
        return Integer.compare(s1.getPuntos(), s2.getPuntos());
    }

}
