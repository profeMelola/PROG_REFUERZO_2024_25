package es.daw.simpson;

import java.util.Random;

import es.daw.simpson.model.Ciudad;
import es.daw.simpson.model.Simpson;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Necesito una ciudad donde viven los Simpson
        Ciudad ciudad = new Ciudad("Springfield");


        // 2. Crear personajes de los Simpson
        Random r = new Random();

        Simpson hommer = new Simpson();
        hommer.setNombre("Hommer");
        hommer.setDni("11111111A");
        hommer.setEdad(38);
        hommer.setPuntos(r.nextInt(1, 100));

        Simpson bart = new Simpson("Bart", "11111111B", 10);
        //bart.setPuntos(r.nextInt(1,100)); // sobra porque los puntos aleatorios se calculan en el constructor

        Simpson marge = new Simpson("Marge","11111111C",34);

        // 3. Añadir los personajes a la ciudad
        ciudad.addHabitante(hommer); 
        ciudad.addHabitante(bart);
        ciudad.addHabitante(marge);

        // 4. Mostrar habitantes
        ciudad.mostrarHabitantes();

        // 5. Edad media de los habitantes
        System.out.println("La media de edad de los Simpson es: "+ciudad.calcularEdadMedia());

        // 6. Borro habitantes

        String nombreABorrar= "Bart";
        Simpson bart2 = new Simpson("Bart", "11111111B", 10);

        if (ciudad.removeHabitante(bart2)){
            System.out.println("* Habitantes después de borrar Bart:");
            ciudad.mostrarHabitantes();
        }else{
            System.out.println("* No encuentro al personaje "+bart.getNombre());
        }






    }
}
