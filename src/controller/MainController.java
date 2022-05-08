package controller;

import view.AddPackageView;
import view.DisplayView;

import java.util.Scanner;

public class MainController {
    private final AddPackageView addPackageView;
    private DisplayView displayView;

    public MainController() {
        addPackageView = new AddPackageView();
        displayView    = new DisplayView()   ;
    }

    // methods
    public int inputChoice(){
        System.out.print("Please Input your choice: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public void switchClass(int choice) {
        if (choice == 1) {
            System.out.println("< Add New Package >");
            addPackageView.generateInterface();
        }
        else if (choice == 2) {
            System.out.println("________________< Display Package >________________");
            displayView.displayPackageInterface();
        }
        else if (choice == 3) {
            System.out.println("< Update Package >");
        }
        else if (choice == 4) {
            System.out.println("< You are exiting... >");
            System.exit(1);
        }
        else {
            System.out.print("Invalid Input!");
        }
    }
}
