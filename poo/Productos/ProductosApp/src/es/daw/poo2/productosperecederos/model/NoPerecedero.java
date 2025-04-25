package es.daw.poo2.productosperecederos.model;

public class NoPerecedero extends Producto{

    // ("Sin devolución", "Permite devolución")
    //String[] tipo = {"Sin devolución", "Permite devolución"};

    // -------------------------------
    // PERMITE_DEVOLUCION
    // SIN_DEVOLUCION
    public enum TIPO {SIN_DEVOLUCION,PERMITE_DEVOLUCION};
    // ------------------------------------

    private TIPO tipo;


    public NoPerecedero(TIPO tipo, String nombre, double precio ) {
        super(nombre, precio);
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return super.toString()+" , y es NoPerecedero y del tipo " + tipo ;
    }


    @Override
    public boolean permiteDevolucion() {
        if (tipo == TIPO.PERMITE_DEVOLUCION)
            return true;
        
        return false;
    }


    @Override
    public String convert2XML() {
        // TODO Auto-generated method stub
        return super.convert2XML()+"</TAGS ADICIONALES DEL PRODUCTO NO PERECEDERO>";
    }

    
    
}
