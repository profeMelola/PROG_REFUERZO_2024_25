package es.daw.ordenaciones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import es.daw.ordenaciones.dao.PersonaDAO;
import es.daw.ordenaciones.exception.MenorEdadException;
import es.daw.ordenaciones.model.Persona;
import es.daw.ordenaciones.util.OrdenacionUtil;

public class App {


    static List<Persona> personas; //null

    public static void main(String[] args) throws Exception {


        // Ordenar Integer
        //OrdenacionUtil.testListInteger();

        // Ordenar personas
        //OrdenacionUtil.testListPersonas();

        //---------------------------------------------
        // Cargar el listado de personas
        // PersonaDAO dao = new PersonaDAO();
        // //List<Persona> personas = dao.selectAll(); // variable local al método main
        // personas = dao.selectAll(); // inicializo la variable global

        Persona p1 = new Persona("Pepe",20);
        Persona p2 = new Persona("Juan",20);
        Persona p3 = new Persona("Paco",40);
        Persona p4 = new Persona("Lola",21);
        Persona p6 = new Persona("Lola",20);
        //Persona p7 = new Persona("Lola",22);
        Persona p7 = new Persona("Lola",21);
        Persona p5 = new Persona("Susi",24);
        Persona p8 = new Persona("Susi",25);
        //Persona p9 = new Persona("Susi",26);
        Persona p9 = new Persona("Susi",25);

        personas = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5, p6, p7,p8,p9));

        // Set datos para jugar con mayoría de edad
        personas.add(new Persona("Maripuri",17));
        personas.add(new Persona("Borja",16));



        System.out.println("****** LISTADO DE TODAS LAS PERSONAS (SET DE DATOS) *********");
        personas.forEach(System.out::println);
        System.out.println("*****************************************************************");

        //-----------------------------

        // Iguales
        //sonIguales();

        // Duplicados
        //eliminarDuplicados();

        // borraPersonasConEdadPar()
        //borraPersonasConEdadPar();

        // Devolver un conjunto de personas mayores de edad
        try{
            Set<Persona> mayoresEdad = obtenerMayoresEdad();
            System.out.println("* Personas mayores de edad:");
            mayoresEdad.forEach(System.out::println);
        }catch(MenorEdadException e){
            System.out.println(e.getMessage());
        }



        System.out.println("**** CHIMPÚN MAIN!!!!");



    }

    /**
     * 
     */
    private static void sonIguales(){

        Persona p1 = new Persona("Lola",21);
        Persona p2 = new Persona("Lola",22);
        Persona p3 = new Persona("Lola",21);

        System.out.println("p1 == p2 : "+p1.equals(p2));
        System.out.println("p1 == p3 : "+p1.equals(p3));


    }

    /**
     * 
     */
    private static void eliminarDuplicados(){
        System.out.println("********* ELIMINAR DUPLICADOS *********");

        System.out.println("* Listado de personas repetidas");
        personas.forEach(System.out::println);
        
        Set<Persona> conjunto = new HashSet<>(personas);
        System.out.println("* Listado de personas no repetidas");
        conjunto.forEach(System.out::println);

    }

    /**
     * 
     */
    private static void borraPersonasConEdadPar(){
        System.out.println("* Listado de personas sin borrar nada:");
        personas.forEach(System.out::println);

        // Pendiente borrar (pedazo de error)
        try{
            for (Persona persona : personas) {
                if (persona.getEdad() %2 == 0){
                    personas.remove(persona);
                }
            }
        }catch(ConcurrentModificationException e){
            System.out.println("************ NO SE HA PODIDO BORRAR PERSONAS POR EDAD PAR *****");
            System.out.println(e.getMessage());
            System.out.println("------------");
            e.printStackTrace();
        }

        // En observación!!!
        // for (int i = 0; i < personas.size(); i++) {
        //     if (personas.get(i).getEdad() %2 == 0 ){
        //         personas.remove(i);
        //     }
        // }

        // Iterator<Persona> it = personas.iterator();
        // //ListIterator<Persona> it2 = personas.listIterator(); // palante, patrás, borrar, modificar

        // while(it.hasNext()){
        //     Persona p = it.next();

        //     if (p.getEdad() % 2 == 0)
        //         it.remove();
        // }
        

        System.out.println("* Listado de personas una vez borradas las que tienen edad par:");
        personas.forEach(System.out::println);

        System.out.println("**** CHIMPÚN 1!!!!");

    }

    /**
     * 
     * @return
     */
    private static Set<Persona> obtenerMayoresEdad() throws MenorEdadException{
        Set<Persona> mayores = new TreeSet<>();

        for (Persona persona : personas) {

            if(persona.getEdad() > 18){
                mayores.add(persona);
            }
            else{
                // Crear, lanzar y propapar una excepción propia
                // MenorEdadException e = new MenorEdadException("La persona "+persona.getNombre()+" es menor de edad. Tiene "+persona.getEdad());
                // throw e;
                throw new MenorEdadException("La persona "+persona.getNombre()+" es menor de edad. Tiene "+persona.getEdad());
            }
            
        }

        return mayores;
    }
}
