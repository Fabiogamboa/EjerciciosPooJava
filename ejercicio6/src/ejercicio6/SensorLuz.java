package ejercicio6;

import java.util.Random;

public class SensorLuz {
    public static Random random = new Random();
    public static String mensaje1 = "las luces estan prendidas";
    public static String mensaje2 = "las luces estan apagadas";
    public boolean continuar = true;

    public SensorLuz() {
        while (continuar) {
            boolean noche = random.nextBoolean();
            boolean movimi = random.nextBoolean();

            if (noche && movimi) {
                new MostrarInfo(mensaje1);
            } else {
                new MostrarInfo(mensaje2);
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("por si acaso bota error :v");
            }
        }
    }
}