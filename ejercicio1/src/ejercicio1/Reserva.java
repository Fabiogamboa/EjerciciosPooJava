package ejercicio1;
import java.util.Scanner;
public class Reserva {
    private Scanner scanner;

    public Reserva() {
        this.scanner = new Scanner(System.in);
    }
    public boolean realizarReserva(Sala sala) {
        System.out.print("¿Quieres reservar un asiento? (s/n): ");
        char opcion = scanner.next().toLowerCase().charAt(0);
        scanner.nextLine();
        if (opcion == 's') {
            sala.reservarAsiento();
            return true;
        }
        return false;
    }
}
