package com.sonora.dao.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sonora.dao.Repository;
import com.sonora.model.person.User;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JsonUser implements Repository<User> {
    private static final String JSON_PATH = "src/main/resources/data/users.json";
    private List<User> cache;
    private Gson gson;

    public JsonUser() {
        this.gson = new Gson();
        this.cache = loadFromFile();
    }

    private List<User> loadFromFile() {
        try (Reader reader = new FileReader(JSON_PATH)) {
            Type listType = new TypeToken<ArrayList<User>>(){}.getType();
            List<User> list = gson.fromJson(reader, listType);
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
    public void save(User user) {
        this.cache.add(user);
        saveToFile();
    }

    @Override
    public void delete(int id) {
        this.cache.removeIf(user -> user.getId() == id);
        saveToFile();
    }

    @Override
    public Optional<User> findById(int id) {
        return cache.stream().filter(user -> user.getId() == id).findFirst();
    }

    @Override
    public List<User> findAll() {
        return cache;
    }
}
