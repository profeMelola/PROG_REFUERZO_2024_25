package es.daw.poo2.electrodomesticos.enumerados;

public enum CONSUMO_ENERGETICO {
    A(100),
    B(80),
    C(60),
    D(50),
    E(30),
    F(10);

    private int precioExtra;

    private CONSUMO_ENERGETICO(int precioExtra){
        this.precioExtra = precioExtra;
    }

    public int getPrecioExtra(){
        return precioExtra;
    }


}
