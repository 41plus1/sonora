package com.sonora.model.collection;


import com.sonora.model.media.Music;

import java.util.List;

public class Playlist extends ContentCollection {
    private List<Music> musics;

    public Playlist(String name, String description, String cover, List<Music> musics) {
        super(name, description, cover);
        this.musics = musics;
    }

    public List<Music> getMedia() {
        return musics;
    }
}
