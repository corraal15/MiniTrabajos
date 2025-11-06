public class PuntuacionesDeJuego {
    public static void main(String[] args) {
        int[]Puntuaciones= new int[6];
        int total=0;
        int media=0;
        int max=0;
        for(int i=0; i<Puntuaciones.length; i++){
            Puntuaciones[i]=(int)(Math.random()*1501)+1500;
            //Para comprobar que las cuentas esten bien hechas.
            //System.out.println((i+1)+". "+Puntuaciones[i]);

            total=total+Puntuaciones[i];

            media= total/Puntuaciones.length;

            if(Puntuaciones[i]>max){
                max=Puntuaciones[i];
            }

        }
        System.out.println("Puntuación total: "+total);
        System.out.println("Puntuación media: "+media);
        System.out.println("Puntuación máxima: "+max);



    }
}
    