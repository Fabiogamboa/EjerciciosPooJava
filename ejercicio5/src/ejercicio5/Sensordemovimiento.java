package ejercicio5;
import java.util.Random;

public class Sensordemovimiento {
    public static Random random = new Random();
    public static int numeroAleatorio = random.nextInt(2) + 1;
    public static int numerosensor=random.nextInt(2)+1;
    public static String tiempo;
    
    public Sensordemovimiento(){
        switch (Sensordemovimiento.numeroAleatorio) {
            case 1:
                Sensordemovimiento.tiempo="noche";
                System.out.println("1");
                break;
            case 2:
                Sensordemovimiento.tiempo="dia";
                System.out.println("2");
                break;
            default:
                throw new AssertionError();
        }
        Sensordemovimiento.validarsensor();
    }
    
    public static void validarsensor(){
        int avisos=0;
        for (int i=1;i<=3;i++){
            int numerosensor=random.nextInt(2)+1;
            if (numerosensor==1 && Sensordemovimiento.tiempo.equals("noche")){
                System.out.println(".");
                avisos+=1;
            }else if(numerosensor!=1 || !Sensordemovimiento.tiempo.equals("noche")){
                System.out.println("no se ha detectado nada");
            }
        }
        
        if(avisos>=2){
            Alarma.PrenderAlarma();
        }
    }
}
