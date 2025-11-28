package com.sonora.model.media;

import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private List<Integer> artistIds;
    private int collectionId;
    private CollectionType collectionType;

    public Music() {
        super();
        this.artistIds = new ArrayList<>();
    }

    public Music(int id, String name, int duration, String releaseDate, String cover, List<Integer> artistIds, int collectionId, CollectionType collectionType) {
        super(id, name, duration, releaseDate, cover);
        this.artistIds = artistIds;
        this.collectionId = collectionId;
        this.collectionType = collectionType;
    }

    public List<Integer> getArtistIds() {
        return artistIds;
    }

    public void setArtistIds(List<Integer> artistIds) {
        this.artistIds = artistIds;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public CollectionType getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(CollectionType collectionType) {
        this.collectionType = collectionType;
    }

    public enum CollectionType {
        ALBUM, SINGLE
    }
}
