package Execs;

import java.util.Scanner;

public class exerc5 {

    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        
            System.out.println("Digite um valor para A: ");
            int a = sc.nextInt();

            System.out.println("Digite um valor para B: ");
            int b = sc.nextInt();

            System.out.println("Digite um valor para C: ");
            int c = sc.nextInt();

            System.out.println("Digite um valor para D: ");
            int d = sc.nextInt();

            int total = (a*b)-(c*d);

            System.out.println("DIFERENÇA = " + total);

        sc.close();

    }
    
}
