package Execs;

import java.util.Scanner;

public class exerc23 {
    public static void main(String[] args) {

        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        //mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        //(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)


        Scanner sc = new Scanner(System.in);

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();
            System.out.println("Os meses:");
            int mes = sc.nextInt();
            System.out.println("Agora os dias:");
            int dia = sc.nextInt();

            idade = idade * 365;

            mes = mes * 30;

            int total = idade + mes + dia; 

            System.out.println("Seu total de dias é: " + total);

        sc.close();
        
    }
    
}
