public class ObjetosDeMinecraft {
    public static void main(String[] args) {
        String[]objeto= new String[5];
        objeto[0]="espada";
        objeto[1]="pico";
        objeto[2]="manzana dorada";
        objeto[3]="bloques de piedra";
        objeto[4]="antorchas";

        int[]cantidad= new int[5];
        cantidad[0]=1;
        cantidad[1]=1;
        cantidad[2]=1;
        cantidad[3]=23;
        cantidad[4]=6;

        System.out.println("Tienes en tu inventario:");
        for( int i=0; i<objeto.length; i++ ){
            System.out.println("- "+cantidad[i]+" "+objeto[i]);
        }
    }
}
    