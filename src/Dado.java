public class Dado {
    public static int lanzarDado() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {


        int lanzamientos = 10;

        System.out.println("Lanzando el dado " + lanzamientos + " veces:\n");


        for (int i = 1; i <= lanzamientos; i++) {
            int resultado = lanzarDado();
            System.out.println("Lanzamiento " + i + ": " + resultado);
        }

    }
}
    