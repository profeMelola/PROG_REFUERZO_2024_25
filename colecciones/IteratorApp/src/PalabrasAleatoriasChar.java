import java.util.*;

public class PalabrasAleatoriasChar {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        Random random = new Random();
        String letras = "abcdefghijklmnopqrstuvwxyz";

        // Crear lista de 30 palabras de 3 letras aleatorias
        for (int i = 0; i < 30; i++) {
            StringBuilder palabra = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                palabra.append(letras.charAt(random.nextInt(letras.length())));
            }
            lista.add(palabra.toString());
        }

        System.out.println("Lista original:");
        System.out.println(lista);

        ListIterator<String> it = lista.listIterator();

        while (it.hasNext()) {
            String palabra = it.next();

            // Primero: eliminar si empieza por 'z' o 'Z'
            char primeraLetra = palabra.charAt(0);
            if (primeraLetra == 'z' || primeraLetra == 'Z') {
                it.remove();
                continue; // no tiene sentido revisar si tiene vocales
            }

            // Segundo: convertir a mayúsculas si contiene vocal
            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    it.set(palabra.toUpperCase());
                    break;
                }
            }
        }

        System.out.println("Lista modificada:");
        System.out.println(lista);
    }
}

