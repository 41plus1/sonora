package com.sonora.ui.slot;

import com.sonora.model.media.Music;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class SongSlot extends Slot<Music> {
    @FXML private Label SongName;
    @FXML private Label SongTimer;
    @FXML private ImageView SongImage;
    @FXML private HBox SongArtists;

    public SongSlot(Music info) {
        super(info);
    }

    @Override
    public void initializeUI() {
        //Music info = this.getInfo();
    }
}
