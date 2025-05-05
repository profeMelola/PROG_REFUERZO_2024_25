package es.daw.ordenaciones.model;

/**
 *
 * @author melola
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona other) {

        // // Forma 1
        // if (other.getEdad() > edad)
        //     return -1;
        // else if (edad > other.getEdad())
        //     return 1;
        // else
        //     return 0;

        // forma 2
        // return edad - other.getEdad();

        return Integer.compare(edad, other.getEdad());

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
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
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }


    
   
}
