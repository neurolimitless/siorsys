package siorsys.service;

import siorsys.model.Food;

import java.util.List;

public interface FoodService {
    Food getById(int id);
    Food getByTitle(String title);
    void save(Food food);
    void delete(Food food);
    List<Food> getAllFood();
}
