package com.olekhv.onlinestore.service;

import com.olekhv.onlinestore.entity.order.Order;
import com.olekhv.onlinestore.exception.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.olekhv.onlinestore.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order fetchOrderById(Long orderId){
        return this.orderRepository.findById(orderId).orElseThrow(
                () -> new OrderNotFoundException(String.format("Zamowienie: %d nie istnieje", orderId))
        );
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }
}
