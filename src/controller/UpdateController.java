package controller;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateController {
    //field
    private AddPackageController addPackageController;
    private DisplayController displayController;
    private Scanner input = new Scanner(System.in);

    //non-default constructor
    public UpdateController(AddPackageController addPackageController, DisplayController displayController){
        this.addPackageController = addPackageController;
        this.displayController = displayController;
    }

    // method for generate user input
    public void generateInput(){
        System.out.println("Please Input ID of package that you want to update:");
        int id = input.nextInt();
        if (isValidSearch(id)){
            System.out.println("Please Input your update =>");
            System.out.print("New ID: ");
            int newId = input.nextInt();
            input.nextLine();
            System.out.print("From: ");
            String from = input.nextLine();
            System.out.print("To: ");
            String to = input.nextLine();
            System.out.print("Price: ");
            int price = input.nextInt();
            update(id, newId, from, to, price);
        }
        else {
            System.out.println("The ID that you want to update is invalid!");
            System.out.println("You can view the all of package's ID below:");
            System.out.println("+-------------------------------------------------+");
            System.out.println("| ID\t\t\tFrom\t\t\tTo\t\t\tPrice |");
            displayController.generateList();
        }
    }

    // method for check user input search is valid
    public boolean isValidSearch(int id){
        boolean check = false;
        for (Product products : addPackageController.packageList) {
            if (products.getPackageId() == id){
                check = true;
            }
        }
        return check;
    }

    //update method
    public void update(int oldId, int newId, String from, String to, int price) {
        ArrayList <Product> tempPackageList = new ArrayList<>();
        for (Product products : addPackageController.packageList) {
            if (products.getPackageId() == oldId){
                tempPackageList.add(new Product(newId, from, to, price));
            }
            else {
                tempPackageList.add(new Product(products.getPackageId(), products.getFrom(),
                                                products.getTo(), products.getPrice()));
            }
        }
        addPackageController.packageList.clear();
        addPackageController.packageList.addAll(tempPackageList);
    }
}
