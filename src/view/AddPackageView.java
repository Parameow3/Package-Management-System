package view;

import controller.AddPackageController;

public class AddPackageView {
    private final AddPackageController addPackageController;

    //default constructor
    public AddPackageView() {
        addPackageController = new AddPackageController();
    }
    //method
    public void generateInterface() {
        System.out.println("Please Enter your package:");
        addPackageController.generateInput();
    }
}
