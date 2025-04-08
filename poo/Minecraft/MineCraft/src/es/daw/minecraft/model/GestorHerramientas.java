package es.daw.minecraft.model;

import java.util.ArrayList;
import java.util.List;

public class GestorHerramientas {

    // Esto es polimorfismo!!!! Uso Herramienta, no una lista de picos, de hachas...
    // No necesitas saber exactamente qué tipo de herramienta es. 
    // Solo sabes que es una herramienta y puedes usarla. Eso es polimorfismo.    
    private List<Herramienta> herramientas;

    public GestorHerramientas() {
        herramientas = new ArrayList<>();
    }

    public void addHerramienta(Herramienta herramienta){
        herramientas.add(herramienta);
    }

    public String pintaHerramientas(){
        return herramientas.toString();
    }


    // PENDIENTE!!!
    public void removeLastHerramienta(){

    }

}
