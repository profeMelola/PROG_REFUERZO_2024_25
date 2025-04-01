package es.daw.minecraft.model;

public class Pico extends Herramienta{

    protected String material;

    public Pico(String nombre, int durabilidad, String material) {
        super(nombre, durabilidad);
        this.material = material;
    }

    

}
