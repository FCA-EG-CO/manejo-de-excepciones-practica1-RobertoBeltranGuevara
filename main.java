import java.util.Scanner;

class NumeroImparException extends Exception {
    public NumeroImparException(String mensaje) {
        super(mensaje);
    }
}

class ExcepcionImpar {
    private ExcepcionImpar() {
    }

    public static void verificarNumero(int numero) throws NumeroImparException {
        if (numero % 2 == 0) {
            throw new NumeroImparException("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        try {
            ExcepcionImpar.verificarNumero(numero);
        } catch (NumeroImparException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        }

        scanner.close();
    }
}
