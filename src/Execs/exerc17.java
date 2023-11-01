package Execs;

import java.util.Scanner;

public class exerc17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            int cod1, npec1, cod2, npec2;
            double valor_un1, valor_un2, total;

            System.out.println("Qual o código da peça? ");
            cod1 = sc.nextInt();

            System.out.println("Quantas peças são?");
            npec1 = sc.nextInt();

            System.out.println("Qual o valor unitário desta peça?");
            valor_un1 = sc.nextDouble();

            System.out.println("Qual o código da outra peça? ");
            cod2 = sc.nextInt();

            System.out.println("Quantas peças são?");
            npec2 = sc.nextInt();

            System.out.println("Qual o valor unitário desta peça?");
            valor_un2 = sc.nextDouble();

                total = (npec1 * valor_un1) + (npec2 * valor_un2);


            System.out.println("O código da primeira peça é: "+cod1+" e o valor unitário dessa peça é: R$"+valor_un1);
            System.out.println("O código da segunda peça é: "+cod2+" e o valor unitário dessa peça é: R$"+valor_un2);
            System.out.println("O valor total da venda é: R$"+total);    

        sc.close();
    }    
}
