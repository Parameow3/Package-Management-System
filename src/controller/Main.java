package controller;

import view.AddPackageView;
import view.DisplayView;
import view.MainView;

public class Main {
    public static void main(String[ ] args) {
        AddPackageController addPackageController = new AddPackageController();
        AddPackageView addPackageView = new AddPackageView(addPackageController);
        DisplayController displayController = new DisplayController(addPackageController);
        DisplayView displayView = new DisplayView(displayController);
        MainController mainController = new MainController(addPackageView, displayView);

        MainView mainView = new MainView(mainController);
        mainView.generateMenu();
    }
}
