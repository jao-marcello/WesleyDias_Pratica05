import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sexo;
        double peso;

        int homens = 0;
        int mulheres = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o sexo da pessoa " + i + " (M ou F): ");
            sexo = input.next();

            System.out.print("Digite o peso da pessoa " + i + ": ");
            peso = input.nextDouble();

            if (sexo.equalsIgnoreCase("M") && peso >= 60 && peso <= 80) {
                homens++;
            } else if (sexo.equalsIgnoreCase("F") && peso >= 50 && peso <= 70) {
                mulheres++;
            }
        }

        System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + homens);
        System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + mulheres);
    }
}