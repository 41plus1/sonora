package com.sonora.dao.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sonora.dao.Repository;
import com.sonora.model.collection.Single;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JsonSingle implements Repository<Single> {
    private static final String JSON_PATH = "src/main/resources/data/singles.json";
    private List<Single> cache;
    private Gson gson;

    public JsonSingle() {
        this.gson = new Gson();
        this.cache = loadFromFile();
    }

    private List<Single> loadFromFile() {
        try (Reader reader = new FileReader(JSON_PATH)) {
            Type listType = new TypeToken<ArrayList<Single>>(){}.getType();
            List<Single> list = gson.fromJson(reader, listType);
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
    public void save(Single single) {
        this.cache.add(single);
        saveToFile();
    }

    @Override
    public void delete(int id) {
        this.cache.removeIf(single -> single.getId() == id);
        saveToFile();
    }

    @Override
    public Optional<Single> findById(int id) {
        return cache.stream().filter(single -> single.getId() == id).findFirst();
    }

    @Override
    public List<Single> findAll() {
        return cache;
    }
}
