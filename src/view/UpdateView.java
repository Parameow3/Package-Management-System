package view;

import controller.UpdateController;

public class UpdateView {
    // field
    private UpdateController updateController;

    //non-default constructor
    public UpdateView(UpdateController updateController){
        this.updateController = updateController;
    }
    //method
    public void displayUpdateInterface() {
        updateController.generateInput();
    }
}