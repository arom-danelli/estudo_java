import java.util.Scanner;

public class exec3 {

    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor para subtração: ");
            int n1 = sc.nextInt();

            System.out.println("Digite outro valor para subtração: ");
            int n2 = sc.nextInt();

                int total = n1 - n2;

            System.out.println("O valor da subtração é: " + total);


        sc.close();
    }

  }


