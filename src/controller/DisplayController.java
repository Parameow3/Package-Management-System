package controller;

import model.Product;

public class DisplayController {
    private final AddPackageController addPackageController;
    
    public DisplayController(){
        addPackageController = new AddPackageController();
    }
    
    public void generateList() {
        for (Product products : addPackageController.packages) {
            System.out.println("| " + products.getPackageId() + "\t\t\t"
                                    + products.getFrom()      + "\t\t\t"
                                    + products.getTo()        + "\t\t\t"
                                    + products.getPrice()     + " |"    );
        }

    }
}
