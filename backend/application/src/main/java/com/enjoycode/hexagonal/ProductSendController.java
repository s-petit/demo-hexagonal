package com.enjoycode.hexagonal;

import com.enjoycode.hexagonal.domain.send.usecase.SendAllProducts;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSendController {

  private final SendAllProducts sendAllProducts;

  public ProductSendController(SendAllProducts sendAllProducts) {
    this.sendAllProducts = sendAllProducts;
  }

  @GetMapping("/products/send/all")
  public ResponseEntity<Void> sendAllProducts() {
    sendAllProducts.execute();

    return ResponseEntity.accepted().build();
  }
}
