package com.example.demo.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;


  @PostMapping("/create")
  @ResponseBody
  //public String createOrder(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13){
    public Object createOrder(@RequestBody Ordering ordering){
    orderService.create(ordering.getOrder_id()
        ,ordering.getProduct_name()
        ,ordering.getOptions()
        ,ordering.getTable_no()
        ,ordering.getQuantity()
        ,ordering.getOrder_date()
        ,ordering.getOrder_time()
        ,ordering.getDate_time()
        ,ordering.getRobot_status()
        ,ordering.getDong()
        ,ordering.getHo()
        ,ordering.getSeq()
        ,ordering.getOrderer_name()
        );
    Ordering o = new Ordering();
    o.setOrder_id(ordering.getOrder_id());
    return o;
  }



  //@GetMapping("list")
  @RequestMapping("/list")
  @ResponseBody
  public List<Ordering> list(Model model) {
//  public String list() {
    List<Ordering> orderList = orderService.getList();
    return orderList;
  }



}
