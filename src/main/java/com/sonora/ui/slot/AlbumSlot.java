package com.sonora.ui.slot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class AlbumSlot extends Slot {
    @FXML
    private ImageView albumPhoto;
    @FXML
    private Label albumName;
    @FXML
    private HBox artistsBox;

    public AlbumSlot() {
        super("/ui/slot/AlbumSlot.fxml");
    }

}
