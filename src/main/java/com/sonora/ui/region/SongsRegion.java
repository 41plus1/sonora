package com.sonora.ui.region;

import com.sonora.ui.slot.SongSlot;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class SongsRegion extends Region<SongSlot> {
    @FXML
    private VBox songsBox;

    public SongsRegion() {
        super("/ui/region/SongsRegion.fxml");
        this.setSlots();
    }

    @FXML
    public void initializeUI() {


    }

    @Override
    public void setSlots() {
        List<SongSlot> slots = new ArrayList<SongSlot>();

        for (int i = 0; i < 10; i++) {
            SongSlot songSlot = new SongSlot();

            slots.add(songSlot);
            songsBox.getChildren().add(songSlot.getRoot());
        }
    }
}