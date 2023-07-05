package com.enjoycode.hexagonal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.enjoycode.hexagonal.repository.sql.CarRentalEntity;
import com.enjoycode.hexagonal.repository.sql.CarRentalSqlRepository;
import com.enjoycode.hexagonal.service.CalculateStock;

@RestController
public class CarRentalController {

   private final CalculateStock calculateStock;

   public CarRentalController(CalculateStock calculateStock) {
      this.calculateStock = calculateStock;
   }

   @GetMapping("/car-rental/{id}/stock")
   public ResponseEntity<Integer> getStock(@PathVariable("id") Integer id) {
      Integer stock = calculateStock.remainingCars(id);

      return ResponseEntity.ok(stock);
   }

   // Le controller accède directement au code infrastructure
   @GetMapping("/car-rental/{id}")
   public ResponseEntity<CarRentalEntity> findById(@PathVariable("id") Integer id) {
      CarRentalEntity carRental = calculateStock.findById(id);
      return ResponseEntity.ok(carRental);
   }
}
