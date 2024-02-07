package Ejercicio2;


import Ejercicio2.exception.NoHayExistenciasEception;

public class Suscripcion{
    private String descripcion;
    private int existencias;
    private double precio;

    public Suscripcion(String descripcion, int existencias, double precio) {

        if(descripcion.isBlank()){
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        this.descripcion = descripcion;

        if(existencias<=0){
            throw new IllegalArgumentException("La existencias no pueden ser menos de 0");
        }

        this.existencias = existencias;

        if(precio<0){
            throw new IllegalArgumentException("El precio no puede ser menos de 0");
        }
        this.precio = precio;
    }
}
