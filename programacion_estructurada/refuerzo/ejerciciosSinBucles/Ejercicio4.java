
import java.util.Scanner;

/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/ejerciciosSinBucles#ejercicio-4-preciofinal
 */

/**
 *
 * @author melol
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. DECLARACIÓN DE VARIABLES
        Scanner sc = new Scanner(System.in);
        String nombreArt;
        float precio;
        float iva, descuento;
        int cantidad;
        float precioFinal;
        
        //2. LECTURA DE DATOS
        System.out.println("Introduce el nombre del artículo:");
        nombreArt = sc.nextLine();
        
        System.out.println("Introduce el precio del artículo:");
        precio = sc.nextFloat();
        
        System.out.println("Introduce la cantidad de artículos:");
        cantidad = sc.nextInt();
        
        System.out.println("Introduce el IVA: ");
        iva = sc.nextInt();
        
        System.out.println("Introduce el \"descuento\" a aplicar:");
        descuento = sc.nextInt();
        
        //3. LÓGICA
        
        //3.1 aplicamos el iva a un producto
        // Si el iva es 21% aplico ==> multiplicaríamos por 1.210
        precio = precio * (1+(iva/100) );
        
        //3.2 aplico el descuento al precio con iva
        //float descAux = precio * (descuento/100);
        //precio -= descAux;
        precio = precio - ( precio * descuento /100 );
        
        
        //3.3. aplico la cantidad
        precio = precio * cantidad;
        
        System.out.println("El artículo "+nombreArt+" con "+cantidad+" unidades"
        + " vale un total de "+precio);
    }
    
}
