package es.daw.simpson.model;

import java.util.ArrayList;

public class Ciudad {

    private String nombre;

    private ArrayList<Simpson> habitantes;

    public Ciudad(String nombre){
        this.nombre = nombre;
        habitantes = new ArrayList<>();
    }

    public void addHabitante(Simpson habitante){
        habitantes.add(habitante);
        System.out.println(habitante.getNombre()+" ha sido añadido a "+nombre);
    }

    public void mostrarHabitantes(){
        System.out.println("Lista de habitantes de "+nombre+" :");
        for (Simpson simpson : habitantes) {
            System.out.println(simpson);
        }
    }

    public boolean removeHabitante(Simpson habitante){
        return habitantes.remove(habitante);
    }

    /**
     * 
     * @return
     */
    public double calcularEdadMedia(){
        int sumaEdades =0;

        if (habitantes.isEmpty()) 
            return 0;
        for (Simpson simpson : habitantes) {
            sumaEdades += simpson.getEdad();
        }

        return sumaEdades / habitantes.size();


    }


    
}
