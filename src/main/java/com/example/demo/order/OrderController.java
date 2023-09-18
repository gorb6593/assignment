package com.example.demo.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;
  @PostMapping("/create")
  public String createOrder(String test1, String test2, String test3){
    orderService.create(test1,test2,test3);
    return "1";
  }
}
