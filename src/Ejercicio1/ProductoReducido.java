package Ejercicio1;

public class ProductoReducido extends ProductoIVA{


    public ProductoReducido(String descripcion, double precioBruto) throws IllegalArgumentException {
        super(descripcion, precioBruto);
        setIVA(5);
    }


}
