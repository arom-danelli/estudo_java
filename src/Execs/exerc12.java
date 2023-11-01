package Execs;

import java.util.Scanner;

public class exerc12 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para a verificação: ");
        int valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("VALOR NEGATIVO!");

        } else {
            System.out.println("VALOR NÃO NEGATIVO!");
        }

        sc.close();
    }
}