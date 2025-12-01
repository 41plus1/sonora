package com.sonora.ui.screen;

import com.sonora.ui.region.Region;
import com.sonora.ui.region.SongsRegion;
import com.sonora.ui.region.TitleRegion;
import com.sonora.ui.slot.Slot;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class AlbumScreen extends Screen {
    @FXML
    private VBox regionsBox;

    public AlbumScreen() {
        super("/ui/screen/AlbumScreen.fxml");

        this.setRegions();
    }

    @Override
    public void setRegions() {
        List<Region<? extends Slot>> regions = new ArrayList<>();

        TitleRegion titleRegion = new TitleRegion();
        SongsRegion songsRegion = new SongsRegion();

        regions.add(titleRegion);
        regions.add(songsRegion);

        regionsBox.getChildren().add(titleRegion.getRoot());
        regionsBox.getChildren().add(songsRegion.getRoot());
    }
}
