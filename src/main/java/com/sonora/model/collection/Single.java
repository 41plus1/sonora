package com.sonora.model.collection;

import com.sonora.model.media.Music;
import com.sonora.model.person.Artist;

import java.util.List;

public class Single extends ContentCollection {
    private List<Artist> artists;
    private Music singleTrack;

    public Single(String name, String description, String cover, List<Artist> artists, Music singleTrack) {
        super(name, description, cover);
        this.artists = artists;
        this.singleTrack = singleTrack;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public Music getSingleTrack() {
        return singleTrack;
    }
}
