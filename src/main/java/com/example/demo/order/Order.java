package com.example.demo.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(length = 100)
  private String test1;
  @Column(length = 100)
  private String test2;
  @Column(length = 100)
  private String test3;
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private int id;
//  @Column(columnDefinition = "TEXT")
//  private String content;
//
//  private LocalDateTime createDate;
//  private LocalDateTime modifyDate;

}
