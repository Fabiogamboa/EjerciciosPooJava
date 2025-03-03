package ejercicio4;

public class Invernaderogogo {
    private SensorTemperatura sensor;
    boolean datito = true;
    public Invernaderogogo() {
        sensor = new SensorTemperatura();
    }
    public void monitorear() {
        while (datito) {
            double temperatura = sensor.leerTemperatura();
            System.out.println("\nTemperatura actualgogo = " + temperatura + "°C");
            if (temperatura < 10) {
                System.out.println("Estado: calefactor prendido");
            } else if (temperatura > 25) {
                System.out.println("Estado: Ventilador prendido");
            } else {
                System.out.println("Estado: Invernaderogogo esta normal :v");
                System.out.println("Invernaderogogo procedera a apagarse solito :v");
                datito = false;
            }
            try {
                // esta wbd es pa esperar 5 segundos :v, me toco busca porque que mas
                // si la temperatura ta normal, le para xd
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("por si acaso bota error :v");
            }
        }
    }
}
