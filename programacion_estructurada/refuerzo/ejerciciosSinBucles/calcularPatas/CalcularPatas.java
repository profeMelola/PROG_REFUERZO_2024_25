/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/ejercicios
 */
package calcularPatas;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalcularPatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Constantes
        final int NUM_PATAS_HORMIGA = 6;
        final int NUM_PATAS_ARAÑA = 8;
        final int NUM_PATAS_COCHINILLA = 14;
        
        // NUM_PATAS_ARAÑA = 16; // Da error porque no se puedo modifcar una var final
        
        // Variables
        Scanner sc = new Scanner(System.in);
        int acumuladorPatas=0;
        
        System.out.println("Escribe el número de hormigas capturadas:");
        
        acumuladorPatas = NUM_PATAS_HORMIGA *  sc.nextInt();
        
        
        System.out.println("Escribe el número de arañas capturas: ");
        // Forma larga
        acumuladorPatas = acumuladorPatas + (NUM_PATAS_ARAÑA *  sc.nextInt());
        
        // Forma reducida (+=)
        //acumuladorPatas += NUM_PATAS_ARAÑA * sc.nextInt();
        
        System.out.println("Escribe el número de cochinillas capturas: ");
        acumuladorPatas += NUM_PATAS_COCHINILLA * sc.nextInt();
        
        System.out.println("EL NÚMERO TOTAL DE PATAS ES: "+acumuladorPatas);
        
        System.out.println("HAY "+acumuladorPatas+" PATAS EN TOTAL");
        
        
        
        
    }
    
}
