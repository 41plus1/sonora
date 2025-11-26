package com.sonora.model.media;

import com.sonora.model.person.Creator;

import java.time.LocalDate;
import java.util.List;

public class Episode extends Media {
    private List<Creator> creators;
    private String description;

    public Episode(String name, int duration, LocalDate releaseDate, String cover, List<Creator> creators, String description) {
        super(name, duration, releaseDate, cover);
        this.creators = creators;
        this.description = description;
    }

    public List<Creator> getCreators() {
        return creators;
    }

    public String getDescription() {
        return description;
    }
}
