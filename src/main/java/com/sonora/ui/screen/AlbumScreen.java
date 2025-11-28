package com.sonora.ui.screen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AlbumScreen extends Screen {
    @FXML
    private Label labelTitle;

    public AlbumScreen() {
        super("/screen/AlbumScreen.fxml");
    }

    @FXML
    public void initialize() {
        labelTitle.setText("Album Screen");
    }
}
