package Execs;

import java.util.Scanner;

public class exerc35 {
    public static void main(String[] args) {
        
        double areax, areay,px,py,a,b,c,d,e,f;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor do Triangulo X : ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            System.out.println("Digite o valor do Triangulo Y : ");
            d = sc.nextDouble();
            e = sc.nextDouble();
            f = sc.nextDouble();

            px = (a+b+c)/2;
            py = (d+e+f)/2;
            
            areax = Math.sqrt(px * (px-a)* (px-b) * (px-c));
            areay = Math.sqrt(py * (py-d)* (py-e) * (py-f));

            if (areax > areay){
                System.out.println("TRIANGULO X: "+areax);
                System.out.println("TRIANGULO Y:" + areay);
                System.out.println("O DE MAIOR ÁREA É O X");
            }else{
                System.out.println("TRIANGULO X: "+areax);
                System.out.println("TRIANGULO Y:" + areay);
                System.out.println("O DE MAIOR ÁREA É O Y");
            }
                       
        

        sc.close();

    }
    
}
