package com.sonora.ui.slot;

import com.sonora.model.media.Music;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class SongSlot extends Slot {
    @FXML private Button songButton;
    @FXML private ImageView songImage;
    @FXML private HBox songArtists;
    @FXML private Label songName;
    @FXML private Label songTimer;

    public SongSlot() {
        super("/ui/slot/SongSlot.fxml");
    }

    @FXML
    public void initializeUI() {
        songName.setText("Songggg nameee");
    }
}
