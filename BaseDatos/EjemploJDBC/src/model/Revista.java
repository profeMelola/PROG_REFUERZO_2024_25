package model;

public class Revista extends Material {
    private int numero;

    public Revista(int id, String titulo, int numero) {
        super(id,titulo);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return super.toString()+" --> Revista [numero=" + numero + "]";
    }

    
}
