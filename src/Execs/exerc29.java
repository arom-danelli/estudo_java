package Execs;

import java.util.Scanner;

public class exerc29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes você deseja digitar um valor?");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Digite o valor: ");
            int valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) {
                in = in + 1;
            } else {
                out = out + 1;

            }

        }
        System.out.println("IN: " + in);
        System.out.println("OUT: " + out);

        sc.close();
    }
}
