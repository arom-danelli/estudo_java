import java.util.Scanner;

public class exerc8 {
    
    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor para A: ");
            double a = sc.nextDouble();

            System.out.println("Digite um valor para B: ");
            double b = sc.nextDouble();

            System.out.println("Digite um valor para C: ");
            double c = sc.nextDouble();

            double triangulo = (a*c)/2;

            double circulo = 3.14159 * (c*c);

            double trapezio = ((a+b)*c) / 2 ;

            double quadrado = b*b;

            double retangulo = a*b;

            System.out.printf("TRIANGULO: %.2f%n", triangulo);
            System.out.printf("CÍRCULO: %.2f%n", circulo);
            System.out.printf("TRAPEZIO: %.2f%n", trapezio);
            System.out.printf("QUADRADO: %.2f%n", quadrado);
            System.out.printf("RETANGULO: %.2f%n", retangulo);

        sc.close();
    }
}
