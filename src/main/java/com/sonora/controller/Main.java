package com.sonora.controller;

import com.sonora.ui.bar.PlayerBar;
import com.sonora.ui.bar.SearchBar;
import com.sonora.ui.bar.SideBar;
import com.sonora.ui.screen.Screen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private SearchBar searchBar;
    private SideBar sideBar;
    private PlayerBar playerBar;
    private Screen currentScreen;

    @Override
    public void start(Stage stage) throws Exception {
        this.searchBar = new SearchBar();
        this.sideBar = new SideBar();
        this.playerBar = new PlayerBar();
        this.currentScreen = new Screen();

        Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sonora");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
