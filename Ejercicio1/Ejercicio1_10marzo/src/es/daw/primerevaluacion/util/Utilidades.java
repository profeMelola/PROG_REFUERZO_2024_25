package es.daw.primerevaluacion.util;

public class Utilidades {

    public static int calcularEdadMedia(String[] edades){
        double suma = 0; //sumatorio o acumularos

        // TRANSFORMAR UN ENTERO A STRING
        // String suma2 = ""+suma;
        // String suma3 = String.valueOf(suma);

        for (String edad : edades) {

            // TRANSFORMAR UN STRING A ENTERO
            suma += Integer.parseInt(edad);
            
        }

        System.out.println("** edad media: "+suma / edades.length);

        return (int)suma / edades.length;

    }

}
