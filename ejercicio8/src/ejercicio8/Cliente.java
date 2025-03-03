package ejercicio8;

import java.util.Random;

public class Cliente {
    public static Random random = new Random();
    public static int membresia = random.nextInt(3) + 1;
    public static int hora=random.nextInt(24)+1;
    
    public static void Validarentrada(){
        if(Cliente.membresia==1 && Cliente.hora>=6 && Cliente.hora<=18){
            String resultado="el cliente tiene membresia y pudo entrar";
            Tienda.Tiendaentrada(resultado);
        }else if (Cliente.membresia==2 && Cliente.hora>=6 && Cliente.hora<=18){
            String resultado="el cliente es empleado y pudo entrar";
            Tienda.Tiendaentrada(resultado);
        }else{
            String resultado="el cliente no pudo entrar";
            Tienda.Tiendaentrada(resultado);
        }
    }
}
