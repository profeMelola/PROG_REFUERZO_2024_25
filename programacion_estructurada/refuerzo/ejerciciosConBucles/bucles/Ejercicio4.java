/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/ejerciciosConBucles#ejercicio-4
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número mayor que 1: ");
        
        
        int num = sc.nextInt();
        int numCopia = num;
        
        if (num < 1) {
            System.out.println("No has introducido un número mayor que 1");
        } else {
            do {
                System.out.println(num);
                num--;
            } while (num > 0);

            num = numCopia;
            do {
                System.out.print(num+" ");
                num--;
            } while (num > 0);
            
        }
    }

}
