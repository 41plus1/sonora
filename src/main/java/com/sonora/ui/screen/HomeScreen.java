package com.sonora.ui.screen;

import com.sonora.ui.region.*;
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

        //artists
        ArtistsRegion artistsRegion = new ArtistsRegion("Artists");

        regions.add(artistsRegion);
        regionsBox.getChildren().add(artistsRegion.getRoot());

        //users
        UsersRegion usersRegion = new UsersRegion("Users");

        regions.add(usersRegion);
        regionsBox.getChildren().add(usersRegion.getRoot());

        //albums
        AlbumsRegion albumsRegion = new AlbumsRegion("Albums");

        regions.add(albumsRegion);
        regionsBox.getChildren().add(albumsRegion.getRoot());

        //playlists
        PlaylistsRegion playlistsRegion = new PlaylistsRegion("Playlists");

        regions.add(playlistsRegion);
        regionsBox.getChildren().add(playlistsRegion.getRoot());
    }
}
