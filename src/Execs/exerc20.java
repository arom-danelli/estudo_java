package Execs;

import java.util.Scanner;

public class exerc20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

            double conta = 50.00;
            if(minutos > 100){
                conta = conta + (minutos - 100) * 2.0;
            }

            System.out.printf("O valor da conta é: R$ %.2f%n", conta);

        sc.close();
    
    
    }
}