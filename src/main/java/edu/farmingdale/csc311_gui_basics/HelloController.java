package edu.farmingdale.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button rotateButton;

    @FXML
    protected void onRotateButtonClick() {
        myName.setRotate(myName.getRotate()+45); //finds the current rotation and adds 45 dgrees when pressed
    }
    @FXML
    private Label myName;

    @FXML
    protected void initialize() {
        myName.setRotate(45); //startes rotated at 45 degrees
    }
}