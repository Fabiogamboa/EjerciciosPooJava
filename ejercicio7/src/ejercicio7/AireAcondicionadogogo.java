package ejercicio7;
import java.util.Scanner;
import java.util.Random;

public class AireAcondicionadogogo {
    public static Random random = new Random();
    public static String mensaje1 = "aire prendido";
    public static String mensaje2 = "aire apagado";
    public boolean continuar = true;
    private Scanner scanner;
    
    public AireAcondicionadogogo(){
        this.scanner = new Scanner(System.in);
         while (continuar) {
            boolean tempMayor28 = random.nextBoolean();
            boolean humedadm60 = random.nextBoolean();
            boolean tempMayor30 = random.nextBoolean();

            if (tempMayor28 && humedadm60) {
                new MostrarInfoAire(mensaje1);
            } else if (tempMayor30) {
                new MostrarInfoAire(mensaje1);
            } else {
                new MostrarInfoAire(mensaje2);
            }
            System.out.println("desea continuar?? (s/n)");
            char opc = scanner.next().toLowerCase().charAt(0);
            if (opc == 'n') {
                continuar = false;
            }
        }
    }
}
