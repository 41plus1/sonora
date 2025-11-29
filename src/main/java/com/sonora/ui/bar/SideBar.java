package com.sonora.ui.bar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SideBar extends Bar {
    @FXML
    private Label labelTitle;

    public SideBar() {
        super("/ui/bar/SideBar.fxml");
    }

    @FXML
    public void initialize() {
        labelTitle.setText("Side Bar");
    }
}