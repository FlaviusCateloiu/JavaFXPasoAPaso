package com.example.javafxpasoapaso;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField tFCode;
    private TextField tFFirstName;
    private TextField tFLastName;
    private DatePicker dPBirthdate;


    @FXML
    protected void onCreateUserClick() {
        tFCode.setDisable(false);
        tFFirstName.setDisable(false);
        tFFirstName.setDisable(false);
        dPBirthdate.setDisable(false);
    }
}