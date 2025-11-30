package com.sonora.ui.slot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Slot {
    private Parent root;

    public Slot(String path) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            loader.setController(this);
            this.root = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Parent getRoot() {
        return root;
    }
}