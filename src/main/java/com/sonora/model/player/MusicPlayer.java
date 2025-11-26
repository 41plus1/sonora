package com.sonora.model.player;

import com.sonora.model.media.Music;

import java.util.List;

public class MusicPlayer extends Player {
    private Music currentMedia;
    private List<Music> queue;
    private boolean shuffle;
    private boolean loopTrack;
    private boolean loopCollection;

    public MusicPlayer(int currentTime, Music currentMedia, List<Music> queue, boolean shuffle, boolean loopTrack, boolean loopCollection) {
        super(currentTime);
        this.currentMedia = currentMedia;
        this.queue = queue;
        this.shuffle = shuffle;
        this.loopTrack = loopTrack;
        this.loopCollection = loopCollection;
    }

    public Music getCurrentMedia() {
        return currentMedia;
    }

    public List<Music> getQueue() {
        return queue;
    }

    public boolean isShuffle() {
        return shuffle;
    }

    public boolean isLoopTrack() {
        return loopTrack;
    }

    public boolean isLoopCollection() {
        return loopCollection;
    }
}
