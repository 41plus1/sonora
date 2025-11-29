package com.sonora.ui.bar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SearchBar extends Bar {
    @FXML
    private Label labelTitle;

    public SearchBar() {
        super("/ui/bar/SearchBar.fxml");
    }

    @FXML
    public void initialize() {
        labelTitle.setText("Search Bar");
    }
}