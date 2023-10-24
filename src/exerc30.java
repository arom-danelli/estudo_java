import java.util.Scanner;

public class exerc30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes quer digitar 3 valores?");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            System.out.println("Digite o primeiro valor: ");
            double a = sc.nextDouble();

            System.out.println("Digite o segundo valor: ");
            double b = sc.nextDouble();

            System.out.println("Digite o último valor: ");
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("A média dos valores é de: %.1f%n", media);

        }

        sc.close();
    }

}
