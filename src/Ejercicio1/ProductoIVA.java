package Ejercicio1;

public abstract class ProductoIVA extends Producto {
    private double IVA;

    public ProductoIVA(String descripcion, double precioBruto) throws IllegalArgumentException {
        super(descripcion, precioBruto);
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    @Override
    public double getPrecioNeto() {
        return (getPrecioBruto()* (1 + IVA/100));
    }

    @Override
    public String toString() {
        return getDescripcion()+": "+getPrecioBruto()+"$ + "+ IVA+"% = "+ getPrecioNeto();
    }
}
