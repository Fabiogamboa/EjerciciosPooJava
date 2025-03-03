package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Sala sala = new Sala(10);
        Reserva reserva = new Reserva();
        System.out.println("Bienvenido a la sala vip de Cinegogo Colombia elige tu asiento :v");

        while (sala.hayDisponibilidad()) {
            boolean continuar = reserva.realizarReserva(sala);
            if (!continuar) {
                break;
            }
        }
        System.out.println("Graciasgogogo");
    }
}
