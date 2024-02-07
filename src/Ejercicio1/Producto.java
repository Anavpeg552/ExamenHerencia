package Ejercicio1;

public abstract class Producto {

    private String descripcion;
    private double precioBruto;

    public Producto(String descripcion, double precioBruto) throws IllegalArgumentException{

        if(descripcion.isBlank()){
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        this.descripcion = descripcion;

        if (precioBruto<0){
            throw new IllegalArgumentException("Precio bruto menor que 0 ");
        }
        this.precioBruto = precioBruto;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public double getPrecioBruto() {
        return precioBruto;
    }


    @Override
    public String toString() {
        return descripcion +": "  + precioBruto +"$";
    }

    public abstract double getPrecioNeto();
}
