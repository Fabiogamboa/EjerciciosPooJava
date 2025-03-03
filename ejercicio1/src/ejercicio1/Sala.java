package ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    private int capacidadTotal;
    private int asientosOcupados;
    private ArrayList<Integer> asientosReservados;
    private Scanner scanner;

    public Sala(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.asientosOcupados = 0;
        this.asientosReservados = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public boolean hayDisponibilidad() {
        return asientosOcupados < capacidadTotal;
    }

    public void reservarAsiento() {
        if (hayDisponibilidad()) {
            System.out.print("Ingrese su name: ");
            String nombre = scanner.nextLine();
            int numA;
            while (true) {
                System.out.print("ponga el numero del asiento ");
                numA = scanner.nextInt();
                scanner.nextLine();
                if (numA < 1 || numA > capacidadTotal) {
                    System.out.println("asiento invalidogogo");
                } else if (asientosReservados.contains(numA)) {
                    System.out.println("El asiento " + numA + " ya está ocupado. Elige otro.");
                } else {
                    break;
                }
            }
            Usuario user = new Usuario(nombre, numA);
            user.sentarse();
            user.mostrarInfo();
            asientosReservados.add(numA);
            asientosOcupados++;
            System.out.println("Reserva confirmada. Asientos ocupados: " + asientosOcupados + "/" + capacidadTotal);
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }
}
