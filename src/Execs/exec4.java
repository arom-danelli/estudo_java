package Execs;

import java.util.Scanner;

public class exec4 {

    public static void main (String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor do raio");
            double n1 = sc.nextDouble();

            double area = 3.14159 * (n1*n1);

            System.out.printf("O valor do raio é %.2f%n", area);


        sc.close();

    }
    
}
