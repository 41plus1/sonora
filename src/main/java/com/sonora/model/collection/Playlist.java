package com.sonora.model.collection;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends ContentCollection {
    private List<Integer> userIds;

    public Playlist() {
        super();
        this.userIds = new ArrayList<>();
    }

    public Playlist(int id, String name, String description, String cover, List<Integer> userIds, List<Integer> musicIds) {
        super(id, name, description, cover, musicIds);
        this.userIds = userIds;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }
}
