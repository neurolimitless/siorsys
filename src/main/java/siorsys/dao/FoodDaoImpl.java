package siorsys.dao;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import siorsys.model.Food;

import java.util.List;

@Repository("foodDao")
public class FoodDaoImpl extends AbstractDao implements FoodDao {
    @Transactional
    public void save(Food food) {
        persist(food);
    }

    @Transactional
    public void update(Food food) {
        persist(food);
    }

    @Transactional
    public void delete(Food food) {
        delete(food);
    }

    @Transactional
    public Food getFoodById(int id) {
        return (Food) getByRestriction("id", id, Food.class).get(0);
    }

    @Transactional
    public Food getFoodByTitle(String title) {
        return (Food) getByRestriction("title", title, Food.class).get(0);
    }

    @Transactional
    public List<Food> getAllFood() {
        return getAll(Food.class);
    }

    @Transactional
    public List<Food> getFoodByType(int type) {
        return getByRestriction("type", type, Food.class);
    }
}
