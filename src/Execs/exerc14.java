package Execs;

import java.util.Scanner;

public class exerc14 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("    VALORES MULTIPLOS");
        System.out.println("==========================");
        System.out.println("Digite um valor para verificação: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite outro valor para a verificação: ");
        int valor2 = sc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }

        sc.close();
    }

}
