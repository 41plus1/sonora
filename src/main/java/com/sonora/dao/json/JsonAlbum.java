package com.sonora.dao.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sonora.dao.Repository;
import com.sonora.model.collection.Album;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JsonAlbum implements Repository<Album> {
    private static final String JSON_PATH = "src/main/resources/data/albums.json";
    private List<Album> cache;
    private Gson gson;

    public JsonAlbum() {
        this.gson = new Gson();
        this.cache = loadFromFile();
    }

    private List<Album> loadFromFile() {
        try (Reader reader = new FileReader(JSON_PATH)) {
            Type listType = new TypeToken<ArrayList<Album>>(){}.getType();
            List<Album> list = gson.fromJson(reader, listType);
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
    public void save(Album album) {
        this.cache.add(album);
        saveToFile();
    }

    @Override
    public void delete(int id) {
        this.cache.removeIf(album -> album.getId() == id);
        saveToFile();
    }

    @Override
    public Optional<Album> findById(int id) {
        return cache.stream().filter(album -> album.getId() == id).findFirst();
    }

    @Override
    public List<Album> findAll() {
        return cache;
    }
}
