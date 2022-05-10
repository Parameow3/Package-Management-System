package controller;

import view.AddPackageView;
import view.DisplayView;
import view.MainView;
import view.UpdateView;

public class Main {
    public static void main(String[ ] args) {
        // create object of AddPackageController and AddPackageView
        AddPackageController addPackageController = new AddPackageController();
        AddPackageView addPackageView = new AddPackageView(addPackageController);

        // create object of DisplayController and DisplayView
        DisplayController displayController = new DisplayController(addPackageController);
        DisplayView displayView = new DisplayView(displayController);

        // create object of UpdateController and UpdateView
        UpdateController updateController = new UpdateController(addPackageController, displayController);
        UpdateView updateView = new UpdateView(updateController);

        // create object of MainController and MainView
        MainController mainController = new MainController(addPackageView, displayView, updateView);
        MainView mainView = new MainView(mainController);

        // generate Interface
        mainView.generateMenu();
    }
}
