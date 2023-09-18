package com.example.demo.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ordering {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String order_id;
  private String product_name;
  private String options;
  private String table_no;
  private String quantity;
  private String order_date;
  private String order_time;
  private String date_time;
  private String robot_status;
  private String dong;
  private String ho;
  private String seq;
  private String orderer_name;



}
