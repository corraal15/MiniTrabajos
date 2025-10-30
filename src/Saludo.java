import java.util.Scanner;
public class Saludo {
    public static void saludar(String nombreEntrada){
        System.out.println("Hola "+nombreEntrada);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el nombre del entrada");
        String nombreEntrada = sc.nextLine();
        saludar(nombreEntrada);

    }
}
    