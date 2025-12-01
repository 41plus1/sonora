package com.sonora.ui.screen;

import com.sonora.ui.region.ArtistsRegion;
import com.sonora.ui.region.Region;
import com.sonora.ui.slot.Slot;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends Screen {
    @FXML
    private VBox regionsBox;

    public HomeScreen() {
        super("/ui/screen/HomeScreen.fxml");

        this.setRegions();
    }

    @Override
    public void setRegions() {
        List<Region<? extends Slot>> regions = new ArrayList<>();

        ArtistsRegion artistsRegion = new ArtistsRegion("Artists");

        regions.add(artistsRegion);
        regionsBox.getChildren().add(artistsRegion.getRoot());
    }
}
