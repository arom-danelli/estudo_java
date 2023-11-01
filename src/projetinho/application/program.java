package projetinho.application;

import java.util.Scanner;

import projetinho.entities.Product;

public class program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        sc.close();
    }
    
}
