package com.sonora.ui.slot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class TitleSlot extends Slot {
    @FXML
    private ImageView image;
    @FXML
    private Label labelName;
    @FXML
    private Label labelDescription;
    @FXML
    private Label labelOtherInfos;

    public TitleSlot() {
        super("/ui/slot/TitleSlot.fxml");
    }
}
