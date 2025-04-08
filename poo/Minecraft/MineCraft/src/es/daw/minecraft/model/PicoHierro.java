package es.daw.minecraft.model;

public class PicoHierro extends Pico{

    public PicoHierro(String nombre, int durabilidad, String material) {
        super(nombre, durabilidad, material);
        //TODO Auto-generated constructor stub
    }

    public PicoHierro(String nombre, int durabilidad) {
        super(nombre, durabilidad, "Hierro");
    }


    @Override
    public void minar() {
        System.out.println("Soy un pico de hierro y no puedo minar obsidiana.");
    }


}
