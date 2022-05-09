package view;

import controller.MainController;

public class MainView {
    // field
    private MainController mainController;
    //non-default constructor
    public MainView(MainController mainController){
        this.mainController = mainController;
    }
    //method
    public void generateMenu(){
        while (true) {
            System.out.println("< Package Management System >");
            System.out.println("|1. Add new package \t\t|");
            System.out.println("|2. Display package \t\t|");
            System.out.println("|3. Update package  \t\t|");
            System.out.println("|4. Exit            \t\t|");
            int choice = mainController.inputChoice();
            mainController.switchClass(choice);
        }
    }
}
