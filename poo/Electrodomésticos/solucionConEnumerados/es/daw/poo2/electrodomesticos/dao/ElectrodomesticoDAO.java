package es.daw.poo2.electrodomesticos.dao;

import java.util.ArrayList;

import es.daw.poo2.electrodomesticos.enumerados.COLOR;
import es.daw.poo2.electrodomesticos.enumerados.CONSUMO_ENERGETICO;
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

        electrodomesticos.add(new Lavadora(200, 60, CONSUMO_ENERGETICO.C, COLOR.VERDE));
        electrodomesticos.add(new Lavadora(150, 30));
        electrodomesticos.add(new Television(500, 80, CONSUMO_ENERGETICO.E, COLOR.NEGRO, 42, false));
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Lavadora(600, 20, CONSUMO_ENERGETICO.D, COLOR.GRIS));
        electrodomesticos.add(new Lavadora(300, 40, CONSUMO_ENERGETICO.F, COLOR.BLANCO, 40));
        electrodomesticos.add(new Television(250, 70));
        electrodomesticos.add(new Lavadora(400, 100, CONSUMO_ENERGETICO.A, COLOR.VERDE, 15));
        electrodomesticos.add(new Television(200, 60, CONSUMO_ENERGETICO.C, COLOR.ROJO, 30, true));
        electrodomesticos.add(new Television(50, 10));
        
    }
    
    public ArrayList<Electrodomestico> select(){
        return (ArrayList<Electrodomestico>) electrodomesticos.clone();
    }    
    
}
