package es.daw.minecraft.model;

public class Herramienta {

    protected final String nombre; //no se podrá modificar su nombre una vez creado el objeto
    //protected String nombre; // Si no pongo el setNombre, nadie podrá modificarlo, pero sí sus hijos si está protected
    //private String nombre;
    protected int durabilidad;


    // Se debe llevar la cuenta del número total de herramientas creadas. 
    //La clase deberá mantener un contador estático consultable en cualquier momento.
    private static int contador;


    // constructor
    public Herramienta(String nombre, int durabilidad) {
        this.nombre = nombre;
        this.durabilidad = durabilidad;
        contador++;
    }

    // Getters & Setters
    // Una vez creada la herramienta sí se puede modificar su durabilidad
    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    // método estático para obtener el número total de objetos herramienta creados
    public static int getTotalHerramientas() {
        return contador;
    }

     // Sobreescritura de métodos de object
    @Override
    public String toString() {
        return "Herramienta [nombre=" + nombre + ", durabilidad=" + durabilidad + "]";
    }


   
    
    
    



}
