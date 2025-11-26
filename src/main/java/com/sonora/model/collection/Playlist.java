package com.sonora.model.collection;

import com.sonora.model.media.Media;

import java.util.List;

public class Playlist extends ContentCollection {
    private List<Media> media;

    public Playlist(String name, String description, String cover, List<Media> media) {
        super(name, description, cover);
        this.media = media;
    }

    public List<Media> getMedia() {
        return media;
    }
}
