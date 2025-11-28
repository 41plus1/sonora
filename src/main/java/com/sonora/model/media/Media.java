package com.sonora.model.media;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Media {
    private int id;
    private String name;
    private int duration;
    private String releaseDate;
    private String cover;

    public Media() {}

    public Media(int id, String name, int duration, String releaseDate, String cover) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.cover = cover;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        if (this.releaseDate == null) return null;
        return LocalDate.parse(this.releaseDate);
    }

    public void setReleaseDate(LocalDate releaseDate) {
        if (releaseDate != null) {
            this.releaseDate = releaseDate.toString();
        } else {
            this.releaseDate = null;
        }
    }


    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
