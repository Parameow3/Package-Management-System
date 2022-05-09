package controller;

import view.AddPackageView;
import view.DisplayView;
import view.MainView;

public class Main {
    public static void main(String[ ] args) {
        // create object of AddPackageController and AddPackageView
        AddPackageController addPackageController = new AddPackageController();
        AddPackageView addPackageView = new AddPackageView(addPackageController);

        // create object of DisplayController and DisplayView
        DisplayController displayController = new DisplayController(addPackageController);
        DisplayView displayView = new DisplayView(displayController);

        // create object of MainController and MainView
        MainController mainController = new MainController(addPackageView, displayView);
        MainView mainView = new MainView(mainController);

        // generate Interface
        mainView.generateMenu();
    }
}
