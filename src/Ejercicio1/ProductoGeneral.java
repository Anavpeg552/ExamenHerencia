package Ejercicio1;

final public class ProductoGeneral extends ProductoIVA {
    public ProductoGeneral(String descripcion, double precioBruto) throws IllegalArgumentException {
        super(descripcion, precioBruto);
        setIVA(21);
    }


}
