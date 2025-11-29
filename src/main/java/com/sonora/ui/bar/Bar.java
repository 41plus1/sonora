package com.sonora.ui.bar;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Bar {
    private Parent root;

    public Bar(String path) {
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
