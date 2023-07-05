package com.enjoycode.hexagonal.domain.send.port;

import com.enjoycode.hexagonal.domain.send.entity.Product;

public interface ProductSender {
  void send(Product product);
}
