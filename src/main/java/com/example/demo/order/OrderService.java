package com.example.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  @Autowired
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public void create(String test1, String test2, String test3) {
    Order o = new Order();
    o.setTest1(test1);
    o.setTest2(test2);
    o.setTest3(test3);
    orderRepository.save(o);
  }
}
