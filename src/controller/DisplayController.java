package controller;

import model.Product;

public class DisplayController {
    //field
    private AddPackageController addPackageController;

    // non-default constructor
    public DisplayController(AddPackageController addPackageController){
        this.addPackageController = addPackageController;
    }

    // generate list method
    public void generateList() {
        for (Product products : addPackageController.packageList) {
            System.out.println("| " + products.getPackageId() + "\t\t\t"
                                    + products.getFrom()      + "\t\t\t\t"
                                    + products.getTo()        + "\t\t\t"
                                    + products.getPrice()     + " |"    );
        }
        System.out.println("+-------------------------------------------------+");
    }
}
