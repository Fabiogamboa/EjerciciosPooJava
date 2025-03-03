package ejercicio1;

class Asientos {
    int numeroAsiento;
    boolean ocupado;

    public Asientos(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
        this.ocupado = false;
    }

    public void sentarse() {
        if (!ocupado) {
            ocupado = true;
            System.out.println("Te has sentado en el asiento " + numeroAsiento);
        } else {
            System.out.println("El asiento " + numeroAsiento + " ya está ocupado.");
        }
    }
}
