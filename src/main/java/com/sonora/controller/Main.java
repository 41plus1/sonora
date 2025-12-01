package com.sonora.controller;

import com.sonora.dao.json.JsonMusic;
import com.sonora.model.media.Music;
import com.sonora.model.person.Artist;
import com.sonora.ui.bar.PlayerBar;
import com.sonora.ui.bar.SearchBar;
import com.sonora.ui.bar.SideBar;
import com.sonora.ui.screen.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    @FXML private HBox screenBox;
    @FXML private HBox playerBarBox;
    @FXML private HBox searchBarBox;
    @FXML private VBox sideBarBox;

    private SearchBar searchBar;
    private PlayerBar playerBar;
    private SideBar sideBar;
    private Screen currentScreen;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/Main.fxml"));
        loader.setController(this);

        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("Sonora");
        stage.show();

        renderBars();
        renderScreen(loadAlbumScreen());
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void renderScreen(Screen screen) {
        screenBox.getChildren().clear();

        Node screenRoot = screen.getRoot();

        HBox.setHgrow(screenRoot, Priority.ALWAYS);
        screenRoot.maxHeight(Double.MAX_VALUE);
        screenRoot.maxWidth(Double.MAX_VALUE);

        screenBox.getChildren().add(screenRoot);
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

    public SearchScreen loadSearchScreen() {
        return new SearchScreen();
    }

    public void renderBars() {
        this.searchBar = new SearchBar();
        this.playerBar = new PlayerBar();
        this.sideBar = new SideBar();

        searchBarBox.getChildren().clear();
        playerBarBox.getChildren().clear();
        sideBarBox.getChildren().clear();

        HBox.setHgrow(searchBar.getRoot(), Priority.ALWAYS);
        searchBarBox.getChildren().add(searchBar.getRoot());

        HBox.setHgrow(playerBar.getRoot(), Priority.ALWAYS);
        playerBarBox.getChildren().add(playerBar.getRoot());

        sideBarBox.getChildren().add(sideBar.getRoot());
    }
}