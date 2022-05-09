package view;

import controller.AddPackageController;
import controller.DisplayController;

public class DisplayView {
    // field
    private DisplayController displayController;

    // non-default constructor
    public DisplayView(DisplayController displayController) {
        this.displayController = displayController;
    }

    // display method
    public void displayPackageInterface(){
        System.out.println("| ID\t\t\tFrom\t\t\tTo\t\t\tPrice |");
        displayController.generateList();
    }
}
