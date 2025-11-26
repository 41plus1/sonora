package com.sonora.model.collection;

import com.sonora.model.media.Episode;
import com.sonora.model.person.Creator;

import java.util.List;

public class Podcast extends ContentCollection {
    private List<Creator> creators;
    private List<Episode> episodes;

    public Podcast(String name, String description, String cover, List<Creator> creators, List<Episode> episodes) {
        super(name, description, cover);
        this.creators = creators;
        this.episodes = episodes;
    }

    public List<Creator> getCreators() {
        return creators;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
