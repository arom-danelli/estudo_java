import java.util.Scanner;

public class exerc19 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        double x = sc.nextDouble();

        System.out.println("Digite o valor de Y: ");
        double y = sc.nextDouble();
        
        if(x == 0 && y == 0){
            System.out.println("ORIGEM");
        }else if(x == 0){
            System.out.println("Eixo Y");
        }else if(y == 0){
            System.out.println("Eixo X");
        }else if(x > 0.0 && y > 0.0){
            System.out.println("Q1");
        }else if(x < 0.0 && y > 0.0){
            System.out.println("Q2");
        }else if(x < 0.0 && y < 0.0){
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }

        sc.close();
    }
}
