package com.sonora.ui.screen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProfileScreen extends Screen {
    @FXML
    private Label labelTitle;

    public ProfileScreen() {
        super("/ui/screen/ProfileScreen.fxml");

        this.setRegions();
    }

    @Override
    public void setRegions() {

    }
}