package ejercicio1;

import java.util.ArrayList;

public class Usuario extends Asientos {
    String nombre;
    static ArrayList<Integer> asientosOcupados = new ArrayList<>();
    public Usuario(String nombre, int numeroAsiento) {
        super(numeroAsiento);

        if (asientosOcupados.contains(numeroAsiento)) {
            System.out.println("El asiento " + numeroAsiento + " ya está ocupado.");
        } else {
            this.nombre = nombre;
            asientosOcupados.add(numeroAsiento);
        }
    }
    public void mostrarInfo() {
        if (asientosOcupados.contains(numeroAsiento)) {
            System.out.println("Usuario: " + nombre + ", Asiento: " + numeroAsiento + ", Ocupado: " + ocupado);
        } else {
            System.out.println("Usuario: " + nombre + ", no tiene asiento asignado.");
        }
    }

    public void sentarse() {
        if (asientosOcupados.contains(numeroAsiento)) {
            super.sentarse();
        } else {
            System.out.println(nombre + " no tiene un asiento asignado.");
        }
    }
}
