package ejercicio3;
import java.util.Scanner;

public class InterfazUsuario {
    private Calculadora calculadora;
    private Scanner scanner;

    public InterfazUsuario() {
        calculadora = new Calculadora();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nCalculadora Simple");
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingrese la operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            double resultado = 0;
            switch (operacion) {
                case '+':
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case '-':
                    resultado = calculadora.restar(num1, num2);
                    break;
                case '*':
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = calculadora.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("¿Va a hacer otra cosa? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                continuar = false;
            }
        }

        System.out.println("Gracias por usar la calculadora mas insana de la gogostore");
        scanner.close();
    }
}

