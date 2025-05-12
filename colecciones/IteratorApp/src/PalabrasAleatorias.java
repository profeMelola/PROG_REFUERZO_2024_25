import java.util.*;

/**
 * Crea una lista de 30 palabras de forma aleatoria. 
 * Cada palabra se formará por tres letras del abecedario al azar. 
 * Muestra la lista por pantalla. 
 * Usando un iterador, recorre una segunda vez la lista y las palabras que contengan alguna vocal deben convertirse en mayúsculas. 
 * Las palabras que empiecen por z se borrarán. Muestra la lista tras la conversión.
 */
public class PalabrasAleatorias {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        Random random = new Random();
        String letras = "abcdefghijklmnopqrstuvwxyz";

        // Crear lista con 30 palabras de 3 letras aleatorias
        for (int i = 0; i < 30; i++) {
            StringBuilder palabra = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                palabra.append(letras.charAt(random.nextInt(letras.length())));
            }
            lista.add(palabra.toString());
        }

        // Mostrar lista original
        System.out.println("Lista original:");
        System.out.println(lista);

        // Recorrer con iterador para modificar y eliminar según condiciones
        ListIterator<String> it = lista.listIterator();
        //Iterator<String> it = lista.iterator();

        // Esta lógica podría ser caracter a caracter comparando con el código ascii
        while (it.hasNext()) {
            String palabra = it.next();

            if (palabra.contains("a") || palabra.contains("e") ||
                palabra.contains("i") || palabra.contains("o") ||
                palabra.contains("u")) {
                palabra = palabra.toUpperCase();
                it.set(palabra); // Da error si es un iterator
            }

            if (palabra.startsWith("z") || palabra.startsWith("Z")) {
                it.remove();
            }
        }

        // Mostrar lista modificada
        System.out.println("Lista modificada:");
        System.out.println(lista);
    }
}
