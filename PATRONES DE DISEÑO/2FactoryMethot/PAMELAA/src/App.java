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

            if (opcion >= 1 && opcion <= 3) {
                Nivel nivel = new Nivel(opcion);
                nivel.Jugar();
            } else if (opcion != 0) {
                System.out.println("Opcion invalida");
            }

        }
        sc.close();
    }
}
