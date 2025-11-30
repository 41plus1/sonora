package com.sonora.ui.region;

import com.sonora.ui.slot.AlbumSlot;
import com.sonora.ui.slot.Slot;
import javafx.fxml.FXML;

import java.util.List;

public class AlbumsRegion extends Region<AlbumSlot> {
    public AlbumsRegion() {
        super("/ui/region/AlbumsRegion.fxml");

        this.setSlots();
    }

    @Override
    public void setSlots() {

    }
}
