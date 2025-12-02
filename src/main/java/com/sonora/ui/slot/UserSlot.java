package com.sonora.ui.slot;

import com.sonora.model.person.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class UserSlot extends Slot {
    @FXML
    private ImageView userPhoto;
    @FXML
    private Label userName;

    public UserSlot() {
        super("/ui/slot/UserSlot.fxml");
    }
}

