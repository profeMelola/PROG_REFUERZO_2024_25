/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/ejerciciosConBucles#ejercicio-8-tabla-de-multiplicar
 */
package bucles;

/**
 *
 * @author melol
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamo a función que pinta la tabla de multiplicar con for anidados
        pintaTablaConFor();
        
        // Llamo a una función que pinta la tabla de multiplicar con while anidados
        pintaTablaConWhile();
    }
    
    
    // función que pinta la tabla de multiplicar con for anidados
    public static void pintaTablaConFor(){
        System.out.println("******** TABLA DE MULTIPLICAR CON FORS ***********");
        
        // bucle que se repite 9 veces. Desde la tabla del 1 hasta la 9
        for(int i=1;i<=9;i++){
            System.out.println("****> Tabla del "+i);
            // Por cada número pinto la tabla de multiplicar
            for(int j=0; j<=10;j++){
                System.out.println(i +"X"+j+"="+ (i*j));
            }
            System.out.println("******>fin de la tabla del "+i);
        }
    }
    
    public static void pintaTablaConWhile(){
        int i=1,j=0;
        
        System.out.println("******** TABLA DE MULTIPLICAR CON WHILES ***********");
        while(i<=9){
            System.out.println("****> Tabla del "+i);
            
            while(j<=10){
                System.out.println(i +"X"+j+"="+ (i*j));
                j++;
            }
            
            System.out.println("******>fin de la tabla del "+i);
            i++; // incremento i para pasar a la siguente tabla
            j=0; // reseteo j a 0 para empezar la multiplicación por 0
        }
        
        
    }
    
}
