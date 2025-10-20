import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in);
        int random=aleatorio.nextInt(1,10);
        boolean acierta = false;
        int contador = 0;
        while (!acierta) {
            System.out.println("Adivinando el número aleatorio: ");
            int numero = leer.nextInt();
            contador++;
            if (numero>random) {
                System.out.println("Te has pasado.");
            } else if (numero<random) {
                System.out.println("Te has quedado corto.");
            }
            else  {
                System.out.println("Has acertado!!");
                acierta = true;
            }
        }
    }
}
