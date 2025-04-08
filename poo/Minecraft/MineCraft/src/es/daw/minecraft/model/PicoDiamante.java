package es.daw.minecraft.model;

public class PicoDiamante extends Pico{

    

    public PicoDiamante(String nombre, int durabilidad, String material) {
        super(nombre, durabilidad, material);
    }

    public PicoDiamante(String nombre, int durabilidad) {
        super(nombre, durabilidad, "Diamante");
    }


    @Override
    public void minar() {
        System.out.println("Soy un pico de diamante y mino cualquier bloque.");
    }


}
