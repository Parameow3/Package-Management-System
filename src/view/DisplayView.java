package view;

import controller.DisplayController;

public class DisplayView {
    private final DisplayController displayController;

    public DisplayView() {
        displayController = new DisplayController();
    }
    public void displayPackageInterface(){
        System.out.println("| ID\t\t\tFrom\t\t\tTo\t\t\tPrice |");
        displayController.generateList();
    }
}
