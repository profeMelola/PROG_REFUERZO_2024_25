package model;

public class Libro extends Material {
    private String autor;

    public Libro(int id, String titulo, String autor) {
        super(id,titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return super.toString()+" --> Libro [autor=" + autor + "]";
    }

    
}
