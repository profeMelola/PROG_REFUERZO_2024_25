package model;

public class Material {
    protected int id;
    protected String titulo;

    public Material(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Material(String titulo) {
        this.titulo = titulo;
    }    
   
    public int getId() {
        return id;
    }



    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Material [id=" + id + ", titulo=" + titulo + "]";
    }

    
}
