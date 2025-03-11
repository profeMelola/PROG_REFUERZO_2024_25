/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/ejerciciosConBucles#ejercicio-8-tabla-de-multiplicar
 */
package bucles;

/**
 *
 * @author melol
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura = 5; // Altura del triángulo

        for (int i = 1; i <= altura; i++) { // Bucle externo para controlar las filas
            for (int j = 1; j <= i; j++) { // Bucle interno para controlar las columnas
                System.out.print("* ");
            }
            System.out.println(); // Cambiar de línea después de imprimir una fila completa
        }
    }
    
}
