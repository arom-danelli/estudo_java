package Execs;

import java.util.Scanner;

public class exerc10{

public static void main (String [] args) throws Exception{

        int sexo, qtMulheres=0, qtHomens=0;
		float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

    Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i ++ ){
            System.out.println("Digite um valor para altura: 1-MULHER / 2-HOMEM");
            sexo = sc.nextInt();

            System.out.println("Digite a altura da pessoa: ");
            altura = sc.nextFloat();

                if (sexo == 1){ 
                    qtMulheres ++ ;
                } else if (sexo == 2) {
                    qtHomens ++  ;
                    somaH = somaH + altura;
                      
                }else{
                    System.out.println("Sexo inválido parcero");
                } 

                if (altura > maior){
                    maior = altura;
                }else if (altura < menor){
                    menor = altura;
                }
            }
                mediaHomens = somaH / qtHomens;

            System.out.println("A maior altura é: "+ maior +" M e a menor altura é"+menor+" M");
            System.out.println("A média de altura dos homens é de: "+ mediaHomens);
            System.out.println("O número de mulheres é de: "+qtMulheres);

    sc.close();




    }

}