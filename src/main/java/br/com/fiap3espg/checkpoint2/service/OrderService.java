package br.com.fiap3espg.checkpoint2.service;

import br.com.fiap3espg.checkpoint2.model.OrderModel;
import br.com.fiap3espg.checkpoint2.repository.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderModel createOrder(OrderModel order) {
        return orderRepository.save(order);
    }

    public List<OrderModel> readAllOders() {
        return orderRepository.findAll();
    }

    public OrderModel readOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado!"));
    }
}
