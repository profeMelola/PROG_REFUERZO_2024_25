package es.daw.primerevaluacion.util;

public class Utilidades {

    public static double calcularEdadMedia(String[] edades) {
    //public static int calcularEdadMedia(String[] edades) {
        double suma = 0; // sumatorio o acumularos

        // TRANSFORMAR UN ENTERO A STRING...
        // String suma2 = ""+suma;
        // String suma3 = String.valueOf(suma);

        // TRABAJANDO CON DECIMALES...
        // double decimal = 4.5;
        // float decimalFloat = 4.7f;
        // float decimalFloat2 = (float)4.7;

        for (String edad : edades) {
            // TRANSFORMAR UN STRING A ENTERO
            suma += Integer.parseInt(edad);
            // suma = suma + Integer.parseInt(edad); 

        }

        System.out.println("** edad media: " + suma / edades.length);

        //return (int) suma / edades.length; // Trunca!!!!
        //return Math.round(suma / edades.length); // Redondea y devuelve un long en el caso de trabajar con double!!!!

        return suma / edades.length; // Devuelve un double sin formatear (muchos decimales!!!!!)

    }

    /**
     * 
     * @return
     */
    public static String obtenerPersonajesMasPuntos(String[] nombres, int[] puntos){
        int indiceMax = 0;

        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] > puntos[indiceMax]){
                indiceMax = i;
            }

        }
        return nombres[indiceMax];

    }

    /**
     * 
     * @param dnis
     */
    public static void mostrarDnisRepetidos(String[] dnis){
        // PENDIENTE PARA EL LUNES 24 DE MARZO
    }

}
