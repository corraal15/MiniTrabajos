import java.util.Scanner;
public class ArrayInverso {
    public static void main(String[] args) {
        System.out.println("¿Cuantos nombres quieres guardar?:");
        Scanner sc= new Scanner(System.in);
        int numNombres= sc.nextInt();
        String[]Nombres=new String[numNombres];

        Scanner sc2= new Scanner(System.in);
        for (int i=0;i<numNombres;i++){
            System.out.print("Nombre "+(i+1)+":");
            Nombres[i]=sc2.nextLine();
        }
        System.out.println("-- Lista en orden inverso: --");
        for (int j=numNombres;j>0;j--){
            System.out.println("Posición "+j+":"+Nombres[j-1]);cmd
        }




    }
}
    