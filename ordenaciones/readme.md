# Ordenaciones

![image](https://github.com/user-attachments/assets/983376e7-f182-4884-9e8c-548e7f652e5d)

Crea un proyecto llamado **OrdenacionesApp**.

## ORDENACIÓN DE ENTEROS

Usa este método:

```
    /**
     * Método para hacer pruebas listando enteros
     */
    private static void testListInteger(){
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

```

## ORDENACIÓN CLASE PERSONA

Partimos de la clase **Persona**:

```
package es.daw.arraylistonfire.model;

/**
 *
 * @author melola
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona other) {
        // FORMA 1
        /*if (other.getEdad() > edad)
            return -1;
        else if (edad > other.getEdad())
            return 1;
        else
            return 0;*/
        
        // FORMA 2
        //return edad - other.getEdad();

        // ---------------------------------------
        // FORMA RECOMENDADA
        return Integer.compare(this.edad, other.edad);

        // Considerar el nombre si las edades son iguales
        // int result = Integer.compare(this.edad, other.edad);
        // if (result == 0) {
        //     result = this.nombre.compareTo(other.nombre);
        // }
        // return result;        
        // ----------------------------------------
        
    }
   
}

```
### Set de datos: objetos Persona (Clase DAO)

```
package es.daw.arraylistonfire.dao;

import java.util.ArrayList;
import java.util.Arrays;

import es.daw.arraylistonfire.model.Persona;

public class PersonaDAO {

    private final ArrayList<Persona> personas;
    
    public PersonaDAO(){
        //Persona p1 = new Persona("Pepe",28);
        Persona p1 = new Persona("Pepe",20);
        //Persona p2 = new Persona("Juan",32);
        Persona p2 = new Persona("Juan",20);
        Persona p3 = new Persona("Paco",40);
        Persona p4 = new Persona("Lola",21);
        Persona p6 = new Persona("Lola",20);
        Persona p7 = new Persona("Lola",22);
        Persona p5 = new Persona("Susi",24);
        Persona p8 = new Persona("Susi",25);
        Persona p9 = new Persona("Susi",26);
        
        //listPersonas.add(p1);
        //listPersonas.add(p2);
        // .....

        
        personas = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5, p6, p7,p8,p9));
        
    }
    public ArrayList<Persona> selectAll(){
        return new ArrayList<>(personas);
    }    
}
```


### Comparador por nombre (Clase implementando la inferface Comparator)

```
package es.daw.arraylistonfire.model;

import java.util.Comparator;

/**
 *
 * @author melola
 */
public class ComparatorByName implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
    
}
```

## Borrar personas con edad par: Iterator

Implementa este método:

```
private static void borraPersonasConEdadPar(){
...
}
```
