package com.sonora.ui.region;

import com.sonora.ui.slot.AlbumSlot;
import com.sonora.ui.slot.Slot;
import com.sonora.ui.slot.AlbumSlot;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class AlbumsRegion extends Region<AlbumSlot> {
    private List<AlbumSlot> slots;

    @FXML
    private HBox albumsBox;

    public AlbumsRegion() {
        super("/ui/region/AlbumsRegion.fxml");

        this.setSlots();
    }

    @Override
    public void setSlots() {
        this.slots = new ArrayList<AlbumSlot>();

        for (int i = 0; i < 10; i++) {
            AlbumSlot albumSlot = new AlbumSlot();

            this.slots.add(albumSlot);
            albumsBox.getChildren().add(albumSlot.getRoot());
        }
    }
}
