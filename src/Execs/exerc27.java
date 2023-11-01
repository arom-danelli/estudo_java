package Execs;

import java.util.Scanner;

public class exerc27 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do salário minimo atual? : ");
        double salario_minimo = sc.nextDouble();

        System.out.println("Qual o seu salário atual? : ");
        double salario_atual = sc.nextDouble();

        double total = salario_atual / salario_minimo;

        System.out.println(total);


        sc.close();
    }
    
}
