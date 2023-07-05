package com.enjoycode.hexagonal.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.enjoycode.hexagonal.domain.carrental.CalculateStock;

@RestController
public class CarRentalController {

   private final CalculateStock calculateStock;

   public CarRentalController(CalculateStock calculateStock) {
      this.calculateStock = calculateStock;
   }

   @GetMapping("/car-rental/{id}/stock")
   public ResponseEntity<Integer> sendAllProducts(@PathVariable("id") Integer id) {
      Integer stock = calculateStock.remainingCars(id);
      return ResponseEntity.ok(stock);
   }
}
