package siorsys.service;

import siorsys.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(int id);

    Order getOrderByCreatorId(int id);

    void save(Order order);

    void delete(Order order);

    void update(Order order);
}
