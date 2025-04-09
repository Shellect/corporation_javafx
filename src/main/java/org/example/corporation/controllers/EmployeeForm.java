package org.example.corporation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.example.corporation.entities.Department;
import org.example.corporation.entities.Position;

public class EmployeeForm {
    @FXML
    private TextField username;
    @FXML
    private TextField age;
    @FXML
    private ComboBox<Position> position;
    @FXML
    private ComboBox<Department> department;

    public EmployeeForm() { }

    @FXML
    private void initialize() { }

    @FXML
    public void handleSave() {}

    @FXML
    public void handleClose() {}
}
