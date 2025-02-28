package com.ducna1.learnspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long quantity;
  private double price;

  // orderId : long
  // OrderDetail many -> to one Order
  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

  // productId : long
  // OrderDetail many -> to one Product
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
}
