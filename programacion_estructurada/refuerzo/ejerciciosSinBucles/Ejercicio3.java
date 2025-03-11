
import java.util.Scanner;

/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/ejerciciosSinBucles#ejercicio-3-euroscentimos
 */

/**
 *
 * @author melol
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dineroAcumulado;
        int monedas;
        int euros;
        int centimos;

        System.out.println("¿CUÁNTAS MONEDAS DE 2 EUROS TIENES?");
        monedas = sc.nextInt();
        dineroAcumulado = monedas * 200;

        System.out.println("¿CUÁNTAS MONEDAS DE 1 EUROS TIENES?");
        monedas = sc.nextInt();

        dineroAcumulado += monedas * 100;

        System.out.println("¿CUÁNTAS MONEDAS DE 0.5 CÉNTIMOS DE EURO TIENES?");
        monedas = sc.nextInt();

        dineroAcumulado += monedas * 50;

        System.out.println("¿CUÁNTAS MONEDAS DE 0.2 CÉNTIMOS DE EURO TIENES?");
        monedas = sc.nextInt();

        dineroAcumulado += monedas * 20;

        System.out.println("¿CUÁNTAS MONEDAS DE 0.1 CÉNTIMOS DE EURO TIENES?");
        monedas = sc.nextInt();

        dineroAcumulado += monedas * 10;

        System.out.println("HASTA EL MOMENTO TIENES " + dineroAcumulado);
        
        euros = (int) dineroAcumulado / 100;
        centimos = dineroAcumulado % 100;
        
        System.out.println("TIENES "+euros+" EUROS Y "+centimos+" CÉNTIMOS");        
        
    }
    
}
