package com.sonora.ui.slot;

import com.sonora.model.person.Artist;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ArtistSlot extends Slot {
    @FXML
    private ImageView artistPhoto;
    @FXML
    private Label artistName;

    public ArtistSlot() {
        super("/ui/slot/ArtistSlot.fxml");
    }

}
