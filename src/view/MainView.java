package view;

import controller.MainController;

public class MainView {
    private MainController mainController;
    private int choice;

    public MainView(){
        mainController = new MainController();
    }
    //display method
    public void generateInterface(){
        System.out.println("< Package Management System >");
        System.out.println("|1. Add new package \t\t|");
        System.out.println("|2. Display package \t\t|");
        System.out.println("|3. Update package  \t\t|");
        System.out.println("|4. Exit            \t\t|");
        choice = mainController.inputChoice();
        mainController.switchClass(choice);
    }
}
