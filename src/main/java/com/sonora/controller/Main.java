package com.sonora.controller;

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

import java.util.Map;
import java.util.function.Function;

public class Main extends Application {
    interface ScreenFactory {
        Screen create(Object... args);
    }

    private final Map<String, ScreenFactory> screenFactories = Map.of(
            "home",   args -> new HomeScreen(),
            "search", args -> new SearchScreen(),

            "album",  args -> new AlbumScreen(),
            "playlist",  args -> new PlaylistScreen(),

            "artist", args -> new ArtistScreen(),
            "user",   args -> new UserScreen()

            //with arguments:
            //new AlbumScreen((int) args[0], (String) args[1]),
    );

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
        renderScreen(loadScreen("home"));
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

    public Screen loadScreen(String type, Object... args) {
        ScreenFactory factory = screenFactories.get(type);

        if (factory == null) { throw new IllegalArgumentException("Invalid type: " + type); }

        return factory.create(args);
    }

    public void renderBars() {
        this.searchBar = new SearchBar();
        this.playerBar = new PlayerBar();
        this.sideBar = new SideBar();

        //search
        searchBarBox.getChildren().clear();

        HBox.setHgrow(searchBar.getRoot(), Priority.ALWAYS);
        searchBarBox.getChildren().add(searchBar.getRoot());

        //player bar
        playerBarBox.getChildren().clear();

        HBox.setHgrow(playerBar.getRoot(), Priority.ALWAYS);
        playerBarBox.getChildren().add(playerBar.getRoot());

        //sidebar
        sideBarBox.getChildren().clear();

        sideBarBox.getChildren().add(sideBar.getRoot());
    }
}