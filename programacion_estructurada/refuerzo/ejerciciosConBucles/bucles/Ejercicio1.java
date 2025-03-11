/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/ejerciciosConBucles#ejercicio-1-eco
 * Programa que muestre un mensaje repetido por consola tantas veces como se hay introducido por teclado.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pintar por consola la palabra ECHO 4 veces
        
        // Caso 1: si bucle
        System.out.println("ECHO");
        System.out.println("ECHO");
        System.out.println("ECHO");
        System.out.println("ECHO");
        
        // Caso 2: con bucle for
        
        //for(int i = 1 ; i < 5  ; i++){
        //for(int i = 1 ; i <= 4  ; i++){
        for(int i = 0; i < 4; i++){
            System.out.println("["+i+"] HECHO");
        }
        
        
        
        
        /*int numVeces = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántas veces debe aparecer ECHO?");
        numVeces = sc.nextInt();
        
        for (int i = 1; i <= numVeces; i++){
            System.out.println("ECHO");
        }*/
        
        
        
        
        
    }
    
}
