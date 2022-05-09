package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Product;

public class AddPackageController {
    // ArrayList of object Product
    public ArrayList <Product> packages = new ArrayList<Product>();

    // Scanner for user input
    private final Scanner input = new Scanner(System.in);

    // generateInput method
    public void generateInput(){
        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("From: ");
        String from = input.nextLine();
        System.out.print("To: ");
        String to = input.nextLine();
        System.out.print("Price: ");
        int price = input.nextInt();
        packages.add(new Product(id, from, to, price));
    }
}
