package com.example.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  @Autowired
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public void create(String order_id, String product_name, String option, String table_no, String quan, String o_date, String o_time, String date, String robot_status, String dong, String ho, String seq, String orderer_name) {
    Ordering o = new Ordering();
    o.setOrder_id(order_id);
    o.setProduct_name(product_name);
    o.setOptions(option);
    o.setTable_no(table_no);
    o.setQuantity(quan);
    o.setOrder_date(o_date);
    o.setOrder_time(o_time);
    o.setDate_time(date);
    o.setRobot_status(robot_status);
    o.setDong(dong);
    o.setHo(ho);
    o.setSeq(seq);
    o.setOrderer_name(orderer_name);

    this.orderRepository.save(o);
  }

  public List<Ordering> getList(){
    return orderRepository.findAll();
  }
}
