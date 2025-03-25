package es.daw.simpson.model;

import java.time.LocalDate;
import java.util.Random;

public class Simpson {
    // ATRIBUTOS
    private String nombre;
    private String dni;
    private int edad;
    private int puntos;
    private LocalDate fechaAlta; //yyyy-mm-dd

    // CONSTRUCTORES
    // SIEMPRE EXISTE EL CONSTRUCTOR VACÍO SI NO HE CREADO NINGÚN CONSTRUCTOR
    public Simpson(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        // puntos aleatorios
        puntos = new Random().nextInt(1,100);

        // fecha de alta que coincide con la fecha actual del sistema
        fechaAlta = LocalDate.now();

    }

    public Simpson(){

    }
    
    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // MÉTODOS OVERRIDE DE OBJECT
    @Override
    public String toString() {
        return "Simpson [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", puntos=" + puntos + ", fechaAlta="
                + fechaAlta + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Simpson other = (Simpson) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equalsIgnoreCase(other.nombre))
            return false;
        return true;
    }

    
    
    
    
}
