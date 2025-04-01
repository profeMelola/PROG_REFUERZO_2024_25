package es.daw.simpson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import es.daw.simpson.model.Ciudad;
import es.daw.simpson.model.ComparadorPorPuntos;
import es.daw.simpson.model.Simpson;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Necesito una ciudad donde viven los Simpson
        Ciudad ciudad = new Ciudad("Springfield");


        // 2. Crear personajes de los Simpson
        Random r = new Random();

        Simpson hommer = new Simpson();
        hommer.setNombre("Hommer");
        hommer.setDni("11111111A");
        hommer.setEdad(38);
        hommer.setPuntos(r.nextInt(1, 100));

        Simpson bart = new Simpson("Bart", "11111111B", 10);
        //bart.setPuntos(r.nextInt(1,100)); // sobra porque los puntos aleatorios se calculan en el constructor

        Simpson marge = new Simpson("Marge","11111111C",34);

        // 3. Añadir los personajes a la ciudad
        ciudad.addHabitante(hommer); 
        ciudad.addHabitante(bart);
        ciudad.addHabitante(marge);

        // 4. Mostrar habitantes
        ciudad.mostrarHabitantes();

        // 5. Edad media de los habitantes
        System.out.println("La media de edad de los Simpson es: "+ciudad.calcularEdadMedia());

        // 6. Borro habitantes

        // Simulo que se escribe Bart en consola para que se borra
        // Borrar por posición (pendiente!!!!)
        String nombreABorrar= "Bart";
        Simpson bart2 = new Simpson("Bart", "11111111B", 10);

        if (ciudad.removeHabitante(bart2)){
            System.out.println("* Habitantes después de borrar Bart:");
            ciudad.mostrarHabitantes();
        }else{
            System.out.println("* No encuentro al personaje "+bart.getNombre());
        }



        // ------------------- TRASTEANDO CON ARRAYLIST DE OBJETOS ----------------
        System.out.println("/n**********************************************");
        ArrayList<Simpson> lista = new ArrayList<>();
        lista.add(hommer);
        lista.add(bart);
        lista.add(marge);

        //ArrayList<String> cadenas = new ArrayList<>(List.of("uno","dos","tres"));

        
        System.out.println("*********** LISTA SIN ORDENAR **********");
        System.out.println(lista);
        //System.out.println(cadenas);

        System.out.println("*********** LISTA ORDENADA POR CRITERIO NATURAL (nombre asc) *****");
        //Collections.sort(cadenas);
        Collections.sort(lista);
        System.out.println(lista);


        // ----------------------
        ArrayList<Simpson> lista2 = new ArrayList<>();

        lista2 = lista; // dos variables apuntando a la misma lista

        System.out.println("********** LISTA 2 *********");
        System.out.println(lista2);

        // COPIA DE LISTA 1 EN LISTA 3
        ArrayList<Simpson> lista3 = new ArrayList<>(lista);

        System.out.println("********** LISTA 3 *********");
        System.out.println(lista3);



        // Modifico el primer Simpson (Bart)
        lista.get(0).setNombre("NuevoNombre");

        System.out.println("********** LISTA 1 TRAS MODIFICAR NOMBRE BART *******");
        System.out.println(lista);
        System.out.println("********** LISTA 2 TRAS MODIFICAR NOMBRE BART en lista 1*******");
        System.out.println(lista2);
        System.out.println("********** LISTA 3 TRAS MODIFICAR NOMBRE BART en lista 1*******");
        System.out.println(lista3);

        System.out.println("******** BORRO PRIMER ELEMENTO DE LISTA 1********");
        lista.remove(0);

        System.out.println("********** LISTA 1 TRAS BORRAR PRIMER ELEMENTO *******");
        System.out.println(lista);
        System.out.println("********** LISTA 2 TRAS BORRAR PRIMER ELEMENTO en lista 1*******");
        System.out.println(lista2);
        System.out.println("********** LISTA 3 TRAS BORRAR PRIMER ELEMENTO en lista 1*******");
        System.out.println(lista3);


        // ORDENACIÓN POR OTROS CAMPOS
        // USO DE COMPARATOR CON PROGRAMACIÓN FUNCIONAL (LAMBDA)
        Collections.sort(lista3, (s1,s2)-> Integer.compare(s1.getEdad(), s2.getEdad()));

        System.out.println("******** LISTA 3 ORDENADA POR EDAD *****");
        System.out.println(lista3);

        // USO DE COMPARATOR IMPLEMENTANDO COMPARATOR 
        Collections.sort(lista3,new ComparadorPorPuntos());
        System.out.println("******** LISTA 3 ORDENADA POR PUNTOS *****");
        System.out.println(lista3);








    }
}
