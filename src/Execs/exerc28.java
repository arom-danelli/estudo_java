package Execs;

import java.util.Scanner;

public class exerc28 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor e vou dizer todos os impares abaixo dele: ");
            int valor = sc.nextInt();

            for (int i=1; i<=valor; i++){

                if (i % 2 != 0){
                    System.out.println("IMPAR: "+ i);
            
                }
            }

        sc.close();
    }
    
}
