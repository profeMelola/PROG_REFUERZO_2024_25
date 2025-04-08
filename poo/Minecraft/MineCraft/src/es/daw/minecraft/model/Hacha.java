package es.daw.minecraft.model;

public class Hacha extends Herramienta{

    private float eficiencia;

    public Hacha(String nombre, int durabilidad, float eficiencia) {
        super(nombre, durabilidad);
        this.eficiencia = eficiencia;
    }

    public float getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(float eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {

        return super.toString()+"\nHacha [eficiencia=" + eficiencia + "]";
    }


    
    
    

    


}
