package com.sonora.model.player;

import com.sonora.model.media.Episode;

public class EpisodePlayer extends  Player {
    private Episode currentMedia;

    public EpisodePlayer(int currentTime, Episode currentMedia) {
        super(currentTime);
        this.currentMedia = currentMedia;
    }

    public Episode getCurrentMedia() {
        return currentMedia;
    }

    public void rewind15s() {

    }

    public void foward15s() {

    }
}
