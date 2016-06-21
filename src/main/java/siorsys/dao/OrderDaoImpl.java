package siorsys.dao;

import org.springframework.stereotype.Repository;
import siorsys.model.Order;

import java.util.List;

@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao implements OrderDao {
    @Override
    public List<Order> getAllOrders() {
       return getAll(Order.class);
    }

    @Override
    public Order getOrderById(int id) {
       return (Order) getByRestriction("id",id,Order.class);
    }

    @Override
    public Order getOrderByCreatorId(int id) {
        return (Order) getByRestriction("creator",id,Order.class);
    }

    @Override
    public void save(Order order) {
        persist(order);
    }

    @Override
    public void delete(Order order) {
        delete(order);
    }

    @Override
    public void update(Order order) {
        persist(order);
    }
}
