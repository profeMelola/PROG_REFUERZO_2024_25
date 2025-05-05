package es.daw.ordenaciones.dao;

import java.util.ArrayList;
import java.util.Arrays;

import es.daw.ordenaciones.model.Persona;


public class PersonaDAO {

    private final ArrayList<Persona> personas; // una vez inicializado no se inicializa de nuevo
    
    public PersonaDAO(){
        Persona p1 = new Persona("Pepe",20);
        Persona p2 = new Persona("Juan",20);
        Persona p3 = new Persona("Paco",40);
        Persona p4 = new Persona("Lola",21);
        Persona p6 = new Persona("Lola",20);
        //Persona p7 = new Persona("Lola",22);
        Persona p7 = new Persona("Lola",21);
        Persona p5 = new Persona("Susi",24);
        Persona p8 = new Persona("Susi",25);
        //Persona p9 = new Persona("Susi",26);
        Persona p9 = new Persona("Susi",25);


        //System.out.println(personas); // esto pinta un null!!!!
        
        personas = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5, p6, p7,p8,p9));

        // Set datos para jugar con mayoría de edad
        personas.add(new Persona("Maripuri",17));
        personas.add(new Persona("Borja",16));
        
    }
    public ArrayList<Persona> selectAll(){
        return new ArrayList<>(personas);
    }    
}