package com.sonora.ui.screen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class HomeScreen extends Screen {
    @FXML
    private Label labelTitle;

    public HomeScreen() {
        super("/screen/HomeScreen.fxml");
    }

    @FXML
    public void initialize() {
        labelTitle.setText("Home Screen");
    }
}
