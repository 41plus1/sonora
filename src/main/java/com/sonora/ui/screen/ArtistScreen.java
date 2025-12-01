package com.sonora.ui.screen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ArtistScreen extends Screen {
    @FXML
    private Label labelTitle;

    public ArtistScreen() {
        super("/ui/screen/ArtistScreen.fxml");

        this.setRegions();
    }

    @Override
    public void setRegions() {

    }
}