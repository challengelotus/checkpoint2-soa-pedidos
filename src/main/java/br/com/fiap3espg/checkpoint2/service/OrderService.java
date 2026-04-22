package br.com.fiap3espg.checkpoint2.service;

import br.com.fiap3espg.checkpoint2.model.OrderModel;
import br.com.fiap3espg.checkpoint2.repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderModel createOrder(OrderModel order) {
        return orderRepository.save(order);
    }
}