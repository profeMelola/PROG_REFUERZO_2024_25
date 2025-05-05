package es.daw.poo2.electrodomesticos.dao;

import java.util.ArrayList;

import es.daw.poo2.electrodomesticos.model.Electrodomestico;
import es.daw.poo2.electrodomesticos.model.Lavadora;
import es.daw.poo2.electrodomesticos.model.Television;

/**
 *
 * @author melola
 */
public class ElectrodomesticoDAO {
    private final ArrayList<Electrodomestico> electrodomesticos;

    
    public ElectrodomesticoDAO(){
        electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(200, 60, 'C', "Verde"));
        electrodomesticos.add(new Lavadora(150, 30));
        electrodomesticos.add(new Television(500, 80, 'E', "Negro", 42, false));
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Lavadora(600, 20, 'D', "gris"));
        electrodomesticos.add(new Lavadora(300, 40, 'Z', "blanco", 40));
        electrodomesticos.add(new Television(250, 70));
        electrodomesticos.add(new Lavadora(400, 100, 'A', "verde", 15));
        electrodomesticos.add(new Television(200, 60, 'C', "naranja", 30, true));
        electrodomesticos.add(new Television(50, 10));
        
    }
    
    public ArrayList<Electrodomestico> select(){
        return (ArrayList<Electrodomestico>) electrodomesticos.clone();
    }    
    
}
