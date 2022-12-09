package com.example.javafxpasoapaso;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.nio.channels.Pipe;

public class HelloController {
    @FXML
    private TextField tFCode;
    @FXML
    private TextField tFFirstName;
    @FXML
    private TextField tFLastName;
    @FXML
    private DatePicker dPBirthdate;
    @FXML
    private GridPane gPSaveAndCancel;


    @FXML
    protected void onCreateUserClick() {
        tFCode.setDisable(false);
        tFFirstName.setDisable(false);
        tFLastName.setDisable(false);
        dPBirthdate.setDisable(false);
        gPSaveAndCancel.setVisible(true);
    }

    @FXML
    protected void onCheckOption() {
        tFCode.setDisable(true);
        tFFirstName.setDisable(true);
        tFLastName.setDisable(true);
        dPBirthdate.setDisable(true);
        gPSaveAndCancel.setVisible(false);
    }

    @FXML
    protected void onCancelOption() {
        tFCode.setDisable(true);
        tFCode.setText("");
        tFFirstName.setDisable(true);
        tFFirstName.setText("");
        tFLastName.setDisable(true);
        tFLastName.setText("");
        dPBirthdate.setDisable(true);
        dPBirthdate.setValue(null);
        gPSaveAndCancel.setVisible(false);
    }

    @FXML
    protected void onSearchPerson() {
        tFCode.setDisable(false);
        gPSaveAndCancel.setVisible(false);
        gPSaveAndCancel.setVisible(true);
    }

    @FXML
    protected void onToExitProgram() {
        System.exit(0);
    }
}