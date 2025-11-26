package com.sonora.model.media;

import com.sonora.model.person.Artist;

import java.time.LocalDate;
import java.util.List;

public class Music extends Media {
    private List<Artist> artists;
    private Object albumOrSingle;

    public Music(String name, int duration, LocalDate releaseDate, String cover, List<Artist> artists, Object albumOrSingle) {
        super(name, duration, releaseDate, cover);
        this.artists = artists;
        this.albumOrSingle = albumOrSingle;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public Object getAlbumOrSingle() {
        return albumOrSingle;
    }
}
