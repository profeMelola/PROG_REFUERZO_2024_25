package es.daw.primerevaluacion;

import java.util.Random;

import es.daw.primerevaluacion.util.Utilidades;

public class App {
    public static void main(String[] args) throws Exception {
        
        // DIFERENTES FORMAS DE CARGA UN ARRAY
        String[] nombres = {"Homer","Bart","Marge","Lisa","Maggie","Ned","Moe"};

        String[] dnis = new String[7];
        dnis[0] = "11111111A";
        dnis[1] = "11111111B";
        dnis[2] = "11111111C";
        dnis[3] = "11111111C"; // Repetido
        dnis[4] = "11111111E";
        dnis[5] = "11111111A"; // Repetido
        dnis[6] = "11111111G";

        String[] edades = new String[]{"38","10","34","8","1","40","50"};

        int[] puntos = new int[7];


        System.out.println("********** puntos antes de cargar ***********");
        for (int punto : puntos) {
            System.out.print(punto +" ");
        }
        System.out.println("\n*********************************************");

        cargarPuntos(puntos,1,100); // método estático privado para cargar aleatoriamente puntos

        System.out.println("********** puntos antes de cargar ***********");
        for (int i = 0; i < puntos.length; i++) {
            System.out.print(puntos[i] +" ");
        }
        
        System.out.println("\n*********************************************");


        System.out.println("1.EDAD MEDIA DE LOS PERSONAJES DE LOS SIMPSON");
        //double edadMedia = Utilidades.calcularEdadMedia(edades);
        //System.out.println(edadMedia);

        System.out.println(Utilidades.calcularEdadMedia(edades));

        System.out.println("2.NOMBRE DEL PERSONAJE DE LOS SIMPSON QUE TIENE MÁS PUNTOS:");
        //String nombre = obtenerPersonajeMasPuntos(nombres,puntos);
        //System.out.println(nombre);

        System.out.println("3.DNIS REPETIDOS");
        //mostrarDnisRepetidos(dnis);        


    }

    /**
     * Método que carga un array de enteros con números aleatorios
     * @param puntos array de entero
     */
    private static void cargarPuntos(int[] puntos, int min, int max){


        Random random = new Random();

        // Llenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < puntos.length; i++) {
            // Devuelve núm aleatorio entre 0 y 99
            //puntos[i] = random.nextInt(100) +1 ;
            puntos[i] = random.nextInt(min,max);
        }


    }

}
