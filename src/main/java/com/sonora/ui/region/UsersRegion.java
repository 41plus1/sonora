package com.sonora.ui.region;

import com.sonora.ui.slot.UserSlot;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class UsersRegion extends Region<UserSlot> {
    @FXML
    private HBox usersBox;
    @FXML
    private Label labelName;

    private List<UserSlot> slots;
    private String regionName;

    public UsersRegion(String regionName) {
        super("/ui/region/UsersRegion.fxml");

        this.setInfos(regionName);
        this.setSlots();
    }

    @Override
    public void setSlots() {
        this.slots = new ArrayList<UserSlot>();

        for (int i = 0; i < 20; i++) {
            UserSlot userSlot = new UserSlot();

            this.slots.add(userSlot);
            usersBox.getChildren().add(userSlot.getRoot());
        }
    }

    public void setInfos(String regionName) {
        this.regionName = regionName;
        labelName.setText(this.regionName);
    }
}
