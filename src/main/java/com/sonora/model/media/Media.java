package com.sonora.model.media;

import java.time.LocalDate;

public class Media {
    private String name;
    private int duration;
    private LocalDate releaseDate;
    private String cover;

    public Media(String name, int duration, LocalDate releaseDate, String cover) {
        this.name = name;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getCover() {
        return cover;
    }
}
