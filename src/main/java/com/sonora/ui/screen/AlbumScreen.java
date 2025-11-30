package com.sonora.ui.screen;

import com.sonora.ui.region.Region;
import com.sonora.ui.region.SongsRegion;
import com.sonora.ui.slot.Slot;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class AlbumScreen extends Screen {
    @FXML
    private Label labelTitle;

    @FXML
    private VBox regionsBox;

    public AlbumScreen() {
        super("/ui/screen/AlbumScreen.fxml");
    }

    @FXML
    public void initialize() {
        labelTitle.setText("Album Screen");

        this.setRegions();
    }

    @Override
    public void setRegions() {
        List<Region<? extends Slot>> regions = new ArrayList<>();

        SongsRegion songsRegion = new SongsRegion();

        regions.add(songsRegion);
        regionsBox.getChildren().add(songsRegion.getRoot());
    }
}
