package com.sonora.dao.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sonora.dao.Repository;
import com.sonora.model.person.Artist;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JsonArtist implements Repository<Artist> {
    private static final String JSON_PATH = "src/main/resources/data/artists.json";
    private List<Artist> cache;
    private Gson gson;

    public JsonArtist() {
        this.gson = new Gson();
        this.cache = loadFromFile();
    }

    private List<Artist> loadFromFile() {
        try (Reader reader = new FileReader(JSON_PATH)) {
            Type listType = new TypeToken<ArrayList<Artist>>(){}.getType();
            List<Artist> list = gson.fromJson(reader, listType);
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
    public void save(Artist artist) {
        this.cache.add(artist);
        saveToFile();
    }

    @Override
    public void delete(int id) {
        this.cache.removeIf(artist -> artist.getId() == id);
        saveToFile();
    }

    @Override
    public Optional<Artist> findById(int id) {
        return cache.stream().filter(artist -> artist.getId() == id).findFirst();
    }

    @Override
    public List<Artist> findAll() {
        return cache;
    }
}
