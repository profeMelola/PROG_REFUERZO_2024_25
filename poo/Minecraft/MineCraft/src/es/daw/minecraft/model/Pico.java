package es.daw.minecraft.model;

public abstract class Pico extends Herramienta{

    protected String material;

    public Pico(String nombre, int durabilidad, String material) {
        super(nombre, durabilidad);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    // si el enunciado dijera... una vez creado el objeto pico, no se puede modificar el material..
    // pues no pondría el setMaterial
    public void setMaterial(String material) {
        this.material = material;
       
    }

    // Método abstracto
    public abstract void minar();

    @Override
    public String toString() {
        return super.toString()+"\nPico [material=" + material + "]";
    }



    

}
