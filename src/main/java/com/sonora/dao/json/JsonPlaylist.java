package com.sonora.dao.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sonora.dao.Repository;
import com.sonora.model.collection.Playlist;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JsonPlaylist implements Repository<Playlist> {
    private static final String JSON_PATH = "src/main/resources/data/playlists.json";
    private List<Playlist> cache;
    private Gson gson;

    public JsonPlaylist() {
        this.gson = new Gson();
        this.cache = loadFromFile();
    }

    private List<Playlist> loadFromFile() {
        try (Reader reader = new FileReader(JSON_PATH)) {
            Type listType = new TypeToken<ArrayList<Playlist>>(){}.getType();
            List<Playlist> list = gson.fromJson(reader, listType);
            return list != null ? list : new ArrayList<>();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void saveToFile() {
        try (Writer writer = new FileWriter(JSON_PATH)) {
            gson.toJson(cache, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Playlist playlist) {
        this.cache.add(playlist);
        saveToFile();
    }

    @Override
    public void delete(int id) {
        this.cache.removeIf(playlist -> playlist.getId() == id);
        saveToFile();
    }

    @Override
    public Optional<Playlist> findById(int id) {
        return cache.stream().filter(playlist -> playlist.getId() == id).findFirst();
    }

    @Override
    public List<Playlist> findAll() {
        return cache;
    }
}
