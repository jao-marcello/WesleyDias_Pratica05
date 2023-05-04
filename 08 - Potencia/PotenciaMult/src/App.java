import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, expoente, potencia;
        
        System.out.print("Digite a base (um número inteiro): ");
        base = sc.nextInt();
        
        System.out.print("Digite o expoente (um número inteiro não negativo): ");
        expoente = sc.nextInt();
        
        potencia = 1;
        for (int i = 1; i <= expoente; i++) {
            potencia *= base;
        }
        
        System.out.println(base + "^" + expoente + " = " + potencia);
        
        sc.close();
    }
}