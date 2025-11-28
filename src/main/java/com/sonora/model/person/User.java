package com.sonora.model.person;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    private List<Integer> playlistIds;
    private List<Integer> followedArtistIds;
    private List<Integer> favoriteMediaIds;

    public User() {
        super();
        this.playlistIds =  new ArrayList<>();
        this.followedArtistIds =  new ArrayList<>();
        this.favoriteMediaIds =  new ArrayList<>();
    }

    public User(int id, String name, String email, String password, String photo, List<Integer> playlistIds, List<Integer> followedArtistIds, List<Integer> favoriteMediaIds) {
        super(id, name, email, password, photo);
        this.playlistIds = playlistIds;
        this.followedArtistIds = followedArtistIds;
        this.favoriteMediaIds = favoriteMediaIds;
    }

    public List<Integer> getPlaylistIds() {
        return playlistIds;
    }

    public void setPlaylistIds(List<Integer> playlistIds) {
        this.playlistIds = playlistIds;
    }

    public List<Integer> getFollowedArtistIds() {
        return followedArtistIds;
    }

    public void setFollowedArtistIds(List<Integer> followedArtistIds) {
        this.followedArtistIds = followedArtistIds;
    }

    public List<Integer> getFavoriteMediaIds() {
        return favoriteMediaIds;
    }

    public void getFavoriteMediaIds(List<Integer> favoriteMediaIds) {
        this.favoriteMediaIds = favoriteMediaIds;
    }
}
