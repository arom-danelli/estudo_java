package Execs;

import java.util.Scanner;

public class exerc32 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= valor; i ++){

            fat = fat * i;

        }

        System.out.println("valor: "+ fat);

        sc.close();
        
    }
    
}
