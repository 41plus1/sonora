package com.sonora.model.person;

import com.sonora.model.collection.Album;
import com.sonora.model.collection.Single;

import java.util.ArrayList;
import java.util.List;

public class Artist extends Person {
    private List<Integer> albumIds;
    private List<Integer> singleIds;

    public Artist() {
        super();
        this.albumIds = new ArrayList<>();
        this.singleIds = new ArrayList<>();
    }

    public Artist(int id, String name, String email, String password, String photo, List<Integer> albumIds, List<Integer> singleIds) {
        super(id, name, email, password, photo);
        this.albumIds = albumIds;
        this.singleIds = singleIds;
    }

    public List<Integer> getAlbumIds() {
        return albumIds;
    }

    public void setAlbumIds (List<Integer> albumIds) {
        this.albumIds = albumIds;
    }

    public List<Integer> getSingleIds() {
        return singleIds;
    }

    public void setSingleIds (List<Integer> singleIds) {
        this.singleIds = singleIds;
    }
}
