package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ResigterController {

    @FXML
    private Button Login;

    @FXML
    private Button Resigter;

    @FXML
    void ActionLogin(ActionEvent event) throws IOException {
        Login.getScene().getWindow().hide();

        Stage QLKH = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("QLKH.fxml"));
        Scene scene = new Scene(root);

        QLKH.setResizable(false);
        QLKH.setScene(scene);
        QLKH.show();
    }

    @FXML
    void ActionResigter(ActionEvent event) {

    }

}

