import java.util.Scanner;

public class exerc7 {

    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

            System.out.println("Qual o código da peça 1: ");
            //int cod1 = sc.nextInt();

            System.out.println("Quantas peças 1 vai levar? ");
            int qtd1 = sc.nextInt();

            System.out.println("Qua o valor unitario da peça? ");
            double pc1 = sc.nextDouble();


            System.out.println("Qual o código da peça 2: ");
            //int cod2 = sc.nextInt();

            System.out.println("Quantas peças 2 vai levar? ");
            int qtd2 = sc.nextInt();

            System.out.println("Qua o valor unitario da peça? ");
            double pc2 = sc.nextDouble();

            double total = (qtd1 * pc1) + (qtd2 * pc2);

            System.out.printf("VALOR A SER PAGO: R$ %.2f%n", total);



        sc.close();

    }
    
}
