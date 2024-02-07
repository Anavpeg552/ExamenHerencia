package Ejercicio2;

import java.util.ArrayList;

public class CestaCompra{

    private double presupuesto;

    public CestaCompra(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public double getPrecioCesta() {
        return 0;
    }

    public void imprimir(){
        System.out.println("CESTA DE LA COMPRA");

        System.out.println("Suma: ");
        System.out.println("Presupuesto: "+getPresupuesto());
        System.out.println("Restante: ");
    }
}
