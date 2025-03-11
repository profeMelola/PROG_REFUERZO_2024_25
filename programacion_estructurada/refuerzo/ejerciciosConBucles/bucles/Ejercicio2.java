/*
Programa que muestre los números del 1 a un número 

mayor introducido por teclado utilizando la sentencia for.

Realizar el ejercicio mostrando los números cada uno en una línea.

Y después mostrándolos en la misma línea separados por un espacio.

Mostrar un mensaje que indique el final del programa
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica hasta que número quieres que cuente desde 1");
        numero = sc.nextInt();
        
        System.out.println("En líneas separadas...");
        for(int i = 1; i <= numero; i++ ){
            System.out.println(i);
        }

        System.out.println("En la misma línea...");
        System.out.print("[");
        for(int i = 1; i <= numero; i++ ){
            
            /*
            if (i < numero)
                System.out.print(i+" ");
            else
                System.out.print(i);
            */
            if ( i == numero)
                System.out.print(i);
            else
                System.out.print(i+" ");
            
            
        }
        System.out.print("]");

        //System.out.println("");
        System.out.println("\nchimpún!");
        
    }
    
}
