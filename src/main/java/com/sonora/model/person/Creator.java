package com.sonora.model.person;

import com.sonora.model.collection.Podcast;

import java.util.List;

public class Creator extends Person {
    private List<Podcast> podcasts;

    public Creator(String name, String email, String password, String photo, List<Podcast> podcasts) {
        super(name, email, password, photo);
        this.podcasts = podcasts;
    }

    public List<Podcast> getPodcasts() {
        return podcasts;
    }
}
