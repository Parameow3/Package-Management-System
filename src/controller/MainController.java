package controller;

import java.util.Scanner;

public class MainController {
    private int choice;

    // setter and getter
    public int getChoice() {
        return choice;
    }
    public void setChoice(int choice) {
        this.choice = choice;
    }

    // methods
    public int inputChoice(){
        System.out.print("Please Input your choice: ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        return choice;
    }
    public void switchClass(int choice) {
        if (choice == 1) {
            System.out.println("< Add New Package >");
        }
        else if (choice == 2) {
            System.out.println("< Display Package >");
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
