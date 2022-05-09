package view;

import controller.AddPackageController;
import controller.DisplayController;

public class DisplayView {
    private DisplayController displayController;

    public DisplayView(DisplayController displayController) {
        this.displayController = displayController;
    }
    public void displayPackageInterface(){
        System.out.println("| ID\t\t\tFrom\t\t\tTo\t\t\tPrice |");
        displayController.generateList();
    }
}
