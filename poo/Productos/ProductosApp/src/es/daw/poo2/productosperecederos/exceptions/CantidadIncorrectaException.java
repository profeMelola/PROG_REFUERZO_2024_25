package es.daw.poo2.productosperecederos.exceptions;

// Excepción -> checked (necesito manejarla)
// RuntimeException -> unckecked (no me obliga a manejar, salta en ejecución). Ejemplo: IndexOfBoundException...
public class CantidadIncorrectaException extends Exception{

    public CantidadIncorrectaException(String mensaje){
        super(mensaje);
    }

}
