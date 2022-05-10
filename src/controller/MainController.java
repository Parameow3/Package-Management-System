package controller;

import view.AddPackageView;
import view.DisplayView;
import view.UpdateView;

import java.util.Scanner;

public class MainController {
    // class field
    private AddPackageView addPackageView;
    private DisplayView displayView;
    private UpdateView updateView;

    // non-default constructor
    public MainController(AddPackageView addPackageView, DisplayView displayView, UpdateView updateView) {
        this.addPackageView = addPackageView;
        this.displayView = displayView;
        this.updateView = updateView;
    }

    // methods for user's choice
    public int inputChoice(){
        System.out.print("Please Input your choice: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // method for switch the choice or class
    public void switchClass(int choice) {
        if (choice == 1) {
            System.out.println("+_______________< Add New Package >_______________+");
            addPackageView.generateInterface();
            System.out.println("+-------------------------------------------------+");
        }
        else if (choice == 2) {
            System.out.println("+_______________< Display Package >_______________+");
            displayView.displayPackageInterface();
        }
        else if (choice == 3) {
            System.out.println("+________________< Update Package >_______________+");
            updateView.displayUpdateInterface();
            System.out.println("+-------------------------------------------------+");
        }
        else if (choice == 4) {
            System.out.println("________________< You are exiting... >________________");
            System.exit(1);
        }
        else {
            System.out.print("Invalid Input!");
        }
    }
}
