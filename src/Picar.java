import java.util.Scanner;
public class Picar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de bloques a picar");
        int bloques=leer.nextInt();
        for (int i = 1; i<=bloques;i++) {
            System.out.println("Picando bloque "+i+"...");
        }
        System.out.println("Has terminado de picar "+bloques+" bloques!");

    }
}
