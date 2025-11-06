
import java.util.Random;
import java.util.Scanner;
public class ImpostorAmongUs {
    public static void main(String[] args) {
        String[]Jugadores=new String[6];//Creamos el array y ponemos los nombres
        Jugadores[0]="Ana";
        Jugadores[1]="Isabella";
        Jugadores[2]="Iván";
        Jugadores[3]="Carlos";
        Jugadores[4]="Iker";
        Jugadores[5]="Daniel";

        for (int i=0; i<Jugadores.length; i++){ //Creamos un bucle for con el que mostramos todos los jugadores por pantalla
            System.out.println("- "+Jugadores[i]);
        }
        int impostor= new Random().nextInt(0,6);//Con el modulo random seleccionamos un numero del 0 al 5
        // el 0 correspondiendo a Ana y el 5 a Daniel
        String impostorString;//Creamos la variable impostorString
        impostorString=Jugadores[impostor];//Y la asociames a la posicion correspondiente del impostor en el array


        System.out.println("Adivina el impostor:Ana,Isabella,Iván...");//Le pedimos al usuario que intente adivinar
        String sc=new Scanner(System.in).nextLine();
        if (sc.equals(impostorString)){//si el nombre introducido es igual al impostor dar victoria
            System.out.println("Has acertado "+impostorString+" era el impostor");
        }
        else {//sino crear un bucle for en el que leamos todos los nombres del array hasta que la posicion i sea
            for (int i = 0; i < Jugadores.length; i++) {
                if (impostorString.equals(Jugadores[i])) {//igual a la posicion del impostor
                    System.out.println("Fallaste "+Jugadores[i] + " es el impostor");//imprimimos la derrota
                }
            }
        }


    }
}
    