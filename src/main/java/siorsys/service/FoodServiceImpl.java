package siorsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siorsys.dao.FoodDao;
import siorsys.model.Food;

import java.util.List;

@Service("foodManager")
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodDao foodDao;


    @Override
    public Food getById(int id) {
        return foodDao.getFoodById(id);
    }

    @Override
    public Food getByTitle(String title) {
        return foodDao.getFoodByTitle(title);
    }

    @Override
    public void save(Food food) {
        foodDao.save(food);
    }

    @Override
    public void delete(Food food) {
        foodDao.delete(food);
    }

    @Override
    public List<Food> getAllFood() {
        return foodDao.getAllFood();
    }
}
