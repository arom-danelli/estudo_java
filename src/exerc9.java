import java.util.Scanner;

public class exerc9 {

    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor em CELSIUS: ");
            double celsius = sc.nextDouble();

            double farenheit = (celsius * 1.8) + 32;
            double kelvin = celsius + 273.15;
            double reaumur = celsius * 1.8;
            double rankine = ((celsius * 1.8 ) + 32) + 459.67;
            
            System.out.println("FARENHEINT = " + farenheit);
            System.out.println("KELVIN = " + kelvin);
            System.out.println("RÉAUMUR = " + reaumur);
            System.out.println("RANKINE = " + rankine);

        sc.close();
    
}
}