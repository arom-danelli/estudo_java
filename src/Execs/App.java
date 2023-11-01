package Execs;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int total = n1 + n2;

        System.out.println("Total: "+ total);

        sc.close();
    }
}
