import java.util.Scanner;

public class exerc6 {

    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número do funcionario: ");
        int num = sc.nextInt();

        System.out.println("Informe o número de horas trabalhadas: ");
        double ht = sc.nextDouble();

        System.out.println("E qual o valor que seu funcionário recebe por hora? ");
        double salario_hora = sc.nextDouble();

        double total = ht * salario_hora;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f", total);

        sc.close();



    }

    
}
