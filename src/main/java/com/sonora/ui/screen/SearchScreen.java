package com.sonora.ui.screen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SearchScreen extends Screen {
    @FXML
    private Label labelTitle;

    public SearchScreen() {
        super("/ui/screen/SearchScreen.fxml");
    }

    @FXML
    public void initialize() {
        labelTitle.setText("Search Screen");
    }

    @Override
    public void setRegions() {

    }
}