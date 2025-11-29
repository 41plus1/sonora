package com.sonora.ui.bar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PlayerBar extends Bar {
    @FXML
    private Label labelTitle;

    public PlayerBar() {
        super("/ui/bar/PlayerBar.fxml");
    }

    @FXML
    public void initialize() {
        labelTitle.setText("Player Bar");
    }
}