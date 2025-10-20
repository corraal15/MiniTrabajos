import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
        int caras=0;
        int cruces=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de lanzamientos: ");
        int lanzamientos=leer.nextInt();

        for(int i=1;i<=lanzamientos;i++){
            double resultado=Math.random();
            if(resultado>=0.5){
                System.out.println("Lanzamiento "+ i + ":Ha salido cara");
                caras++;
            }
            else{
                System.out.println("Lanzamiento "+ i + ":Ha salido cruz");
                cruces++;
            }
        }
        System.out.println("===Resultados===");
        System.out.println("Caras: "+caras);
        System.out.println("Cruces: "+cruces);
    }
}
