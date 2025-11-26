package com.sonora.model.person;

import com.sonora.model.collection.Album;
import com.sonora.model.collection.Single;

import java.util.List;

public class Artist extends Person {
    private List<Album> albums;
    private List<Single> singles;

    public Artist(String name, String email, String password, String photo, List<Album> albums, List<Single> singles) {
        super(name, email, password, photo);
        this.albums = albums;
        this.singles = singles;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public List<Single> getSingles() {
        return singles;
    }
}
