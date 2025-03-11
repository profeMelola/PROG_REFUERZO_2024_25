/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/ejerciciosConBucles#ejercicio-5
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numMenor,numMayor;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el num mayor:");
        numMayor = sc.nextInt();
        
        System.out.println("Escribe el num menor:");
        numMenor = sc.nextInt();
        
        
        //OJO: faltaría controla que numMayor es mayor que numMenor!!!!
        for(int i = numMayor; i >= numMenor; i--){
            System.out.println(i);
            
        }
        
        
        
    }
    
}
