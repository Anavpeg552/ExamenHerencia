package Ejercicio1;

public class ProductoMain {
    public static void main(String[] args) {
        ProductoGeneral p1= new ProductoGeneral("Teclado",8.99);
        System.out.println(p1);

        ProductoReducido p2= new ProductoReducido("Teclado",8.99);
        System.out.println(p2);

        //Ejercicio1.ProductoIVA p3= new Ejercicio1.ProductoIVA("Monitor",8.99);
        //p1.setDescripcion("mONITOR");
        //System.out.println(p1);
/*
        Ejercicio1.ProductoReducido p3= new Ejercicio1.ProductoReducido("",8.99);
        System.out.println(p3);
*/
        /*
        Ejercicio1.ProductoReducido p4= new Ejercicio1.ProductoReducido("A",-1);
        System.out.println(p4);
*/
    }
}
