import java.util.Scanner;
public class Venta {
    public static void main(String[] args) {
    int precio;
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
    precio = leer.nextInt();
    int dinero;
        System.out.println("Ingrese el dinero");
    dinero = leer.nextInt();
    while  (dinero<precio){
        System.out.println("Dinero insuficiente");
        System.out.println("Ingrese el dinero");
        dinero = leer.nextInt();
    }
    int cambio = dinero-precio;
        System.out.println("Aqui tienes tu refresco y tu cambio: "+cambio+"€");
    }
}