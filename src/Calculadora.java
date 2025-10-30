import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        int num1, num2;
        String op;
        System.out.println("Ingresa el primer dígito de la operación");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo dígito de la operación");
        num2 = sc.nextInt();
        System.out.println("Indica el operando (+),(-),(*),(/),(%): ");
        Scanner sc2 = new Scanner(System.in);
        op = sc2.nextLine();
        if (op.equals("+")){
            System.out.println("Resultado: "+sumar(num1,num2));
        }
        else if (op.equals("-")){
            System.out.println("Resultado: "+restar(num1,num2));
        }
        else if (op.equals("*")){
            System.out.println("Resultado: "+multiplicar(num1,num2));
        }
        else if (op.equals("/")){
            System.out.println("Resultado: "+dividir(num1,num2));
        }
        else if (op.equals("%")) {
            System.out.println("Resultado: "+modulo(num1,num2));
        }
    }
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }
    public static double restar(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2){
        return num1 / num2;
    }
    public static double modulo(double num1, double num2){
        return num1 % num2;
    }
}
    