package com.sonora.ui.region;

import com.sonora.ui.slot.TitleSlot;
import javafx.fxml.FXML;

import java.util.List;

public class TitleRegion extends Region<TitleSlot> {
    public TitleRegion() {
        super("/ui/region/TitleRegion.fxml");

        this.setSlots();
    }

    @FXML
    public void initializeUI() {

    }

    @Override
    public void setSlots() {

    }
}