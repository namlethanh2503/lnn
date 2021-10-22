package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button Login;

    @FXML
    private Button Resigter;

    @FXML
    public void ActionLogin(ActionEvent event) {

    }

    @FXML
    public void ActionResigter(ActionEvent event) throws IOException {
        Login.getScene().getWindow().hide();

        Stage Resigter = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Resigter.fxml"));
        Scene scene = new Scene(root);

        Resigter.setResizable(false);
        Resigter.setScene(scene);
        Resigter.show();

}
}