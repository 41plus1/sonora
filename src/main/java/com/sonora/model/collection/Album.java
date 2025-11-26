package com.sonora.model.collection;

import com.sonora.model.media.Music;
import com.sonora.model.person.Artist;

import java.util.List;

public class Album extends ContentCollection {
    private List<Artist> artists;
    private List<Music> tracks;

    public Album(String name, String description, String cover, List<Artist> artists, List<Music> tracks) {
        super(name, description, cover);
        this.artists = artists;
        this.tracks = tracks;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public List<Music> getTracks() {
        return tracks;
    }
}
