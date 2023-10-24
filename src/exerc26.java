import java.util.Scanner;

public class exerc26 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informar o salário a ser reajustado: ");
        double salario = sc.nextDouble();

        double reajuste = salario * 0.01;

        salario = salario + reajuste;

        System.out.println("O valor reajustado é: "+ salario);

        sc.close();


    }
}
