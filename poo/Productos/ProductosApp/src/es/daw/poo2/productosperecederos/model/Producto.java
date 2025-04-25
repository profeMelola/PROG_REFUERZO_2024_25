package es.daw.poo2.productosperecederos.model;

import es.daw.poo2.productosperecederos.exceptions.CantidadIncorrectaException;

public abstract class Producto implements ExportableToXML, Comparable<Producto>{

    // ATRIBUTOS
    private String nombre;
    //private final double precio; // puedo dejarlo como final si una vez creado no se va a modificar
    private double precio;


    // ------------------------
    // CONSTRUCTOR
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // // Si el enunciado dice: se pueden dar de alta en el sistema productos con solo el nombre
    // public Producto(String nombre) {
    //     this.nombre = nombre;
    // }    

    // ---------------------
    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }

    // Si el enunciado dice que una vez creado el producto no puede modificarse el precio, no pondría setter!!!!
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // -------------------- MÉTODOS DE COMPORTAMIENTO -----
    public double calcular(int cantidad) throws CantidadIncorrectaException{

        // Vamos a controlar que la cantidad sea mayor que cero
        if (cantidad <= 0){
            // Crear el objeto excepción
            // CantidadIncorrectaException e = new CantidadIncorrectaException("La cantidad de productos debe ser mayor o igual que 5");
            // throw e;
            throw new CantidadIncorrectaException("La cantidad de productos debe ser mayor o igual que 5");
        }

        return precio * cantidad;
    }

    // --------- MÉTODO ABSTRACTO -------
    public abstract boolean permiteDevolucion();

    @Override
    public String convert2XML() {
        //return "<producto>"+toString()+"</producto>";
        // String xml = "<producto><nombre>"+nombre+"</nombre><precio>"+precio+"</precio></producto>";
        // return xml;

        StringBuilder sb = new StringBuilder();
        sb.append("<producto><nombre>")
        .append(nombre)
        .append("</nombre><precio>")
        .append(precio)
        .append("</precio></producto>");

        return sb.toString();


    }

   // ----------------
   // MÉTODOS OVERRIDE DE OBJECT
   
   @Override
   public String toString() {
       //return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
       return "El producto '"+nombre+"' tiene un precio de "+precio+" euros";
   }

   // ---------- ORDENACIONES -----------

   @Override
   public int compareTo(Producto p) {
        return Double.compare(precio, p.precio);
    
   }


    
   

}
