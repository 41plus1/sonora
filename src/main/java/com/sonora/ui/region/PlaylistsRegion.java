package com.sonora.ui.region;

import com.sonora.ui.slot.PlaylistSlot;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class PlaylistsRegion extends Region<PlaylistSlot> {
    @FXML
    private HBox playlistsBox;
    @FXML
    private Label labelName;

    private List<PlaylistSlot> slots;
    private String regionName;

    public PlaylistsRegion(String regionName) {
        super("/ui/region/PlaylistsRegion.fxml");

        this.setInfos(regionName);
        this.setSlots();
    }

    @Override
    public void setSlots() {
        this.slots = new ArrayList<PlaylistSlot>();

        for (int i = 0; i < 20; i++) {
            PlaylistSlot playlistSlot = new PlaylistSlot();

            this.slots.add(playlistSlot);
            playlistsBox.getChildren().add(playlistSlot.getRoot());
        }
    }

    public void setInfos(String regionName) {
        this.regionName = regionName;
        labelName.setText(this.regionName);
    }
}
