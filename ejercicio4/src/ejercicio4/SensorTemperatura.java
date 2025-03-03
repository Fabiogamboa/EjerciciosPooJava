package ejercicio4;
import java.util.Random;

public class SensorTemperatura {
    private Random random;
    public SensorTemperatura() {
        random = new Random();
    }
    public double leerTemperatura() {
        return 5 + (random.nextDouble() * 30);
    }
}
