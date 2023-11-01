package Execs;

import java.util.Scanner;

public class exerc24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o dia de hoje");
        int dia = sc.nextInt();

        System.out.println("mes");
        int mes = sc.nextInt();

        System.out.println("ano");
        int ano = sc.nextInt();
        
        System.out.println("Dia em que vc nasceu");
        int diac = sc.nextInt();

        System.out.println("mes que vc nasceu");
        int mesc = sc.nextInt();

        System.out.println("ano que vc nasceu");
        int anoc = sc.nextInt();
        
        ano = (anoc - ano) * 365;

        mes = (mesc - mes) * 30;

        dia = dia - diac;

        int total = ano + mes + dia;

        if ( total > 0){

        System.out.println("res: " + total);

        }else{

            total = total * -1;

            System.out.println("res:" + total);
        }


        sc.close();

    }
    
}
