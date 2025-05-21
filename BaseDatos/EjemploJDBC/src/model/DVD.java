package model;

public class DVD extends Material {
    private int duracion;

    public DVD(int id, String titulo, int duracion) {
        super(id,titulo);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return super.toString()+" --> DVD [duracion=" + duracion + "]";
    }

    
}

