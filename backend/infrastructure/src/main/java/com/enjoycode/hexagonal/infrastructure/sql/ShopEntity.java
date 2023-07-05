package com.enjoycode.hexagonal.infrastructure.sql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShopEntity {
  @Id private Integer id;

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }
}
