import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, resultado;

        System.out.print("Informe um número: ");
        numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }

        scanner.close();
    }
}