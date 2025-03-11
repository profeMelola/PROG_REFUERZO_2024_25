package bucles;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class EjemploBucleInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int inicio = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número >= 0 y < 10: ");
        inicio = sc.nextInt();
        
        // condición: el num introducido sea < 10 y >= 0
        if (inicio >= 0 && inicio < 10){
            
            System.out.println("Los números consecutivos de "+inicio+" a 10 son:");
            //for (inicio del contador;condición;incremento o decremento)
            for( int i = inicio; i <= 10 ; i++){
                System.out.println(i);
            }
            
        }else{
            System.out.println("Has escrito un número incorrecto!!!!");
        }
        
        
        
    }
    
}
