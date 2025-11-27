package com.sonora.ui.regions;

import com.sonora.ui.slot.Slot;

import java.util.List;

public class Region {
    private List<Slot> slots;

    public Region(List<Slot> slots) {
        this.slots = slots;
    }

    public List<Slot> getSlots() {
        return slots;
    }
}
