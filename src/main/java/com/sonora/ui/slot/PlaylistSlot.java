package com.sonora.ui.slot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PlaylistSlot extends Slot {
    @FXML
    private ImageView playlistPhoto;
    @FXML
    private Label playlistName;
    @FXML
    private HBox usersBox;

    public PlaylistSlot() {
        super("/ui/slot/PlaylistSlot.fxml");
    }

}