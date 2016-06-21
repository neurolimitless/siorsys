package siorsys.dao;

import siorsys.model.Order;

import java.util.List;

public interface OrderDao {
    List<Order> getAllOrders();

    Order getOrderById(int id);

    Order getOrderByCreatorId(int id);

    void save(Order order);

    void delete(Order order);

    void update(Order order);
}
