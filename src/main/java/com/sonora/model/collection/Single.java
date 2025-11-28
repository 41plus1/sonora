package com.sonora.model.collection;

import com.sonora.model.media.Music;
import com.sonora.model.person.Artist;

import java.util.ArrayList;
import java.util.List;

public class Single extends ContentCollection {
    private List<Integer> artistIds;

    public Single() {
        super();
        this.artistIds = new ArrayList<>();
    }

    public Single(int id, String name, String description, String cover, List<Integer> artistIds, List<Integer> musicId) {
        super(id, name, description, cover, musicId);
        this.artistIds = artistIds;
    }

    public List<Integer> getArtistIds() {
        return artistIds;
    }

    public void setArtistIds(List<Integer> artistIds) {
        this.artistIds = artistIds;
    }
}
