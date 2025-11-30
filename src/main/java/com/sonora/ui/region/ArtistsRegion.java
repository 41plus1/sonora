package com.sonora.ui.region;

import com.sonora.ui.slot.ArtistSlot;
import javafx.fxml.FXML;

import java.util.List;

public class ArtistsRegion extends Region<ArtistSlot> {
    public ArtistsRegion() {
        super("/ui/region/ArtistsRegion.fxml");

        this.setSlots();
    }

    @FXML
    public void initializeUI() {

    }

    @Override
    public void setSlots() {

    }
}
