package com.sonora.ui.region;

import com.sonora.ui.slot.Slot;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.util.List;

public abstract class Region<T> {
    private Parent root;
    private List<T> slots;

    public Region(String path) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            loader.setController(this);
            this.root = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract void setSlots();

    public List<T> getSlots() {
        return slots;
    }

    public Parent getRoot() {
        return root;
    }
}
