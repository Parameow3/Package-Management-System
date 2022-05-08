package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Product;

public class AddPackageController {
    public ArrayList <Product> packages = new ArrayList<Product>();
    private final Scanner input = new Scanner(System.in);

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
