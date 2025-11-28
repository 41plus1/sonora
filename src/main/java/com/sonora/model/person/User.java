package com.sonora.model.person;

import com.sonora.model.collection.Playlist;
import com.sonora.model.media.Media;

import java.util.List;

public class User extends Person {
    private List<Playlist> playlists;
    private List<Artist> followedArtists;
    private List<Media> favoriteMedia;

    public User(String name, String email, String password, String photo, List<Playlist> playlists, List<Artist> followedArtists, List<Media> favoriteMedia) {
        super(name, email, password, photo);
        this.playlists = playlists;
        this.followedArtists = followedArtists;
        this.favoriteMedia = favoriteMedia;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Artist> getFollowedArtists() {
        return followedArtists;
    }

    public List<Media> getFavoriteMedia() {
        return favoriteMedia;
    }
}
