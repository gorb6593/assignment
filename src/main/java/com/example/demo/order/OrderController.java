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
    o.setProduct_name(ordering.getProduct_name());
    o.setOptions(ordering.getOptions());
    o.setTable_no(ordering.getTable_no());
    o.setQuantity(ordering.getQuantity());
    o.setOrder_date(ordering.getOrder_date());
    o.setOrder_time(ordering.getOrder_time());
    o.setDate_time(ordering.getDate_time());
    o.setRobot_status(ordering.getRobot_status());
    o.setDong(ordering.getDong());
    o.setHo(ordering.getHo());
    o.setSeq(ordering.getSeq());
    o.setOrderer_name(ordering.getOrderer_name());
    //return "<pre>"+  +"<pre/>주문번호:"+ordering.getOrder_id()+"  : 수신";

    return o;
  }



  //@GetMapping("list")
  @RequestMapping("/list")
  @ResponseBody
  public List<Ordering> list(Model model) {
    List<Ordering> orderList = orderService.getList2();

    return orderList;
  }



}
