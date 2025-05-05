package es.daw.ordenaciones.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import es.daw.ordenaciones.dao.PersonaDAO;
import es.daw.ordenaciones.model.ComparatorByName;
import es.daw.ordenaciones.model.ComparatorByNameDesc;
import es.daw.ordenaciones.model.Persona;

public class OrdenacionUtil {


    /**
     * Método para hacer pruebas listando enteros
     */
    public static void testListInteger(){
        /*
         * ARRAYLIST DE ENTEROS
         */
        System.out.println("**************************************************");
        System.out.println("**EJEMPLOS DE ORDENACIÓN DE ARRAYLIST DE ENTEROS *");
        System.out.println("**************************************************");

        System.out.println("**************************************************");
        System.out.println("** ARRAYLIST ENTEROS *");
        System.out.println("**************************************************");
        
        // ArrayList<Integer> listInt = new ArrayList<>();
        // listInt.add(3);
        // listInt.add(4);
        // listInt.add(2);
        // listInt.add(6);
        // listInt.add(5);
        // listInt.add(1);
        // listInt.add(7);

        List<Integer> listInt = Arrays.asList(3,4,2,6,5,1,7);        
        
        System.out.println("* Lista de enteros no ordenada");
        listInt.forEach(System.out::println);
        
        System.out.println("* Lista de enteros inversa:");
        Collections.reverse(listInt);
        listInt.forEach(System.out::println);
        
        System.out.println("* Lista de enteros ordenada por defecto (ascendente):");
        //Forma 1
        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt);
        listInt.forEach(System.out::println);
        
        //Forma 2
        System.out.println("\tForma 2 con sort del ArrayList");
        listInt.sort(Comparator.naturalOrder());
        listInt.forEach(System.out::println);
        
        System.out.println("* Lista de enteros ordenada descendente:");
        //Forma 1
        System.out.println("\tForma 1: con Collections.sort");
        Collections.sort(listInt, Comparator.reverseOrder());
        listInt.forEach(System.out::println);
        
        //Forma 2
        System.out.println("\tForma 2 con sort del ArrayList");
        listInt.sort(Comparator.reverseOrder());
        listInt.forEach(System.out::println);
        
        
    }

    /**
     * Trastear con listas de personas y diferentes ordenaciones
     */
    public static void testListPersonas(){

        PersonaDAO dao = new PersonaDAO();

        List<Persona> personas = dao.selectAll();

        System.out.println("* Lista de personas no ordenadas (por orden de inserción):");
        System.out.println("-1-");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
        System.out.println("-2-");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println("-3-");
        personas.forEach(System.out::println);

        System.out.println("* Lista de personas en orden inverso de inserción:");
        Collections.reverse(personas);
        personas.forEach(System.out::println);

        System.out.println("***************** ORDENACIONES COMPARABLE ************");
        System.out.println("* Ordenadas por criterio natural (edad asc):");
        System.out.println("-1-");
        Collections.sort(personas);
        personas.forEach(System.out::println);
        System.out.println("-2-");
        personas.sort(Comparator.naturalOrder());
        personas.forEach(System.out::println);

        System.out.println("* Ordenadas por criterio natural DESC:");
        System.out.println("-1-");
        Collections.sort(personas, Comparator.reverseOrder());
        personas.forEach(System.out::println);

        System.out.println("-2-");
        personas.sort(Comparator.reverseOrder());
        personas.forEach(System.out::println);

        System.out.println("-3-");
        Collections.reverse(personas); // Ordena al revés (el último será el primero)
        personas.forEach(System.out::println);
        System.out.println("*************************************");


        System.out.println("***************** ORDENACIONES COMPARATOR ************");
        System.out.println("* Ordenar por nombre:");
        System.out.println("-1-");
        Collections.sort(personas, new ComparatorByName());
        personas.forEach(System.out::println);

        System.out.println("-2-");
        personas.sort(new ComparatorByName());
        personas.forEach(System.out::println);

        System.out.println("-3-");
        personas.sort( (p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));
        personas.forEach(System.out::println);

        System.out.println("* Ordenar por nombre desc:");
        System.out.println("-1-");
        Collections.sort(personas,new ComparatorByNameDesc());
        personas.forEach(System.out::println);

        System.out.println("-2-");
        personas.sort( (p1,p2) -> p2.getNombre().compareTo(p1.getNombre()));
        personas.forEach(System.out::println);




    }

}
