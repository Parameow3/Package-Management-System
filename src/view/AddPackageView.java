package view;

import controller.AddPackageController;

public class AddPackageView {
    // field
    private AddPackageController addPackageController;

    //non-default constructor
    public AddPackageView(AddPackageController addPackageController) {
        this.addPackageController = addPackageController;
    }

    // generateInterface method
    public void generateInterface() {
        System.out.println("Please Enter your package:");
        addPackageController.generateInput();
    }
}
