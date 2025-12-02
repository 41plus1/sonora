package com.sonora.ui.screen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserScreen extends Screen {
    @FXML
    private Label labelTitle;

    public UserScreen() {
        super("/ui/screen/UserScreen.fxml");

        this.setRegions();
    }

    @Override
    public void setRegions() {

    }
}