
import java.util.Scanner;

/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/ejerciciosSinBucles#ejercicio-2-calculocapital
 */

/**
 *
 * @author melol
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double capital;
        double ganancia;
        //final double PORCENTAJE_MENSUAL = 0.02;
        final float PORCENTAJE_MENSUAL = 0.02f;
        //final float PORCENTAJE_MENSUAL = (float)0.02;
        System.out.println(PORCENTAJE_MENSUAL);

        System.out.println("Introduce el capital invertido:");
        capital = sc.nextDouble();

        ganancia = capital * PORCENTAJE_MENSUAL;

        System.out.println("La ganancia en un mes es: " + ganancia);
    }

}
