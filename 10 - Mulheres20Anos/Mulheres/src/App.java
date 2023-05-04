import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sexo;
        int idade;
        int mulheres_20_40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("\nDigite a idade da pessoa " + i + ": ");
            idade = in.nextInt();

            System.out.print("Digite o sexo da pessoa " + i + " (M ou F): ");
            sexo = in.next();

            if (sexo.equalsIgnoreCase("F") && idade >= 20 && idade <= 40) {
                mulheres_20_40++;
            }
        }

        System.out.println("\nQuantidade de mulheres entre 20 e 40 anos: " + mulheres_20_40);
    }
}