package com.sonora.model.collection;

import java.util.ArrayList;
import java.util.List;

public class Album extends ContentCollection {
    private List<Integer> artistIds;

    public Album() {
        super();
        this.artistIds = new ArrayList<>();
    }

    public Album(int id, String name, String description, String cover, List<Integer> artistIds, List<Integer> musicIds) {
        super(id, name, description, cover, musicIds);
        this.artistIds = artistIds;
    }

    public List<Integer> getArtistIds() {
        return artistIds;
    }

    public void setArtistIds(List<Integer> artistIds) {
        this.artistIds = artistIds;
    }
}
