package com.sonora.controller;

import com.sonora.ui.bar.PlayerBar;
import com.sonora.ui.bar.SearchBar;
import com.sonora.ui.bar.SideBar;
import com.sonora.ui.screen.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML private HBox ScreenBox;
    @FXML private HBox PlayerBarBox;
    @FXML private HBox SearchBarBox;
    @FXML private VBox SideBarBox;

    private SearchBar searchBar;
    private SideBar sideBar;
    private PlayerBar playerBar;
    private Screen currentScreen;

    @Override
    public void start(Stage stage) throws Exception {
        //setting the main controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/Main.fxml"));
        loader.setController(this);

        //setting scene
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("Sonora");
        stage.show();

        //rendering
        renderBars();
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

    public SearchScreen loadSearchScreen() {
        return new SearchScreen();
    }

    public void renderBars() {
        this.searchBar = new SearchBar();
        this.sideBar = new SideBar();
        this.playerBar = new PlayerBar();

        PlayerBarBox.getChildren().clear();
        PlayerBarBox.getChildren().add(playerBar.getRoot());

        SearchBarBox.getChildren().clear();
        SearchBarBox.getChildren().add(searchBar.getRoot());

        SideBarBox.getChildren().clear();
        SideBarBox.getChildren().add(sideBar.getRoot());
    }
}
