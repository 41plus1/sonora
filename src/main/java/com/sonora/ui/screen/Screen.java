package com.sonora.ui.screen;

import com.sonora.ui.region.Region;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.util.List;

public abstract class Screen {
    private Parent root;
    private List<Region> regions;

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

    public abstract void setRegions();

    public List<Region> getRegions() {
        return regions;
    }
}
