package com.sonora.controller;

import com.sonora.ui.bar.PlayerBar;
import com.sonora.ui.bar.SearchBar;
import com.sonora.ui.bar.SideBar;
import com.sonora.ui.screen.Screen;

public class Main  {
    private SearchBar searchBar;
    private SideBar sideBar;
    private PlayerBar playerBar;
    private Screen currentScreen;

    public Main(SearchBar searchBar, SideBar sideBar, PlayerBar playerBar, Screen currentScreen) {
        this.searchBar = searchBar;
        this.sideBar = sideBar;
        this.playerBar = playerBar;
        this.currentScreen = currentScreen;
    }
}
