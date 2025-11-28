package com.sonora.controller;

import com.sonora.ui.bar.PlayerBar;
import com.sonora.ui.bar.SearchBar;
import com.sonora.ui.bar.SideBar;
import com.sonora.ui.screen.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML private HBox ScreenBox;
    @FXML private HBox PlayerBox;

    private SearchBar searchBar;
    private SideBar sideBar;
    private PlayerBar playerBar;
    private Screen currentScreen;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main.fxml"));
        loader.setController(this);

        Scene scene = new Scene(loader.load());

        this.searchBar = new SearchBar();
        this.sideBar = new SideBar();
        this.playerBar = new PlayerBar();

        stage.setScene(scene);
        stage.setTitle("Sonora");
        stage.show();

        renderScreen(loadHomeScreen());
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void renderScreen(Screen screen) {
        ScreenBox.getChildren().clear();
        ScreenBox.getChildren().add(screen.getRoot());
        this.currentScreen = screen;
    }

    public AlbumScreen loadAlbumScreen() {
        return new AlbumScreen();
    }

    public ArtistScreen loadArtistScreen() {
        return new ArtistScreen();
    }

    public ProfileScreen loadProfileScreen() {
        return new ProfileScreen();
    }

    public HomeScreen loadHomeScreen() {
        return new HomeScreen();
    }
}
