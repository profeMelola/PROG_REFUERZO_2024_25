/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/ejerciciosConBucles#ejercicio-6-datos-estad%C3%ADsticos-edades-alumnos
 * 
Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.

Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará:

    la suma de todas las edades introducidas
    la media
    el número de alumnos
    cuantos son mayores de edad

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int edad = 0;
        //int numAlumnos=0, numAlumnosMayor18=0, mediaEdad=0, sumaEdad=0;
        int numAlumnos = 0;
        int numAlumnosMayor18 = 0;
        int sumaEdad = 0, sumaEdadMay18 = 0;
        int mediaEdad = 0;

        do {
            System.out.println("Introduce la edad del alumno:");
            edad = sc.nextInt();
            
            // Para sabe el número de alumnos
            if (edad > 0){
                // Siempre cuento el número de alumnos
                numAlumnos++;
                
                // Solo en el caso de ser mayor edad cuento
                if (edad >= 18){
                    numAlumnosMayor18++;
                    sumaEdadMay18 += edad;
                }
                
                // Sumatorio de la edad
                sumaEdad += edad;
                
            }
            
            
        }while(edad >= 0); //cuando sea negativo, dará false y el bucle no se repite más
        
        // Solo voy a pintar por consola los resultado si se ha introducido alumnos en el sistema
        if (numAlumnos > 0){
            System.out.println("El número de alumnos es: "+numAlumnos);
            System.out.println("El número de alumnos mayor de edad es: "+numAlumnosMayor18);
            System.out.println("La suma de todas las edades es: "+sumaEdad);
            System.out.println("La suma de todas las edades > 18 es: "+sumaEdadMay18);
            
            mediaEdad = sumaEdad/numAlumnos;
            System.out.println("La media de edad es:"+ mediaEdad);
            
        }else{
            System.out.println("No se ha introducido ningún alumno en el sistema");
        }
            
        //System.out.println("La media de edad es:"+ (sumaEdad/numAlumnos));
    }

}
