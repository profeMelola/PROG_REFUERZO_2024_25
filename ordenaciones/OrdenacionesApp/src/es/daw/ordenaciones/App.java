package es.daw.ordenaciones;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.daw.ordenaciones.dao.PersonaDAO;
import es.daw.ordenaciones.model.Persona;
import es.daw.ordenaciones.util.OrdenacionUtil;

public class App {
    public static void main(String[] args) throws Exception {
        // Ordenar Integer
        //OrdenacionUtil.testListInteger();

        // Ordenar personas
        //OrdenacionUtil.testListPersonas();

        // Iguales
        //sonIguales();

        // Duplicados
        eliminarDuplicados();

    }

    private static void sonIguales(){

        Persona p1 = new Persona("Lola",21);
        Persona p2 = new Persona("Lola",22);
        Persona p3 = new Persona("Lola",21);

        System.out.println("p1 == p2 : "+p1.equals(p2));
        System.out.println("p1 == p3 : "+p1.equals(p3));


    }

    private static void eliminarDuplicados(){
        System.out.println("********* ELIMINAR DUPLICADOS *********");

        PersonaDAO dao = new PersonaDAO();
        List<Persona> personas = dao.selectAll();
        System.out.println("* Listado de personas repetidas");
        personas.forEach(System.out::println);
        
        Set<Persona> conjunto = new HashSet<>(personas);
        System.out.println("* Listado de personas no repetidas");
        conjunto.forEach(System.out::println);

    }


}
