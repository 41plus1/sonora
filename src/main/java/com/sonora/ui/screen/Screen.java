package com.sonora.ui.screen;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Screen {
    private Parent root;

    public Screen(String path) {
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
