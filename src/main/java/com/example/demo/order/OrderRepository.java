package com.example.demo.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Ordering,Integer>{

  @Query(value = "SELECT * FROM Ordering group by order_id", nativeQuery = true)
  public List<Ordering> selectAllSQL();
}
