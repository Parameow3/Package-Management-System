package controller;

import model.Product;

public class DisplayController {
    private AddPackageController addPackageController;
    
    public DisplayController(AddPackageController addPackageController){
        this.addPackageController = addPackageController;
    }
    
    public void generateList() {
        for (Product products : addPackageController.packages) {
            System.out.println("| " + products.getPackageId() + "\t\t\t"
                                    + products.getFrom()      + "\t\t\t\t"
                                    + products.getTo()        + "\t\t\t"
                                    + products.getPrice()     + " |"    );
        }
        System.out.println("+-------------------------------------------------+");
    }
}
