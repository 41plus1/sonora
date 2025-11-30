package com.sonora.ui.region;

import com.sonora.ui.slot.SongSlot;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class SongsRegion extends Region<SongSlot> {
    private List<SongSlot> slots;

    @FXML
    private VBox songsBox;

    public SongsRegion() {
        super("/ui/region/SongsRegion.fxml");
    }

    @FXML
    public void initialize() {
        this.setSlots();
    }

    @Override
    public void setSlots() {
        this.slots = new ArrayList<SongSlot>();

        for (int i = 0; i < 10; i++) {
            SongSlot songSlot = new SongSlot();

            this.slots.add(songSlot);
            songsBox.getChildren().add(songSlot.getRoot());
        }
    }
}