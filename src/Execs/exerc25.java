package Execs;

import java.util.Scanner;

public class exerc25 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

            double media = (7 + 8 + 9) / 3;

            double media2 = (4 + 5 + 6)/3;

            double soma = media + media2;

            double medias = (media + media2 + soma) / 3;

            System.out.println("media: "+media+" media2: "+media2+" soma: "+soma+" medias: "+medias);

        sc.close();
    }
    
}
