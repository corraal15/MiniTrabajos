import java.util.Scanner;
public class ConverTemp {
    public static void main(String[] args) {
    int celsius, fahrenheit;
    Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de celsius");
    celsius=sc.nextInt();
    fahrenheit=celsiusAfahrenheit(celsius);
    System.out.println("El valor en fahrenheit es: "+fahrenheit+"ºF");



    }
    public static int celsiusAfahrenheit(int celsius){
        int fahrenheit=(celsius*9/5)+32;
        return fahrenheit;
    }
}
    