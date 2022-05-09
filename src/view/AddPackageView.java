package view;

import controller.AddPackageController;

public class AddPackageView {
    private AddPackageController addPackageController;

    //default constructor
    public AddPackageView(AddPackageController addPackageController) {
        this.addPackageController = addPackageController;
    }
    //method
    public void generateInterface() {
        System.out.println("Please Enter your package:");
        addPackageController.generateInput();
    }
}
