package com.sonora.ui.slot;

public abstract class Slot <T> {
    private T info;

    public Slot(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public abstract void initializeUI();
}
