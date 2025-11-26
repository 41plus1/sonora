package com.sonora.model.collection;

public class ContentCollection {
    private String name;
    private String description;
    private String cover;

    public ContentCollection(String name, String description, String cover) {
        this.name = name;
        this.description = description;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCover() {
        return cover;
    }

    public int getTotalDuration() {
        return 0; //TODO
    }
}
