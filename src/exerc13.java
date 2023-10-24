import java.util.Scanner;

public class exerc13 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("    PAR OU IMPAR      ");
        System.out.println("======================");
        System.out.println("Digite o valor a ser verificado: ");
        int valor = sc.nextInt();

        if (valor % 2 == 1) {
            System.out.println("VALOR IMPAR");
        } else {
            System.out.println("VALOR PAR");
        }
        sc.close();
    }

}
