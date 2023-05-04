import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        
        System.out.print("Digite um número inteiro não negativo: ");
        n = in.nextInt();
        
        if (n < 0) {
            System.out.println("Número inválido. Digite um número inteiro não negativo.");
        } else {
            int fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println(n + "! = " + fatorial);
        }
        
        in.close();
    }
}