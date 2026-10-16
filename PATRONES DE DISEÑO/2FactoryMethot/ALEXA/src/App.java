import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n 1.Bosque de Alamo");
            System.out.println("\n 2.Castillo");
            System.out.println("\n 3.Volcan");
            System.out.println("\n Elige un nivel: ");
            opcion = sc.nextInt();

            Nivel nivel = null;

            switch (opcion) {
                case 1:
                    nivel = new NivelBosque();
                    break;
                case 2:
                    nivel = new NivelCastillo();
                    break;
                case 3:
                    nivel = new NivelVolcan();
                    break;
                default:
                    System.out.println("Eleccion invalida");
                    break;
            }

            if (nivel != null) {
                nivel.jugar();
            }
        }
        sc.close();
    }
}
