# Iterator

- Crea una lista de 30 palabras de forma aleatoria. 
- Cada palabra se formará por tres letras del abecedario al azar. 
- Muestra la lista por pantalla. 
- Usando un iterador, recorre una segunda vez la lista y las palabras que contengan alguna vocal deben convertirse en mayúsculas. 
- Las palabras que empiecen por z se borrarán. 
- Muestra la lista tras la conversión

**Ejemplo de resultado por consola:**

![image](https://github.com/user-attachments/assets/3045e080-658a-4794-a350-da0354871426)

# Map

Trabajamos con la clase persona:

```
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    @Override
    public int compareTo(Persona otra) {
        // Orden natural: por edad ascendente
        return Integer.compare(this.edad, otra.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

```

Usaremos un Map para identificar a cada persona con su DNI:

```
import java.util.*;

public class EjemploMap {
    public static void main(String[] args) {
        Map<String, Persona> personas = new HashMap<>();

        personas.put("12345678A", new Persona("Ana", 30));
        personas.put("87654321B", new Persona("Luis", 25));
        personas.put("11223344C", new Persona("Marta", 35));

        // Mostrar el mapa
        for (Map.Entry<String, Persona> entrada : personas.entrySet()) {
            System.out.println("DNI: " + entrada.getKey() + ", Persona: " + entrada.getValue());
        }
    }
}

```

## Tipos de MAP

![image](https://github.com/user-attachments/assets/abd7ea97-a07b-4141-b5ae-38dc067bb372)

### Formas de recorrer un MAP

![image](https://github.com/user-attachments/assets/15aef285-08f3-466a-927d-2331e9c99efe)


### TreeMap

Se aplicará la **ordenación natural de LocalDate**:

```
        TreeMap<LocalDate, Integer> temperaturas = new TreeMap<>();

        temperaturas.put(LocalDate.of(2024, 5, 3), 22);
        temperaturas.put(LocalDate.of(2024, 5, 1), 18);
        temperaturas.put(LocalDate.of(2024, 5, 2), 20);

        System.out.println("Temperaturas ordenadas por fecha:");
        for (Map.Entry<LocalDate, Integer> entrada : temperaturas.entrySet()) {
            System.out.println("Fecha: " + entrada.getKey() + ", Temp: " + entrada.getValue() + "°C");
        }

```

### Ejemplo con los métodos más comunes

![image](https://github.com/user-attachments/assets/159fb1b0-0242-45c2-bbac-7040b496292e)

```
import java.util.*;

public class Agenda {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();

        // ✅ Añadir elementos
        agenda.put("Ana", "123456789");
        agenda.put("Luis", "987654321");
        agenda.put("Marta", "555555555");

        // ✅ Obtener un valor por clave
        String telefonoDeLuis = agenda.get("Luis");
        System.out.println("Teléfono de Luis: " + telefonoDeLuis);

        // ✅ Verificar si contiene una clave
        if (agenda.containsKey("Marta")) {
            System.out.println("Marta está en la agenda.");
        }

        // ✅ Verificar si contiene un valor
        if (agenda.containsValue("123456789")) {
            System.out.println("El número 123456789 está en la agenda.");
        }

        // ✅ Eliminar un contacto
        agenda.remove("Ana");

        // ✅ Reemplazar un número existente
        agenda.replace("Luis", "111111111");

        // ✅ Obtener todas las claves
        System.out.println("Contactos:");
        for (String nombre : agenda.keySet()) {
            System.out.println("- " + nombre);
        }

        // ✅ Obtener todos los valores
        System.out.println("Números de teléfono:");
        for (String numero : agenda.values()) {
            System.out.println("- " + numero);
        }

        // ✅ Recorrer todo el mapa (clave + valor)
        System.out.println("Agenda completa:");
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        // ✅ Tamaño del mapa
        System.out.println("Total de contactos: " + agenda.size());

        // ✅ Borrar todo
        agenda.clear();
        System.out.println("Agenda vacía: " + agenda.isEmpty());
    }
}

```
