import java.util.Scanner;
public class AnhoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int anho = sc.nextInt();

        if ((anho % 4 == 0 && anho % 100 != 0) || anho % 400 == 0) {
            System.out.println(anho + " es un año bisiesto.");
        } else {
            System.out.println(anho + " no es un año bisiesto.");
        }
    }
}
    