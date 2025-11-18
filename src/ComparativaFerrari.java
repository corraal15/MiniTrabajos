public class ComparativaFerrari {
    public static void main(String[] args) {
        int[] cocheFerrari = {340, 3, 95};
        int[] cochePorsche = {330, 3, 98};
        int victoriasFerrari = 0;
        int victoriasPorsche = 0;

        String[] estadisticas = {"Velocidad", "Aceleración", "Manejo"};

        System.out.println("--- COMPARATIVA FERRARI vs PORSCHE ---");

        for (int i = 0; i < cocheFerrari.length; i++) {

            if (cocheFerrari[i] > cochePorsche[i]) {
                System.out.println(estadisticas[i] + ": Gana Ferrari (" + cocheFerrari[i] + ")");
                victoriasFerrari++;
            } else if (cocheFerrari[i] < cochePorsche[i]) {
                System.out.println(estadisticas[i] + ": Gana Porsche (" + cochePorsche[i] + ")");
                victoriasPorsche++;
            } else {
                System.out.println(estadisticas[i] + ": Empate (" + cocheFerrari[i] + ")");
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Victorias Ferrari: " + victoriasFerrari);
        System.out.println("Victorias Porsche: " + victoriasPorsche);

        if (victoriasFerrari > victoriasPorsche) {
            System.out.println("¡Gana Ferrari!");
        } else if (victoriasPorsche > victoriasFerrari) {
            System.out.println("¡Gana Porsche!");
        } else {
            System.out.println("¡Es un empate técnico!");
        }
    }
}



