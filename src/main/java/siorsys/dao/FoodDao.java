package siorsys.dao;

import siorsys.model.Food;

import java.util.List;

public interface FoodDao {
    void save(Food food);
    void update(Food food);
    void delete(Food food);
    Food getFoodById(int id);
    Food getFoodByTitle(String title);
    List<Food> getAllFood();

    List<Food> getFoodByType(int type);
}
