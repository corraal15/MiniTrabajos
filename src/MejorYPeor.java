import java.util.Random;
public class MejorYPeor {
    public static void main(String[] args) {
        int puntos[]=new int[5];
        Random rd=new Random();
        int puntMax=0;
        int puntMin=0;
        for (int i=0;i<puntos.length;i++){
            puntos[i]= rd.nextInt(1000,2900);
            System.out.println(puntos[i]);
            if (i==0){
                puntMax=puntos[i];
                puntMin=puntos[i];
            }
            if (puntMax<puntos[i]){
                puntMax=puntos[i];
            }
            if (puntMin>puntos[i]){
                puntMin=puntos[i];
            }
        }
        System.out.println("Max: "+puntMax);
        System.out.println("Min: "+puntMin);
    }
}
    