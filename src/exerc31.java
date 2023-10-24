import java.util.Scanner;

public class exerc31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes deseja digitar pares de números? ");
        int x = sc.nextInt();

        int dominador = 0;
        int denominador = 0;

        for (int i = 0; i < x; i++) {

            System.out.println("Digite um valor: ");
            dominador = sc.nextInt();

            System.out.println("Digite outro número: ");
            denominador = sc.nextInt();

            if (denominador == 0) {

                System.out.println("DIVISÃO IMPOSSÍVEL");

            } else {

                double total = (double) dominador / denominador;
                System.out.printf("Valor: %.2f%n", total);

            }

        }
        sc.close();
    }

}
