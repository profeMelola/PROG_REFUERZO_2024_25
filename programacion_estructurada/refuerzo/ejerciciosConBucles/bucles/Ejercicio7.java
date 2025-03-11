/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/ejerciciosConBucles#ejercicio-7-suma-de-pares-e-impares
 */
package bucles;

/**
 *
 * @author melola
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sumaPares=0, sumaImpares=0;
        int contadorPares=0, contadorImpares=0;
        
        // Itera 100 veces
        for(int i=100;i<200;i++){
            
            if ( i % 2 == 0){
                // es par
                //sumaPares = sumaPares + i;
                sumaPares += i;
                contadorPares++;
            }else{
                // impar
                sumaImpares += i;
                contadorImpares++;
            }
        }
        
        // Mostrar información al usuario
        System.out.println("El sumatorio de num pares es: "+sumaPares);
        System.out.println("El sumatorio de num impares es: "+sumaImpares);
        System.out.println("El número de impares es: "+contadorImpares);
        System.out.println("El número de pares es: "+contadorPares);
        
        
    }
    
}
