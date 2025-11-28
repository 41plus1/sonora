package com.sonora.model.collection;

import java.util.List;

public class ContentCollection {
    private int id;
    private String name;
    private String description;
    private String cover;
    private List<Integer> mediaIds;

    public ContentCollection() {}

    public ContentCollection(int id, String name, String description, String cover, List<Integer> mediaIds) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cover = cover;
        this.mediaIds = mediaIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description ) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<Integer> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(List<Integer> mediaIds) {
        this.mediaIds = mediaIds;
    }

    public int getTotalDuration() {
        return 0; // TODO
    }
}
