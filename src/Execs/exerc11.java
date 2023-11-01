package Execs;

import java.util.Scanner;

public class exerc11 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Que horas são?");
        x = sc.nextInt();

        if (x >= 6  && x <= 12) {
            System.out.println("Bom dia!");
        } else if (x < 18 && x > 12) {
            System.out.println("Boa Tarde!");

        } else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }

}
