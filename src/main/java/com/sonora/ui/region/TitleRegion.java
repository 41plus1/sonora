package com.sonora.ui.region;

import com.sonora.ui.slot.SongSlot;
import com.sonora.ui.slot.TitleSlot;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class TitleRegion extends Region<TitleSlot> {
    private List<TitleSlot> slots;

    @FXML
    private HBox titleBox;

    public TitleRegion() {
        super("/ui/region/TitleRegion.fxml");

        this.setSlots();
    }

    @Override
    public void setSlots() {
        this.slots = new ArrayList<TitleSlot>();

        TitleSlot titleSlot = new TitleSlot();

        this.slots.add(titleSlot);
        titleBox.getChildren().add(titleSlot.getRoot());
    }
}