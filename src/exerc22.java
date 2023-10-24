import java.util.Scanner;

public class exerc22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Os numemos inteiros vão ser SOMADOS até que seja apertado 0 (zero)");
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;

            x = sc.nextInt();
        }
        System.out.println("O valor total é: " + soma);

        sc.close();
    }

}
