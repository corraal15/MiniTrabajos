import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        double num1, num2;
        String op;
        System.out.println("Ingresa el primer dígito de la operación");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo dígito de la operación");
        num2 = sc.nextDouble();
        System.out.println("Resultado: "+sumar(num1,num2));
    }
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }
}
    