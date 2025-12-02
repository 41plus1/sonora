package com.sonora.ui.region;

import com.sonora.ui.slot.ArtistSlot;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class ArtistsRegion extends Region<ArtistSlot> {
    @FXML
    private HBox artistsBox;
    @FXML
    private Label labelName;

    private List<ArtistSlot> slots;
    private String regionName;

    public ArtistsRegion(String regionName) {
        super("/ui/region/ArtistsRegion.fxml");

        this.setInfos(regionName);
        this.setSlots();
    }

    @Override
    public void setSlots() {
        this.slots = new ArrayList<ArtistSlot>();

        for (int i = 0; i < 20; i++) {
            ArtistSlot artistSlot = new ArtistSlot();

            this.slots.add(artistSlot);
            artistsBox.getChildren().add(artistSlot.getRoot());
        }
    }

    public void setInfos(String regionName) {
        this.regionName = regionName;
        labelName.setText(this.regionName);
    }
}
